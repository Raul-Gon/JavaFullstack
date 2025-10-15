package _12Inheritance;

public class OsoMejorado extends AnimalMejorado {
	
	public OsoMejorado(double peso, String color) {
		super(peso, color);	
	}
	
	public void identificar() {
		System.out.print("Soy un OSO-MEJORADO. ");
	}
	
	public void rugir(int n) {
		
		for (int i = 0; i < n; i ++) {
			System.out.print("Grrrrr. ");
		}
		System.out.println();		
	}
	
}
