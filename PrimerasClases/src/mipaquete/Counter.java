package mipaquete;

public class Counter {
	
	//PROPIEDADES
	private static int numeroContador = 0;
	
	private int id;
	private int value = 0;
	private int maxValue = 100_000;
	private String model = "N-COUNTER";
	
	//VALIDACIONES
	private static String devuelveModeloCorrecto(String model) {
		return model == null || model.equals("") ? "N_COUNTER" : model;
	}
	
	//CONSTRUCTORES
	public Counter(int maxValue, String model) {
		this.maxValue = maxValue > 10 ? maxValue : 10;
		this.model = devuelveModeloCorrecto(model);
		numeroContador++;
		id = numeroContador * 2;
	}
	
	public Counter(int maxValue) {
		this(maxValue, "N-MODEL");
	}

	public Counter() {
		this(100_000, "N-MODEL");
	}

	public Counter(Counter c) {
		value = c.value;
		maxValue = c.maxValue;
		model = c.model;
		numeroContador++;
		id = numeroContador * 2;
	}	
	
	//METODOS
	public void show() {
		System.out.printf("Contador: modelo (%s) y id: %d y valor %d de %d.%n", model, id, value, maxValue);
		System.out.printf("Contadores Creados en TOTAL: %d.%n", numeroContador);
	}
	
	public boolean increment() {
		/*if (value < maxValue) {
			value++;
			return true;
		}else {
			return false;
		}*/
		/*
		boolean incrementable = value < maxValue;
		if (incrementable) value++;
		return incrementable;
		*/
		return increment(1);
	}
	
	public boolean increment(int i) {
		/*
		if (n <= 0) return false;
		if (value < maxValue) {
			value+= i;
			return true;
		}else {
			value = maxValue;
		}
		return false;
		*/
		if (i <= 0) return false;
		boolean incrementable = value + i <= maxValue;
		value = incrementable? value + i : maxValue;
		return incrementable;
	}
	
	public boolean reset() {
		if (value == maxValue) {
			value = 0;
			return true;
		}
		return false;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public static int getNumeroContador() {
		return numeroContador;
	}

	public int getId() {
		return id;
	}

	public int getValue() {
		return value;
	}

	public int getMaxValue() {
		return maxValue;
	}

	public String getModel() {
		return model;
	}

	public static long sumarValoresArray(Counter [] array) {
		long total = 0;
		for (Counter counter : array) {
			total += counter.value;
		}
		
		return total;		
	}
	
	//MAIN
	public static void main(String[] args) {
		
		Counter c1 = new Counter();
		for (int i = 0; i < 8 ; i++) {
			c1.increment(5);
		}		
		c1.show();
		
		Counter c2 = new Counter(-3);
		for (int i = 0; i < 8 ; i++) {
			c2.increment();
		}		
		c2.show();
		
		Counter c3 = new Counter(-5, "modelito");
		for (int i = 0; i < 10 ; i++) {
			c3.increment(5);
		}		
		c3.show();
		
		Counter c4 = new Counter(c3);
		c4.show();
		
		System.out.println();
		System.out.printf("Intentamos resetear los contadors %d y %d :%n", c4.id, c2.id);
		System.out.println("==========================================");
		System.out.println(c4.reset());
		c4.show();
		System.out.println(c2.reset());
		c2.show();
		
		Counter [] arrayContadores = {c1, c2, c3, c4};
		System.out.printf("El total de la suma de los valores de todos los contadores es: %d.%n", sumarValoresArray(arrayContadores));
		
	}
}
