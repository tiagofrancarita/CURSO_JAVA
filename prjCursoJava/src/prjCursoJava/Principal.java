package prjCursoJava;

public class Principal {

	public static void main(String[] args) {

		PessoaFisica pessoa = new PessoaFisica();
		PessoaJuridica pessoaJ = new PessoaJuridica();

		pessoa.setNome("Tiago");
		pessoa.setEndereco("Rua A");
		pessoa.setCpf("11807566730");

		validarCpf(pessoa);
		
		pessoaJ.setNome("FAbrica");
		pessoaJ.setEndereco("Rua B");
		pessoaJ.setCnpj("33445566778823");

		validarCnpj(pessoaJ);
		validar(pessoa);
	}

	public static void validarCpf(PessoaFisica pessoa) {

		String cpf = pessoa.getCpf();

		System.out.println(cpf);

	}

	public static void validarCnpj(PessoaJuridica pessoa) {

		String cnpj = pessoa.getCnpj();

		System.out.println(cnpj);

	}
	
	public static void validar(Pessoa p) {

		if (p.getNome().equals("Tiago")){
			
			System.out.println("Pessoa Fisica.");
			
		}else
			
			System.out.println("Pessoa Juridica");
			

	}

}
