package aula012;

public class Reptil extends Animal {
	private String corEscama;
	
	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Rastejando");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Comendo Vegetais");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("som de R�ptil");
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
}