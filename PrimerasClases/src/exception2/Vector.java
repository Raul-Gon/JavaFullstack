package exception2;

import exception1.PruebaException;

public class Vector {
	
	private int x;
	private int y;
	
	public Vector(int x, int y) {
		this.x = x;
		this.y = y;
	}	
	public Vector(int a) {
		x = a;
		y = a;
	}
	
	public Vector Suma(Vector v) throws VectorOutOfBoundsException{
		long sumaX = ((long)x + v.x), sumaY = ((long)y + v.y);
		
		if(sumaX > Integer.MAX_VALUE || sumaX < Integer.MIN_VALUE || sumaY > Integer.MAX_VALUE || sumaY < Integer.MIN_VALUE ) {
			throw new VectorOutOfBoundsException("mi Prueba excepcion para jugar");
		}else {
			Vector vSuma = new Vector((int)sumaX, (int)sumaY);			
			return vSuma;
		}		
	}
	
	public static void main(String[] args) {
		Vector v1 = new Vector(1_200_200_200, 1_300_300_300);
		Vector v2 = new Vector(2_000_000_000, 5);
		//-2,147,483,648
		
		Vector v3 = null;
		
		try {
			v3 = v1.Suma(v2);
		} catch (VectorOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(v3 != null) System.out.println("V3(" + v3.x + ", " + v3.y + ")");
	}	
}
