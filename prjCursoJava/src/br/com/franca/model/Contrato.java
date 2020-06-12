package br.com.franca.model;

import java.util.Date;

public class Contrato {
	
	private int id;
	Aluno aluno = new Aluno ();
	Turma turma = new Turma();
	private double taxaMatricula;
	private double valorCurso;
	private double descontoCurso;
	private int qtdParcelasCurso;
	private double valorMaterial;
	private int qtdParcelasMaterial;
	private int diaVencimento;
	private String formaPagamento;
	private Date dtMatricula;
	private int situacao;
	private String matricula;
	private int condicaoContrato;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	public double getTaxaMatricula() {
		return taxaMatricula;
	}
	public void setTaxaMatricula(double taxaMatricula) {
		this.taxaMatricula = taxaMatricula;
	}
	public double getValorCurso() {
		return valorCurso;
	}
	public void setValorCurso(double valorCurso) {
		this.valorCurso = valorCurso;
	}
	public double getDescontoCurso() {
		return descontoCurso;
	}
	public void setDescontoCurso(double descontoCurso) {
		this.descontoCurso = descontoCurso;
	}
	public int getQtdParcelasCurso() {
		return qtdParcelasCurso;
	}
	public void setQtdParcelasCurso(int qtdParcelasCurso) {
		this.qtdParcelasCurso = qtdParcelasCurso;
	}
	public double getValorMaterial() {
		return valorMaterial;
	}
	public void setValorMaterial(double valorMaterial) {
		this.valorMaterial = valorMaterial;
	}
	public int getQtdParcelasMaterial() {
		return qtdParcelasMaterial;
	}
	public void setQtdParcelasMaterial(int qtdParcelasMaterial) {
		this.qtdParcelasMaterial = qtdParcelasMaterial;
	}
	public int getDiaVencimento() {
		return diaVencimento;
	}
	public void setDiaVencimento(int diaVencimento) {
		this.diaVencimento = diaVencimento;
	}
	public String getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	public Date getDtMatricula() {
		return dtMatricula;
	}
	public void setDtMatricula(Date dtMatricula) {
		this.dtMatricula = dtMatricula;
	}
	public int getSituacao() {
		return situacao;
	}
	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getCondicaoContrato() {
		return condicaoContrato;
	}
	public void setCondicaoContrato(int condicaoContrato) {
		this.condicaoContrato = condicaoContrato;
	}
	@Override
	public String toString() {
		return "Contrato [id=" + id + ", aluno=" + aluno + ", turma=" + turma + ", taxaMatricula=" + taxaMatricula
				+ ", valorCurso=" + valorCurso + ", descontoCurso=" + descontoCurso + ", qtdParcelasCurso="
				+ qtdParcelasCurso + ", valorMaterial=" + valorMaterial + ", qtdParcelasMaterial=" + qtdParcelasMaterial
				+ ", diaVencimento=" + diaVencimento + ", formaPagamento=" + formaPagamento + ", dtMatricula="
				+ dtMatricula + ", situacao=" + situacao + ", matricula=" + matricula + ", condicaoContrato="
				+ condicaoContrato + "]";
	}
	
	
	

}
