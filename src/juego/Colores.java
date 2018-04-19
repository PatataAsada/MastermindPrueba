package juego;

public enum Colores {
ROJO("rojo","\u001B[41m"),AZUL("azul","\u001B[44m"),AMARILLO("amarillo","\u001B[43m"),VERDE("verde","\u001B[42m"),GRIS("gris","\u001B[100m"),LIMA("lima","\u001B[102m"),BLANCO("blanco","\u001B[47m"),NEGRO("negro","\u001B[40m"),ROSA("rosa","\u001B[105m"),MORADO("morado","\u001B[45m");
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
