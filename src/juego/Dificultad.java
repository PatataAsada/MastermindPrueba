package juego;

public enum Dificultad {
	FACIL("Facil",false,(byte)4,(byte)8,false,10),MEDIO("Medio",true,(byte)5,(byte)8,false,15),DIFICIL("Dificil",true,(byte)6,(byte)10,true,10000000);
	public String dificultad;
	public boolean tableros; 	/*BOOLEAN PARA SABER SI MOSTRAR 1 O 2 TABLEROS*/
	public boolean repeticion; 	/*BOOLEAN PARA REPETICION DE COLORES*/
	public byte casillas;		/*BYTE PARA DEFINIR LAS CASILLAS QUE TENDRÁ EL TABLERO*/
	public byte colores;		/*BYTE PARA DEFINIR CUÁLES COLORES SE USARÁN*/
	public int intentos;		/*INT PARA DEFINIR CUANTOS INTENTOS SE TIENEN*/
	
	Dificultad(String dificultad,boolean tableros, byte casillas, byte colores, boolean repeticion, int intentos){
		this.dificultad=dificultad;
		this.tableros = tableros;
		this.casillas = casillas;
		this.colores = colores;
		this.repeticion = repeticion;
		this.intentos = intentos;
	}
}
