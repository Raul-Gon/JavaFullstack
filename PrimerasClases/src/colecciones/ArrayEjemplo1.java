package colecciones;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayEjemplo1 {
	
	public static void main(String[] args) {
		
		ArrayList<String> colores = new ArrayList<>();
		System.out.println(colores);
		
		String [] arrayColores = {"rojo", "amarillo", "verde", "rojo", "amarillo", "azul", "naranja", "marron", "verde"};
		System.out.println(Arrays.toString(arrayColores));
		
		while (colores.size() < 100) {
			for (int i = 0; i < 9; i++) {
				if (colores.size() == 100) break;
				colores.add(arrayColores[i]);
			}
		}
		
		System.out.println();
		System.out.println("\033[35mHemos llenado un ArrayList usando un array:");
		System.out.println("===========================================\u001B[0m");
		System.out.println(colores);
		
		System.out.println();
		System.out.println("\033[35mImprimimos con un bucle for normal:");
		System.out.println("===================================\u001B[0m");
		for (int i = 0; i < colores.size(); i++) {
			System.out.print(colores.get(i) + " ");
		}
		System.out.println();
		
		System.out.println();
		System.out.println("\033[35mImprimimos con un bucle forEach:");
		System.out.println("================================\u001B[0m");
		for (String color : colores) {
			System.out.print(color + " ");
		}
		System.out.println();
		
		System.out.println();
		System.out.println("\033[35mBorramos el segundo rojo de la lista:");
		System.out.println("=====================================\u001B[0m");
		int contadorRojo = 0;
		for (int i = 0; i < colores.size(); i++) {
			if (colores.get(i).equals("rojo")) {
				contadorRojo++;
				if (contadorRojo == 2) {
					colores.remove(i);
					break;					
				}
			}
		}
		for (String color : colores) {
			System.out.print(color + " ");
		}
		System.out.println();
		
		System.out.println();
		System.out.println("\033[35mBorramos el todos los amarillos de la lista on un removeIf():");
		System.out.println("=============================================================\u001B[0m");
		colores.removeIf(color -> color == "amarillo");
		//while (colores.remove("amarillo")); otra forma más bonita de hacerlo
		for (String color : colores) {
			System.out.print(color + " ");
		}
		System.out.println();
		
	}	
}
