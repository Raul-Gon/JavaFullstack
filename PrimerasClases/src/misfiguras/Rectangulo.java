package misfiguras;

public class Rectangulo extends Figura {

	private int base;
	private int altura;
	
	public Rectangulo(int base, int altura, String color) {
		super(color);
		this.base = base;
		this.altura = altura;
	}
	
	public Rectangulo() {
		this(2, 1, "negro");
	}
	
	public Rectangulo(double area, String color) {
		super(color);
		altura = (int)Math.sqrt(area/2);
		base = altura * 2;
	}

	public int getBase() {
		return base;
	}

	public int getAltura() {
		return altura;
	}
	
	public int perimetro() {
		return (2 * base + 2 * altura);
	}
	
	public int area() {
		return (base * altura);
	}
	
	public boolean compararAreas(double area) {
		return (area == this.area()? true : false);
	}

	@Override
	public String toString() {
		return String.format("El rectangulo tiene una base de %d con una altura de %d y es de color %s.%n", base, altura, super.getColor());
	}	
	
}
