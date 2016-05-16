package model;

import java.util.ArrayList;
import java.util.Collections;

import tipoEnum.Color;
import tipoEnum.Numero;

public class Baraja {

	private ArrayList<Carta> cartas;

	public Baraja() {
		this.cartas = new ArrayList<Carta>();
		ArrayList<Color> colores = new ArrayList<Color>();
		colores.add(Color.ROJO);
		colores.add(Color.AMARILLO);
		colores.add(Color.AZUL);
		colores.add(Color.VERDE);

		ArrayList<Numero> numeros = new ArrayList<Numero>();
		numeros.add(Numero.UNO);
		numeros.add(Numero.DOS);
		numeros.add(Numero.TRES);
		numeros.add(Numero.CUATRO);
		numeros.add(Numero.CINCO);
		numeros.add(Numero.SEIS);
		numeros.add(Numero.SIETE);
		numeros.add(Numero.OCHO);
		numeros.add(Numero.NUEVE);
		numeros.add(Numero.CAMBIOSENTIDO);
		numeros.add(Numero.PROHIBIDO);
		numeros.add(Numero.CHUPATE2);

		for (Color color : colores) {
			cartas.add(new Carta(color, Numero.CERO));
			cartas.add(new Carta(Color.NEGRO, Numero.CAMBIOCOLOR));
			cartas.add(new Carta(Color.NEGRO, Numero.CHUPATE4));
			for (Numero numero : numeros) {
				cartas.add(new Carta(color, numero));
				cartas.add(new Carta(color, numero));
			}
		}

	}

	public void barajearCartas() {
		Collections.shuffle(cartas);
	}
	
	public void imprimir(){
		for(Carta carta :  cartas){
			System.out.println(carta);
		}
	}
	
	public Carta cogerCarta(){
		Carta out = this.cartas.get(0).copy();
		this.cartas.remove(0);
		return out;
	}

	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}
	
	public void meterCarta(Carta c){
		this.cartas.add(c);
		this.barajearCartas();
	}
	
	
	
}
/*
	public void imprimirBaraja() {
		for (int i = 0; i < 108; i++) {
			// if(carta[i].color != null && carta[i].numero != null)
			System.out.println("\t\tCarta " + (i + 1) + ":\t" + carta[i].color + "            \t" + carta[i].numero);
		}
	}

	public void contarCartasBaraja() {
		for (int i = 0; i < 108; i++) {
			if (carta[i].color != null && carta[i].numero != null)
				numeroCartas++;
		}
		System.out.println("\tNÚMERO DE CARTAS EN LA BARAJA ACTUALMENTE: " + numeroCartas);
		numeroCartas = 0;
	}

	public int repartirCartas() {
		aqui = 107;
		for (int i = 0; i < 7; i++) {
			cartajugador[i].color = carta[aqui].color;
			cartajugador[i].numero = carta[aqui].numero;
			carta[aqui].color = null;
			carta[aqui].numero = null;
			aqui--;
		}

		for (int i = 0; i < 7; i++) {
			cartamaquina[i].color = carta[aqui].color;
			cartamaquina[i].numero = carta[aqui].numero;
			carta[aqui].color = null;
			carta[aqui].numero = null;
			aqui--;

		}
		return aqui;

	}

	public void contarCartasJugadores() {
		cartasJugador = 0;
		cartasCPU = 0;
		for (int i = 0; i < 108; i++) {
			if (cartajugador[i].color != null && cartajugador[i].numero != null)
				cartasJugador++;
			if (cartamaquina[i].color != null && cartamaquina[i].numero != null)
				cartasCPU++;
		}
		System.out.println("NÚMERO DE CARTAS DEL JUGADOR: " + cartasJugador);
		System.out.println("NÚMERO DE CARTAS DE LA MÁQUINA: " + cartasCPU);
	}

	public void mostrarCartasPropias() {
		// contarCartasJugadores();
		cartasJugador = 7;
		cartaJugador = 1;
		for (int i = 0; i < cartasJugador; i++) {
			// if(cartajugador[i].color != null && cartajugador[i].numero !=
			// null){
			System.out.println("Carta " + cartaJugador + ": " + cartajugador[i].color + " " + cartajugador[i].numero);
			cartaJugador++;
			// }

		}
	}

	public void robarCarta() {
		System.out.println(aqui);
	}
}*/
