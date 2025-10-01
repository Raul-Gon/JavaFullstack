package mipaquete;

import java.util.Random;

public class TestPoint {
	
	public static void main(String[] args) {
		
		Point p1 = new Point();
		p1.showSimple();
		
		byte bx = 10;
		byte by = 6;
		Point p2 = new Point(bx, by);
		p2.showSimple();
		
		Point p3 = new Point(bx, by, "red", '@');
		p3.showSimple();
		
		Point p4 = new Point("green", 'F');
		p4.showSimple();
		
		Point p5 = new Point(p4);
		p5.showSimple();
		
		byte bxx = 1;
		byte byy = 1;
		Point p6 = new Point(bxx, byy, "blue", '$');
		p6.showSimple();
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		p3.show();
		
		System.out.println();
		System.out.println();
		
		p6.show();
		
		System.out.println();
		System.out.println("\033[32mRompiendo un Point");
		System.out.println("==================");
		
		Point p100 = new Point();
		p100.showSimple();
		
		p100.setX((byte)100);
		p100.showSimple();
		
		System.out.println("\u001B[0m");
		
		
		System.out.println();
		System.out.println("Generar números aleatorios:");
		System.out.println("===========================");
		
		Random r = new Random();
		System.out.println(r.nextInt(1, 7));
		
		
	}
}
