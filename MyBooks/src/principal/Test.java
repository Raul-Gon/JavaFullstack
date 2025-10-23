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
		/* para imprimir el array de libros para comprobarlo
		for (Libro libro : libros) {
			libro.show();
		}
		*/
		
		String[] titulosRev = {"Muy interesante", "Historia", "Más alla", "Cars and Drivers", "Cambalache"};
		int[] paginasRev = {127, 150, 100, 120, 100};
		boolean[] formatosRev = {true, false, false, false, true};
		double[] preciosRev = {3.5, 4, 2.5, 3.25, 1.99};
		
		Revista[] revistas = new Revista[5];
		for (int i = 0; i < revistas.length; i++) {
			revistas[i] = new Revista(titulosRev[i], paginasRev[i], formatosRev[i], preciosRev[i]);	
		}
		/* para imprimir el array de revistas para ver que esta bien
		for (Revista revista : revistas) {
			revista.show();
		}
		*/
		
		Publicacion[] publicaciones = new Publicacion[(libros.length + revistas.length)];
		int contador = 0, cont = 0;
		while(contador < publicaciones.length) {
			if(contador < libros.length) {
				publicaciones[contador] = libros[contador];
			}else {
				publicaciones[contador] = revistas[cont];
				cont++;
			}
			contador++;
		}
		/* para imprimir el array de publicacion para comprobar de que este todo bien
		for (Publicacion publicacion : publicaciones) {
			publicacion.show();
		}
		*/
		
		//imprimir todas las publicaciones del array publicaciones con el titulo y su id
		System.out.println();
		System.out.println("\033[35mPublicaciones con el titulo y su id:");
		System.out.println("====================================\u001B[0m");
		int n=0;
		for (Publicacion publicacion : publicaciones) {
			n++;
			System.out.printf("%2d).-TITULO: %s. ID: %d%n", n, publicacion.getTitulo(), publicacion.getId());
		}
		
		//imprimir todas las publicaciones del array publicaciones que sólo sean Libros con el titulo y su id
		System.out.println();
		System.out.println("\033[35mPublicaciones que son LIBROS con el titulo y su id:");
		System.out.println("===================================================\u001B[0m");
		int num=0;
		for (Publicacion publicacion : publicaciones) {
			if (publicacion instanceof Libro) {
				num++;
				System.out.printf("%2d).-TITULO: %s. ID: %d%n", num, publicacion.getTitulo(), publicacion.getId());
			}
		}
		
		//imprimir todas las publicaciones del array publicaciones que sólo sean Revistas con el titulo y su id
		System.out.println();
		System.out.println("\033[35mPublicaciones que son REVISTAS con el titulo y su id:");
		System.out.println("===================================================\u001B[0m");
		int nume=0;
		for (Publicacion publicacion : publicaciones) {
			if (publicacion instanceof Revista) {
				nume++;
				System.out.printf("%2d).-TITULO: %s. ID: %d%n", nume, publicacion.getTitulo(), publicacion.getId());
			}
		}
		
		//imprimir todas las publicaciones del array publicaciones que su precio sea mayor de 20 euros con el titulo, su id y precio
		System.out.println();
		System.out.println("\033[35mPublicaciones que su PRECIO sea mayor de 20€ con el titulo, su id y su precio:");
		System.out.println("==============================================================================\u001B[0m");
		int numer=0;
		for (Publicacion publicacion : publicaciones) {
			if (20 < publicacion.getPrecio()) {
				numer++;
				System.out.printf("%2d).-TITULO: %s. ID: %d PRECIO: %.2f%n", numer, publicacion.getTitulo(), publicacion.getId(), publicacion.getPrecio());
			}
		}
		
		//imprimir todas las publicaciones del array publicaciones que sea LIBROS y su precio sea mayor de 20 euros con el titulo, su id y precio
		System.out.println();
		System.out.println("\033[35mPublicaciones que sean LIBROS y su PRECIO sea mayor de 20€ con el titulo, su id y su precio:");
		System.out.println("============================================================================================\u001B[0m");
		int numero=0;
		for (Publicacion publicacion : publicaciones) {
			if (publicacion instanceof Libro && 20 < publicacion.getPrecio()) {
				numero++;
				System.out.printf("%2d).-TITULO: %s. ID: %d PRECIO: %.2f%n", numero, publicacion.getTitulo(), publicacion.getId(), publicacion.getPrecio());
			}
		}
		
		//imprimir todas las publicaciones del array publicaciones que sea REVISTAS y su precio sea mayor de 3 euros con el titulo, su id y precio
		System.out.println();
		System.out.println("\033[35mPublicaciones que sean REVISTAS y su PRECIO sea mayor de 3€ con el titulo, su id y su precio:");
		System.out.println("=============================================================================================\u001B[0m");
		int numerote=0;
		for (Publicacion publicacion : publicaciones) {
			if (publicacion instanceof Revista && 3 < publicacion.getPrecio()) {
				numerote++;
				System.out.printf("%2d).-TITULO: %s. ID: %d PRECIO: %.2f%n", numerote, publicacion.getTitulo(), publicacion.getId(), publicacion.getPrecio());
			}
		}
		
		//Hacer una serie de acciones sobre el libro Ulises si utilizar lib7
		System.out.println();
		System.out.println("\033[35mHacer acciones sobre el libro Ulises:");
		System.out.println("=====================================\u001B[0m");
		int iden = 0;
		for (int i = 0; i < publicaciones.length; i++) {
			if ("Ulises".equals(publicaciones[i].getTitulo())) {
				iden = i;
			}
		}
		Libro libroControl = (Libro)publicaciones[iden];
		libroControl.show();
		//leer 295 paginas de forma silenciosa con el metodo estatico
		System.out.println();
		System.out.println("\033[35mLee 295 Pag de forma silenciosa con el método static:");
		System.out.println("=====================================================\u001B[0m");
		for (int i = 0; i < 295; i++) {
			libroControl.leePaginaStatic(true, libroControl);
		}
		libroControl.show();
		//leer 5 paginas de forma NO silenciosa con el metodo estatico
		System.out.println();
		System.out.println("\033[35mLee 5 Pag de forma NO silenciosa y el método static:");
		System.out.println("====================================================\u001B[0m");
		for (int i = 0; i < 5; i++) {
			libroControl.leePaginaStatic(false, libroControl);
		}
		libroControl.show();
		//leer 10 paginas de forma NO silenciosa con el metodo NO estatico
		System.out.println();
		System.out.println("\033[35mLee 10 Pag de forma NO silenciosa y el método NO static:");
		System.out.println("========================================================\u001B[0m");
		for (int i = 0; i < 10; i++) {
			libroControl.leePagina(false);
		}
		libroControl.show();
		//leer 1000 paginas de forma silenciosa con el metodo NO estatico
		System.out.println();
		System.out.println("\033[35mLee 1000 Pag de forma silenciosa y el método NO static:");
		System.out.println("========================================================\u001B[0m");
		for (int i = 0; i < 1000; i++) {
			libroControl.leePagina(true);
		}
		libroControl.show();
		
	}
}
