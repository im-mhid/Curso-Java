package ultraEmojiCombat;

public class UltraEmojiCombat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lutador l[] = new Lutador[6];
		
		l[0] = new Lutador("Prety Boy", "França", 1.75f, 68.9f, 31, 11, 2, 1);
		
		l[1] = new Lutador("Putscript", "Brasil", 1.68f, 57.8f, 29, 14, 2, 3);
		
		l[2] = new Lutador("Snapshadow", "EUA", 1.65f, 80.9f, 29, 14, 2, 3);
		
		l[3] = new Lutador("Dead Code", "Austrália", 1.93f, 81.6f, 28, 13, 0, 2);
		
		l[4] = new Lutador("UF0Cobol", "Brasil", 1.70f, 119.3f, 37, 5, 4, 3);
		
		l[5] = new Lutador("Nerdaart", "EUA", 1.81f, 105.7f, 30, 12, 2, 4);
		
		l[3].perderLuta();
		l[3].status();
	}

}
