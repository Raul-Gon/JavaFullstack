package misfiguras3;

public abstract class Figura implements IPerimetrable, ISuperficiable {
	
	public String color;
	public float x;
	public float y;
	
	public void dibujar() {
		System.out.printf("Dibujando figura de color %s que esta en x: %d y en y: %d.%n", color, x, y);
	}
	
	public void mover(float dx, float dy) {
		x += dx;
		y += dy;
	}

}
