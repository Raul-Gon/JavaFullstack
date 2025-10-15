package _12Inheritance;

public class Perro {
	
	private double peso;
	
	public Perro(double peso) {
		this.peso = peso;		
	}
	
	public void identificar() {
		System.out.println("Soy un PERRO.");
	}
	
	public double getPeso() {
		return peso;
	}
	
}
