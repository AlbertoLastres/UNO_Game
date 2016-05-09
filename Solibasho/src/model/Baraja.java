package model;

import java.util.ArrayList;
import java.util.Collections;

import tipoEnum.Color;
import tipoEnum.Jugador;
import tipoEnum.Numero;

public class Baraja {
	
	//Variables para asignar los valores a las cartas
	int numeroPosicion = 0;
	int numeroAleatorio;
	int aqui = 107;//Para repartir las cartas
	Carta carta[];
	//Variables para contar las cartas de la baraja
	int numeroCartas;
	ArrayList<Integer> list = new ArrayList<Integer>();
	//Variables para mostrarCartasJugador
	int cartaJugador;
	
	public void declararCartas(){
		carta = new Carta[108];
	}

	//Getters y setters:
	public Carta[] getCarta() {
		return carta;
	}
	public void setCarta(Carta[] carta) {
		this.carta = carta;
	}
	

	public void asignarValoresCartas(){
		
		declararCartas();
		for(int i = 0; i < 108; i++){
			carta[i] = new Carta();
			carta[i].posicion = 0;
			carta[i] = new Carta();
		}

		int posicionNumero = 0;
		
		//Colores:
			for(int i = 0; i < 25; i++){
				carta[i].color = Color.ROJO;
			}
			for(int i = 25; i < 50; i++){
				carta[i].color = Color.AMARILLO;
			}
			for(int i = 50; i < 75; i++){
				carta[i].color = Color.AZUL;
			}
			for(int i = 75; i <100; i++){
				carta[i].color = Color.VERDE;
			}
			for(int i = 100; i < 108; i++){
				carta[i].color = Color.NEGRO;
			}
		
	
		//Números:
	posicionNumero = 0;
	for(int color = 1; color < 5; color++){
		//Solo hay una carta 0 en cada color según las normas.
			carta[posicionNumero].numero = Numero.CERO;
			posicionNumero++;
		
		for(int i = 0; i < 2; i++){
			carta[posicionNumero].numero = Numero.UNO;
			posicionNumero++;
		}
		for(int i = 0; i < 2; i++){
			carta[posicionNumero].numero = Numero.DOS;
			posicionNumero++;
		}
		for(int i = 0; i < 2; i++){
			carta[posicionNumero].numero = Numero.TRES;
			posicionNumero++;
		}
		for(int i = 0; i < 2; i++){
			carta[posicionNumero].numero = Numero.CUATRO;
			posicionNumero++;
		}
		for(int i = 0; i < 2; i++){
			carta[posicionNumero].numero = Numero.CINCO;
			posicionNumero++;
		}
		for(int i = 0; i < 2; i++){
			carta[posicionNumero].numero = Numero.SEIS;
			posicionNumero++;
		}
		for(int i = 0; i < 2; i++){
			carta[posicionNumero].numero = Numero.SIETE;
			posicionNumero++;
		}
		for(int i = 0; i < 2; i++){
			carta[posicionNumero].numero = Numero.OCHO;
			posicionNumero++;
		}
		for(int i = 0; i < 2; i++){
			carta[posicionNumero].numero = Numero.NUEVE;
			posicionNumero++;
		}
		for(int i = 0; i < 2; i++){
			carta[posicionNumero].numero = Numero.PROHIBIDO;
			posicionNumero++;
		}
		for(int i = 0; i < 2; i++){
			carta[posicionNumero].numero = Numero.CAMBIOSENTIDO;
			posicionNumero++;
		}
		for(int i = 0; i < 2; i++){
			carta[posicionNumero].numero = Numero.CHUPATE2;
			posicionNumero++;
		}
	}
			for(int i = 0; i < 4; i++){
				carta[posicionNumero].numero = Numero.CHUPATE4;
				posicionNumero++;
			}
			for(int i = 0; i < 4; i++){
				carta[posicionNumero].numero = Numero.CAMBIOCOLOR;
				posicionNumero++;
			}
	}
	
	public void barajearCartas(){
		
		asignarValoresCartas();
		Color colorAuxiliar[] = new Color[108];
		Numero numeroAuxiliar[] = new Numero[108];
        //ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<108; i++) {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);//Desordena lo que pongas dentro.
        for (int i=0; i<108; i++) {
            colorAuxiliar[i] = carta[list.get(i)].color;
            numeroAuxiliar[i] = carta[list.get(i)].numero;
        }
        
        for(int i = 0; i < 108; i ++){
        	carta[i].color = colorAuxiliar[i];
        	carta[i].numero = numeroAuxiliar[i];
        }
		
	}
	
	public void imprimirBaraja(){
		for(int i = 0; i < 108; i++){
			if(carta[i].color != null && carta[i].numero != null)
			System.out.println("\t\tCarta "+(i+1)+":\t"+carta[i].color+"            \t"+carta[i].numero);
		}
	}
	
	public void contarCartasBaraja(){
		for(int i = 0; i < 108; i ++){
			if(carta[i].color != null && carta[i].numero != null) numeroCartas++;
		}
		System.out.println("\tNÚMERO DE CARTAS EN LA BARAJA ACTUALMENTE: "+numeroCartas);
		numeroCartas = 0; 
	}
	
	public void repartirCartas(){
		for(int i = 0; i < 7; i ++){
			carta[aqui].jugador = Jugador.JUGADOR;
			carta[aqui].color = null;
			carta[aqui].numero = null;
			aqui--;
		}
		
		for(int i = 0; i < 7; i ++){
			carta[aqui].jugador = Jugador.CPU;
			carta[aqui].color = null;
			carta[aqui].numero = null;
			aqui--;
		}
		
		
	}
	
	public void contarCartasJugadores(){
		int cartasJugador = 0;
		int cartasCPU = 0;
		for(int i = 0; i < 108; i ++){
			if(carta[i].jugador == Jugador.JUGADOR) cartasJugador++;
			if(carta[i].jugador == Jugador.CPU) cartasCPU++;
		}
		System.out.println("NÚMERO DE CARTAS DEL JUGADOR: "+cartasJugador);
		System.out.println("NÚMERO DE CARTAS DE LA MÁQUINA: "+cartasCPU);
	}
	
	public void mostrarCartasPropias(){
		cartaJugador = 1;
		for(int i = 0; i < 108; i++){
			if(carta[i].jugador == Jugador.JUGADOR){
				System.out.println("Carta "+cartaJugador+": "+carta[i].numero+" "+carta[i].color);
				cartaJugador++;
			}
		}
	}


}