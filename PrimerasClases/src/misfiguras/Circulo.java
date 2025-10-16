package misfiguras;

public class Circulo extends Figura {
	
	private int radio;
	private final static double PI = 3.1416;
	
	public Circulo(int radio, String color) {
		super(color);
		this.radio = radio;
	}
	
	public Circulo() {
		this(1, "negro");
	}
	
	public Circulo(double area, String color) {
		super(color);
		radio = (int)Math.sqrt(area / (2 * PI));
	}

	public int getRadio() {
		return radio;
	}

	public double getPI() {
		return PI;
	}
	
	public double perimetro() {
		return (2* PI * radio);
	}
	
	public double area() {
		return (PI * radio * radio);
	}
	
	public boolean compararAreas(double area) {
		return (area == this.area()? true : false);
	}

	@Override
	public String toString() {
		return String.format("El circulo de radio %d y de color %s.%n", radio, super.getColor());
	}	
	
}
