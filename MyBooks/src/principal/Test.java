package principal;

public class Test {

	public static void main(String[] args) {
		String[] titulos = {"Cien años de soledad", "El señor de los anillos", "1984", "Un mundo feliz", "Orgullo y prejuicio",
							"Crimen y castigo", "Lolita", "Ulises", "Madame Bovary", "En busca del tiempo perdido"};
		String[] autores = {"Gabriel García Márquez", "J.R.R. Tolkien", "George Orwell", "Aldous Huxley", "Jane Austen",
							"Fiódor Dostoyevski", "Vladimir Nabokov", "James Joyce", "Gustave Flaubert", "Marcel Proust"};
		int[] paginas = {735, 429, 122, 270, 340, 259, 300, 400, 723, 374};
		int[] pagIniciales = {3, 5, 9, 1, 2, 3, 5, 4, 9, 2};
		boolean[] formatos = {false, false, false, false, true, false, false, false, true, true};
		double[] precios = {20.99, 22.99, 40.99, 25.99, 12.99, 60.99, 27.99, 42.99, 9.99, 9.99};
		
		Libro[] libros = new Libro[10];
		for (int i = 0; i < 10; i++) {
			libros[i]= new Libro(titulos[i], autores[i], paginas[i], pagIniciales[i], formatos[i], precios[i]);
		}
		for (Libro libro : libros) {
			libro.show();
		}
		
		String[] titulosRev = {"Muy interesante", "Historia", "Más alla", "Cars and Drivers", "Cambalache"};
		int[] paginasRev = {127, 150, 100, 120, 100};
		boolean[] formatosRev = {true, false, false, false, true};
		double[] preciosRev = {3.5, 4, 2.5, 3.25, 1.99};
		
		Revista[] revistas = new Revista[5];
		for (int i = 0; i < revistas.length; i++) {
			revistas[i] = new Revista(titulosRev[i], paginasRev[i], formatosRev[i], preciosRev[i]);	
		}
		for (Revista revista : revistas) {
			revista.show();
		}
		
	}
}
