package misfiguras2;

public class Circulo extends Figura {

	private int radio;
	
	public Circulo(int radio, String color) {
		super(color);
		this.radio = radio <= 1 ? 1 : radio;
	}
	
	public Circulo() {
		this(1, "negro");
	}
	
	public Circulo(double superficie, String color) {
		this((int)(Math.sqrt(superficie/Math.PI)), color);
	}
	
	public double perimetro() {
		return 2 * Math.PI * radio;
	}
	
	public double area() {
		return Math.PI * radio * radio;
	}

	@Override
	public String toString() {
		return super.toString() + String.format(" de %d de radio.", radio);
	}
	
}
