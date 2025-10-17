package misfiguras2;

public abstract class Figura {
	
	private String color;

	public Figura(String color) {
		this.color = Color.colorValido(color);
	}

	public String getColor() {
		return color;
	}

	public boolean areasIguales(Figura f) {
		return this.area() == f.area();
	}	
	
	public abstract double area();	
	public abstract double perimetro();
	
	@Override
	public String toString() {
		return String.format("%s %s [area= %.2f, perimetro= %.2f]", 
				  this.getClass().getSimpleName(), getColor(), this.area(), this.perimetro());
	}
	
}
