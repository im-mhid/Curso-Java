package aula012;

public class Mamifero extends Animal {
	private String corPelo;
	
	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Correndo");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Mamando");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("som de Mamífero");
	}

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
}
