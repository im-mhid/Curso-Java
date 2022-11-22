package ProjetoYoutube;

public class ProjetoYoutube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Video v[] = new Video[3];
		
		v[0] = new Video("Aula 1 de POO");
		v[1] = new Video("Aula 5 de JavaScript");
		v[2] = new Video("Aula 14 de Java POO");
		
		System.out.println(v[0].toString());
		System.out.println(v[1].toString());
		System.out.println(v[2].toString());
		
		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("João", 22, "M", "JonJon");
		g[1] = new Gafanhoto("Jose", 17, "M", "Joestar");
		
		System.out.println(g[0].toString());
	}

}
