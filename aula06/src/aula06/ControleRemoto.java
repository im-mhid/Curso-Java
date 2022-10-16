package aula06;
public class ControleRemoto implements Controlador {
	//Atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	//Métodos especiais
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
			System.out.println("Está ligado? " + this.getLigado());
			System.out.println("Está tocando? " + this.getTocando());
			System.out.print("Volume: " + this.getVolume());
			for(int i = 0; i < this.getVolume(); i+=10) {
				System.out.print("|");
			}
			System.out.println("");
		} else {
			System.out.println ("Menu só pode ser aberto com TV ligada");
		}
	}

	@Override
	public void fecharMenu() {
		// TODO Auto-generated method stub
		if (this.getLigado()) {
			System.out.println("Fechando Menu...");
		} else {
			System.out.println ("Menu só pode ser acessado com TV ligada");
		}
	}

	@Override
	public void maisVolume() {
		// TODO Auto-generated method stub
		if (this.getLigado()) {
			this.setVolume(this.getVolume()+10);
		} else {
			System.out.println ("Impossível aumentar volume");
		}
	}

	@Override
	public void menosVolume() {
		// TODO Auto-generated method stub
		if (this.getLigado()) {
			this.setVolume(this.getVolume()-10);
		} else {
			System.out.println ("Impossível diminuir volume");
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
			System.out.println("Não foi possível reproduzir.");
		}
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		if (this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		} else {
			System.out.println("Não consegui pausar");
		}
	}
	
}