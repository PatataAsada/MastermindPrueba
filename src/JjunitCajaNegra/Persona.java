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
		Colores comprobacion[] = new Colores[dificultad.casillas];
		String mensaje="";
		//En realidad lo hace toda la comprobación la IA.
		Ordenador autenticoProbador = new Ordenador(dificultad);
		resultado = autenticoProbador.validar_combinacion(combinacion, secreto);
		int correctas=0;
		int descolocadas=0;
		int i;
		String secretoS="Combinacion secreta: ";
		String combinacionS="Mi intento: ";
		for(i=0;i<secreto.length;i++) {
			secretoS=secretoS + secreto[i].color+ " ";
		}
		for(i=0;i<combinacion.length;i++) {
			combinacionS=combinacionS + combinacion[i].color+ " ";
		}
		
		//Imprimo las dos combinaciones para mostrar al usuario.
		System.out.printf("Comprobemos cuanto me he acercado a ganar:\n"+secretoS+"\n"+combinacionS+"\n");
		
		//Aqui se da la oportunidad al jugador de decir algo por si quiere intentar mentir o "equivocarse".
		//Bucle para mostrar la combinacion que usa el contrincante y muestra del secreto.
		System.out.print("¿Cuántas he acertado en su lugar? ");
		correctas = Teclado.leerEntre(0, (int)dificultad.casillas, Incluido.TODOS, Tipos.INT);
		System.out.printf("¿Cuántas he acertado pero no en su lugar? ");
		descolocadas = Teclado.leerEntre(0, (int)dificultad.casillas, Incluido.TODOS, Tipos.INT);
		for(i=0;i<comprobacion.length;i++) {
			if(correctas>0) {comprobacion[i] = Colores.ACERTADA; correctas--;}
			else if(descolocadas>0) {comprobacion[i] = Colores.DESCOLOCADA; descolocadas--;}
			else comprobacion[i] = Colores.NADA;
		}
		for(i=0;i<comprobacion.length;i++) {
			if(comprobacion[i]!=resultado[i]) mensaje="Me parece que te equivocaste corrigiendo, deja que lo haga por ti.";
		System.out.println(mensaje);
		}
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
