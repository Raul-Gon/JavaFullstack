package dispositivo;

public class Dispositivo {
	private String modelo;
	private int horasDeUso;
	private boolean encendido;
	private int limiteHorasUso;
	
	public Dispositivo(String modelo, int limiteHorasUso) {
		this.modelo = modelo.length() > 15 ? "GENÉRICO" : modelo ;
		if (limiteHorasUso < 1_000) {
			this.limiteHorasUso = 1_000;
		}else if (limiteHorasUso > 10_000){
			this.limiteHorasUso = 10_000;
		}else {
			this.limiteHorasUso = limiteHorasUso;
		}
	}
	
	public Dispositivo() {
		this.modelo = "GENÉRICO";
		this.horasDeUso = 0;
		this.encendido = false;
		this.limiteHorasUso = 10_000;
	}
	
	public Dispositivo(Dispositivo dispo) {
		this.modelo  = dispo.modelo;
		this.horasDeUso = dispo.horasDeUso;
		this.encendido = dispo.encendido;
		this.limiteHorasUso = dispo.limiteHorasUso;
		
	}
	
	public void show() {
		String encend = encendido ? "encendido" : "apagado";
		System.out.printf("El %S está %s tiene un limite de horas de uso de %d h y ha usado %d h.%n", modelo, encend, limiteHorasUso, horasDeUso);
	}
	
	public boolean endender() {
		if (!encendido) {
			encendido = true;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean apagar() {
		if (encendido) {
			encendido = false;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean registroUso(int horas) {
		if (horasDeUso <= limiteHorasUso && horas < (limiteHorasUso - horasDeUso)) {
			horasDeUso+= horas;
			return true;
		}else if(horas > (limiteHorasUso - horasDeUso)){
			horasDeUso = limiteHorasUso;
			return true;
		}
		return false;		
	}
	
	public boolean requiereMantenimiento() {
		if (horasDeUso >= (limiteHorasUso * 0.8)) {
			return true;
		}
		return false;
	}
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean reiniciarUso() {
		if (!encendido && horasDeUso == limiteHorasUso) {
			horasDeUso = 0;
			return true;
		}
		return false;
	}
			
}
