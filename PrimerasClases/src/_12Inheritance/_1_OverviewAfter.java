package _12Inheritance;

public class _1_OverviewAfter {

	public static void main(String[] args) {

		AnimalMejorado a = new AnimalMejorado(250, "rojo");
		
		GatoMejorado g = new GatoMejorado(6, "azul");
		
		PerroMejorado p = new PerroMejorado(40.5, "amarillo");
		
		a.identificar();
		System.out.println("Animal mejorado: " + a.getPeso());
		p.identificar();
		System.out.println("Perro mejorado: " + p.getPeso());
		g.identificar();
		System.out.println("Gato mejorado: " + g.getPeso());
		
			

	}

}
