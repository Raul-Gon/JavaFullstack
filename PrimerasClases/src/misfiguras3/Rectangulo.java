package misfiguras3;

public class Rectangulo extends Figura implements IAngulable {
	
	private float ancho;
	private float alto;

	@Override
	public int contarVertices() {
		return 4;
	}

	@Override
	public float calculaPerimetro() {
		return (2 * alto) + (2 * ancho);
	}

	@Override
	public float calcularArea() {
		// TODO Auto-generated method stub
		return ancho * alto;
	}

}
