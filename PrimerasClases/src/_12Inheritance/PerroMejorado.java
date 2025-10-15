package _12Inheritance;

public class PerroMejorado extends AnimalMejorado {
		
	public PerroMejorado(double peso, String color) {
		super(peso, color);	
	}
	
	public void identificar() {
		System.out.print("Soy un PERRO-MEJORADO. ");
	}
	
}
