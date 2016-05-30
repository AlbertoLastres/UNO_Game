package model;

import tipoEnum.Color;
import tipoEnum.Jugador;
import tipoEnum.Numero;

public class Carta {
	
	Color color;
	Numero numero;
	
	
	public Carta(Color color, Numero numero){
		this.color = color;
		this.numero = numero;
	}//Al añadir parametros no se permite crear cartas vacías. Te obliga a crear cartas con valores.
	
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
	
	public Carta copy(){
		return new Carta(this.color,this.numero);
	}
	
	@Override
    public String toString()
    {
         return "Numero: " + this.numero.toString() + "--Color: " + this.color.toString();
    }
	
	public String image(){
		return this.numero.toString() + "-" + this.color.toString() + ".gif";
	}
	
	//	Esto se llama sobre la carta que quieres jugar, pasando como argumento la carta que esta sobre la mesa
	public boolean jugable(Carta c){
		return (this.color==c.getColor()||this.numero==c.getNumero()||this.color==Color.NEGRO||c.color == Color.NEGRO);
	}
	
	

}