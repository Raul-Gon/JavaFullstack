package misfiguras2;

public class Cuadrado extends Figura {

	private int lado;
	
	public Cuadrado(int lado, String color) {
		super(color);
		this.lado = lado <= 1 ? 1 : lado;
	}
	
	public Cuadrado() {
		this(1, "negro");
	}
	
	public Cuadrado(double superficie, String color) {
		this((int)(Math.sqrt(superficie)), color);
	}
	
	public double perimetro() {
		return 4 * lado;
	}
	
	public double area() {
		return lado * lado;
	}

	@Override
	public String toString() {
		return super.toString() + String.format(" de %d de lado.", lado);
	}
	
}
