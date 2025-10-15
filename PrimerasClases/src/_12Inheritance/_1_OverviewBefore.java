package _12Inheritance;

public class _1_OverviewBefore {

	public static void main(String[] args) {

		Animal a = new Animal(250);
		
		Gato g = new Gato(6);
		
		Perro p = new Perro(40.5);
		
		a.identificar();
		System.out.println("Animal: " + a.getPeso());
		p.identificar();
		System.out.println("Perro: " + p.getPeso());
		g.identificar();
		System.out.println("Gato: " + g.getPeso());
		
			

	}

}
