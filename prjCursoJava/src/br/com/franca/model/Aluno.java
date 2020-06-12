package br.com.franca.model;

import java.util.Date;

public class Aluno {

	private int id;
	private String nome;
	private String cpf;
	private String rg;
	private String orgaoExp;
	private String ufRg;
	private Date dtNasc;
	private int sexo;
	private String celular;
	private String residencial;
	private String email;
	private String cep;
	private String endereco;
	private String bairro;
	private String cidade;
	private String estado;
	private String nomePai;
	private String nomeMae;
	private String situacao;
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getOrgaoExp() {
		return orgaoExp;
	}
	public void setOrgaoExp(String orgaoExp) {
		this.orgaoExp = orgaoExp;
	}
	public String getUfRg() {
		return ufRg;
	}
	public void setUfRg(String ufRg) {
		this.ufRg = ufRg;
	}
	public Date getDtNasc() {
		return dtNasc;
	}
	public void setDtNasc(Date dtNasc) {
		this.dtNasc = dtNasc;
	}
	public int getSexo() {
		return sexo;
	}
	public void setSexo(int sexo) {
		this.sexo = sexo;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getResidencial() {
		return residencial;
	}
	public void setResidencial(String residencial) {
		this.residencial = residencial;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", orgaoExp=" + orgaoExp
				+ ", ufRg=" + ufRg + ", dtNasc=" + dtNasc + ", sexo=" + sexo + ", celular=" + celular + ", residencial="
				+ residencial + ", email=" + email + ", cep=" + cep + ", endereco=" + endereco + ", bairro=" + bairro
				+ ", cidade=" + cidade + ", estado=" + estado + ", nomePai=" + nomePai + ", nomeMae=" + nomeMae
				+ ", situacao=" + situacao + "]";
	}
	
	

}
