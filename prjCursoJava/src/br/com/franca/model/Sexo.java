package br.com.franca.model;

public enum Sexo {

	MASCULINO(0, "Masculino"), 
	FEMININO(1, "Feminino");

	private int chave;
	
	public int getChave() {
		return chave;
	}

	public String getValor() {
		return valor;
	}

	private String valor;

	private Sexo(int chave, String valor) {

		this.chave = chave;
		this.valor = valor;

	}

}
