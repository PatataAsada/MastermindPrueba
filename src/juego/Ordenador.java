package juego;

import java.util.Random;

public class Ordenador extends Jugador{
	Ordenador(Dificultad dificultad){
		super(dificultad);
	}

	public void escoger_combinacion(Jugador jugador) {
		Random rnd = new Random();
		int seleccion;
		Colores combinacion[] = new Colores[dificultad.casillas];
		int i;
		for(i=0;i<dificultad.casillas;i++) {
			seleccion = rnd.nextInt(dificultad.colores)+1;
			combinacion[i]=Partida.lc_pre[seleccion];
		}
		jugador.tablero.combinacion = combinacion;
	}
	
	public boolean adivinar_combinacion(Jugador jugador) {
		
		return false;
	}

	public Colores[] validar_combinacion() {
		Colores combinacion[] = new Colores[dificultad.casillas];
		
		return combinacion;
	}
}
