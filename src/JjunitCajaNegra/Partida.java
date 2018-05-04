package JjunitCajaNegra;

public class Partida {
	public static Colores lc_pre[]= {Colores.ROJO,Colores.AZUL,Colores.AMARILLO,Colores.VERDE,Colores.GRIS,Colores.LIMA,Colores.BLANCO,Colores.NEGRO,Colores.ROSA,Colores.MORADO};
	public static String lista_colores;
	public Persona j1;
	public Ordenador pc;
	public Persona j2;
	public Dificultad dificultad;
	public Debug debug;
	
	Partida(Dificultad dificultad, Debug debug){
		j1 = new Persona(dificultad);
		j2 = new Persona(dificultad);
		pc = new Ordenador(dificultad);
		lista_colores = imprime_colores();
		this.dificultad = dificultad;
		this.debug = debug;
	}
	
	private String imprime_colores() {
		byte i;
		String resultado="";
		for(i=0;i<dificultad.colores;i++) {
			resultado = resultado + (i+1) + "." + lc_pre[i].color + "\t";
			if(i%5==0) resultado = resultado + "\n";
		}
		return resultado;
	}

	public static void iniciarPartida() {
		
	}
	
	public String dibujarPartida() {
		String resultado = "";
		return resultado;
	}

	public static void mostrarGanador() {
		
		
	}
}
