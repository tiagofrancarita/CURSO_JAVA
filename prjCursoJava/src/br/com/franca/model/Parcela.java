package br.com.franca.model;

import java.util.Date;

public class Parcela {
	
	private int id;
	Contrato contrato = new Contrato ();
	private Date dtVencimento;
	private double valorPago;
	private Date dtPagamento;
	private double valorParcelaCurso;
	private double valorParcelaMaterial;
	private double valorTotalParcela;
	private int situacao;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Contrato getContrato() {
		return contrato;
	}
	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}
	public Date getDtVencimento() {
		return dtVencimento;
	}
	public void setDtVencimento(Date dtVencimento) {
		this.dtVencimento = dtVencimento;
	}
	public double getValorPago() {
		return valorPago;
	}
	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}
	public Date getDtPagamento() {
		return dtPagamento;
	}
	public void setDtPagamento(Date dtPagamento) {
		this.dtPagamento = dtPagamento;
	}
	public double getValorParcelaCurso() {
		return valorParcelaCurso;
	}
	public void setValorParcelaCurso(double valorParcelaCurso) {
		this.valorParcelaCurso = valorParcelaCurso;
	}
	public double getValorParcelaMaterial() {
		return valorParcelaMaterial;
	}
	public void setValorParcelaMaterial(double valorParcelaMaterial) {
		this.valorParcelaMaterial = valorParcelaMaterial;
	}
	public double getValorTotalParcela() {
		return valorTotalParcela;
	}
	public void setValorTotalParcela(double valorTotalParcela) {
		this.valorTotalParcela = valorTotalParcela;
	}
	public int getSituacao() {
		return situacao;
	}
	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}
	@Override
	public String toString() {
		return "Parcela [id=" + id + ", contrato=" + contrato + ", dtVencimento=" + dtVencimento + ", valorPago="
				+ valorPago + ", dtPagamento=" + dtPagamento + ", valorParcelaCurso=" + valorParcelaCurso
				+ ", valorParcelaMaterial=" + valorParcelaMaterial + ", valorTotalParcela=" + valorTotalParcela
				+ ", situacao=" + situacao + "]";
	}
	
	
	

}
