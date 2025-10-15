package _12Inheritance;

public class _1_OverviewPolimorphism {

	public static void main(String[] args) {

		AnimalMejorado a1 = new GatoMejorado(5, "blanco");
		
		AnimalMejorado a2 = new PerroMejorado(25, "rojo");
		
		GatoMejorado a3 = new GatoMejorado(10, "amarillo");
		
		PerroMejorado a4 = new PerroMejorado(30, "azul");
		
		AnimalMejorado a5 = new OsoMejorado(800, "naranja");
		
		OsoMejorado a6 = new OsoMejorado(1_000, "verde");
		
		a1.identificar();
		System.out.println(" y peso " + a1.getPeso() + "Kg.");
		        
		a2.identificar();
		System.out.println(" y peso " + a2.getPeso() + "Kg.");
		        
		a3.identificar();
		System.out.println(" y peso " + a3.getPeso() + "Kg.");   
		        
		a4.identificar();
		System.out.println(" y peso " + a4.getPeso() + "Kg.");
		
		a5.identificar();
		System.out.println(" y peso " + a5.getPeso() + "Kg.");
		// a5.rugir(3); no deja porque lo veo como AnimalMejorado y no tengo los metodos de OsoMejorado como a6  
		System.out.println(a5 instanceof OsoMejorado);
		if (a5 instanceof OsoMejorado) ((OsoMejorado)a5).rugir(2);
		        
		a6.identificar();
		System.out.println(" y peso " + a6.getPeso() + "Kg.");
		a6.rugir(4);
		
	}

}
