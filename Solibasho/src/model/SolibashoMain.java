package model;

import javax.swing.JOptionPane;

public class SolibashoMain {

	public static void main(String[] args) {
		Partida p = new Partida();
		int resultado = p.Jugar();
		System.out.println("Ha ganado el jugador "+ resultado);
		JOptionPane.showMessageDialog(null, "Ha ganado el jugador "+ resultado);
	}

}
