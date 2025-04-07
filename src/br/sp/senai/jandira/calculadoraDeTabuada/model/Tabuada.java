package br.sp.senai.jandira.calculadoraDeTabuada.model;

public class Tabuada {
	
	private double minimoMultiplicador;
	private double maximoMultiplicador;
	private double multiplicando;
	
	public double getMinimoMultiplicador() {
		return minimoMultiplicador;
	}
	
	public void setMinimoMultiplicador(double minimoMultiplicador) {
		this.minimoMultiplicador = minimoMultiplicador;
	}
	
	public double getMaximoMultiplicador() {
		return maximoMultiplicador;
	}
	
	public void setMaximoMultiplicador(double maximoMultiplicador) {
		this.maximoMultiplicador = maximoMultiplicador;
	}
	
	public double getMultiplicando() {
		return multiplicando;
	}
	
	public void setMultiplicando(double multiplicando) {
		this.multiplicando = multiplicando;
	}
	
	public String [] calcularTabuada() {
		if (minimoMultiplicador>maximoMultiplicador) {
			double temp = minimoMultiplicador;
			minimoMultiplicador = maximoMultiplicador;
			maximoMultiplicador = minimoMultiplicador;
		}
		
		// Criar um vetor de String que armazenará cada linha da tabuada
		int tamanho = (int) (maximoMultiplicador - minimoMultiplicador + 1);
		String resultado[] = new String [tamanho];
		
		int contador = 0;
		while (minimoMultiplicador <= maximoMultiplicador) {
			double produto = multiplicando * minimoMultiplicador;
			String linha = multiplicando + " X " + minimoMultiplicador + " = " + produto;
			resultado[contador] = linha;
			System.out.println(linha);
			System.out.println();
			minimoMultiplicador++;
			contador++;
		}
		System.out.println("FIM!");
		return resultado;
	}

}
