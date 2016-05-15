package model;

import model.Baraja;
import tipoEnum.Color;
import tipoEnum.Jugador;

public class Jugadores {
	
	//JUGADOR o CPU
	Baraja baraja = new Baraja();
	int aqui = 108;
	
	public Jugadores(Baraja baraja) {
		this.baraja = baraja;
	}

	public Baraja getBaraja() {
		return baraja;
	}

	public void setBaraja(Baraja baraja) {
		this.baraja = baraja;
	}
	
	public void obtenerDatos(){
		baraja.setCarta(baraja.getCarta());
		//baraja.carta[108].jugador = Jugador.JUGADOR;
		//baraja.setCarta.serColor(baraja.getCarta.getNumero());
	}

	public void imprimir(){
		
		obtenerDatos();
		
	
}
}

