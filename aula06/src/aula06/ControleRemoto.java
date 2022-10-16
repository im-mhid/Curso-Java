package aula06;
public class ControleRemoto implements Controlador {
	//Atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	//M�todos especiais
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.setTocando(false);
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public boolean getLigado() {
		return ligado;
	}
	
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean getTocando() {
		return tocando;
	}

	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		// TODO Auto-generated method stub
		if (this.getLigado()) {
			System.out.println("----------MENU----------");
			System.out.println("Est� ligado? " + this.getLigado());
			System.out.println("Est� tocando? " + this.getTocando());
			System.out.print("Volume: " + this.getVolume());
			for(int i = 0; i < this.getVolume(); i+=10) {
				System.out.print("|");
			}
			System.out.println("");
		} else {
			System.out.println ("Menu s� pode ser aberto com TV ligada");
		}
	}

	@Override
	public void fecharMenu() {
		// TODO Auto-generated method stub
		if (this.getLigado()) {
			System.out.println("Fechando Menu...");
		} else {
			System.out.println ("Menu s� pode ser acessado com TV ligada");
		}
	}

	@Override
	public void maisVolume() {
		// TODO Auto-generated method stub
		if (this.getLigado()) {
			this.setVolume(this.getVolume()+10);
		} else {
			System.out.println ("Imposs�vel aumentar volume");
		}
	}

	@Override
	public void menosVolume() {
		// TODO Auto-generated method stub
		if (this.getLigado()) {
			this.setVolume(this.getVolume()-10);
		} else {
			System.out.println ("Imposs�vel diminuir volume");
		}
	}

	@Override
	public void ligarMudo() {
		// TODO Auto-generated method stub
		if (this.getLigado() && this.getVolume()>0) {
			this.setVolume(0);
		}
	}

	@Override
	public void desligarMudo() {
		// TODO Auto-generated method stub
		if (this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		if (this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		} else {
			System.out.println("N�o foi poss�vel reproduzir.");
		}
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		if (this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		} else {
			System.out.println("N�o consegui pausar");
		}
	}
	
}