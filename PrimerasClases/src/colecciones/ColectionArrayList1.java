package colecciones;

import java.util.ArrayList;
import java.util.Arrays;

public class ColectionArrayList1 {

	public static void main(String[] args) {
		//CON ARRAYS UNA OPERACION PARA AÑADIR UN NUMREO
		int [] ListaNumeros = {1, 3, 5};
		int numeroAniadir = 7;
		
		int [] ListaNumerosAmpliada = new int [ListaNumeros.length + 1];
		
		for (int i = 0; i < ListaNumeros.length; i++) {
			ListaNumerosAmpliada[i] = ListaNumeros[i];
		}
		
		ListaNumerosAmpliada[ListaNumerosAmpliada.length - 1] = numeroAniadir;
		//FIN CON ARRAYS
		
		
		//CON LISTAS
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("one"); //AÑADIMOS ELEMENTOS AL ARRAY LIST
		arrayList.add("two");
		arrayList.add("three");
		for (String string : arrayList) {
			System.out.println(string);
		}
		System.out.println("========================================");
		String uno = arrayList.get(0); //NOS DA EL VALOR EN EL INDICE INDICADO
		arrayList.remove(0); //BORRA EL VALOR EN EL INDICE INDICADO
		for (String string : arrayList) {
			System.out.println(string);
		}
		System.out.println("========================================");
		arrayList.add(0, "zero"); //AÑADE EN EL INDICE INDICADO EL ELEMENTO DADO
		for (String string : arrayList) {
			System.out.println(string);
		}
		System.out.println("========================================");
		
		System.out.println(arrayList);
		System.out.println();
		
		
		//Crear un ArrayList con elementos de tipo String y trabaja y entiende todos los métodos anteriores excepto removeIf(filtro)
		System.out.println("Creamos uno ArrayList del tipo String y añadimos elementos con add():");
		System.out.println("=====================================================================");
		ArrayList<String> array1 = new ArrayList<>();
		array1.add("Hola");
		array1.add("señor");
		array1.add("Juán");
		array1.add("Pérez");
		System.out.println(array1);
		System.out.println();
		
		System.out.println("Ahora añadimos elementos con add(indice, elemento):");
		System.out.println("===================================================");
		array1.add(2, "Miguel");
		System.out.println(array1);
		System.out.println();
		
		System.out.println("Ahora eliminamos todos los elementos con clear():");
		System.out.println("=================================================");
		array1.clear();
		System.out.println(array1);
		System.out.println();
		
		array1.add("Hola");
		array1.add("señor");
		array1.add("Juán");
		array1.add("Pérez");
		
		System.out.println("Preguntamos si esta unos elementos en la lista con contains(elemento):");
		System.out.println("======================================================================");
		System.out.println("¿Contiene la lista el elemento señor? " + array1.contains("señor"));
		System.out.println("¿Contiene la lista el elemento Sandra? " + array1.contains("Sandra"));
		System.out.println(array1);
		System.out.println();
		
		System.out.println("Ahora obtenemos el elemento con get(indice):");
		System.out.println("============================================");
		System.out.println("Dame el elemento de la lista con indice 2: " + array1.get(2));
		System.out.println(array1);
		System.out.println();
		
		System.out.println("Ahora obtenemos el indice donde está el elemento con indexOf(element):");
		System.out.println("======================================================================");
		System.out.println("Dame el indice del elemento Pérez: " + array1.indexOf("Pérez"));
		System.out.println("Dame el indice del elemento Miguel: " + array1.indexOf("Miguel") + " porque no lo encuentra.");
		System.out.println(array1);
		System.out.println();
		
		System.out.println("Ahora preguntamos si hay algun elemento en la lista isEmpty():");
		System.out.println("==============================================================");
		System.out.println("¿Está vacio el array? " + array1.isEmpty());
		System.out.println(array1);
		System.out.println();
		
		System.out.println("Ahora borramos un elemento en la lista con el indice remove(indice):");
		System.out.println("====================================================================");
		System.out.println("Borrar el elemento en el indice 1: " + array1.remove(1));
		System.out.println(array1);
		System.out.println();
		
		System.out.println("Ahora borramos un elemento en la lista con el elemento (borra el primer elemento que se encuentra) remove(elemento):");
		System.out.println("====================================================================================================================");
		System.out.println("Borrar el elemento en el indice Juán: " + array1.remove("Juán"));
		System.out.println(array1);
		System.out.println();
		
		System.out.println("Ahora sobreescribimos un elemento en la lista con el indice set( indice, elemento):");
		System.out.println("===================================================================================");
		System.out.println("Sobreescribe el elemento 1: " + array1.set(1, "Gómez"));
		System.out.println(array1);
		System.out.println();
		
		System.out.println("Preguntamos el tamaño de la lista con size():");
		System.out.println("=============================================");
		System.out.println("Elementos del ArrayList: " + array1.size());
		System.out.println(array1);
		System.out.println();
		
		System.out.println("Creamos un Array a partir de la lista con toArray():");
		System.out.println("=============================================");
		String[] array2 = array1.toArray(new String[0]);
		System.out.println(array2);
        System.out.println(Arrays.toString(array2)); //forma de imprimir un array normal y mostrar sus elementos
        System.out.println(array1);
        System.out.println();
		
		
		
		
	}

}
