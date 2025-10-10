package collectionsymaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class CuentaCuentos2 {
	
	public static String cuentoZorro(){
	    StringBuilder sb = new StringBuilder();
	    sb.append("El zorro y las uvas");
	    sb.append("\nHabía una vez un zorro que caminaba, sediento, por el bosque. "
	            + "Mientras lo hacía vio en lo alto de la rama de un árbol un racimo "
	            + "de uvas, las cuales deseó al instante al servirle para refrescarse "
	            + "y apagar su sed. El zorro se acercó al árbol e intentó alcanzar las "
	            + "uvas, pero estaban demasiado altas. Tras intentarlo una y otra vez "
	            + "sin conseguirlo, el zorro finalmente se rindió y se alejó. Viendo "
	            + "que un pájaro había visto todo el proceso se dijo en voz alta que "
	            + "en realidad no quería las uvas, dado aún no estaban maduras, y que "
	            + "en realidad había cesado el intento de alcanzarlas al comprobarlo.");
	    sb.append("\nOtra interesante historia corta en forma de fábula que nos "
	            + "enseña que a menudo nos intentamos convencer a nosotros mismos "
	            + "de no querer algo e incluso llegamos a despreciar dicho algo por "
	            + "el hecho de que encontramos difícil llegar a alcanzarlo.");
	    return sb.toString();
    }        
    

	public static String cuentoLechera(){
	    StringBuilder sb = new StringBuilder();
	    sb.append("El cuento de la lechera");
	    sb.append("\nÉrase una vez una joven lechera que llevaba un cubo de leche "
	            + "en la cabeza, camino al mercado para venderla. Durante el camino, "
	            + "la soñadora joven iba imaginando lo que podría lograr conseguir "
	            + "con la leche. Pensó que en primer lugar y con el dinero de la venta "
	            + "compraría un canasto de huevos, los cuales una vez eclosionaran le "
	            + "permitiría montar una pequeña granja de pollos. Una vez estos "
	            + "crecieran podría venderlos, lo que le daría dinero para "
	            + "comprarse un lechón.");
	    sb.append("\nUna vez este creciera la venta del animal bastaría para comprarse "
	            + "una ternera, con la leche de la cual seguiría obteniendo beneficios "
	            + "y a su vez podría tener terneros. Sin embargo, mientras iba pensando "
	            + "todas estas cosas la joven tropezó, lo que provocó que el cántaro "
	            + "cayera el suelo y se rompiera. Y con él, sus expectativas hacia lo "
	            + "que podría haber hecho con ella.");  
	    return sb.toString();
    } 
	
	
	public static String[] devuelvePalabras(String texto) {		
		texto = texto.toLowerCase();
		return texto
					.replaceAll("[,.]", "") //quita los puntos y las comas
					.replaceAll("\n", " ") //sustituye los saltos de lineas por un espacio
					.split(" "); //corta el string donde haya un espacio y devuelve un array de string
	}
	
	public static void arrayPalabras(String[] array) {		
		System.out.println();
		System.out.println("\033[35mArray de palabras:");
		System.out.println("==================\u001B[0m");
		
		for (String palabra : array) {
			System.out.printf("[%s]", palabra);			
		}
		System.out.println();
		System.out.printf("Lista original tiene %d palabras.%n", array.length);
	}
	
	public static void arrayListPalabras(String[] array) {		
		System.out.println();
		System.out.println("\033[35mArrayList de palabras:");
		System.out.println("======================\u001B[0m");
		
		ArrayList<String> aListPalabras = new ArrayList<>();
		for (String palabra : array) {
			aListPalabras.add(palabra);
		}
		
		for (String palabra : aListPalabras) {
			System.out.printf("[%s]", palabra);			
		}
		System.out.println();
		System.out.printf("Lista en ArrayList tiene %d palabras.%n", aListPalabras.size());
	}
	
	public static void hashSetPalabras(String[] array) {		
		System.out.println();
		System.out.println("\033[35mHashSet de palabras:");
		System.out.println("====================\u001B[0m");
		
		HashSet<String> hSetPalabras = new HashSet<>();
		for (String palabra : array) {
			hSetPalabras.add(palabra);
		}
		
		for (String palabra : hSetPalabras) {
			System.out.printf("[%s]", palabra);			
		}
		System.out.println();
		System.out.printf("Lista en HashSet tiene %d palabras.%n", hSetPalabras.size());
	}
	
	
	public static void treeSetPalabras(String[] array) {		
		System.out.println();
		System.out.println("\033[35mTreeSet de palabras:");
		System.out.println("====================\u001B[0m");
		
		TreeSet<String> tSetPalabras = new TreeSet<>();
		for (String palabra : array) {
			tSetPalabras.add(palabra);
		}
		
		for (String palabra : tSetPalabras) {
			System.out.printf("[%s]", palabra);			
		}
		System.out.println();
		System.out.printf("Lista en TreeSet tiene %d palabras.%n", tSetPalabras.size());
	}
	
	public static void mapConteoPalabras(String[] array) {
		System.out.println();
		System.out.println("\033[35mConteo de repeticiones de palabras:");
		System.out.println("===================================\u001B[0m");
		
		HashMap<String, Integer> mapa = new HashMap<>();
		for (String palabra : array) {
			mapa.put(palabra, mapa.get(palabra) == null ? 1 : mapa.get(palabra) + 1);
		}
		
		for (String palabra : mapa.keySet()) {
			System.out.printf("[%s(%d)]%n", palabra, mapa.get(palabra));			
		}
	}
	
	public static void mapConteoPalabrasOrdenadas(String[] array) {
		System.out.println();
		System.out.println("\033[35mConteo de repeticiones de palabras ordenadas:");
		System.out.println("=============================================\u001B[0m");
		
		TreeMap<String, Integer> mapa = new TreeMap<>();
		for (String palabra : array) {
			mapa.put(palabra, mapa.get(palabra) == null ? 1 : mapa.get(palabra) + 1);
		}
		
		for (String palabra : mapa.keySet()) {
			System.out.printf("[%s(%d)]%n", palabra, mapa.get(palabra));			
		}
	}
	
	public static void treeSetPalabrasOrdenadasInversas(String[] array) {		
		System.out.println();
		System.out.println("\033[35mListado de palabras unicas en orden inverso:");
		System.out.println("============================================\u001B[0m");
		
		TreeSet<String> tSetPalabras = new TreeSet<>((s1, s2) -> -s1.compareTo(s2));
		for (String palabra : array) {
			tSetPalabras.add(palabra);
		}
		
		for (String palabra : tSetPalabras) {
			System.out.printf("[%s]", palabra);			
		}
		System.out.println();
		System.out.printf("Lista en TreeSet tiene %d palabras.%n", tSetPalabras.size());
	}
	
	public static void treeSetPalabrasOrdenadasLongitud(String[] array) {		
		System.out.println();
		System.out.println("\033[35mListado de palabras unicas en orden longitudinal:");
		System.out.println("=================================================\u001B[0m");
		
		TreeSet<String> tSetPalabras = new TreeSet<>((s1, s2) -> s1.length() - s2.length());
		for (String palabra : array) {
			tSetPalabras.add(palabra);
		}
		
		for (String palabra : tSetPalabras) {
			System.out.printf("[%s]", palabra);			
		}
		System.out.println();
		System.out.printf("Lista en TreeSet tiene %d palabras.%n", tSetPalabras.size());
	}
	
	
	public static void main(String[] args) {
		
		String cuento = cuentoLechera();
		System.out.println(cuento);
		String[] cuentoEnArray = devuelvePalabras(cuento);

		System.out.println();
		System.out.println("\033[35mGenera un método estático llamado devuelvePalabras:");
		System.out.println("===================================================\u001B[0m");
		System.out.println(Arrays.toString(devuelvePalabras(cuento)));
		
		arrayPalabras(cuentoEnArray);
		
		arrayListPalabras(cuentoEnArray);
		
		hashSetPalabras(cuentoEnArray);
		
		treeSetPalabras(cuentoEnArray);
		
		mapConteoPalabras(cuentoEnArray);
		
		mapConteoPalabrasOrdenadas(cuentoEnArray);
		
		treeSetPalabrasOrdenadasInversas(cuentoEnArray);
		
		treeSetPalabrasOrdenadasLongitud(cuentoEnArray);
		
	}

}
