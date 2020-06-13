package br.com.franca.model;

public class Principal {

	public static void main(String[] args) {
		
		// Configuracao do OBJ unidade.
		Unidade unidade = new Unidade(1,"Tiago","Rua A",1);
		unidade.setId(1);
		unidade.setNome("D  f e e ");
		unidade.setEndereco("Rua Augusto Vasconcelos");
		unidade.setSituacao(1);
		unidade.setSexo(Sexo.MASCULINO);
		
		
		
		Unidade unid = new Unidade ();
		
		
		// Configuracao do OBJ turma.
		Turma turma = new Turma();
		turma.setId(1);
		turma.setNome("2001 - Manhã");
		turma.setSituacao(1);
		turma.setUnidade(unidade);
		
		System.out.println(turma.toString());

	}

}
