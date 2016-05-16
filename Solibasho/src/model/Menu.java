package model;

import java.util.Scanner;
import model.Baraja;

public class Menu {
	
  public static void mostrarMenu (){
	  
	  int opcion = 0;
	  Baraja baraja = new Baraja();
	  
	  System.out.println("\n\n\n");
	 
	  Scanner respuesta = new Scanner(System.in);
	  System.out.println("TUS CARTAS: ");
	  baraja.imprimir();
	  System.out.println("Opcion 1: Tirar carta");
	  System.out.println("Opcion 2: Robar carta");
	  System.out.println("Opción: ");
	  opcion = respuesta.nextInt();
	  
	if(opcion != 1 && opcion != 2){
	    System.out.println("Error. No existe la opción escogida.");
	}
	  
    if(opcion == 1){//TIRAR CARTA
        //Funcion Tirar una carta de la mano.
        System.out.println("Procesando...");
  }
    if(opcion == 2){//ROBAR CARTA
      
        //Funcion Robar una carta del mazo.
        System.out.println("Procesando...");;
    }
   

  }
  
}