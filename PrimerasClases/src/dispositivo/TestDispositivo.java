package dispositivo;

public class TestDispositivo {
	
	public static void main(String[] args) {
		
		Dispositivo d1 = new Dispositivo("RELOJ-01", 10_000);
		Dispositivo d2 = new Dispositivo("TABLET-X", 15_000);
		Dispositivo d3 = new Dispositivo();
		Dispositivo d4 = new Dispositivo("LAPTOR-PRO", 8_000);
		Dispositivo d5 = new Dispositivo("GENÉRICO", 12_000);		
		
		Dispositivo [] arrayDispositivo = {d1, d2, d3, d4, d5};
		System.out.println("ESTADO INICIAL DISPOSITIVOS:");
		System.out.println("============================");
		for (Dispositivo dispo : arrayDispositivo) {
			dispo.show();
		}
		
		System.out.println();
		System.out.println("ENCENDER DISPOSITIVOS:");
		System.out.println("======================");
		int contador= 0;
		while (contador < arrayDispositivo.length) {
			arrayDispositivo[contador].endender();
			contador ++;
		}
		for (Dispositivo dispo : arrayDispositivo) {
			dispo.show();
		}
		
		System.out.println();
		System.out.println("DISPOSITIVOS DESPUES DE 1000 h DE USO:");
		System.out.println("======================================");
		for (int j = 0; j < 5; j++) {
			arrayDispositivo[j].registroUso(1000);
		}
		for (Dispositivo dispo : arrayDispositivo) {
			dispo.show();
		}

		System.out.println("======================================");
		
		arrayDispositivo[1].registroUso(10700);		
		arrayDispositivo[3].registroUso(10500);
		for (Dispositivo dispo : arrayDispositivo) {
			dispo.show();
		}
		
		System.out.println();
		System.out.println("DISPOSITIVOS QUE REQUIEREN MANTENIMIENTO:");
		System.out.println("=========================================");
		for (Dispositivo dispo : arrayDispositivo) {
			if (dispo.requiereMantenimiento()) {
				System.out.printf("El dispositivo %s requiere mantenimiento.%n", dispo.getModelo());
			}
		}
		
		System.out.println();
		System.out.println("DISPOSITIVOS QUE SE HAN PODIDO APAGAR Y REINICIAR:");
		System.out.println("==================================================");
		for (Dispositivo dispo : arrayDispositivo) {
			dispo.apagar();
			if (dispo.reiniciarUso()) {
				System.out.printf("El dispositivo %s se ha podido reiniciar.%n", dispo.getModelo());
			}
		}

		System.out.println("==================================================");
		for (Dispositivo dispo : arrayDispositivo) {
			dispo.show();
		}
	}
}
