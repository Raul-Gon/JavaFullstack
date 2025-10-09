package colecciones;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class SetsYMaps {

	public static void main(String[] args) {
		
		HashSet<String> set1 = new HashSet<>(); //no tiene orden
		
		set1.add("one");
		set1.add("two");
		set1.add("two");
		System.out.println(set1);

		TreeSet<String> setTree = new TreeSet<>();//ordena alfabeticamente
		setTree.add("one");
		setTree.add("two");
		setTree.add("two");
		setTree.add("four");
		setTree.add("seven");
		System.out.println(setTree);
		
		HashMap<String, Integer> mapita = new HashMap<>(); //inserta clave y valor
		mapita.put("one", 1);
		mapita.put("dos", 2);
		mapita.put("three", 3);
		mapita.put("three", 2);		
		System.out.println(mapita);
		
	}
	
}
