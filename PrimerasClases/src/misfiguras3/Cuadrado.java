package misfiguras3;

public class Cuadrado extends Figura implements IAngulable {
	
	private float lado;

	@Override
	public float calculaPerimetro() {
		return lado * 4;
	}

	@Override
	public float calcularArea() {
		return lado * lado;
	}

	@Override
	public int contarVertices() {
		return 4;
	}
	
	
}
