package br.com.fiap.view;

import br.com.fiap.bo.CursoBOStub;
import br.com.fiap.bo.CursoBOStub.CalcularMedia;
import br.com.fiap.bo.CursoBOStub.CalcularMediaResponse;

public class TesteMedia {

	public static void main(String[] args) {
		
		try {
			CursoBOStub stub = new CursoBOStub();
			
			//Valores que será enviados para o webservice
			CalcularMedia valores = new CalcularMedia();
			valores.setAm(7);
			valores.setNac(10);
			valores.setPs(5);
			
			//Chama o webservice
			CalcularMediaResponse response =
								stub.calcularMedia(valores);
			
			double media = response.get_return();
			System.out.println("Média " + media);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
