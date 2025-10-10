package telefonomovil;

public class Telefono {
	private boolean encendido = false;
	private int bateria = 20;
	private boolean consumo = false;
	private String modelo;
	private String marca;
	
	public Telefono(String modelo, String marca) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public void botonEncendido() {
		encendido = encendido ? false : true; 
	}
	
	public void estadoTelefono() {
		if (encendido) {
			System.out.printf("El teléfono %S se encuentra encendido con una batería de %d %%.%n", modelo, bateria);
		}else {
			System.out.printf("El teléfono %S está apagado.%n", modelo);
		}
	}
	
	public void hacerLLamada() {
		if (bateria >= 2 && bateria <= 100 && encendido) {
			bateria-= 2;
			this.bajoConsumo();
		}
		
		if (bateria < 2) {
			bateria = 0;
			this.apagadoTelefono();
		}
		
	}
	
	public void navegarInternet() {
		if (bateria >= 2 && bateria <= 100 && encendido) {
			bateria--;
			this.bajoConsumo();
		}
		
		if (bateria < 2) {
			bateria = 0;
			this.apagadoTelefono();
		}
		
	}
	
	public void bajoConsumo() {
		if (bateria < 10) {
			consumo = true;
			this.consultarBajoConsumo();
		}
	}
	
	public void consultarBajoConsumo() {
		if (consumo) {
			System.out.printf("El teléfono %S %S esta en modo BAJO consumo y la batería es %d %%.%n", marca, modelo, bateria);
		}else {
			System.out.printf("El teléfono %S %S esta en modo NORMAL DE consumo y su batería es %d %%.%n.", marca, modelo, bateria);
		}
	}
	
	public void recargaBateria() {
		if (bateria >= 0 && bateria <= 75) {
			bateria+= 25;
			consumo = false;
			encendido = true;
		}
	}
	
	public void apagadoTelefono() {
		encendido = false;
		System.out.println("El teléfono se ha apagado por poca bateria.");
	}
	
	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

	public boolean isConsumo() {
		return consumo;
	}

	public void setConsumo(boolean consumo) {
		this.consumo = consumo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public static void main(String[] args) {
		Telefono t1 = new Telefono("n6", "nokia");
		t1.botonEncendido();
		t1.estadoTelefono();
		t1.hacerLLamada();
		t1.estadoTelefono();
		t1.navegarInternet();
		t1.estadoTelefono();
		for (int i = 0; i < 5 ; i++) {
			t1.hacerLLamada();
		}
		t1.estadoTelefono();
		
		for (int i = 0; i < 10 ; i++) {
			t1.navegarInternet();
		}
		t1.estadoTelefono();
		
		t1.recargaBateria();
		t1.estadoTelefono();
		
		
	}
		

}
