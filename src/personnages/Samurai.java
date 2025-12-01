package personnages;

public class Samurai extends Ronin {
	private String seigneur;
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Je suis au service de " + seigneur);
	}
	
	public Samurai(String seigneur, String nomString, String boissonString, int argent) {
		super(nomString, boissonString, argent);
		this.seigneur = seigneur;
	}
	
	public void boire(String boisson) {
		parler("Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du " + boisson);
	}

}
