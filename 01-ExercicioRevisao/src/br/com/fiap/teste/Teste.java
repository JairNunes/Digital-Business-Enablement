package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.fiap.bean.Livro;
import br.com.fiap.bean.SistemaOperacional;
import br.com.fiap.bean.Tablet;

public class Teste {

	public static void main(String[] args) {
		//Instanciar os objetos
		Livro livro = new Livro(1, "Revolução dos bichos", 50, 
				"George", "Abril", new GregorianCalendar(2000, Calendar.APRIL, 2));
		
		Tablet tablet = new Tablet(2, "Lenovo 10G", 1500, "10G", "Lenovo",
				SistemaOperacional.ANDROID, true);
		
		//Exibir as informações
		System.out.println(livro);
		System.out.println(tablet);
		System.out.println(tablet.calcularGarantiaEstendida());
	}
	
}



