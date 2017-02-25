package br.com.fiap.teste;

import br.com.fiap.config.PropertySingleton;

public class Teste {

	public static void main(String[] args) {
		//Ler e exibir uma configuração 
		System.out.println(PropertySingleton
				.getInstance().getProperty("mensagem"));
	}
	
}