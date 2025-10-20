package misfiguras2;

import java.util.ArrayList;
import java.util.Random;

public class MiPrograma {
	
	public static void m(ArrayList<Figura> figuras, String tipoCalculo) {
		System.out.println();
		System.out.printf("\033[35mObtener un listado de Cuadrados con areas mayor a la media:");
		System.out.println("===============================================================\u001B[0m");
		
		for (Figura figura : figuras) {
			if("area".equals(tipoCalculo)) {
				if(figura instanceof clase && figura.area() > mediaAreaFiguras) {
					System.out.println(figura);
				}
			}else if("perimetro".equals(tipoCalculo)) {
				if(figura instanceof clase && figura.perimetro() > mediaPerimetrosArea) {
					System.out.println(figura);
				}
			}
		}		
	}
	
	public static void main(String[] args) {

		Random random = new Random();
		
		System.out.println("\033[35mArrayList de Figuras:");
		System.out.println("===================\u001B[0m");
		ArrayList<Figura> figuras = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			figuras.add(new Cuadrado(random.nextInt(10) + 1, Color.colorAleatorio()));
			figuras.add(new Circulo(random.nextInt(10) + 1, Color.colorAleatorio()));
			figuras.add(new Rectangulo(random.nextInt(20) + 1, random.nextInt(10) + 1, Color.colorAleatorio()));
		}
		for (Figura figura : figuras) {
			System.out.println(figura);
		}
		
		//hayamos la media de las areas de las figuras
		double sumaAreaFiguras = 0, sumaPerimetrosFiguras = 0;		
		for (Figura figura : figuras) {
			sumaAreaFiguras += figura.area();
			sumaPerimetrosFiguras += figura.perimetro();
		}		
		double mediaAreaFiguras = sumaAreaFiguras / figuras.size();
		double mediaPerimtroFigura = sumaPerimetrosFiguras / figuras.size();
		System.out.printf("\033[35m%nMedia area de figuras %f%n\u001B[0m", mediaAreaFiguras);
		System.out.printf("\033[35m%nMedia Perimetro de figuras %f%n\u001B[0m", mediaPerimtroFigura);		
		
		
		
		/*
		System.out.println();
		System.out.println("\033[35mObtener un listado de Cuadrados con areas mayor a la media:");
		System.out.println("===============================================================\u001B[0m");
		for (Figura figura : figuras) {
			if(figura instanceof Cuadrado && figura.area() > mediaAreaFiguras) {
				System.out.println(figura);
			}
		}	
		
		System.out.println();
		System.out.println("\033[35mObtener un listado de Circulos con areas mayor a la media:");
		System.out.println("===============================================================\u001B[0m");
		for (Figura figura : figuras) {
			if(figura instanceof Circulo && figura.area() > mediaAreaFiguras) {
				System.out.println(figura);
		
			}
		}	
		
		System.out.println();
		System.out.println("\033[35mObtener un listado de Rectangulos con areas mayor a la media:");
		System.out.println("===============================================================\u001B[0m");
		for (Figura figura : figuras) {
			if(figura instanceof Rectangulo && figura.area() > mediaAreaFiguras) {
				System.out.println(figura);
		
			}
		}
		
		System.out.println();
		System.out.println("\033[35mObtener un listado de Cuadrados con perimetro mayor a la media:");
		System.out.println("===============================================================\u001B[0m");
		for (Figura figura : figuras) {
			if(figura instanceof Cuadrado && figura.perimetro() > mediaPerimtroFigura) {
				System.out.println(figura);
			}
		}	
		
		System.out.println();
		System.out.println("\033[35mObtener un listado de Circulos con perimetro mayor a la media:");
		System.out.println("===============================================================\u001B[0m");
		for (Figura figura : figuras) {
			if(figura instanceof Circulo && figura.perimetro() > mediaPerimtroFigura) {
				System.out.println(figura);
		
			}
		}	
		
		System.out.println();
		System.out.println("\033[35mObtener un listado de Rectangulos con perimetro mayor a la media:");
		System.out.println("===============================================================\u001B[0m");
		for (Figura figura : figuras) {
			if(figura instanceof Rectangulo && figura.perimetro() > mediaPerimtroFigura) {
				System.out.println(figura);
		
			}
		}
		*/
		
	}
}
