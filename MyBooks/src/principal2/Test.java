package principal2;

public class Test {
	
	public static void main(String[] args) {
		
		Libro libro1 = new Libro("Cien años de soledad", "Grabriel García Márquez", 735, 3, false, 20.99);
		System.out.println(libro1);
		Revista revista1 = new Revista("Muy interesante", 127, false, 3.50);
		System.out.println(revista1);
		
		Publicacion.showStatic(libro1);
		Publicacion.showStatic(revista1);
		
		Libro lib1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 735, 3, false, 20.99);
		Libro lib2 = new Libro("El señor de los anillos", "J. R. R. Tolkien", 429, 5, false, 22.99);
		Libro lib3 = new Libro("1984", "George Orwel", 122, 9, false, 40.99);
		Libro lib4 = new Libro("Un mundo feliz", "Aldous Huxley", 270, 1, false, 25.99);
		Libro lib5 = new Libro("Orgullo y prejuicio", "Jane Austen", 340, 2, true, 12.99);
		Libro lib6 = new Libro("Crimen y castigo", "Fiódor Dostoyevski", 259, 3, false, 60.99);
		Libro lib7 = new Libro("Lolita", "Vladimir Nabokov", 300, 5, false, 27.99);
		Libro lib8 = new Libro("Ulises", "James Joyce", 400, 4, false, 42.99);
		Libro lib9 = new Libro("Madame Bovary", "Gustave Flaubert", 723, 9, true, 9.99);
		Libro lib10 = new Libro("En busca del tiempo perdido", "Marcel Proust", 374, 2, true, 9.99);
		
		Revista rev1 = new Revista("Muy interesante", 127, true, 3.50);
		Revista rev2 = new Revista("Cambio 16", 74, true, 4.95);
		Revista rev3 = new Revista("Yoga yournal", 12, false, 1.50);
		Revista rev4 = new Revista("Revista Tralara", 125, false, 7.95);
		Revista rev5 = new Revista("Revista Triliri", 140, true, 5.45);
		
		Publicacion[] publicaciones = {lib1, lib2, lib3, lib4, lib5, lib6, lib7, lib8, lib9, lib10, rev1, rev2, rev3, rev4, rev5};
		
		Publicacion.ListadoA(publicaciones);
		Publicacion.ListadoB(publicaciones);
		Publicacion.ListadoC(publicaciones);		
	}

}
