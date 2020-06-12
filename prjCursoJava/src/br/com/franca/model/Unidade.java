package br.com.franca.model;

public class Unidade {
	
	private int id;
	private String nome;
	private String endereco;
	private int situacao;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getSituacao() {
		return situacao;
	}
	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}
	
	@Override
	public String toString() {
		return "Unidade [id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", situacao=" + situacao + "]";
	}
	
	
	
	

}
