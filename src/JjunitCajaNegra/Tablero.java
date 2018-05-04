package JjunitCajaNegra;

public class Tablero {
	public Colores tablero[][];
	public Colores combinacion[];
	public Colores aciertos[][];
	
	Tablero(Dificultad dificultad){
		this.tablero = new Colores[dificultad.intentos][dificultad.casillas];
		this.aciertos = new Colores[dificultad.intentos][dificultad.casillas];
		this.combinacion = new Colores[dificultad.casillas];
	}
}
