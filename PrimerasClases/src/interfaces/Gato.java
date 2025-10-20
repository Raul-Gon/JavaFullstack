package interfaces;

public class Gato extends Animal implements Domestico, Mascota {

	public Gato(int peso) {
		super(peso);
	}
	
	@Override
	public void acariciar() {
		System.out.println("Gato acariciado.");
		
	}

	@Override
	public void darComida() {
		System.out.println("Gato alimentado.");
		
	}

	@Override
	public void sacarPasear() {
		System.out.println("Gato paseado.");
		
	}

}
