package juego;

import juego.Teclado.Tipos;

public class Menu {

	public static void main(String[] args) {
		boolean cerrar_programa = true; /*BOOLEAN PARA CERRAR BUCLE Y PROGRAMA DE MASTERMIND*/
		/*DIFICULTAD Y ESTADO DEL MODO DEBUG POR PREDETERMINADO AL INICIAR EL PROGRAMA*/
		Debug debug = Debug.D;
		Dificultad dificultad = Dificultad.FACIL;
		@SuppressWarnings("unused")
		Partida partida;
		/*PARA LA OPCION DEL MENÚ*/
		byte opcion;
		
		System.out.printf("Bienvenido al juego mastermind creado por Yeray Moreno\n");
		do{
			System.out.println("_______________________________________________________________________________________________\n");
			System.out.println("Por favor, selecciona una de las siguientes opciones:\n"
					+ "1. Cambiar dificultad.\t\t(Dificultad seleccionada: "+dificultad.dificultad+")\n"
					+ "2. Modo debug.\t\t\t"+"(Estado: "+debug.interruptor+")\n"
					+ "3. Iniciar partida.\n"
					+ "4. Cerrar programa");
			System.out.println("_______________________________________________________________________________________________\n");
			opcion = Teclado.leerNumero(Tipos.BYTE);
			switch(opcion) {
			case 1: 
				if(dificultad.dificultad=="Facil") {dificultad = Dificultad.MEDIO;}
				else if(dificultad.dificultad=="Medio") {dificultad = Dificultad.DIFICIL;}
				else {dificultad = Dificultad.FACIL;}
				break;
			case 2:
				if(debug.activo==false) {debug = Debug.A;}
				else {debug = Debug.D;}
				break;
			case 3:
				partida = new Partida(dificultad, debug);
				Partida.iniciarPartida();
				Partida.mostrarGanador();
				break;
			case 4:
				cerrar_programa=false;
			}
		}while (cerrar_programa);
		System.out.println("¡Hasta otra!");
	}

}
