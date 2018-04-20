package juego;

public enum Colores {
ROJO("\u001B[41m rojo \u001B[0m","\u001B[41m"),AZUL("\u001B[44m azul \u001B[0m","\u001B[44m"),AMARILLO("\\u001B[43m amarillo \u001B[0m","\u001B[43m"),VERDE("\u001B[42m verde \u001B[0m","\u001B[42m"),GRIS("\u001B[100m gris \u001B[0m","\u001B[100m"),LIMA("\u001B[102m lima \u001B[0m","\u001B[102m"),BLANCO("\u001B[47m blanco \u001B[0m","\u001B[47m"),NEGRO("\u001B[40m negro \u001B[0m","\u001B[40m"),ROSA("\u001B[105m rosa \u001B[0m","\u001B[105m"),MORADO("\u001B[45m morado \u001B[0m","\u001B[45m");
	public String color;
	public String pinta;
	public String reset = "\u001B[0m";
	Colores(String color,String colorado) {
		this.color = color;
		this.pinta = colorado;
	}
	public String ToString() {
		String resultado = pinta+"   "+reset;
		return resultado;
	}
}
