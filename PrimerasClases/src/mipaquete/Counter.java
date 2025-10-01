package mipaquete;

public class Counter {
	int value = 0;
	int maxValue = 100_000;
	String model = "N-COUNTER";
	
	public Counter(int maxValue, String model) {
		this.maxValue = maxValue > 10 ? maxValue : 10;
		this.model = model;
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
	}	
	
	public void show() {
		System.out.printf("Contador: modelo (%s) y valor %d de %d.%n", model, value, maxValue);
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
		
		System.out.println(c4.reset());
		c4.show();
		System.out.println(c2.reset());
		c2.show();
		
	}
}
