package projetoPessoas;

public class ProjetoPessoas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Pedro");
		p1.setIdade(18);
		p1.setSexo("M");
		
		p2.setNome("Maria");
		p2.setIdade(21);
		p2.setSexo("F");
		p2.setCurso("Informática");
		p2.setMatr(2281122);
		
		p3.setNome("Cláudio");
		p3.setIdade(32);
		p3.setSexo("M");
		p3.setEspecialidade("Banco de Dados");
		p3.setSalario(2500.75f);
		
		p4.setNome("Fabiana");
		p4.setIdade(38);
		p4.setSexo("F");
		p4.setSetor("Estoque");
		p4.setTrabalhando(true);

		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
	}

}
