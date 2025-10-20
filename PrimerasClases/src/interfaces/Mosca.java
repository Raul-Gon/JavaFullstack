package interfaces;

public class Mosca extends Animal implements Volador {

	public Mosca(int peso) {
		super(peso);
	}
	
	@Override
	public void despegar() {
		System.out.println("Mosca despegando");
		
	}

	@Override
	public void aterrizar() {
		System.out.println("Mosca aterrizando");
		
	}

	@Override
	public void planear() {
		System.out.println("Mosca planeando");
		
	}


}
