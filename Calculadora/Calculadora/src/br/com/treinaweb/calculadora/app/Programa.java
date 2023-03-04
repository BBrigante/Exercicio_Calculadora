package br.com.treinaweb.calculadora.app;

import br.com.treinaweb.calculadora.fabricas.FabricaCalculoMatematico;
import br.com.treinaweb.calculadora.interfaces.CalculadorMatematico;

public class Programa {

	public static void main(String[] args) {
		
		String calculo = "+"; //Operadores (+ adição, - Subtração, * Multiplicacao, /Divisao, ^Potencializacao).
		int numero1 = 500; 
		int numero2 = 500;
		
		FabricaCalculoMatematico fabrica = new FabricaCalculoMatematico();
		CalculadorMatematico calculador = fabrica.criarCalculador(numero1, numero2, calculo);
		
		if(calculador != null) {
			System.out.println(calculador.calcular());
			System.out.println("\n=========================|");
		} else {
			System.out.println();
		}
	}

}
