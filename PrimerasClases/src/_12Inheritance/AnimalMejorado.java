package _12Inheritance;

public class AnimalMejorado {
	
	private double peso;
	private String color;
		
	public AnimalMejorado(double peso, String color) {
		this.peso = peso;		
		this.color = color;
	}
	
	public void identificar() {
		System.out.print("Soy un ANIMAL-MEJORADO. ");
	}

	public double getPeso() {
		return peso;
	}

	public String getColor() {
		return color;
	}
	
	
}
