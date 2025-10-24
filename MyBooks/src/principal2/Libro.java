package principal2;

public class Libro extends Publicacion {
	//atributos static
	private static String mensajeCabecera = "\nDATOS LIBRO\n===========";	
	//atributos
	private String autor;
	
	//constructor
	public Libro (String titulo, String autor, int numPags, int pagInicial, boolean formatoDigital, double precio){
		super(titulo, numPags, pagInicial, formatoDigital, precio);
		this.autor = autor;		
	}
	
	@Override
	public void show() {
		System.out.println(mensajeCabecera);
		System.out.printf("Autor; %s%n", autor);
		super.show();
	}

	@Override
	public void mensajeLecturaPublicacionLeida() {
		System.out.printf("Libro %s del autor %s ya ha sido leído.%n", getTitulo(), autor);
		
	}

	@Override
	public void mensajeLecturaPaginaNoFinal() {
		System.out.printf("Página %d leída del libro titulado %s del autor %s.%n", getPagActual(), getTitulo(), autor);
		
	}

	@Override
	public void mensajeLecturaPaginaFinal() {
		System.out.printf("Última página (%d) leída del libro titulado %s del autor %s.%n%", getPagActual(), getTitulo(), autor);
		
	}
	
}
