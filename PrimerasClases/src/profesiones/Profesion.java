package profesiones;

import java.util.Calendar;

public abstract class Profesion {

	private final String nombre;
	private final short anioDeNacimiento;
	private String especialidad;
	
	
	
	public Profesion(String nombre, short anioDeNacimiento, String especialidad) {
		this.nombre = nombre;
		this.anioDeNacimiento = anioDeNacimiento;
		this.especialidad = especialidad;
	}
	
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public String getNombre() {
		return nombre;
	}
	public short getAnioDeNacimiento() {
		return anioDeNacimiento;
	}
	
	public abstract void trabajar();
	
	public short calcularEdad() {		
		int anioActual = Calendar.getInstance().get(Calendar.YEAR);
		return (short)(anioActual - anioDeNacimiento);
	}
	
	public String toString() {
		return String.format("Hola, soy %s, tengo %d años de edad, y tengo la especialidad de %s.%n", nombre, calcularEdad(), especialidad);
	}
	
}
