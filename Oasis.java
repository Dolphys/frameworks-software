import java.util.Scanner;
import java.lang.Math;
public class Main
{
	static void main(String[] args) {

	     Scanner reader = new Scanner(System.in);
	     int dia;
	     int pun;
	     int jugar = 1;
        while (jugar == 1) {	
         jugar = 2;
	     int awa = 100, comi = 100, ene = 100, pobreza = 20 ;
	     pun=0;
            for (int k=1;k<=10;k++){
                pun=(awa + comi + ene) + (pobreza*2);
     System.out.println("== DIA " + Integer.toString(k) + " ==");
     System.out.println("Agua: " + Integer.toString(awa) + " || Comida: " + Integer.toString(comi) 
                        + " || Energia: " + Integer.toString(ene) + " || Pobreza: " + Integer.toString(pobreza));
     System.out.println("1. Explorar" + "\n" +"2. Descanzar" + "\n" +"3. Racionar" + "\n" +"4. Comprar en un tianguis" + "\n" + "= Escoge tu destino =");
     int des = 0;
     while (des < 1 || des > 4) {
         des = reader.nextInt();
     }
     
     switch(des) {
         case 1:
             awa = awa - 15;
             comi = comi - 10;
             ene = ene - 20;
             pobreza = pobreza + (int) (Math.random() * 15);
             if ((int) (Math.random()*100) <= 30){
                 System.out.println("¡Tormenta! Te volo hasta que ocho cuarto. - 10 de Energia");
                 ene = ene - 10;
             }
             break;
        case 2:
            awa = awa - 10;
            comi = comi - 10;
            ene = ene + 25;
            pobreza = pobreza;
            if (ene > 100) {
                ene = 100;
            }
            break;
        case 3:
            awa = awa - 5;
            ene = ene - 5;
            comi = comi - 5;
            pobreza = pobreza;
            break;
        case 4:
            if (pobreza >= 10) {
                System.out.println("= Bienvenido a la tienda =" +  "\n" + "1. Agua" + "\n" + "2. Comida");
                int i = 0;
                while (i < 1 || i > 2){
                    i = reader.nextInt();
                }
                if (i == 1) {
                    pobreza -= 10;
                    awa += 20;
                    if (awa>100) {
                        awa=100;
                    }
                } else {
                    pobreza -= 10;
                    comi += 20;
                    if (comi>100) {
                        comi=100;
                    }
                } 
     } else {
         System.out.println("No hay sistema para pobres");
         k=k-1;
        
     }
     
        }
	    if (awa <= 0 || comi <= 0 || ene <= 0) {
	        System.out.println("Has muerto en el desierto en el dia " + Integer.toString(k));
	        if (awa <= 0) {
	        System.out.println("Te moriste por no consumir awita fresca");    
	        } else if (comi <=0) {
	            System.out.println("Te quedaste sin comidar por tragar tanto");
	        } else if (ene <= 0) {
	            System.out.println("Te bofeaste y te tronchaste");
	        }
	        System.out.println("Puntaje: " + Integer.toString(pun));
	        k=11;
	    }
		
	}
	    if (awa > 0 && comi > 0 && ene > 0) {
	        System.out.println("Exitoso. Vamos a felicitarte  !!!");
	        System.out.println("Has llegado al Oasis.");
	        System.out.println("FELICIDADES SHINJI");
	        System.out.println("Puntaje: " + Integer.toString(pun));
	    }
	    System.out.println("QUIERES JUGAR OTRA VEZ!? (0 = Ño || 1 = Si)" );
	    
         while (jugar < 0 || jugar > 1 ) {
         jugar = reader.nextInt();
         } 
         if (jugar == 0) {
             System.out.println("Gracias por jugar" );
         }
        }
	}
}