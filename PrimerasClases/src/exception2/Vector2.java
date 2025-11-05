package exception2;

public class Vector2 {
		
	private int x, y;
	
	public Vector2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Vector2(int valor) {
		x = y = valor;
	}
	
	public Vector2 suma(Vector2 v) throws VectorOutOfBoundsException {
		if((long)x + v.x > Integer.MAX_VALUE || (long)x + v.x < Integer.MIN_VALUE || (long)y + v.y > Integer.MAX_VALUE || (long)y + v.y < Integer.MIN_VALUE) {
			//lanzo excepcion
			throw new VectorOutOfBoundsException("Suma se sale de los limites");
		}
		
		return new Vector2(x + v.x, y +v.y);
	}

	
	
	@Override
	public String toString() {
		return "Vector2 [x=" + x + ", y=" + y + "]";
	}
	public static void main(String[] args) {
		Vector2 v = null;
		try {
			v = new Vector2(Integer.MAX_VALUE).suma(new Vector2 (3, 5));
		} catch (VectorOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("Error capturado.");
			e.printStackTrace();
		}
		
		System.out.println(v);
		
	}
}
