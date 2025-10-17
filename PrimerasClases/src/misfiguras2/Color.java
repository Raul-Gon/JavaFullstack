package misfiguras2;

import java.util.Random;

public class Color {
	
	private static String[] colores = {"negro", "azul", "marrón", "gris", "verde", 
										"naranja", "rosa", "púrpura", "rojo", "blanco", "amarillo"};
	private static Random random = new Random();
	
	public static String colorValido(String color) {
		
		if (color == null) return colores[0];
		
		for (String c : colores) {
			if (color.toLowerCase().equals(c)) return c;
		}
		
		return colores[0];
	}
	
	public static String colorAleatorio() {
		
		return colores[random.nextInt(colores.length)];
	}
	
	
}
