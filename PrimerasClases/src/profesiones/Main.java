package profesiones;

public class Main {
	
	public static void main(String[] args) {
		
		Doctor[] doctores = new Doctor[3];
		doctores[0] = new Doctor("Juan", (short)1980, "Cirugia");
		doctores[1] = new Doctor("Jose", (short)1987, "Psicologia");
		doctores[2] = new Doctor("Manuel", (short)1988, "Trauma");
		
		for (Doctor doctor : doctores) {
			System.out.print(doctor);
		}
		
		Ingeniero[] ingenieros = new Ingeniero[3];
		ingenieros[0] = new Ingeniero("Antonio", (short)1990, "Automobilismo");
		ingenieros[1] = new Ingeniero("Edu", (short)1992, "Arquitectura");
		ingenieros[2] = new Ingeniero("Fran", (short)1999, "Obras Publicas");
		
		for (Ingeniero ingeniero : ingenieros) {
			System.out.print(ingeniero);
		}
		
		Doctor[] doctores = new Doctor[3];
		doctores[0] = new Doctor("Juan", (short)1980, "Cirugia");
		doctores[1] = new Doctor("Jose", (short)1987, "Psicologia");
		doctores[2] = new Doctor("Manuel", (short)1988, "Trauma");
		
		for (Doctor doctor : doctores) {
			System.out.print(doctor);
		}
		
/*				
		String [] nombres = {"Juan", "Jose", "Manuel", "Antonio", "Edu", "Fran", "Javi", "Celu", "Pepe"};
		short [] anios = {1980, 1987, 1988, 1990, 1992, 1999, 2000, 2001, 2002};
		String [] especialidades = {"Cirugia", "Psicologia", "Trauma", "Arquitectura", "Automobilismo", "Obras Publicas", "Matemáticas", "Lengua", "Ciencias"};
		
		Profesion [] profesionales = new Profesion[9];
		
		for (int i = 0; i < profesionales.length; i++) {
		    profesionales[i] = new Profesion(nombres[i], anios[i], especialidades[i]);
		}
		
*/
		
	}

}
