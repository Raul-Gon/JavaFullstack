package telefonomovil;

public class Movil {
	private boolean encendido;
	private int nivelBateria = 20;
	
	// Encender y apagar el teléfono: debe permitir cambiar el estado del 
	// teléfono entre encendido y apagado
	public boolean cambiarEstado(){
		return (encendido = !encendido && nivelBateria != 0);
	}
	// Encender
	public void encender() {
		if (nivelBateria != 0) encendido = true;
	}
	// Apagar
	public void apagar() {
		encendido = false;
	}
	
	// Saber si está encendido: un método para consultar
	// si el teléfono está encendido o apagado. 	
	public boolean estaEncendido() {
		return encendido;
	}	
	
	private boolean consumir(int n) {
		if(!encendido || n <=0) return false;
		if(nivelBateria <= n) {
			nivelBateria = 0;
			encendido = false;
			return nivelBateria == n;
		}
		nivelBateria -=n;
		return true;
	}
	
	// Hacer una llamada: reduce un 2% del nivel de batería 
	// por cada llamada.	
	public boolean llamar() {
		return consumir(2);
	}
	
	// Navegar por internet: reduce un 1% del nivel de 
	// batería por cada sesión de navegación.
	public boolean navegar() {
		return consumir(1);
	}
	
	public static void main(String[] args) {
		System.out.println("Probar cambiarEstado()");
		System.out.println("======================");
		System.out.println("Creado móvil apagado");
		Movil m = new Movil();
		System.out.println("Cambiando estado: a encendido");
		System.out.println(m.cambiarEstado() ? "encendido": "apagado");
		System.out.println("Cambiando estado a apagado");
		System.out.println(m.cambiarEstado() ? "encendido": "apagado");
		System.out.println("Cambiando estado a encendido");
		System.out.println(m.cambiarEstado() ? "encendido": "apagado");
		
		
		System.out.println("Probando apagar() - encender()");
		System.out.println("==============================");
		System.out.println("Está encendido: uso encender (rdo: encendido)");
		m.encender();
		System.out.println(m.encendido ? "encendido": "apagado");
		
		System.out.println("Está encendido: uso apagar (rdo: apagado)");
		m.apagar();
		System.out.println(m.encendido ? "encendido": "apagado");
		
		System.out.println("Está apagado: uso apagar (rdo: apagado)");
		m.apagar();
		System.out.println(m.encendido ? "encendido": "apagado");
		
		System.out.println("Está apagado: uso encender (rdo: encendido)");
		m.encender();
		System.out.println(m.encendido ? "encendido": "apagado");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}
}
