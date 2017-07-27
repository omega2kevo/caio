package br.com.qualister.triangulo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrianguloBasicoUnitTest {

	@Test
	public void testeTrianguloEquilatero() throws TrianguloNaoPreenchidoException {
		assertEquals("O triângulo é Equilátero", Triangulo.calcular(3, 3, 3));
		System.out.println("teste");
	}
	
	@Test
	public void testeTrianguloEscaleno() throws TrianguloNaoPreenchidoException {
		assertEquals("O triângulo é Escaleno", Triangulo.calcular(3, 6, 9));
		System.out.println("teste1");
	}
	
	@Test
	public void testeTrianguloIsosceles() throws TrianguloNaoPreenchidoException {
		assertEquals("O triângulo é Isósceles", Triangulo.calcular(3, 6, 6));
		System.out.println("teste2");
	}

}
