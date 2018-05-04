package JjunitCajaNegra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCompruebaColores {
	Ordenador prueba = new Ordenador(Dificultad.FACIL);
	Colores secreto[] = {Colores.AMARILLO,Colores.ROJO,Colores.AZUL,Colores.MORADO};
	Colores resultado[] = new Colores[Dificultad.FACIL.casillas];
	
	
	@Test
	void testSinAcertar() {
		Colores comprobacion[] = {Colores.VERDE,Colores.BLANCO,Colores.NEGRO,Colores.GRIS};
		resultado [0]= Colores.NADA;
		resultado [1]= Colores.NADA;
		resultado [2]= Colores.NADA;
		resultado [3]= Colores.NADA;
		assertArrayEquals(resultado, prueba.validar_combinacion(comprobacion,secreto));
	}
	@Test
	void testUnaAcertada() {
		Colores comprobacion[] = {Colores.VERDE,Colores.ROJO,Colores.BLANCO,Colores.NEGRO};
		resultado [0]= Colores.ACERTADA;
		resultado [1]= Colores.NADA;
		resultado [2]= Colores.NADA;
		resultado [3]= Colores.NADA;
		assertArrayEquals(resultado,prueba.validar_combinacion(comprobacion,secreto));
	}
	@Test
	void testVariasAcertada() {
		Colores comprobacion[] = {Colores.VERDE,Colores.ROJO,Colores.BLANCO,Colores.MORADO};
		resultado [0]= Colores.ACERTADA;
		resultado [1]= Colores.ACERTADA;
		resultado [2]= Colores.NADA;
		resultado [3]= Colores.NADA;
		assertArrayEquals(resultado,prueba.validar_combinacion(comprobacion,secreto));
	}
	@Test
	void testUnaDescolocada() {
		Colores comprobacion[] = {Colores.VERDE,Colores.AMARILLO,Colores.BLANCO,Colores.NEGRO};
		resultado [0]= Colores.DESCOLOCADA;
		resultado [1]= Colores.NADA;
		resultado [2]= Colores.NADA;
		resultado [3]= Colores.NADA;
		assertArrayEquals(resultado,prueba.validar_combinacion(comprobacion,secreto));
	}
	@Test
	void testVariasDescolocadas() {
		Colores comprobacion[] = {Colores.ROJO,Colores.AMARILLO,Colores.BLANCO,Colores.NEGRO};
		resultado [0]= Colores.DESCOLOCADA;
		resultado [1]= Colores.DESCOLOCADA;
		resultado [2]= Colores.NADA;
		resultado [3]= Colores.NADA;
		assertArrayEquals(resultado,prueba.validar_combinacion(comprobacion,secreto));
	}
	@Test
	void testUnaAcertadaUnaDescolocada() {
		Colores comprobacion[] = {Colores.ROJO,Colores.VERDE,Colores.AZUL,Colores.GRIS};
		resultado [0]= Colores.ACERTADA;
		resultado [1]= Colores.DESCOLOCADA;
		resultado [2]= Colores.NADA;
		resultado [3]= Colores.NADA;
		assertArrayEquals(resultado,prueba.validar_combinacion(comprobacion,secreto));
	}
	@Test
	void testVariasAcertadasUnaDescolocada() {
		Ordenador prueba = new Ordenador(Dificultad.FACIL);
		Colores comprobacion[] = {Colores.ROJO,Colores.ROJO,Colores.AZUL,Colores.AMARILLO};
		resultado [0]= Colores.ACERTADA;
		resultado [1]= Colores.ACERTADA;
		resultado [2]= Colores.DESCOLOCADA;
		resultado [3]= Colores.NADA;
		assertArrayEquals(resultado,prueba.validar_combinacion(comprobacion,secreto));
	}
	@Test
	void testUnaAcertadaVariasDescolocadas() {
		Colores comprobacion[] = {Colores.ROJO,Colores.AMARILLO,Colores.BLANCO,Colores.MORADO};
		resultado [0]= Colores.ACERTADA;
		resultado [1]= Colores.DESCOLOCADA;
		resultado [2]= Colores.DESCOLOCADA;
		resultado [3]= Colores.NADA;
		assertArrayEquals(resultado,prueba.validar_combinacion(comprobacion,secreto));
	}
	@Test
	void testVariasAcertadasVariasDescolocadas() {
		Colores comprobacion[] = {Colores.ROJO,Colores.AMARILLO,Colores.AZUL,Colores.MORADO};
		resultado [0]= Colores.ACERTADA;
		resultado [1]= Colores.ACERTADA;
		resultado [2]= Colores.DESCOLOCADA;
		resultado [3]= Colores.DESCOLOCADA;
		assertArrayEquals(resultado,prueba.validar_combinacion(comprobacion,secreto));
	}
	@Test
	void testErrorHumano() {
		Colores comprobacion[] = {Colores.VERDE,Colores.BLANCO,Colores.NEGRO,Colores.GRIS};
		
		assertArrayEquals(resultado,prueba.validar_combinacion(comprobacion,secreto));
	}

}
