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
	
	public void calcularTabuada() {
		if (minimoMultiplicador>maximoMultiplicador) {
			double temp = minimoMultiplicador;
			minimoMultiplicador = maximoMultiplicador;
			maximoMultiplicador = minimoMultiplicador;
		}
		
		while (minimoMultiplicador <= maximoMultiplicador) {
			double produto = multiplicando * minimoMultiplicador;
			System.out.printf("%s X %s = %s", multiplicando, minimoMultiplicador, produto);
			System.out.println();
			minimoMultiplicador++;
		}
		System.out.println("FIM!");
	}

}
