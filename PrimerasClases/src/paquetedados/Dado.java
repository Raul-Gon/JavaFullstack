package paquetedados;

import java.util.Random;

public class Dado {;
	private int ultimoLanzamiento = 1;
	private int contadorLanzamientos = 0;
	private int[] historico = new int[3];
	private int id = 0;
	
	private static int dadosConstruidos = 0;
	private static int nextId = 1;
	
	public Dado () {
		id = nextId++;
		dadosConstruidos++;
	}
	
	public int lanzarDado() {
		Random r = new Random();
		ultimoLanzamiento = r.nextInt(1, 7);
		contadorLanzamientos++;
		historico[2] = historico[1];
		historico[1] = historico[0];
		historico[0] = ultimoLanzamiento;
		return ultimoLanzamiento;
	}
	
	public int lanzarDado(int numeroVeces) {
		for ( int i = 0; i < numeroVeces; i++ ) {
			System.out.print(this.lanzarDado() + " ");
		}
		System.out.println();
		return ultimoLanzamiento;		
	}
	
	public void show() {
		System.out.printf("[%d] dados construidos, el id del dado es %d,  El último nº ha sido: %d, y se ha lanzado un total de %d veces.%n", dadosConstruidos, id, ultimoLanzamiento, contadorLanzamientos);
		System.out.print("Los ultimos tres lanzamientos han sido: ");
		for (int i = 0; i < historico.length; i++) {
			System.out.print(historico[i] + " ");
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		Dado d1 = new Dado();
		for ( int i = 0; i < 10; i++ ) {
			System.out.print(d1.lanzarDado() + " ");
		}
		
		System.out.println();
		System.out.println(d1.lanzarDado(5));
		d1.show();
		
		System.out.println("Tiramos el nuevo dado:");
		System.out.println("======================");
		Dado d2 = new Dado();
		d2.lanzarDado();
		d2.show();
		d2.lanzarDado();
		d2.show();
		d2.lanzarDado();
		d2.show();
		d2.lanzarDado();
		d2.show();
		d2.lanzarDado();
		d2.show();
	}
	
}
