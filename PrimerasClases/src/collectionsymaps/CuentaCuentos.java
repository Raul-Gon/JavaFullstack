package collectionsymaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class CuentaCuentos {
	
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
	
	public static String[] devuelvePalabras() {
		String cuento = cuentoLechera();
		cuento = cuento.replace(".", "");
		cuento = cuento.replace(",", "");
		cuento = cuento.replace("\n", " ");
		
		ArrayList<String> listaCuento = new ArrayList<>();
		String palabra = "";
		for (int i = 0; i <= cuento.length(); i++) {
			if (i == cuento.length() || ' ' == cuento.charAt(i)) {
				listaCuento.add(palabra);
				palabra = "";
			}else {
				palabra += cuento.charAt(i);
			}
		}
		
		String [] arrayCuento = new String [listaCuento.size()];
		for (int i = 0; i < listaCuento.size(); i++) {
			arrayCuento[i] = listaCuento.get(i);
		}
		
		return arrayCuento;
	}
	
	public static void arrayPalabras () {
		String[] arrayCuento = devuelvePalabras();
		int contador = 0;
		for ( int i = 0; i < arrayCuento.length; i++) {
			System.out.printf("[%s]", arrayCuento[i]);
			contador++;
		}
		System.out.println();
		System.out.printf("Lista original tiene %d palabras.\n", contador);
	}
	
	public static void arrayListPalabras() {
		String[] arrayCuento = devuelvePalabras();
		ArrayList<String> listCuento = new ArrayList<String>();
		for ( int i = 0; i < arrayCuento.length; i ++) {
			listCuento.add(arrayCuento[i]); 
		}
		
		int contador = 0;
		for (int i = 0; i < listCuento.size(); i++) {
			System.out.printf("[%s]", listCuento.get(i));
			contador++;
		}
		System.out.println();
		System.out.printf("Lista en ArrayList tiene %d palabras.\n", contador);		
	}
	
	public static void hashSetPalabras() {
		String[] arrayCuento = devuelvePalabras();
		HashSet<String> hashCuento = new HashSet<>();
		for ( int i = 0; i < arrayCuento.length; i ++) {
			hashCuento.add(arrayCuento[i]); 
		}
		
		int contador = 0;
		for (String palabra : hashCuento) {
			contador++;
			System.out.printf("[%s]", palabra);
		}
		System.out.println();
		System.out.printf("Lista en HashSet tiene %d palabras.\n", contador);		
	}
	
	public static void main(String[] args) {
		
		System.out.println();
		System.out.println("\033[35mImprimimos los cuentos:");
		System.out.println("=======================\u001B[0m");
		System.out.println(cuentoZorro().toString()); //IMPRIMIMOS EL CUENTO DEL ZORRO
		System.out.println();
		System.out.println(cuentoLechera().toString()); //IMPRIMIMOS EL CUENTO DE LA LECHERA
		
		System.out.println();
		System.out.println("\033[35mCrea un Array con el String del cuento de la Lechera:");
		System.out.println("=====================================================\u001B[0m");
		System.out.println(Arrays.toString(devuelvePalabras()));
		
		System.out.println();
		System.out.println("\033[35mArray de Palabras:");
		System.out.println("==================\u001B[0m");
		arrayPalabras();
		
		System.out.println();
		System.out.println("\033[35mArrayList de Palabras:");
		System.out.println("======================\u001B[0m");
		arrayListPalabras();
		
		System.out.println();
		System.out.println("\033[35mHashSet de Palabras:");
		System.out.println("====================\u001B[0m");
		hashSetPalabras();
	}
	
}
