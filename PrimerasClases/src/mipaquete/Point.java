package mipaquete;

public class Point {
	private byte x = 0;
	private byte y = 0;
	private String colour = "black";
	private char symbol;
	
	
	public byte getY() {
		return y;
	}

	public String getColour() {
		return colour;
	}

	public void setX(byte x) {
		this.x = x;
	}

	public Point(byte x, byte y , String colour, char symbol) {
		this.x = x > 12 ? 12 : x < 0 ? 0 : x;
		this.y = y > 7 ? 7 : y < 0 ? 0 : y; 
		this.symbol = symbol;
		
		//this.colour = "red".equals(colour) ? colour : "green".equals(colour) ? colour : "yellow".equals(colour) ? colour : "blue".equals(colour) ? colour : "purple".equals(colour) ? colour : "black" ;
		this.colour = "red".equals(colour) || "green".equals(colour) || "yellow".equals(colour) || "blue".equals(colour) || "purple".equals(colour) ? colour : "black";
	}
	
	public Point(byte x, byte y) {
		this(x, y, "black", '*');
	}
	
	public Point(String colour, char symbol) {
		this((byte)0, (byte)0, colour, symbol);
	}
	
	public Point() {
		this((byte)0, (byte)0, "black", '*');
	}
	
	public Point(Point p) {
		x = p.x;
		y = p.y;
		colour = p.colour;
		symbol = p.symbol;
	}
	
	public void showSimple() {
		System.out.printf("Point %c de color %s (%d, %d).%n", symbol, colour, x, y);
	}
	
	public boolean up() {
		boolean upper = y < 7 ;
		if(upper) y++;
		return upper;
	}
	
	public boolean down() {
		boolean downer = y > 0 ;
		if(downer) y--;
		return downer;
	}
	
	public boolean left() {
		boolean lefter = x > 0 ;
		if(lefter) x--;
		return lefter;
	}
	
	public boolean right() {
		boolean righter = x < 12 ;
		if(righter) x++;
		return righter;
	}
	
	public void show() {
		String pintura = "red".equals(colour) ? "\033[31m" : "green".equals(colour) ? "\033[32m" : "yellow".equals(colour) ? "\033[33m" : "blue".equals(colour) ? "\033[34m" : "purple".equals(colour) ? "\033[35m" : "\033[30m" ; 
		String resetPintura = "\u001B[0m";
		
		for (int i = 14; i >= 0; i--) {
			if (i % 2 == 0) {
				System.out.print(i/2 + "  ");
				for (int j = 0; j <= 11; j++) {
					for (int con = 0; con < 3; con++) {
						if (con == 0) {
							if (j == (int)x && y == i/2) {
								System.out.printf("%s" + symbol + "\u001B[0m", pintura, resetPintura);
							}else { 
								System.out.print("+");
							}
						}else {
							System.out.print("-");
						}
					}
				}
				if (12 == (int)x && y == i/2) {
					System.out.print(symbol);
				}else { 
					System.out.print("+");
				}
			}else {
				System.out.print("   ");
				for (int j = 0; j <= 11; j++) {
					for (int con = 0; con < 3; con++) {
						if (con == 0) {
							System.out.print("|");
						}else {
							System.out.print(" ");
						}
					}					
				}
				System.out.print("|");
			}
			System.out.println();
		}
		
		System.out.print("   ");
		for (int i = 0; i <= 12; i++) {
			if (i <9) {
				System.out.print(i + "  ");
			}else {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.printf("%sPoint %c de color %s (%d, %d)%s.%n",pintura , symbol, colour, x, y, resetPintura);
		
	}
	
}
