package _12Inheritance;

public class GatoMejorado extends AnimalMejorado {
		
	public GatoMejorado(double peso, String color) {
		super(peso, color);		
	}
	
	public void identificar() {
		System.out.print("Soy un GATO-MEJORADO. ");
	}
		
}
