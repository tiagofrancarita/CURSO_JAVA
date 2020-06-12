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
	

}
