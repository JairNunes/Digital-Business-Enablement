package br.com.fiap.bo;

import java.util.HashMap;

import br.com.fiap.to.ProdutoTO;

public class EstoqueBO {

	//Simular o banco 
	private static HashMap<Integer, ProdutoTO> banco;
	
	public EstoqueBO(){
		banco = new HashMap<>();
		banco.put(401, new ProdutoTO(401, "Camisa Branca", 79, 10));
		banco.put(402, new ProdutoTO(402, "Camisa Rosa", 89, 100));
	}
	
	public ProdutoTO consultarProduto(int codigo){
		return banco.get(codigo);
	}
	
}