package model;

import tipoEnum.Numero;

public class Partida {

	Baraja baraja;
	Carta mesa;

	Jugadores j1;
	Jugadores j2;
	int turno;

	public Partida() {

		// Inicializamos los jugadores
		j1 = new Jugadores();
		j2 = new Jugadores();

		// Inicializamos la baraja y las manos de los jugadores

		this.baraja = new Baraja();
		this.baraja.barajearCartas();

		for (int i = 0; i < 7; i++) {
			j1.robar(baraja);
			j2.robar(baraja);
		}

		this.mesa = this.baraja.cogerCarta();

		// Aqui se deberia tener la baraja creada y Barajada con tooodas sus
		// cartas

		// Para esto seria ideal crear una funcion en baraja llamada robar carta
		// que coja una carta de la baraja, la devuelva y la quite de la baraja
		this.turno = establecerPrimerTurno();
	}

	public int Jugar() {

		// aqui ya iria el bucle while (yo usaria un while(True) con breaks
		while (true) {
			if (turno == 1) {
				// Turno del jugador 1
				boolean found = false;
				for (Carta c : j1.getMano()) {
					if (c.jugable(this.mesa)) {
						this.jugarCarta(j1,c);
						found = true;
						System.out.println("J1 Juega "+ c);
						break;
					}
				}
				if (!found){
					Carta robada = j1.robar(baraja);
					System.out.println("J1 Robando");
					if (robada.jugable(mesa)){
						this.jugarCarta(j1, robada);
						System.out.println("J1 Juega carta robada "+ robada);
					}
				}
				
				
			} else {
				// Turno de la máquina
				// La maquina recorrerá su mano y si encuentra una carta jugable
				// la jugará
				// Turno del jugador 1
				boolean found = false;
				for (Carta c : j2.getMano()) {
					if (c.jugable(this.mesa)) {
						this.jugarCarta(j2,c);
						found = true;
						System.out.println("J2 Juega "+ c);
						break;
					}
				}
				if (!found){
					Carta robada = j2.robar(baraja);
					System.out.println("J2 Robando");
					if (robada.jugable(mesa)){
						this.jugarCarta(j2, robada);
						System.out.println("J2 Juega carta robada "+ robada);
					}
				}
			}
			
			// Chequeamos si ha ganado alguien y si ha ganado devolvemos el
			// turno,(El jugador que ha ganado)
			if (j1.manoVacia() || j2.manoVacia()) {
				return turno;
			} else {
				// si no ha ganado nadie, cambiamos el turno
				if (turno == 1) {
					turno = 2;
				} else {
					turno = 1;
				}
			}
		}

	}

	public int establecerPrimerTurno() {
		boolean turno = (Math.random() < 0.5);

		if (turno == true) {
			System.out.print("\n\t\tTURNO DEL JUGADOR.");
			return 1;
		}

		else {
			System.out.print("\n\t\tTURNO DE LA MÁQUINA.");
			return 2;
		}
	}

	public void PrintPartida() {
		System.out.println("Jugador 1 ---------------");
		for (Carta carta : j1.getMano()) {
			System.out.println(carta);
		}
		System.out.println("Jugador 2 ---------------");
		for (Carta carta : j2.getMano()) {
			System.out.println(carta);
		}
		System.out.println("Carta en la mesa --------");
		System.out.println(this.mesa);
		System.out.println("Es el turno del jugador: " + this.turno);
		System.out.println("La baraja esta asi: ---------------");
		System.out.println("La baraja tiene " + this.baraja.getCartas().size() + " cartas");
		this.baraja.imprimir();

	}

	public void jugarCarta(Jugadores j,Carta c) {
		// esta comprobacion es por asegurarme
		if (c.jugable(this.mesa)) {
			Carta oldmesa = this.mesa;
			this.mesa = c;
			if (c.getNumero()==Numero.CHUPATE2){
				if(this.j1==j){
					j2.robar(this.baraja);
					j2.robar(this.baraja);
				}else{
					j1.robar(this.baraja);
					j1.robar(this.baraja);
				}
			}
			if (c.getNumero()==Numero.CHUPATE4){
				if(this.j1==j){
					j2.robar(this.baraja);
					j2.robar(this.baraja);
					j2.robar(this.baraja);
					j2.robar(this.baraja);
				}else{
					j1.robar(this.baraja);
					j1.robar(this.baraja);
					j1.robar(this.baraja);
					j1.robar(this.baraja);
				}
			}
			if (c.getNumero()==Numero.PROHIBIDO){
				if (turno==1){
					turno = 2;
				}else{
					turno = 1;
				}
			}
			baraja.meterCarta(oldmesa);
			j.soltarCarta(c);
			
		} else {
			System.out.println("Esta carta no es jugable");
		}
	}

}
