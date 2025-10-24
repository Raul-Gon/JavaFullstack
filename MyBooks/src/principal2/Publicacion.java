package principal2;

public abstract class Publicacion implements CanRead {
	//atributos static
	private static int nextId = 0;
	//atributos
	private String titulo;
	private int numPags;
	private int pagInicial;
	private boolean formatoDigital;
	private double precio;
	private int id;
	private int pagActual;
	private boolean leido;
	
	public abstract void mensajeLecturaPublicacionLeida();
	public abstract void mensajeLecturaPaginaNoFinal();
	public abstract void mensajeLecturaPaginaFinal();
	
	//constructor
	public Publicacion (String titulo, int numPags, int pagInicial, boolean formatoDigital, double precio){
		
		this.titulo = titulo == null || titulo.length() == 0 ? "Sin título" : titulo;
		this.numPags = numPags < 10 ? 10 : numPags;
		this.pagInicial = pagInicial > this.numPags || pagInicial < 1 ? 1 : pagInicial;
		this.formatoDigital = formatoDigital;
		this.precio = precio < 0 ? 0 : precio;
		this.id = nextId++;
		this.pagActual = this.pagInicial;
		this.leido = false;	
	}

	@Override
	public String toString() {
		return String.format("Publicación \"%s\" con %d páginas y precio %.2f€%n", titulo, numPags, precio);
	}
	
	public void show() {
		System.out.printf("Titulo: %s%n", titulo);
		System.out.printf("Id: %d%n", id);
		System.out.printf("Páginas: %d%n", numPags);
		System.out.printf("Página Inicial: %d%n", pagInicial);
		System.out.printf("Página Actual: %d%n", pagActual);
		System.out.printf("Precio: %.2f%n", precio);
		System.out.printf("Formato digital: %b%n", formatoDigital);
		System.out.printf("Leido: %b%n", leido);		
	}
	
	public static void showStatic(Publicacion publicacion) {
		publicacion.show();
	}
	
	@Override
	public void leePagina(boolean silenciosamente) {
		if(leido) {
			if(!silenciosamente) mensajeLecturaPublicacionLeida();
		}else {
			if(pagActual != numPags) {
				if(!silenciosamente) mensajeLecturaPaginaNoFinal();
				pagActual++;
			}else {
				if(!silenciosamente) mensajeLecturaPaginaFinal();
				leido = true;
			}
		}
	}
	
	public static void leePaginaStatic(boolean silenciosamente, Publicacion publicacion) {
		publicacion.leePagina(silenciosamente);
	}
	
	public String getTitulo() {
		return titulo;
	}
	public int getPagActual() {
		return pagActual;
	}
	
	
	public static void ListadoA(Publicacion[] publicaciones) {
		System.out.println();
		System.out.println("Listado A:");
		System.out.println("=========");
		for (Publicacion publicacion : publicaciones) {
			if (publicacion instanceof Libro) {
				System.out.printf("Id: %d, titulo: %s.%n", publicacion.id, publicacion.titulo);
			}
		}
	}
	
	public static void ListadoB(Publicacion[] publicaciones) {
		System.out.println();
		System.out.println("Listado B:");
		System.out.println("=========");
		for (Publicacion publicacion : publicaciones) {
			if (publicacion instanceof Revista) {
				System.out.printf("Id: %d, titulo: %s.%n", publicacion.id, publicacion.titulo);
			}
		}
	}
	
	public static void ListadoC(Publicacion[] publicaciones) {
		System.out.println();
		System.out.println("Listado C:");
		System.out.println("=========");
		for (Publicacion publicacion : publicaciones) {
			if (publicacion.precio > 20) {
				System.out.printf("Id: %d, titulo: %s y precio %.2f.%n", publicacion.id, publicacion.titulo, publicacion.precio);
			}
		}
	}
	
}
