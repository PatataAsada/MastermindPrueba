package JjunityCajaNegra;

public abstract class Jugador {
	public Tablero tablero;
	public Dificultad dificultad;
	
	Jugador(Dificultad dificultad){
		tablero = new Tablero(dificultad);
		this.dificultad = dificultad;
	}
	public abstract void escoger_combinacion(Jugador jugador);
	public abstract boolean adivinar_combinacion(Jugador jugador);
	public abstract Colores[] validar_combinacion(Colores combinacion[], Colores secreto[]);
}
