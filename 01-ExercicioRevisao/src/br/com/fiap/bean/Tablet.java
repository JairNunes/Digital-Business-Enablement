package br.com.fiap.bean;

import br.com.fiap.bean.interfaces.Eletronico;

public class Tablet extends Produto implements Eletronico{

	private String modelo;
	
	private String marca;
	
	private SistemaOperacional sistemaOperacional;
	
	private boolean rede3g;
	
	public Tablet(int codigo, String titulo, double preco, String modelo, String marca,
			SistemaOperacional sistemaOperacional, boolean rede3g) {
		super(codigo, titulo, preco);
		this.modelo = modelo;
		this.marca = marca;
		this.sistemaOperacional = sistemaOperacional;
		this.rede3g = rede3g;
	}

	public Tablet() {
		super();
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public SistemaOperacional getSistemaOperacional() {
		return sistemaOperacional;
	}

	public void setSistemaOperacional(SistemaOperacional sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}

	public boolean isRede3g() {
		return rede3g;
	}

	public void setRede3g(boolean rede3g) {
		this.rede3g = rede3g;
	}

	@Override
	public double calcularGarantiaEstendida() {		
		return getPreco()*0.05;
	}
	
	@Override
	public String toString() {		
		return getTitulo() + "\n" + getPreco() + "\n" + marca + "\n" + modelo;
	}
	
}




