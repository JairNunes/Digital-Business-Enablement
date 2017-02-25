package br.com.fiap.bo;

import java.util.HashMap;

import org.apache.axis2.AxisFault;

import br.com.fiap.to.ProdutoTO;

public class EstoqueBO {

	//Simular o banco 
	private static HashMap<Integer, ProdutoTO> banco;
	
	public EstoqueBO(){
		banco = new HashMap<>();
		banco.put(401, new ProdutoTO(401, "Camisa Branca", 79, 10));
		banco.put(402, new ProdutoTO(402, "Camisa Rosa", 89, 100));
	}
	
	public ProdutoTO consultarProduto(int codigo) 
								throws AxisFault {
		ProdutoTO prod = banco.get(codigo);
		if (prod == null)
			throw new AxisFault("Produto não encontrado");
		return prod;
	}
	
}


