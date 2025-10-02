package transport;

import java.time.LocalDate;

public class Vehiculo {
	private String matricula;
	private short anoFabricacion;
	private String tipo;
	private int kilometraje;
	private boolean requiereMantenimiento = false;

	public Vehiculo(String matricula, String tipo, int ano, int kilometraje) {
		short anoFabricacion = (short)ano;
		
		this.matricula = (matricula.length() > 10 || matricula.length() == 0) ? "DESCONOCIDA" : matricula.toUpperCase();
		
		tipo = tipo.toLowerCase();
		this.tipo = ("moto".equals(tipo) || "camion".equals(tipo) || "bicicleta".equals(tipo)) ? tipo : "coche";
		
		short anoActual = (short)(LocalDate.now().getYear());
		this.anoFabricacion = (anoFabricacion < 1990) ? 1990 : (anoFabricacion > anoActual) ? anoActual : anoFabricacion;
		
		this.kilometraje = kilometraje < 0 ? -kilometraje : kilometraje;
		
	}
	
	public Vehiculo(Vehiculo v) {
		matricula = v.matricula;
		anoFabricacion = v.anoFabricacion;
		tipo = v.tipo;
		kilometraje = v.kilometraje;
		requiereMantenimiento = v.requiereMantenimiento;
		
	}
	
	public void mostrar() {
		String mantenimiento = requiereMantenimiento ? "si" : "no";
		System.out.printf("Vehiculo [%s] (%s) del año %d con %d Km. Requiere\033[35m mantenimiento:\u001B[0m %s.%n", matricula, tipo, anoFabricacion, kilometraje, mantenimiento);
		
	}
	
	public boolean actualizarKilometraje(int nuevoKilometraje) {
		if (nuevoKilometraje > kilometraje) {
			kilometraje = nuevoKilometraje;
			return true;
		}
		return false;
	}
	
	public boolean marcarParaMantenimiento() {
		if (requiereMantenimiento) return false;
		requiereMantenimiento = true;
		return true;
		
	}
	
	public int calcularAntiguedad() {
		short anoActual = (short)(LocalDate.now().getYear());
		return anoActual - anoFabricacion;
		
	}
	
	public boolean mismaAntiguedad(Vehiculo ve) {
		if (ve.anoFabricacion == anoFabricacion) return true;
		return false;
	}
	
	public boolean esIgual(Vehiculo vehicu) {
		if (vehicu.matricula.equals(matricula) && vehicu.tipo.equals(tipo)) return true;
		return false;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("CONSTRUYO EL VEHICULO 1:");
		System.out.println("========================");
		Vehiculo v1 = new Vehiculo("abv9809", "CAMION", 1980, -87900);
		v1.mostrar();

		System.out.println();
		System.out.println("CONSTRUYO EL VEHICULO 2:");
		System.out.println("========================");
		Vehiculo v2 = new Vehiculo(v1);
		v2.mostrar();

		System.out.println();
		System.out.println("ACTUALIZAMOS Y MARCAMOS PARA MANTENIMIENTO AL VEHICULO 1:");
		System.out.println("=========================================================");
		System.out.println(v1.actualizarKilometraje(250));
		System.out.println(v1.actualizarKilometraje(150555));
		v1.mostrar();
		System.out.println(v1.marcarParaMantenimiento());
		v1.mostrar();

		System.out.println();
		System.out.println("CONSTRUYO EL VEHICULO 3:");
		System.out.println("========================");
		Vehiculo v3 = new Vehiculo("sfgh238564876", "avion", 2200, 23456);
		v3.mostrar();
		
		System.out.println();
		System.out.println("COMPARAMOS VEHICULO 1 Y 2:");
		System.out.println("==========================");
		System.out.println("Este vehiculo tiene una antiguedad de: " + v1.calcularAntiguedad() + " años." );
		
		System.out.println("¿El vehiculo uno tiene la misma antigüedad que el vehiculo dos? " + v1.mismaAntiguedad(v2));
		
		System.out.println("¿El vehiculo uno es igual al vehiculo dos? " + v1.esIgual(v2));
		
		
		System.out.println();
		System.out.println("COMPARAMOS VEHICULO 1 Y 3:");
		System.out.println("==========================");		
		System.out.println("¿El vehiculo uno tiene la misma antigüedad que el vehiculo tres? " + v1.mismaAntiguedad(v3));
		
		System.out.println("¿El vehiculo uno es igual al vehiculo tres? " + v1.esIgual(v3));
	}
		
}
