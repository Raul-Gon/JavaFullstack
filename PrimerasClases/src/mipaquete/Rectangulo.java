package mipaquete;

public class Rectangulo {
	
	private static int nextId = 1;
	private static long areaTotal = 0;
	private static long perimetroTotal = 0;
	private int id;
	private String color;
	private int base;
	private int altura;
	
	public Rectangulo (String color, int altura, int base) {
		id = nextId++;
		this.altura = altura > 0 ? altura : 1 ;
		this.base = base > 0 ? base : 1 ;
		this.color = color;
		areaTotal += area();
		perimetroTotal += perimetro();
	}
	
	public Rectangulo (int base, int altura) {
		this("blanco", altura, base);
	}
	
	public Rectangulo () {
		/*
		base = 1;
		altura = 1;
		this.color = "blanco";
		*/
		this("blanco", 1, 1);
	}
	
	public void mostrar() {
		System.out.printf("El rectangulo (%d) es de color: %S y tiene una base de: %d y una altura de %d.%n", id, color, base, altura);
	}
	
	public int perimetro() {
		return 2 * (base + altura);
	}
	
	public int area() {
		return base * altura;
	}
	
	public static int rectangulosCreados() {
		return nextId - 1;
	}
	
	public static void mostrarTotales() {
		System.out.printf("Totales (Cantidad: %d, Superficie: %d, Perímetro: %d).%n", rectangulosCreados(), areaTotal, perimetroTotal);
	}
	
	public static void main(String[] args) {
		
		mostrarTotales();
		
		System.out.println();
		Rectangulo r1= new Rectangulo("negro", 10, 30);
		r1.mostrar();
		System.out.println("El perímetro de r1 es : " + r1.perimetro());
		System.out.println("El área de r1 es : " + r1.area());
		
		System.out.println();
		Rectangulo r2= new Rectangulo(20, 50);
		r2.mostrar();
		System.out.println("El perímetro de r2 es : " + r2.perimetro());
		System.out.println("El área de r2 es : " + r2.area());
		
		System.out.println();
		Rectangulo r3= new Rectangulo();
		r3.mostrar();
		System.out.println("El perímetro de r3 es : " + r3.perimetro());
		System.out.println("El área de r3 es : " + r3.area());
		
		System.out.println();
		Rectangulo.mostrarTotales();
		mostrarTotales();
	}

}
