package personnages;

public class Humain {
	private String nomString;
	private String boissonString;
	private int argent;
	protected int nbMaxConnaissance = 30;
	Humain[] memoireHumain = new Humain[nbMaxConnaissance];
	protected int nbConnaissance = 0;
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
	}
	
	public void repondre(Humain autreHumain) {
		direBonjour();
		memoriser(autreHumain);
	}
	
	protected void memoriser(Humain humain) {
		if(nbConnaissance < nbMaxConnaissance) {
			memoireHumain[nbConnaissance] = humain;
			nbConnaissance++;
		}
		else {
			for(int i = 0; i < memoireHumain.length - 1; i++) {
				memoireHumain[i] = memoireHumain[i + 1];
			}
			memoireHumain[memoireHumain.length - 1] = humain;
		}
	}
	
	public void listerConnaissance() {
		StringBuilder texte = new StringBuilder();
		
		texte.append("Je connais beaucoup de monde dont : ");
		for(int i = 0; i < nbConnaissance; i++) {
			texte.append(memoireHumain[i].getNomString());
			if(i < nbConnaissance - 1) {
				texte.append(", ");
			}
		}
		parler(texte.toString());
	}
	
	
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
		parler("Bonjour ! Je m�appelle " + nomString + " et j�aime boire du " + boissonString);
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
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'orir " + bien + " � " + prix + " sous");
			perdreArgent(prix);
		}
		else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux m�me pas m'orir " + bien + " � " + prix + " sous.");
		}
	}

}
