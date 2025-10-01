package mipaquete;

public class Vector {
    int x;
    int y;
    
    /*
    Constructores    
        1. Sin parámetros: no existirá.
        2. Dado `x` e `y`.
        3. Dado un valor que se utilizará tanto para la `x` como para la `y`.
        4. Constructor copia.
    */
    
    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Vector(int valor){
        this.x = this.y = valor;
    }
    
    public Vector(Vector v){
        this.x = v.x;
        this.y = v.y;
    }
    
    // Métodos
    public void show(){
        // Vector de coordenadas (7, 5)
        System.out.printf("Vector de coordenadas (%d, %d)%n", this.x, this.y);
    }
    
    public Vector suma(Vector v){
        Vector suma = new Vector(this.x + v.x, this.y + v.y);
        return suma;
    }
    
    public Vector resta(Vector v){
        return new Vector(this.x - v.x, this.y - v.y);
    }    
    
    public Vector opera(Vector v, char operacion){
        if (operacion == '+') {
            // (7,5) + (10, 7) = (17,12)
            System.out.printf("(%d,%d) + (%d, %d) = (%d, %d)%n",
                    this.x, this.y, v.x, v.y, 
                    this.suma(v).x, this.suma(v).y);
            return this.suma(v);
        } else {
            // (7,5) - (3, 2) = (4,3)
            System.out.printf("(%d,%d) - (%d, %d) = (%d, %d)%n",
                    this.x, this.y, v.x, v.y, 
                    this.resta(v).x, this.resta(v).y);
            return this.resta(v);
        }
    }
    
    public Vector prod(int n){
        return new Vector(n * x, n * y);
    }
    
    public Vector opera(int n){
        System.out.printf("%d * (%d, %d) = (%d,%d)", 
                n, x, y, this.prod(n).x, this.prod(n).y);
        return this.prod(n);
    }
    
    public int prodE(Vector v){
        return x * v.x + y * v.y;
    }
    
    public int prodV(Vector v){
        return x * v.y - y * v.x;
    }
    
    public boolean esParalelo(Vector v){
        return prodV(v) == 0 && (x != 0 || y != 0) && (v.x != 0 || v.y != 0);
    }
    
    public boolean esPerpendicular(Vector v){
        return prodE(v) == 0 && (x != 0 || y != 0) && (v.x != 0 || v.y != 0);
    }    
      
}
