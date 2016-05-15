package model;

import tipoEnum.Jugador;

public class Turno {

	Jugador j1 = Jugador.JUGADOR;
	Jugador j2 = Jugador.CPU;
	boolean turno;
	
	public boolean establecerPrimerTurno(){
		boolean turno = (Math.random() < 0.5);
		
		if(turno == true){
			System.out.print("\n\t\tTURNO DEL JUGADOR.");
			return true;
		}
		
		else{
			System.out.print("\n\t\tTURNO DE LA MÁQUINA.");
			return false;
		}
	}
	
	}
	
