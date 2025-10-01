package mipaquete;

public class TestAnimal {
	
	public static void main(String[] args) {
		Animal a1 = new Animal(20.40, "Gato de angora con pelo largo y flojo", 12, "Gatuna", true, true);
		a1.imprimete();
		
		Animal a2 = new Animal(9.35, "Pez de colores", 150, "pez");
		a2.imprimete();

		Animal a3 = new Animal();
		a3.imprimete();
		

	}
}
