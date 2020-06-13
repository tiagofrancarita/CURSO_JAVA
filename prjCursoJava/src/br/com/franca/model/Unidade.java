package br.com.franca.model;

public class Unidade {
	
	private int id;
	private String nome;
	private String endereco;
	private int situacao;
	private final int PI=32;
	private final String M ="Masculino";
	private final String F ="Feminino";
	private Sexo sexo;

	
	
	public Unidade() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Unidade(int id, String nome, String endereco, int situacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.situacao = situacao;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		
		if (id <= 0 ){
			
			throw new RuntimeException();
		}
		
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		
		if(nome == null || nome.equals("")) {
			
			throw new RuntimeException();
		}
		
		
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		
		if(endereco == null || endereco.equals("")){
			
			throw new RuntimeException();
			
		}
			
		this.endereco = endereco;
	}
	public int getSituacao() {
		return situacao;
	}
	public void setSituacao(int situacao) {
		
		System.out.println(M);
		
		
		this.situacao = situacao;
	}
	@Override
	public String toString() {
		return "Unidade [id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", situacao=" + situacao + ", PI="
				+ PI + ", M=" + M + ", F=" + F + ", sexo=" + sexo + "]";
	}
	
	
	
	
	
	

}
