package model;

import java.util.ArrayList;

import model.Baraja;
import tipoEnum.Color;
import tipoEnum.Jugador;

public class Jugadores {
	private ArrayList<Carta> mano;
	
	public Jugadores(){
		mano = new ArrayList<Carta>();
	}
	
	public Carta robar(Baraja baraja){
		Carta c = baraja.cogerCarta().copy();
		this.mano.add(c);
		return c;
	}
	
	
	
	public ArrayList<Carta> getMano() {
		return mano;
	}

	public void setMano(ArrayList<Carta> mano) {
		this.mano = mano;
	}

	public boolean manoVacia(){
		return this.mano.isEmpty();
	}
	
	public void soltarCarta(Carta c){
		if (this.mano.contains(c)){
			this.mano.remove(c);
		}else{
			System.out.println("El jugador no tiene esa carta en la mano");
		}
	}
}

