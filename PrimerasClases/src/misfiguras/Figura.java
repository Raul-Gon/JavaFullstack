package misfiguras;

import java.text.Normalizer;

public abstract class Figura {
	
	private String color;
	
	public Figura() {
		this("negro");
	}
	
	public Figura(String color) {
		if (color == null) color = "negro";
		
		// pone todo a minusculas
		color = color.toLowerCase();
		// Normaliza el string en su forma decomponed (NFD)
        color = Normalizer.normalize(color, Normalizer.Form.NFD);
        // Elimina los caracteres de diacríticos
        color = color.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
		
		this.color = ("azul".equals(color) || "marron".equals(color) || "gris".equals(color) || "verde".equals(color) || 
					  "naranja".equals(color) || "rosa".equals(color) || "purpura".equals(color) || "rojo".equals(color) ||
					  "blanco".equals(color) || "amarillo".equals(color) ? color : "negro");
		
	}

	public String getColor() {
		return color;
	}
	
}
