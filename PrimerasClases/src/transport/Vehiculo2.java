package transport;

public class Vehiculo2 {
	private static String [] tiposCoche = {"coche", "moto", "camion", "bicicleta"};
	
	private String matricula;
	private String tipo;
	private short anioFabricacion;
	private int kilometraje;
	private boolean requiereMantenimiento = false;
	
	
	public Vehiculo2(String matricula, String tipo, short anioFabricacion, int kilometraje) {
		this.matricula = arreglaMatricula(matricula);
		this.tipo = arreglaTipo(tipo);
		this.anioFabricacion = anioFabricacion < 1990 ? 1990 : anioFabricacion > 2025 ? 2025 : anioFabricacion;
		this.kilometraje = kilometraje < 0 ? 0 : kilometraje;
		
	}
	
	public Vehiculo2(Vehiculo2 v) {
		matricula = v.matricula;
		tipo = v.tipo;
		anioFabricacion = v.anioFabricacion;
		kilometraje = v.kilometraje;
		requiereMantenimiento = v.requiereMantenimiento;
	}
	
	private static String arreglaMatricula(String matricula) {
		if (matricula == null) return "DESCONOCIDA";
		
		if (matricula.length() != 7) return "DESCONOCIDA"; 
		
		for (int i = 0; i < 3 ; i++) {
			if (matricula.charAt(i) < 'A' && matricula.charAt(i) > 'Z' ) return "DESCONOCIDA";		
		}
		for (int i = 3; i < 7 ; i++) {
			if (matricula.charAt(i) < '0' && matricula.charAt(i) > '9' ) return "DESCONOCIDA";		
		}		
		return matricula;
	}
	
	private static String arreglaTipo(String tipo) {
		if (tipo == null) return "coche";		
		
		for  (String tipoCoche : tiposCoche) {
			if (tipoCoche.equals(tipo)) return tipo;
		}			
		return "coche";
	}
	
	public void mostrar() {
		System.out.printf("Vehículo [%s] (%s) del año %d con %d km. Requiere mantenimiento: %s.%n", matricula, tipo, anioFabricacion, kilometraje, requiereMantenimiento ? "Si" : "No");
	}
	
	public static void main(String[] args) {
		Vehiculo2 v1 = new Vehiculo2("dfdsfdsfs", "dkjd", (short)2000, -12);
		v1.mostrar();
	}
	
}
