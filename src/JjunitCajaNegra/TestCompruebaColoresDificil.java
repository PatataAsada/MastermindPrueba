package JjunitCajaNegra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import juego.Colores;
import juego.Dificultad;
import juego.Ordenador;

class TestCompruebaColoresDificil {

	Ordenador prueba = new Ordenador(Dificultad.DIFICIL);
	Colores secreto[] = {Colores.AMARILLO,Colores.ROJO,Colores.AZUL,Colores.MORADO,Colores.ROSA,Colores.LIMA};
	Colores resultado[] = new Colores[Dificultad.DIFICIL.casillas];
	
	//Pruebas en MEDIO
	
	@Test
	void testSinAcertarDificil() {
		Colores comprobacion[] = {Colores.VERDE,Colores.BLANCO,Colores.NEGRO,Colores.GRIS,Colores.GRIS,Colores.GRIS};
		resultado [0]= Colores.NADA;
		resultado [1]= Colores.NADA;
		resultado [2]= Colores.NADA;
		resultado [3]= Colores.NADA;
		resultado [4]= Colores.NADA;
		resultado [5]= Colores.NADA;
		assertArrayEquals(resultado, prueba.validar_combinacion(comprobacion,secreto));
	}
	@Test
	void testUnaAcertadaDificil() {
		Colores comprobacion[] = {Colores.VERDE,Colores.ROJO,Colores.BLANCO,Colores.NEGRO,Colores.NEGRO,Colores.NEGRO};
		resultado [0]= Colores.ACERTADA;
		resultado [1]= Colores.NADA;
		resultado [2]= Colores.NADA;
		resultado [3]= Colores.NADA;
		resultado [4]= Colores.NADA;
		resultado [5]= Colores.NADA;
		assertArrayEquals(resultado,prueba.validar_combinacion(comprobacion,secreto));
	}
	@Test
	void testVariasAcertadaDificil() {
		Colores comprobacion[] = {Colores.VERDE,Colores.ROJO,Colores.BLANCO,Colores.MORADO,Colores.MORADO,Colores.MORADO};
		resultado [0]= Colores.ACERTADA;
		resultado [1]= Colores.ACERTADA;
		resultado [2]= Colores.NADA;
		resultado [3]= Colores.NADA;
		resultado [4]= Colores.NADA;
		resultado [5]= Colores.NADA;
		assertArrayEquals(resultado,prueba.validar_combinacion(comprobacion,secreto));
	}
	@Test
	void testUnaDescolocadaDificil() {
		Colores comprobacion[] = {Colores.VERDE,Colores.AMARILLO,Colores.BLANCO,Colores.NEGRO,Colores.NEGRO,Colores.NEGRO};
		resultado [0]= Colores.DESCOLOCADA;
		resultado [1]= Colores.NADA;
		resultado [2]= Colores.NADA;
		resultado [3]= Colores.NADA;
		resultado [4]= Colores.NADA;
		resultado [5]= Colores.NADA;
		assertArrayEquals(resultado,prueba.validar_combinacion(comprobacion,secreto));
	}
	@Test
	void testVariasDescolocadasDificil() {
		Colores comprobacion[] = {Colores.ROJO,Colores.AMARILLO,Colores.BLANCO,Colores.NEGRO,Colores.NEGRO,Colores.NEGRO};
		resultado [0]= Colores.DESCOLOCADA;
		resultado [1]= Colores.DESCOLOCADA;
		resultado [2]= Colores.NADA;
		resultado [3]= Colores.NADA;
		resultado [4]= Colores.NADA;
		resultado [5]= Colores.NADA;
		assertArrayEquals(resultado,prueba.validar_combinacion(comprobacion,secreto));
	}
	@Test
	void testUnaAcertadaUnaDescolocadaDificil() {
		Colores comprobacion[] = {Colores.ROJO,Colores.VERDE,Colores.AZUL,Colores.GRIS,Colores.GRIS,Colores.GRIS};
		resultado [0]= Colores.ACERTADA;
		resultado [1]= Colores.DESCOLOCADA;
		resultado [2]= Colores.NADA;
		resultado [3]= Colores.NADA;
		resultado [4]= Colores.NADA;
		resultado [5]= Colores.NADA;
		assertArrayEquals(resultado,prueba.validar_combinacion(comprobacion,secreto));
	}
	@Test
	void testVariasAcertadasUnaDescolocadaDificil() {
		Colores comprobacion[] = {Colores.ROJO,Colores.ROJO,Colores.AZUL,Colores.AMARILLO,Colores.AMARILLO,Colores.AMARILLO};
		resultado [0]= Colores.ACERTADA;
		resultado [1]= Colores.ACERTADA;
		resultado [2]= Colores.DESCOLOCADA;
		resultado [3]= Colores.NADA;
		resultado [4]= Colores.NADA;
		resultado [5]= Colores.NADA;
		assertArrayEquals(resultado,prueba.validar_combinacion(comprobacion,secreto));
	}
	@Test
	void testUnaAcertadaVariasDescolocadasDificil() {
		Colores comprobacion[] = {Colores.ROJO,Colores.AMARILLO,Colores.BLANCO,Colores.MORADO,Colores.MORADO,Colores.MORADO};
		resultado [0]= Colores.ACERTADA;
		resultado [1]= Colores.DESCOLOCADA;
		resultado [2]= Colores.DESCOLOCADA;
		resultado [3]= Colores.NADA;
		resultado [4]= Colores.NADA;
		resultado [5]= Colores.NADA;
		assertArrayEquals(resultado,prueba.validar_combinacion(comprobacion,secreto));
	}
	@Test
	void testVariasAcertadasVariasDescolocadasDificil() {
		Colores comprobacion[] = {Colores.ROJO,Colores.AMARILLO,Colores.AZUL,Colores.MORADO,Colores.MORADO,Colores.MORADO};
		resultado [0]= Colores.ACERTADA;
		resultado [1]= Colores.ACERTADA;
		resultado [2]= Colores.DESCOLOCADA;
		resultado [3]= Colores.DESCOLOCADA;
		resultado [4]= Colores.NADA;
		resultado [5]= Colores.NADA;
		assertArrayEquals(resultado,prueba.validar_combinacion(comprobacion,secreto));
	}
	

}
