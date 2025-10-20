package profesiones;

public class Ingeniero extends Profesion {

	public Ingeniero(String nombre, short anioDeNacimiento, String especialidad) {
		super(nombre, anioDeNacimiento, especialidad);
	}

	@Override
	public void trabajar() {
		System.out.printf("El ingeniero [%s] está diseñando un proyecto de [%s].", getNombre(), getEspecialidad());		
	}
	
	public double calcularCostoProyecto(double horas, double tarifaPorHora) {
		return horas * tarifaPorHora;
	}

}
