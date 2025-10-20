package interfaces;

public class Loro extends Animal implements Volador, Domestico, Mascota {

	public Loro(int peso) {
		super(peso);
	}

	@Override
	public void despegar() {
		System.out.println("Loro despegando");
		
	}

	@Override
	public void aterrizar() {
		System.out.println("Loro aterrizando");
		
	}

	@Override
	public void planear() {
		System.out.println("Loro planeando");
		
	}
	
	@Override
	public void acariciar() {
		System.out.println("Loro acariciado.");
		
	}

	@Override
	public void darComida() {
		System.out.println("Loro alimentado.");
		
	}

	@Override
	public void sacarPasear() {
		System.out.println("Loro paseado.");
		
	}

}
