package strings;

public class TestString {
	
	public static void main(String[] args) {
		
		String texto1 = "Hola";
		String texto2 = "Hola";
		String texto3 = new String("Hola");
		
		System.out.println(texto1 == texto2);
		System.out.println(texto2 == texto3);
		System.out.println(texto1 == texto3);
		
		System.out.println();
		System.out.println("concat(String):");
		System.out.println("===============");
		String s1 = "1";
		String s2 = s1.concat("2");
		s2.concat("3");
		System.out.println(s2);		
		
		System.out.println();
		System.out.println("PRUEBA PARA PONER LA PRIMERA LETRA EN MAYUSCULA Y LO DEMAS EN MINUSCULAS:");
		System.out.println("=========================================================================");
		String s = "esto es Una PRUeBA.";
		s = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
		System.out.println(s);
		
		System.out.println();
		System.out.println("trim() toLowerCase() toUpperCase replace():");
		System.out.println("===========================================");
		String a = " AnIMaL ".trim().toLowerCase().replace('a', 'A');
		System.out.println(a);
		
		String a1 = "abc";
		String b1 = a.toUpperCase();
		b1 = b1.replace("B", "2").replace('C', '3');
		System.out.println("a=" + a1);
		System.out.println("b=" + b1);
		
		System.out.println();
		System.out.println("length() charAt(int index) de \"hola\":");
		System.out.println("=====================================");
		String st = "hola";
		System.out.println(st.length());  // 4
		System.out.println(st.charAt(1));  // o
		
		System.out.println();
		System.out.println("equals() equalsIgnoreCase(String str):");
		System.out.println("======================================");
		String s11 = "abc";
		String s22 = "abc";
		String s3 = new String("abc");
		String s4 = "ABC";
		String s5 = "ABC";
		String s6 = new String("ABC");
		System.out.println(s11 == s22); // true   
		System.out.println(s11 == s3); // false  
		System.out.println(s11 == s11); // true  
		System.out.println(s4 == s22); // false  
		System.out.println(s5 == s4); // true   
		System.out.println(s5 == s6); // false 
		System.out.println(s11.equals(s3)); // true
		System.out.println(s11.equals(s22)); //  true
		System.out.println(s11.equalsIgnoreCase(s6)); //  true
		
		System.out.println();
		System.out.println("startsWith(String prefix) endsWith(String suffix):");
		System.out.println("==================================================");
		System.out.println("abc".startsWith("Ab")); // false
		System.out.println("abc".endsWith("bc")); // true
		System.out.println("abc".endsWith("a")); // false
		
		System.out.println();
		System.out.println("contains(CharSequence charSeq):");
		System.out.println("===============================");
		System.out.println("abc".contains("bc")); // true
		System.out.println("abc".contains("B")); // false
		
		System.out.println();
		System.out.println("substring(int beginIndex) substring(int beginIndex, int endIndex):");
		System.out.println("==================================================================");
		String string = "animals";
		System.out.println(string.substring(3));  // mals
		// System.out.println(string.substring(string.indexOf('m')));  // mals
		System.out.println(string.substring(3, 4));  // m
		System.out.println(string.substring(3, 7));  // mals
		System.out.println(string.substring(3, 3)); // String vacío
		//System.out.println(string.substring(3, 2)); // throws exception
		//System.out.println(string.substring(3, 8)); // throws exception 
		
		System.out.println();
		System.out.println("replace(char oldChar, char newChar) replace(CharSequence target, CharSequence replacement):");
		System.out.println("===========================================================================================");
		System.out.println("abcabc".replace('a', 'A')); // AbcAbc
		System.out.println("abcabc".replace("ab", "x")); // xcxc
		
		System.out.println();
		System.out.println("indexOf(int ch) indexOf(int ch, int fromIndex) indexOf(String str) indexOf(String str, int fromIndex):");
		System.out.println("======================================================================================================");
		String s111 = "animals";
		System.out.println(s111.indexOf('a'));      // 0
		System.out.println(s111.indexOf("al"));     // 4
		System.out.println(s111.indexOf('a', 4));   // 4 
		System.out.println(s111.indexOf("al", 5));  // -1
		

	}

}
