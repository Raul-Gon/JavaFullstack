package principal;

public class Libro extends Publicacion {	
	//atributo especifico de libro estaticos
	private static String mensajeCabecera = "\nDATOS LIBRO\n===========\n";
	//atributo especifico de libro
	private String autor;	
	
	//constructor 
	public Libro(String titulo, String autor, int numPags, int pagInicial, boolean formatoDigital, double precio) {
		
		super(titulo, numPags,(int)(pagInicial <= 0 ? 1 : pagInicial), formatoDigital, precio);
		
		this.autor = autor;
	}
	//getters and setters
	public static String getMensajeCabecera() {
		return mensajeCabecera;
	}
	
	//metodos
	public String getAutor() {
		return autor;
	}
	
	public void show() {
		System.out.print(mensajeCabecera +"Autor: " + autor + "\n");
		super.show();
	}
		
	public void leePagina(boolean silenciosamente) {		
		if (!isLeido()) {		
			if (super.getPagActual() < super.getNumPags()) {
				super.leePagina(true);
				System.out.printf("del libro titulado %s del autor %s.%n", super.getTitulo(), autor);
			}else if (super.getPagActual()  == super.getNumPags()) {
				super.leePagina(true);
				System.out.printf("del libro titulado %s del autor %s.%n", super.getTitulo(), autor);
			}		
		}else {
			System.out.printf("Libro titulado %s del autor %s ya ha sido leido.%n", super.getTitulo(), autor);
		}		
	}
	
	public static void leePaginaStatic(boolean silenciosamente, Libro lib) {
		lib.leePagina(silenciosamente);
	}
	
}
