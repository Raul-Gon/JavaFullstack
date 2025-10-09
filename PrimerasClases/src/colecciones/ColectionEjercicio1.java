package colecciones;

import java.util.ArrayList;
import java.util.Random;

public class ColectionEjercicio1 {
	
	public static void main(String[] args) {
		
		System.out.println();
		System.out.println("\033[35mCrea un ArrayList que contenga los primeros n números pares:");
		System.out.println("============================================================\u001B[0m");
		int n = 10;
		ArrayList<Integer> pares = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			pares.add(i * 2);
		}
		System.out.println(pares);
		
		System.out.println();
		System.out.println("\033[35mCrea un ArrayList que contenga los primeros n números múltiplos de m a partir de un número dado p:");
		System.out.println("==================================================================================================\u001B[0m");
		ArrayList<Integer> multiplos = new ArrayList<>();
		int multiploDe = 10, desde = 20, cantidad = 12;
		/*for (int valor = desde; multiplos.size() < cantidad; valor++) {
			if (valor % multiploDe == 0) multiplos.add(valor);
		}
		//de esta forma recorremos todos los numeros uno por uno, de la forma de abajo optimizamos mas el ejercicio
		*/
		int primerMultiploDe = desde;
		for ( int i = 0; i < multiploDe; i++) {
			if ( (desde + i) % multiploDe == 0) {
				primerMultiploDe = desde + i;
				break;
			}
		}
		for (int valor = primerMultiploDe; multiplos.size() < cantidad; valor += multiploDe) {
			multiplos.add(valor);
		}
		System.out.println(multiplos);
		
		System.out.println();
		System.out.println("\033[35mCrear un ArrayList de String de 4 letras del alfabeto ingles y hacer varias cosas:");
		System.out.println("==================================================================================\u001B[0m");
		ArrayList<String> palabrasAleatorias = new ArrayList<>();
		Random random = new Random();
		for ( int i = 1; i <= 30; i++) {
			String palabraAleatoria = "";
			for (int j = 0; j < 4; j++) {
				palabraAleatoria += (char)(random.nextInt((int)'a', (int)'z' + 1));			
			}
			palabrasAleatorias.add(palabraAleatoria);
		}
		System.out.println(palabrasAleatorias);
		
		ArrayList<String> palabrasAleatoriasFiltradas = new ArrayList<>();
		
		for (String palabra : palabrasAleatorias) {
			if (palabra.endsWith("a") || palabra.endsWith("c")) {
				palabrasAleatoriasFiltradas.add(palabra);
			}
		}
		System.out.println(palabrasAleatoriasFiltradas);
	}

}
