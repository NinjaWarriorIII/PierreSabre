package personnages;

public class Humain {
	private String nomString;
	private String boissonString;
	private int argent;
	
	public String getNomString() {
		return nomString;
	}

	public String getBoissonString() {
		return boissonString;
	}

	public int getArgent() {
		return argent;
	}

	public Humain(String nomString, String boissonString, int argent) {
		this.nomString = nomString;
		this.boissonString = boissonString;
		this.argent = argent;
	}
	
	protected void parler(String texte) {
		System.out.println("(" + nomString + ") - " + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m’appelle " + nomString + " et j’aime boire du " + boissonString);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonString + " ! GLOUPS !");
	}
	
	protected void gagnerArgent(int gain) {
		argent += gain;
	}
	
	protected void perdreArgent(int perte) {
		argent -= perte;
	}
	
	public void acheterBien(String bien, int prix) {
		if (prix <= argent) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'orir " + bien + " à " + prix + " sous");
			perdreArgent(prix);
		}
		else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'orir " + bien + " à " + prix + " sous.");
		}
	}

}
