package misfiguras3;

public class Circulo extends Figura {
	
	private float radio;

	@Override
	public float calculaPerimetro() {
		return (float) (2 * Math.PI * radio);
	}

	@Override
	public float calcularArea() {
		return (float) (Math.PI * radio * radio);
	}

}
