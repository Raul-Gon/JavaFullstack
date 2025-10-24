package principal2;

public class Revista extends Publicacion {
	//static
	private static String mensajeCabecera = "\nDATOS REVISTA\n=============";	
		
	public Revista (String titulo, int numPags, boolean formatoDigital, double precio){
		super(titulo, numPags, 1, formatoDigital, precio);
	}
	
	@Override
	public void show() {
		System.out.println(mensajeCabecera);
		super.show();
	}

	@Override
	public void mensajeLecturaPublicacionLeida() {
		System.out.printf("Revista %s ya ha sido leída.%n", getTitulo());
		
	}

	@Override
	public void mensajeLecturaPaginaNoFinal() {
		System.out.printf("Página %d leída de la revista titulada %s.%n", getPagActual(), getTitulo());
		
	}

	@Override
	public void mensajeLecturaPaginaFinal() {
		System.out.printf("Última página (%d) leída de la revista titulada %s%n%", getPagActual(), getTitulo());
		
	}
	
}
