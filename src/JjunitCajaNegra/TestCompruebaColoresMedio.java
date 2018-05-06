package JjunitCajaNegra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCompruebaColoresMedio {

	Ordenador prueba = new Ordenador(Dificultad.MEDIO);
	Persona pruebaManual = new Persona(Dificultad.MEDIO);
	
	Colores secreto[] = {Colores.AMARILLO,Colores.ROJO,Colores.AZUL,Colores.MORADO,Colores.ROSA};
	Colores resultado[] = new Colores[Dificultad.MEDIO.casillas];
	
	//Pruebas en MEDIO
	
	@Test
	void testSinAcertarMedio() {
		Colores comprobacion[] = {Colores.VERDE,Colores.BLANCO,Colores.NEGRO,Colores.GRIS,Colores.GRIS};
		resultado [0]= Colores.NADA;
		resultado [1]= Colores.NADA;
		resultado [2]= Colores.NADA;
		resultado [3]= Colores.NADA;
		resultado [4]= Colores.NADA;
		assertArrayEquals(resultado, prueba.validar_combinacion(comprobacion,secreto));
	}
	@Test
	void testUnaAcertadaMedio() {
		Colores comprobacion[] = {Colores.VERDE,Colores.ROJO,Colores.BLANCO,Colores.NEGRO,Colores.GRIS};
		resultado [0]= Colores.ACERTADA;
		resultado [1]= Colores.NADA;
		resultado [2]= Colores.NADA;
		resultado [3]= Colores.NADA;
		resultado [4]= Colores.NADA;
		assertArrayEquals(resultado,prueba.validar_combinacion(comprobacion,secreto));
	}
	@Test
	void testVariasAcertadaMedio() {
		Colores comprobacion[] = {Colores.VERDE,Colores.ROJO,Colores.BLANCO,Colores.MORADO,Colores.GRIS};
		resultado [0]= Colores.ACERTADA;
		resultado [1]= Colores.ACERTADA;
		resultado [2]= Colores.NADA;
		resultado [3]= Colores.NADA;
		resultado [4]= Colores.NADA;
		assertArrayEquals(resultado,prueba.validar_combinacion(comprobacion,secreto));
	}
	@Test
	void testUnaDescolocadaMedio() {
		Colores comprobacion[] = {Colores.VERDE,Colores.AMARILLO,Colores.BLANCO,Colores.NEGRO,Colores.GRIS};
		resultado [0]= Colores.DESCOLOCADA;
		resultado [1]= Colores.NADA;
		resultado [2]= Colores.NADA;
		resultado [3]= Colores.NADA;
		resultado [4]= Colores.NADA;
		assertArrayEquals(resultado,prueba.validar_combinacion(comprobacion,secreto));
	}
	@Test
	void testVariasDescolocadasMedio() {
		Colores comprobacion[] = {Colores.ROJO,Colores.AMARILLO,Colores.BLANCO,Colores.NEGRO,Colores.GRIS};
		resultado [0]= Colores.DESCOLOCADA;
		resultado [1]= Colores.DESCOLOCADA;
		resultado [2]= Colores.NADA;
		resultado [3]= Colores.NADA;
		resultado [4]= Colores.NADA;
		assertArrayEquals(resultado,prueba.validar_combinacion(comprobacion,secreto));
	}
	@Test
	void testUnaAcertadaUnaDescolocadaMedio() {
		Colores comprobacion[] = {Colores.ROJO,Colores.VERDE,Colores.AZUL,Colores.GRIS,Colores.GRIS};
		resultado [0]= Colores.ACERTADA;
		resultado [1]= Colores.DESCOLOCADA;
		resultado [2]= Colores.NADA;
		resultado [3]= Colores.NADA;
		resultado [4]= Colores.NADA;
		assertArrayEquals(resultado,prueba.validar_combinacion(comprobacion,secreto));
	}
	@Test
	void testVariasAcertadasUnaDescolocadaMedio() {
		Colores comprobacion[] = {Colores.ROJO,Colores.ROJO,Colores.AZUL,Colores.AMARILLO,Colores.GRIS};
		resultado [0]= Colores.ACERTADA;
		resultado [1]= Colores.ACERTADA;
		resultado [2]= Colores.DESCOLOCADA;
		resultado [3]= Colores.NADA;
		resultado [4]= Colores.NADA;
		assertArrayEquals(resultado,prueba.validar_combinacion(comprobacion,secreto));
	}
	@Test
	void testUnaAcertadaVariasDescolocadasMedio() {
		Colores comprobacion[] = {Colores.ROJO,Colores.AMARILLO,Colores.BLANCO,Colores.MORADO,Colores.GRIS};
		resultado [0]= Colores.ACERTADA;
		resultado [1]= Colores.DESCOLOCADA;
		resultado [2]= Colores.DESCOLOCADA;
		resultado [3]= Colores.NADA;
		resultado [4]= Colores.NADA;
		assertArrayEquals(resultado,prueba.validar_combinacion(comprobacion,secreto));
	}
	@Test
	void testVariasAcertadasVariasDescolocadasMedio() {
		Colores comprobacion[] = {Colores.ROJO,Colores.AMARILLO,Colores.AZUL,Colores.MORADO,Colores.GRIS};
		resultado [0]= Colores.ACERTADA;
		resultado [1]= Colores.ACERTADA;
		resultado [2]= Colores.DESCOLOCADA;
		resultado [3]= Colores.DESCOLOCADA;
		resultado [4]= Colores.NADA;
		assertArrayEquals(resultado,prueba.validar_combinacion(comprobacion,secreto));
	}
	
	@Test
	void testErrorHumanoMedio() {
		Colores comprobacion[] = {Colores.VERDE,Colores.BLANCO,Colores.NEGRO,Colores.GRIS,Colores.GRIS};
		pruebaManual.validar_combinacion(comprobacion,secreto);
	}

}
