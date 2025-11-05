package exception1;

public class MyClass2 {
	
	public static void m12() {
		System.out.println("En m12 al principio.");
		// TRATAMIENTO DE EXCEPCION
		
		try {
			m22();
		} catch (PruebaException e) {
			e.printStackTrace();
		}
		
		try {
			m22();
		} catch (ArithmeticException e) {
			System.out.println(e.getClass().getSimpleName());
			System.out.println("Te pillé, cero dividiendo.");
		} catch (NullPointerException e) {
			System.out.println(e.getClass().getSimpleName());
			System.out.println("Te pillé, usando mal el null.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getClass().getSimpleName());
			System.out.println("Te pillé, fuera del rango del Array.");
		} catch (PruebaException e) {
			System.out.println(e.getClass().getSimpleName());
			System.out.println("Te pillé, con problemas en las pruebas.");
		} finally { //NO ES OBLIGATORIO PONERLO, PERO SI SE PONE SE EJECUTA SIEMPRE, HAYA O NO HAYA UN CATCH
			System.out.println("Dentro del FINALLY");
		}
		//FIN DEL TRATAMIENTO Y EL CODIGO SIGUE
		
		System.out.println("En m12 al final.");
	}
	
	public static void m22() throws PruebaException {
		System.out.println("En m22 al principio.");
		
		int key = 3;
		switch (key) {
			case 0: 
				//ArithmeticException
				int i = 1 / 0; // LANZA UNA EXCEPCIOON
				break;
			case 1:
				//NullPointException
				String s = null;
				s.charAt(0);  //LANZA UNA EXCEPCION
				break;
			case 2:
				//ArrayIndexOutOfBoundsException
				int [] array = {1, 2};
				int a = array[5];  //LANZA UNA EXCEPCION
				break;
			case 3:
				//PruebaException
				throw new PruebaException("mi Prueba excepcion para jugar");
				
			default:
		}
		
		System.out.println("En m22 al final.");		
	}

}
