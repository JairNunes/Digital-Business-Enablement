package br.com.fiap.view;

import org.apache.axis2.AxisFault;

import br.com.fiap.bo.CursoBOStub;
import br.com.fiap.bo.CursoBOStub.CalcularExame;
import br.com.fiap.bo.CursoBOStub.CalcularExameResponse;

public class TesteExame {

	public static void main(String[] args) {
		//Chamar o método de calcularExame
		try {
			CursoBOStub stub = new CursoBOStub();
			
			CalcularExame valores = new CalcularExame();
			valores.setExame(7);
			valores.setMedia(5);
			
			CalcularExameResponse response =
								stub.calcularExame(valores);
			
			String msg = response.get_return();
			System.out.println(msg);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
