package aparatos;

public class Reloj {
	private int horas;
	private int minutos;
	private String modelo;
	private boolean en24Horas;
	
	public Reloj(int horas, int minutos, String modelo) {
		
		en24Horas = true;
		
		this.horas = (horas >= 0 || horas < 24) ? horas : 0;
		
		this.minutos = (minutos >= 0 || minutos < 60) ? minutos : 0;
		
		this.modelo = (modelo != null) ? modelo.toUpperCase() : "BASIC-WATCH";
				
	}
	
	public Reloj(int horas, int minutos) {
		this(horas, minutos, "BASIC-WATCH");
		
	}
	
	public Reloj() {
		this(0, 0, "BASIC-WATCH");
	}
	
	public Reloj(Reloj r) {
		horas = r.horas;
		minutos = r.minutos;
		modelo = r.modelo;
		en24Horas = r.en24Horas;
		
	}
	
	public void mostrarHora() {
		if (en24Horas) {
			System.out.printf("Reloj (%s): %2d:%2d.%n", modelo, horas, minutos);
		}else {
			if (horas < 13) {
				System.out.printf("Reloj (%s): %2d:%2d AM.%n", modelo, horas, minutos);
			}else {
				System.out.printf("Reloj (%s): %2d:%2d PM.%n", modelo, (horas - 12), minutos);				
			}
		}
		
	}
	
	public boolean incrementarMinuto() {
		if (minutos < 59) {
			minutos++;
		}else {
			minutos = 0;
			this.incrementarHora();
		}
		return true;
	}
	
	public boolean incrementarHora() {
		if (horas < 23) {
			horas++;
		}else {
			horas = 0;			
		}
		return true;
	}
	
	public boolean cambiarFormato() {
		en24Horas = !en24Horas;
		return true;
	}

}
