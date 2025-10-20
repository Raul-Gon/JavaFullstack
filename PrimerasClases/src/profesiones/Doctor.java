package profesiones;

public class Doctor extends Profesion {

	public Doctor(String nombre, short anioDeNacimiento, String especialidad) {
		super(nombre, anioDeNacimiento, especialidad);
	}

	@Override
	public void trabajar() {
		System.out.printf("El doctor [%s] está atendiendo pacientes en el área de [%s].", getNombre(), getEspecialidad());
	}
	
	public void rectarMedicamento(String medicamento) {
		System.out.printf("El doctor [%s] ha recetado el medicamento [%s].", getNombre(), medicamento);
	}

}
