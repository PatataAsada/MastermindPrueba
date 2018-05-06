package JjunitCajaNegra;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import juego.Colores;
import juego.Dificultad;
import juego.Ordenador;
import juego.Persona;

class TestCompruebaColoresFacil {
	Ordenador prueba = new Ordenador(Dificultad.FACIL);
	Persona pruebaManual = new Persona(Dificultad.FACIL);
	
	Colores secreto[] = {Colores.AMARILLO,Colores.ROJO,Colores.AZUL,Colores.MORADO};
	Colores resultado[] = new Colores[Dificultad.FACIL.casillas];
	
	@Test
	void testSinAcertarFacil() {
		Colores comprobacion[] = {Colores.VERDE,Colores.BLANCO,Colores.NEGRO,Colores.GRIS};
		resultado [0]= Colores.NADA;
		resultado [1]= Colores.NADA;
		resultado [2]= Colores.NADA;
		resultado [3]= Colores.NADA;
		assertArrayEquals(resultado, prueba.validar_combinacion(comprobacion,secreto));
	}
	@Test
	void testUnaAcertadaFacil() {
		Colores comprobacion[] = {Colores.VERDE,Colores.ROJO,Colores.BLANCO,Colores.NEGRO};
		resultado [0]= Colores.ACERTADA;
		resultado [1]= Colores.NADA;
		resultado [2]= Colores.NADA;
		resultado [3]= Colores.NADA;
		assertArrayEquals(resultado,prueba.validar_combinacion(comprobacion,secreto));
	}
	@Test
	void testVariasAcertadaFacil() {
		Colores comprobacion[] = {Colores.VERDE,Colores.ROJO,Colores.BLANCO,Colores.MORADO};
		resultado [0]= Colores.ACERTADA;
		resultado [1]= Colores.ACERTADA;
		resultado [2]= Colores.NADA;
		resultado [3]= Colores.NADA;
		assertArrayEquals(resultado,prueba.validar_combinacion(comprobacion,secreto));
	}
	@Test
	void testUnaDescolocadaFacil() {
		Colores comprobacion[] = {Colores.VERDE,Colores.AMARILLO,Colores.BLANCO,Colores.NEGRO};
		resultado [0]= Colores.DESCOLOCADA;
		resultado [1]= Colores.NADA;
		resultado [2]= Colores.NADA;
		resultado [3]= Colores.NADA;
		assertArrayEquals(resultado,prueba.validar_combinacion(comprobacion,secreto));
	}
	@Test
	void testVariasDescolocadasFacil() {
		Colores comprobacion[] = {Colores.ROJO,Colores.AMARILLO,Colores.BLANCO,Colores.NEGRO};
		resultado [0]= Colores.DESCOLOCADA;
		resultado [1]= Colores.DESCOLOCADA;
		resultado [2]= Colores.NADA;
		resultado [3]= Colores.NADA;
		assertArrayEquals(resultado,prueba.validar_combinacion(comprobacion,secreto));
	}
	@Test
	void testUnaAcertadaUnaDescolocadaFacil() {
		Colores comprobacion[] = {Colores.ROJO,Colores.VERDE,Colores.AZUL,Colores.GRIS};
		resultado [0]= Colores.ACERTADA;
		resultado [1]= Colores.DESCOLOCADA;
		resultado [2]= Colores.NADA;
		resultado [3]= Colores.NADA;
		assertArrayEquals(resultado,prueba.validar_combinacion(comprobacion,secreto));
	}
	@Test
	void testVariasAcertadasUnaDescolocadaFacil() {
		Colores comprobacion[] = {Colores.ROJO,Colores.ROJO,Colores.AZUL,Colores.AMARILLO};
		resultado [0]= Colores.ACERTADA;
		resultado [1]= Colores.ACERTADA;
		resultado [2]= Colores.DESCOLOCADA;
		resultado [3]= Colores.NADA;
		prueba.validar_combinacion(comprobacion,secreto);
		assertArrayEquals(resultado,prueba.validar_combinacion(comprobacion,secreto));
	}
	@Test
	void testUnaAcertadaVariasDescolocadasFacil() {
		Colores comprobacion[] = {Colores.ROJO,Colores.AMARILLO,Colores.BLANCO,Colores.MORADO};
		resultado [0]= Colores.ACERTADA;
		resultado [1]= Colores.DESCOLOCADA;
		resultado [2]= Colores.DESCOLOCADA;
		resultado [3]= Colores.NADA;
		assertArrayEquals(resultado,prueba.validar_combinacion(comprobacion,secreto));
	}
	@Test
	void testVariasAcertadasVariasDescolocadasFacil() {
		Colores comprobacion[] = {Colores.ROJO,Colores.AMARILLO,Colores.AZUL,Colores.MORADO};
		resultado [0]= Colores.ACERTADA;
		resultado [1]= Colores.ACERTADA;
		resultado [2]= Colores.DESCOLOCADA;
		resultado [3]= Colores.DESCOLOCADA;
		assertArrayEquals(resultado,prueba.validar_combinacion(comprobacion,secreto));
	}
	
	@Test
	void testErrorHumanoFacil() {
		Colores comprobacion[] = {Colores.VERDE,Colores.BLANCO,Colores.NEGRO,Colores.GRIS};
		pruebaManual.validar_combinacion(comprobacion,secreto);
	}
	
	
	

}
