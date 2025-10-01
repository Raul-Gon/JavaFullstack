package mipaquete;

public class PostIt {
	
	String color;
	String msg;
	int anchoMM;
	int altoMM;	
	
	public PostIt(String color, String msg, int alto, int ancho) {
		this.color = color;
		this.msg = msg;
		this.anchoMM = ancho;
		this.altoMM = alto;
	}
	
	public static void main(String[] args) {
		
		PostIt p1 = new PostIt("rosa", "AA", 50, 50);
		System.out.printf("El Post-it %s de %d X %d dice: %s.%n",p1.color, p1.altoMM, p1.anchoMM, p1.msg);
		
		PostIt p2 = new PostIt("amarillo", "BB", 50, 50);
		System.out.printf("El Post-it %s de %d X %d dice: %s.%n",p2.color, p2.altoMM, p2.anchoMM, p2.msg);
		
		PostIt p3 = new PostIt("naranja", "CC", 30, 30);
		System.out.printf("El Post-it %s de %d X %d dice: %s.%n",p3.color, p3.altoMM, p3.anchoMM, p3.msg);
		
		PostIt p4 = new PostIt("azul", "DD", 30, 30);
		System.out.printf("El Post-it %s de %d X %d dice: %s.%n",p4.color, p4.altoMM, p4.anchoMM, p4.msg);
		
		
	}

}
