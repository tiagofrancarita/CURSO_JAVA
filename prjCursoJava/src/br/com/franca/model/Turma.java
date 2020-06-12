package br.com.franca;

public class Turma {
	
	private int id;
	Unidade unidade = new Unidade ();
	private String nome;
	private int situacao;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Unidade getUnidade() {
		return unidade;
	}
	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getSituacao() {
		return situacao;
	}
	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}
	@Override
	public String toString() {
		return "Turma [id=" + id + ", unidade=" + unidade + ", nome=" + nome + ", situacao=" + situacao + "]";
	}
	
	
	
	

}
