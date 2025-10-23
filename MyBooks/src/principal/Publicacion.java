package principal;

public abstract class Publicacion implements CanRead {
	//atributos staticos
	private static int nextId = 1;
	//atributos 
	private String titulo;
	private int numPags;
	private int pagInicial;
	private boolean formatoDigital;
	private double precio;
	private int id;
	private int pagActual;
	private boolean leido;
	
	//Constructor
	public Publicacion(String titulo, int numPags, int pagInicial, boolean formatoDigital, double precio) {
		this.id = nextId++;		
		this.titulo = titulo;
		this.numPags = numPags;
		this.formatoDigital = formatoDigital;
		this.precio = precio;
		this.pagInicial = pagInicial;
		this.pagActual = pagInicial;
		this.leido = false;
	}
	//getters and setters
	public int getNumPags() {
		return numPags;
	}
	public boolean isLeido() {
		return leido;
	}
	public String getTitulo() {
		return titulo;
	}
	public double getPrecio() {
		return precio;
	}
	public int getId() {
		return id;
	}
	public int getPagActual() {
		return pagActual;
	}
	
	//metodo abstracto a implementar en los herederos
	public abstract void imprimeLaParteDelHijo();
	
	//metodo toString()
	@Override
	public String toString() {		
		return "Publicacion \"" + titulo + "\" con " + numPags + "precio " + precio + "€";
	}

	//metodo de la interface
	@Override
	public void leePagina(boolean silenciosamente) {		
		if (!leido) {
			if (pagActual  < numPags) {
				pagActual++;
				if (!silenciosamente) {
					System.out.printf("Página %d leída ", pagActual - 1);
					imprimeLaParteDelHijo();
				}				
			}else if (pagActual == numPags) {
				leido = true;
				if (!silenciosamente) {
					System.out.printf("Última página (%d) leída ", pagActual);
					imprimeLaParteDelHijo();
				}
			}
		}else {
			if (!silenciosamente) System.out.printf("%s ya ha sido leido.%n", getTitulo());
		}	
	}

	//metodos
	public void show() {	
		System.out.printf("Titulo: %s%nId: %d%nPáginas: %d%nPágina inicial: %d%nPágina actual: %d%nPrecio: %.2f%nFormato digital: %b%nLeido: %b%n"
							, titulo, id, numPags, pagInicial, pagActual, precio, formatoDigital, leido);
	}
	
	public static void showStatic(Publicacion publi) {		
		publi.show();
	}
		
}
