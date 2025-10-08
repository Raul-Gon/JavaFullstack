package colecciones;

import java.util.ArrayList;
import java.util.Random;

public class ColectionArrayList2 {

	public static void main(String[] args) {
		
		//Crear un ArrayList con un 5 títulos de libros y muéstralos todos por pantalla  
		//utilizando para ello un bucle for y un bucle foreach
		ArrayList<String> Libros = new ArrayList<>();
		Libros.add("El principito");
		Libros.add("El enemigo");
		Libros.add("El paciente ingles");
		Libros.add("1492");
		Libros.add("La jauria");
		
		System.out.println("\033[35mImprimimos los elementos con un forEach for(tipo elemento : ArraylistDeElementos):");
		System.out.println("==================================================================================\u001B[0m");
		for (String Libro : Libros) {
			System.out.println(Libro);
		}
		
		System.out.println("\033[35mImprimimos los elementos con un for normal con for(int i; i < ArrayList.size(); i++):");
		System.out.println("=====================================================================================\u001B[0m");
		for (int i = 0; i < Libros.size(); i++) {
			System.out.println(Libros.get(i));			
		}
		
		//añadimos un punto al final
		System.out.println();
		System.out.println("\033[35mAñadimos un punto al final del titulo con los metodos de ArrayList:");
		System.out.println("===================================================================\u001B[0m");
		for (int i = 0; i < Libros.size(); i++) {
			String textoModificado = Libros.get(i) + ".";
			Libros.set(i, textoModificado);			
		}
		for (String Libro : Libros) {
			System.out.println(Libro);
		}
		
		//uno nuevo
		//otro ejercicio
		//Crear un ArrayList que contenga 20 números aleatorios entre 1 y 100.
		System.out.println();
		System.out.println("\033[35mCreamos un ArrayList de enteros Arraylist<Integer>:");
		System.out.println("===================================================\u001B[0m");
		ArrayList<Integer> listaAleatorios = new ArrayList<>();		
		int min = 1, max = 100;
		Random random = new Random();
		for (int i = 0; i < 20; i++) {
			listaAleatorios.add(random.nextInt(min, max + 1));
		}
		System.out.println(listaAleatorios);
		
		//Calcula y muestra por pantalla la cantidad, la suma, la media, el máximo y el mínimo de los valores
		System.out.println();
		System.out.println("\033[35mCantidad, la suma, la media, el máximo y el mínimo de los valores:");
		System.out.println("==================================================================\u001B[0m");
		int cantidad = 0, suma = 0, maximo = 0, minimo = 99;
		for (Integer integer : listaAleatorios) {
			cantidad++;
			suma += integer;
			if (integer > maximo) maximo = integer;
			if (integer < minimo) minimo = integer;
		}	
		double media = (double)suma / (double)cantidad;
		System.out.printf("Hay %d elementos y suman: %d, la media es: %.2f, el máximo es: %d y el mínimo es: %d.%n", cantidad, suma, media, maximo, minimo);

		//Elimina de la lista todos los que son menores que 50
		System.out.println();
		System.out.println("\033[35mEliminar de la lista todos los números menores de 50:");
		System.out.println("=====================================================\u001B[0m");
		/*for (int i = 0; i < listaAleatorios.size(); i++) {
			if (listaAleatorios.get(i) < 50) listaAleatorios.remove(listaAleatorios.get(i));
		}
		//esta no la utilizamos pq cada vez que borramos un elemento se nos cambia el indice y nos saltamos de comprobar
		//el elemento siguiete al borrado, se podria solucionar haciendo un (i--) en el if cuando borramos, o recorriendo 
		//la lista desde el ultimo elemento al primero, asi si borramos uno cuando cambie el indice del mas grande, este ya
		//lo hemos recorrido
		*/
		listaAleatorios.removeIf(n -> n < 50); //forma bonita de hacerlo con una funcion flecha
		System.out.println(listaAleatorios);
		
		//vuelvo a mostrar por pantalla la cantidad, la suma, la media, el máximo y el mínimo de los valores
		System.out.println();
		System.out.println("\033[35mVuelvo a mostrar la cantidad, la suma, la media, el máximo y el mínimo de los valores:");
		System.out.println("======================================================================================\u001B[0m");
		cantidad = 0;
		suma = 0;
		maximo = 0;
		minimo = 99;
		for (Integer integer : listaAleatorios) {
			cantidad++;
			suma += integer;
			if (integer > maximo) maximo = integer;
			if (integer < minimo) minimo = integer;
		}
		media = (double)suma / (double)cantidad;
		System.out.printf("Hay %d elementos y suman: %d, la media es: %.2f, el máximo es: %d y el mínimo es: %d.%n", cantidad, suma, media, maximo, minimo);
		
		
	}

}
