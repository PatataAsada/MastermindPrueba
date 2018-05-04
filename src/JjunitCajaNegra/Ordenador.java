package JjunitCajaNegra;

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

	public Colores[] validar_combinacion(Colores combinacion[],Colores secreto[]) {
		Colores comprobacion[] = new Colores[dificultad.casillas];
		String marca[] = new String[dificultad.casillas];
		int i,j;
		int correctas = 0;
		int descolocadas = 0;
		for(i=0;i<marca.length;i++) {
			marca[i]="";
		}
		for(i=0;i<combinacion.length;i++) {
			for(j=0;j<combinacion.length;j++) {
				if(secreto[i].color==combinacion[j].color) {
					if(marca[j]!="x") {
						if(i==j) correctas++;
						else descolocadas++;
						marca[j]="x";
						j=combinacion.length;
					}
				}
			}
		}
		for(i=0;i<comprobacion.length;i++) {
			if(correctas>0) {comprobacion[i] = Colores.ACERTADA; correctas--;}
			else if(descolocadas>0) {comprobacion[i] = Colores.DESCOLOCADA; descolocadas--;}
			else comprobacion[i] = Colores.NADA;
		}
		return comprobacion;
	}
}
