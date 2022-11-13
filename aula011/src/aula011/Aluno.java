package aula011;

public class Aluno extends Pessoa{ //public final class Aluno extends Pessoa seria usado se esse metodo não pudesse ser sobrescrito 
	private int matricula;
	private String curso;
	
	public void pagarMensalidade() { //public final void pagarMensalidade() seria usado se esse metodo não pudesse ser sobrescrito 
		System.out.println("Pagando mensalidade do aluno " + this.nome);
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
