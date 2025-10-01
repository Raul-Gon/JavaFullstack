package mipaquete;

public class TestVector {
	 
    public static void main(String[] args) {
        Vector v1 = new Vector(3, 5);
        v1.show();
        // System.out.printf("(%d, %d)%n", v1.x, v1.y);
        Vector v2 = new Vector(4);
        v2.show();
        // System.out.printf("(%d, %d)%n", v2.x, v2.y);
        Vector v3 = new Vector(v1);
        v3.show();
        // System.out.printf("(%d, %d)%n", v3.x, v3.y);
        
        v1.opera(v3,'+');
        v1.opera(v3,'-');
        v1.prod(3).show();
        System.out.println(v1.prodE(v2));
        
        v1.suma(v2).resta(v2).prod(5).show();
    } 
}
