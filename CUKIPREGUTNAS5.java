import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        System.out.println("=== QUIZ SORPRANO CON VIDAS ===");
        System.out.println("Tema: 'Cookie Run: KINGDOM'");
        System.out.println("==================================");
        System.out.println("BIENVENI@ A ESTE MARAVILLOSO QUIZ ACERCA DE LA SAGA DE COOKIE RUN: KINGDOM,");
        System.out.println("EN EL CUAL SE PONDRAN A PRUEBA TUS HABILIDADES Y CONOCIMIENTOS DEL JUEGO.");
        System.out.println("TENDRAS UN MAXIMO DE 80 DE VIDA Y 9 PREGUNTAS, APROVECHA BIEN Y COMENCEMOS CON EL JUEGO!!!" + '\n' + ":P");
        System.out.println("==================================");
        Scanner scan = new Scanner(System.in);
        int vida = 80;
        int con = 0;
        String Pregunta[] = {
            "Crunchy Chip creo la saga de juegos Cookie Run: Kingdom?",
            "Acaso TODAS las Galletas de Cookie Run: Kingdom están hechas de Galleta?",
            "Acaso las galletas han comido galletas dentro de su Universo?",
            "Gingerbrave es la galleta mas valiente que hay?",
            "Por que Gingerbrave salió del horno de la bruja?",
            "Cual galleta es el concepto de tiempo en si mismo?",
            "Acaso Rajapendra Cookie y Burning Spice son la misma galleta?",
            "Por que están en guerra las galletas?",
            "Todo es culpa de Shadow Milk?"
        };

        String RES_A[] = {
            "Si",
            "No",
            "Puede",
            "Tal vez",
            "Porque  quiso vivir a diferencia de sus compañeros",
            "Quien?",
            "El ES el Parangaricutirimicuaro",
            "Por que quieren Chocolate con Almendras",
            "Es vulpa de Marinette Dupain-Cheng"
        };
        String RES_B[] = {
            "No s ",
            "no pero si",
            "Consumen Atole de Lirio",
            "erom erom le se le, iS",
            "No lo se tu dime",
            "Timekeeper Cookie",
            "Si pero solo sabor menta",
            "Porque Crunchy Chip decreto que todos tendrian snickers",
            "Es culpa del perro pastel que se llevo la corona"
        };
        String RES_C[] = {
            "No",
            "todos estan hechos de polvora",
            "SI (de nombre Crisps)",
            "no que te pasa lupita",
            "Porque Luis Miguel le canto, NO??",
            "No porque el canibalismo temporal esta mal",
            "Le tiene miedo a su propia sombra",
            "Para sobrevivir a Shadow Milk",
            "Los tumbaron de las escaleras"
        };
        String RES_D[] = {
            "No es bien miedoso",
            "No, todas estan echan de metales pesados",
            "No JAJA",
            "Si, el es el mero mero",
            "No.",
            "Tal vez no",
            "Rajapendra es su propio ser",
            "Nop :v",
            "Todo es culpa de ese loco que se cree mesias"
        };
        String INCORREC[] = {
            "_",
            "_",
            "_",
            "_",
            "_",
            "_",
            "_",
            "_",
            "_"
        };
        String CORRECTO[] = {
            "A",
            "B",
            "C",
            "D",
            "A",
            "B",
            "A",
            "C",
            "D"
        };
        int pregutna;
        int CORRECTOS = 0;
        String Corec;

        for (int k = 0; k < 9; k++) {
            for (int uy = 0; uy < vida / 10; uy++) {
                System.out.print("#");
            }
            con++;
            System.out.print('\n');
            pregutna = k + 1;
            Corec = CORRECTO[k];
            System.out.println(pregutna + " - " + Pregunta[k]);
            System.out.println("A) " + RES_A[k]);
            System.out.println("B) " + RES_B[k]);
            System.out.println("C) " + RES_C[k]);
            System.out.println("D) " + RES_D[k]);
            String Opci = scan.nextLine();

            if (Opci.toUpperCase().equals(Corec)) {
                System.out.println("--------------------------------------");
                System.out.println("[CORRECTO EXITOSO]");
                CORRECTOS++;
            } else {
                System.out.println("[INCORRECTO IN-EXITOSO]");
                vida -= 20;
                INCORREC[k] = (pregutna + " - " + Pregunta[k]);
                if (vida <= 0) {
                    k = 10;
                    System.out.println("== GAME OVER ==");
                }

            }
            System.out.println("--------------------------------------");

        }

        System.out.println("=== RESUMEN ===");
        System.out.println("Preguntas Contestadas: " + con + " de 9");
        System.out.printf("%s%n", "ACIERTOS: " + CORRECTOS);
        System.out.println("ERRORES: " + (CORRECTOS - 9));
        System.out.println("PORCENTAJE: " + (CORRECTOS * 100 / 9) + "%");
        mostrarresu(CORRECTOS * 100 / 9);
        System.out.println("VIDA FINAL: " + (vida));
        System.out.println("PREGUNTAS INCORRECTAS: ");
        for (int i = 0; i < 9; i++) {
            if (INCORREC[i].equals("_")) {

            } else {
                System.out.println(INCORREC[i] + " " + "(" + CORRECTO[i] + ")");
            }

        }
        if (CORRECTOS - 9 == 0) {
            System.out.println("ERES UN EXITOSO, NI UNA MAL");
        }

        scan.close();


    }

    public static void mostrarresu(int puntos) {
        if (puntos >= 90) {
            System.out.println("EXCELENTE");
        } else if (puntos >= 70 && puntos < 90) {
            System.out.println("APROBASTE");
        } else {
            System.out.println("OCUPA REPASAR");
        }
    }
}