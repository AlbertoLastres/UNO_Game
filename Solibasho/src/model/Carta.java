package model;

import tipoEnum.Color;
import tipoEnum.Jugador;
import tipoEnum.Numero;

public class Carta {
	
	Color color;
	Numero numero;
	Jugador jugador;
	int posicion;
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Numero getNumero() {
		return numero;
	}
	public void setNumero(Numero numero) {
		this.numero = numero;
	}
	
	

}