package _12Inheritance;

public class Animal {
	
	private double peso;
	
	public Animal(double peso) {
		this.peso = peso;		
	}
	
	public void identificar() {
		System.out.println("Soy un ANIMAL.");
	}

	public double getPeso() {
		return peso;
	}
	
}
