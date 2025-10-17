package misfiguras2;

public class Rectangulo extends Figura {

	private int base;
	private int altura;
	
	public Rectangulo(int base, int altura, String color) {
		super(color);
		this.base = base <= 1 ? 1 : base;
		this.altura = altura <= 1 ? 1 : altura;
	}
	
	public Rectangulo() {
		this(2, 1, "negro");
	}
	
	public Rectangulo(double superficie, String color) {
		this(2 * (int)Math.sqrt(superficie / 2.), (int)Math.sqrt(superficie / 2.), color);
	}
	
	public double perimetro() {
		return 2 * (base + altura);
	}
	
	public double area() {
		return base * altura;
	}

	@Override
	public String toString() {
		return super.toString() + String.format(" de base %d y lado %d.", base, altura);
	}
	
}
