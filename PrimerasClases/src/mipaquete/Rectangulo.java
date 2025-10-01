package mipaquete;

public class Rectangulo {
	
	String color;
	int altura;
	int base;
	
	public Rectangulo (String color, int altura, int base) {
		this.altura = altura > 0 ? altura : 1 ;
		this.base = base > 0 ? base : 1 ;
		this.color = color;
	}
	
	public Rectangulo (int base, int altura) {
		//llamada de un constructor dentro de otro this(base, altura, "blanco");
		//sino lo hacemos como las lineas siguientes
		this.base = base;
		this.altura = altura;
		color = "blanco";
	}
	
	public Rectangulo () {
		/*
		base = 1;
		altura = 1;
		this.color = "blanco";
		*/
		this("blanco", 1, 1);
	}
	
	public static void main(String[] args) {
		Rectangulo r1= new Rectangulo("negro", 10, 30);
		System.out.printf("El rectangulo es de color: %S y tiene una base de: %d y una altura de %d.%n", r1.color, r1.base, r1.altura);
		
		Rectangulo r2= new Rectangulo(20, 50);
		System.out.printf("El rectangulo es de color: %S y tiene una base de: %d y una altura de %d.%n", r2.color, r2.base, r2.altura);
		
		Rectangulo r3= new Rectangulo();
		System.out.printf("El rectangulo es de color: %S y tiene una base de: %d y una altura de %d.%n", r3.color, r3.base, r3.altura);
	}

}
