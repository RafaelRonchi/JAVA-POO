package ifsc;

public class MainPessoa {

	public static void main(String[] args) {
		Professor professor = new Professor();
		Aluno aluno = new Aluno();
		
		professor.setSiape(123);
		professor.setCpf("154234");
		professor.setNome("Bruna");
		
		aluno.setCpf("12323");
		aluno.setMatricula(12321);
		aluno.setNome("Rafael");
		
		System.out.println("Professor:");
		System.out.println("Cpf: "+professor.getCpf(null));
		System.out.println("Nome: "+professor.getNome(null));
		System.out.println("Siape: "+professor.getSiape(null));

		System.out.println("\nAluno:");
		System.out.println("Cpf: "+aluno.getCpf(null));
		System.out.println("Nome: "+aluno.getNome(null));
		System.out.println("Matricula: "+aluno.getMatricula(null));
	}

}
