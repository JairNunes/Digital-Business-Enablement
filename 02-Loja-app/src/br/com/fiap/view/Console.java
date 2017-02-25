package br.com.fiap.view;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;


import br.com.fiap.bo.EstoqueBO;
import br.com.fiap.config.PropertySingleton;
import br.com.fiap.to.ProdutoTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/***
 * @author Thiago Yamamoto
 * @version 1.0
 */
public class Console {

	private static Logger log = 
		LoggerFactory.getLogger(Console.class);
	
	public static void main(String[] args) {
		
		log.warn("In�cio da aplica��o");
		
		Scanner scanner = new Scanner(System.in);
		
		//Data para o laoyout da aplica��o
		Calendar dataHoje = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		//Ler a configura��o do nome da loja
		String loja = PropertySingleton
						.getInstance().getProperty("empresa");
		
		System.out.println(loja + "          " + sdf.format(dataHoje.getTime()));
		System.out.println("******************************");
		System.out.print("Digite o c�digo:");
		//L� o c�digo inserido pelo usu�rio
		int codigo = scanner.nextInt();
		
		EstoqueBO bo = new EstoqueBO();
		ProdutoTO produto = bo.consultarProduto(codigo);
		log.debug("Pesquisando o produto: " + codigo);
		
		if (produto != null){
			System.out.println(produto.getDescricao());
			System.out.println(produto.getQuantidade());
			
			//Formatar valores monet�rios
			DecimalFormat format = new DecimalFormat("R$ #,###.00");
			System.out.println(format.format(produto.getPreco()));
		}else{
			log.error("Produto inexistente");
			System.out.println("Produto n�o cadastrado!");
		}
		scanner.close();
		
		log.warn("Fim da aplica��o");
	}
	
}
