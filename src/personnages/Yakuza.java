package personnages;

import java.beans.PersistenceDelegate;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 4;
	
	public Yakuza(String clan, String nomString, String boissonString, int argent) {
		super(nomString, boissonString, argent);
		this.clan = clan;
	}
	
	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNomString() + ", si tu tiens à la vie donne moi ta bourse !");
		int argentVoler = victime.seFaireExtorquer();
		parler("J’ai piqué les " + argentVoler + " sous de Marco, ce qui me fait " + getArgent() + " sous dans ma poche. Hi ! Hi !");
		reputation++;
	}
	
	public int perdre() {
		reputation--;
		int sommePerdue = getArgent();
		perdreArgent(sommePerdue);
		parler("Jai perdu mon duel et mes " + sommePerdue + " sous, snif, .. J'ai déshonoré le clan de " + clan);
		return sommePerdue;
	}
	
	public void gagner(int argentGagnee) {
		reputation++;
		parler(" Ce ronin pensait vraiment battre Yaku Le Noir du clan de " + clan + " ? Je l'ai dépouillé de ses " + argentGagnee + " sous.");
	}
	
}
