package br.com.treinaweb.calculadora.classes;

import br.com.treinaweb.calculadora.interfaces.CalculadorMatematico;

public abstract class CalculoMatematico implements CalculadorMatematico {
	
	
	protected int numero1;
	protected int numero2;
	
	public CalculoMatematico(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	@Override
	public Boolean validar() {
		return numero1 >= 0 && numero2 >=0;
	}

	@Override
	// Desing Patters - Template method
	public  final int calcular() {
		if (validar()) {
			System.out.println("\n\n=========================| \n");
			System.out.println("-> Resultado <- \n");
			return doCalcular();
		} else {
			System.out.println("=========================| ");
			System.out.println("	Operação invalida");
			return -1;			
		}
	}

		protected abstract int doCalcular();
		
}