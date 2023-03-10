package br.com.treinaweb.calculadora.fabricas;

import br.com.treinaweb.calculadora.classes.Adicao;
import br.com.treinaweb.calculadora.classes.Divisao;
import br.com.treinaweb.calculadora.classes.Multiplicacao;
import br.com.treinaweb.calculadora.classes.Potenciacao;
import br.com.treinaweb.calculadora.classes.Subtracao;
import br.com.treinaweb.calculadora.interfaces.CalculadorMatematico;

public class FabricaCalculoMatematico {

	public CalculadorMatematico criarCalculador(int numero1, int numero2, String calculo) {
		if (calculo.equals("+")) {
			return new Adicao(numero1, numero2);
		} else if (calculo.equals("-")){
			return new Subtracao (numero1, numero2);
		} else if(calculo.equals("*")) {
			return new Multiplicacao(numero1, numero2);
		} else if(calculo.equals("/")){
			return new Divisao (numero1, numero2);
		} else if (calculo.equals("^")) {
			return new Potenciacao(numero1, numero2);
		}else {
			return null;
		}
	}
}
