package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import br.com.fiap.bean.Livro;

public class Teste2 {

	public static void main(String[] args) {
		//Instanciar 3 livros
		
		Livro livro1 = new Livro(1,"Java como programar",500,"Deitel",
				"Altabooks",Calendar.getInstance());
		Livro livro2 = new Livro(2,"Harry Potter",5,"J.K.",
				"Globo",new GregorianCalendar(2000, Calendar.JUNE, 5));
		Livro livro3 = new Livro(3,"Narnia",50,"João",
				"Disney",new GregorianCalendar(1990,Calendar.DECEMBER,25));
		
		//Criar uma lista
		List<Livro> livros = new ArrayList<Livro>();
		livros.add(livro1);
		livros.add(livro2);
		livros.add(livro3);
		
		System.out.println(livros);
		//Exibir
		for (Livro livro : livros) {
			System.out.println("****************");
			System.out.println(livro);
		}
	}
	
}
