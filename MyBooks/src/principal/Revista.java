package principal;

public class Revista extends Publicacion {
	//atributo especifico de revista
	private static String mensajeCabecera = "\nDATOS REVISTA\n===========\n";	
	
	//constructor de revista
	public Revista(String titulo, int numPags, boolean formatoDigital, double precio) {
		
		super(titulo, numPags, 1, formatoDigital, precio);
		
	}
	//getters and setters
	public static String getMensajeCabecera() {
		return mensajeCabecera;
	}
	
	//metodos
	public void show() {
		System.out.print(mensajeCabecera);
		super.show();
	}
	
	public void leePagina(boolean silenciosamente) {		
		if (!isLeido()) {		
			if (super.getPagActual() < super.getNumPags()) {
				super.leePagina(true);
				System.out.printf("de la revista titulada %s.%n", super.getTitulo());
			}else if (super.getPagActual() == super.getNumPags()) {
				super.leePagina(true);
				System.out.printf("de la revista titulada %s.%n", super.getTitulo());
			}		
		}else {
			System.out.printf("Revista titulada %s ya ha sido leido.%n", super.getTitulo());
		}		
	}	
	
	public static void leePaginaStatic(boolean silenciosamente, Revista revis) {
		revis.leePagina(silenciosamente);
	}
	
}
