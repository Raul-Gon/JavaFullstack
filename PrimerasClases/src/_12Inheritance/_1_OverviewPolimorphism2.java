package _12Inheritance;

public class _1_OverviewPolimorphism2 {

	public static void main(String[] args) {

		AnimalMejorado a1 = new GatoMejorado(5, "blanco");		
		AnimalMejorado a2 = new PerroMejorado(25, "rojo");		
		GatoMejorado a3 = new GatoMejorado(10, "amarillo");		
		PerroMejorado a4 = new PerroMejorado(30, "azul");		
		AnimalMejorado a5 = new OsoMejorado(800, "naranja");		
		OsoMejorado a6 = new OsoMejorado(1_000, "verde");
		        
		System.out.println("Analizando a1");
		System.out.println(a1 instanceof GatoMejorado);
		System.out.println(a1 instanceof AnimalMejorado);
		System.out.println(a1 instanceof PerroMejorado);
		System.out.println(a1 instanceof OsoMejorado);
		 
		System.out.println("Analizando a2");
		System.out.println(a2 instanceof GatoMejorado);
		System.out.println(a2 instanceof AnimalMejorado);
		System.out.println(a2 instanceof PerroMejorado);
		System.out.println(a2 instanceof OsoMejorado);
		        
		System.out.println("Analizando a3");
		System.out.println(a3 instanceof GatoMejorado);
		System.out.println(a3 instanceof AnimalMejorado);
		System.out.println(((AnimalMejorado)a3) instanceof PerroMejorado);
		System.out.println(((Object)a3) instanceof OsoMejorado);

		System.out.println("Analizando a4");
		System.out.println(((Object)a4) instanceof GatoMejorado);
		System.out.println(a4 instanceof AnimalMejorado);
		System.out.println(a4 instanceof PerroMejorado);
		System.out.println(((AnimalMejorado)a4) instanceof OsoMejorado);
		        
		System.out.println("Analizando a5");
		System.out.println(a5 instanceof GatoMejorado);
		System.out.println(a5 instanceof AnimalMejorado);
		System.out.println(a5 instanceof PerroMejorado);
		System.out.println(a5 instanceof OsoMejorado);

		System.out.println("Analizando a6");
		System.out.println(((AnimalMejorado)a6) instanceof GatoMejorado);
		System.out.println(a6 instanceof AnimalMejorado);
		System.out.println(((Object)a6) instanceof PerroMejorado);
		System.out.println(a6 instanceof OsoMejorado);

	}

}
