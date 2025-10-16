package misfiguras;

public class Cuadrado extends Figura{
	
	private int lado;
	
	public Cuadrado(int lado, String color) {
		super(color);
		this.lado = lado;
	}
	
	public Cuadrado() {
		this(1, "negro");
	}
	
	public Cuadrado(double area, String color) {
		super(color);
		lado = (int) Math.sqrt(area);
	}

	public int getLado() {
		return lado;
	}
	
	public int perimetro() {
		return (4 * lado);
	}
	
	public double area() {
		return (lado * lado);
	}
	
	public boolean compararAreas(double area) {
		return (area == this.area()? true : false);
	}	
	
	@Override
	public String toString() {
		return String.format("El cuadrado tiene un lado de %d  y es de color %s.%n", lado, super.getColor());
		// return "El cuadrado tiene un lado de " + lado + " y es de color " + super.getColor();
	}

}
