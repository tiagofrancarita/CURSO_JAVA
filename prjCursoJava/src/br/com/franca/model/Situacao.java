package br.com.franca.model;

public enum Situacao {
	
	DESATIVADA(0, "Desativada"), 
	Ativa(1, "Ativa");

	private int chave;
	
	public int getChave() {
		return chave;
	}

	public String getValor() {
		return valor;
	}

	private String valor;

	private Situacao(int chave, String valor) {

		this.chave = chave;
		this.valor = valor;

	}

}
