package aula012;
public class Aula012 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animal n = new Animal(); não pode ser instanciado por ser uma classe abstrata
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		Canguru canguru = new Canguru();
		Cachorro cachorro = new Cachorro();
		Cobra cobra = new Cobra();
		Tartaruga tartaruga = new Tartaruga();
		GoldFish goldFish = new GoldFish();
		Arara arara = new Arara();
		
		/*
		m.alimentar();
		m.locomover();
		m.emitirSom();
		
		r.alimentar();
		r.locomover();
		r.emitirSom();
		
		p.alimentar();
		p.locomover();
		p.emitirSom();
		
		a.alimentar();
		a.locomover();
		a.emitirSom();
		*/
		
		canguru.locomover();
		cachorro.locomover();
		
		canguru.emitirSom();
		cachorro.emitirSom();
	}

}
