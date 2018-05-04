package JjunitCajaNegra;
import juego.Teclado;
import juego.Teclado.Incluido;
import juego.Teclado.Tipos;

/**
 * 
 * @author yeray
 *
 */
public class Persona extends Jugador{
	/**
	 * 
	 * @param dificultad
	 */
	Persona(Dificultad dificultad){
		super(dificultad);
	}
	/*CREACION DE COMBINACION PARA EL OPONENTE*/
	/**
	 * 
	 */
	public void escoger_combinacion(Jugador jugador) {
		System.out.printf("Selecciona combinación para tu oponente:\n");
		jugador.tablero.combinacion = seleccionCombinacion();
	}
	/*PARA DECIR CUÁL COMBINACIÓN QUIERES INTENTAR*/
	/**
	 * 
	 */
	public boolean adivinar_combinacion(Jugador jugador) {
		boolean resultado=false;
		
		return resultado;
	}
	/*PARA DECIR CUALES HA ACERTADO EL JUGADOR CONTRARIO*/
	/**
	 * 
	 */
	public Colores[] validar_combinacion(Colores combinacion[], Colores secreto[]) {
		Colores resultado[] = new Colores[dificultad.casillas];
		
		return resultado;
	}
	/**
	 * 
	 * @return
	 */
	public Colores[] seleccionCombinacion() {
		Colores resultado[] = new Colores[dificultad.casillas];
		int i=0;
		int n;
		String combinacion="";
		boolean terminado = true;
		do {
			System.out.println("Selecciona la combinación:");
			System.out.println("Los colores que puedes escoger son los siguientes\n"
					+ Partida.lista_colores);
			for(i=0;i<dificultad.casillas;i++) {
				System.out.printf("\nCasilla "+(i+1) + ":");
				n=Teclado.leerEntre(0, (int)dificultad.colores, Incluido.MAXIMO, Tipos.INT)-1;
				resultado[i] = Partida.lc_pre[n];
			}
			for(i=0;i<resultado.length;i++) {
				combinacion = combinacion + resultado[i].color + " ";
			}
			terminado = Teclado.leerBoolean(combinacion + "\t<- Esta es la combinación que qouieres?", "no", "si");
			combinacion = "";
		}while(terminado);
		return resultado;
	}
	
}
