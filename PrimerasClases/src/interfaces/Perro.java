package interfaces;

public class Perro extends Animal implements Domestico, Mascota {

	public Perro(int peso) {
		super(peso);
	}

	@Override
	public void acariciar() {
		System.out.println("Perro acariciado.");
		
	}

	@Override
	public void darComida() {
		System.out.println("Perro alimentado.");
		
	}

	@Override
	public void sacarPasear() {
		System.out.println("Perro paseado.");
		
	}

}
