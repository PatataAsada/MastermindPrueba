package juego;

import juego.Teclado.Incluido;
import juego.Teclado.Tipos;

public class Persona extends Jugador{
	Persona(Dificultad dificultad){
		super(dificultad);
	}
	/*CREACION DE COMBINACION PARA EL OPONENTE*/
	public void escoger_combinacion(Jugador jugador) {
		int i=dificultad.casillas;
		int n;
		Colores combi[] = new Colores[dificultad.casillas];
		boolean terminado = true;
		do {
			System.out.println("Selecciona la combinación para que adivine tu oponente:");
			System.out.println("Los colores que puedes escoger son los siguientes\n"
					+ Partida.lista_colores);
			for(i=0;i<dificultad.casillas;i++) {
				System.out.printf("\nCasilla "+(i+1) + ":");
				n=Teclado.leerEntre(0, (int)dificultad.colores, Incluido.MAXIMO, Tipos.INT)-1;
				
			}
		}while(terminado);
	}
	/*PARA DECIR CUÁL COMBINACIÓN QUIERES INTENTAR*/
	public boolean adivinar_combinacion(Jugador jugador) {
		boolean resultado=false;
		return resultado;
	}
	/*PARA DECIR CUALES HA ACERTADO EL JUGADOR CONTRARIO*/
	public boolean validar_combinacion(Jugador jugador) {
		boolean resultado = false;
		return resultado;
	}
	
	
}
