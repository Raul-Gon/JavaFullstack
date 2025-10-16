package misfiguras;

import java.util.Random;

public class MiPrograma {

	public void test() {
		
	}
	
	public static void main(String[] args) {

		String[] colores = {"negro", "azul", "marron", "gris", "verde", "naranja", "rosa", "purpura", "rojo", "blanco", "amarillo"};
		Random random = new Random();
		
		System.out.println("\033[35mArray de cuadrados:");
		System.out.println("===================\u001B[0m");
		Cuadrado[] arrayCuadrados = new Cuadrado[10];
		for (int i = 0; i < 10; i++) {
			arrayCuadrados[i] = new Cuadrado(random.nextInt(1, 20), colores[random.nextInt(1, 11)]);
		}		
		for (Cuadrado cuadrado : arrayCuadrados) {
			System.out.print(cuadrado);
		}
		
		System.out.println();
		System.out.println("\033[35mArray de rectangulos:");
		System.out.println("=====================\u001B[0m");
		
	}

}
