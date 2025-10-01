package mipaquete;

public class Animal {

	double precio;
	String descripcion;
	int cantidad;
	String especie;
	boolean oferta;
	boolean animalDeAyuda;

	public Animal(double precio, String descripcion, int cantidad, String especie, boolean oferta,
			boolean animalDeAyuda) {
		this.precio = precio;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.especie = especie;
		this.oferta = oferta ? true : false;
		this.animalDeAyuda = animalDeAyuda;
	}

	public Animal(double precio, String descripcion, int cantidad, String especie) {
		this(precio, descripcion, cantidad, especie, false, false);
	}

	public Animal() {
		this(1.0, "sin descripcion", 1, "", false, false);
	}
		
	public void imprimete() {
		System.out.printf("El %s de la especie %s tiene un precio de %.2f, hay %d, %s y %s.%n", descripcion,
				especie, precio, cantidad, (oferta ? "está en oferta" : "no está de oferta"),
				(animalDeAyuda ? "es un animal de compañia" : "no es de compañia"));
	}
}
