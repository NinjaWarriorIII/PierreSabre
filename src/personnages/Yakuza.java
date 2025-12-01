package personnages;


public class Yakuza extends Humain {
	private String clan;
	private int reputation = 4;
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est le " + clan);
	}
	
	public Yakuza(String clan, String nomString, String boissonString, int argent) {
		super(nomString, boissonString, argent);
		this.clan = clan;
	}
	
	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
		parler(victime.getNomString() + ", si tu tiens � la vie donne moi ta bourse !");
		int argentVoler = victime.seFaireExtorquer();
		parler("J�ai piqu� les " + argentVoler + " sous de Marco, ce qui me fait " + getArgent() + " sous dans ma poche. Hi ! Hi !");
		reputation++;
	}
	
	public int perdre() {
		reputation--;
		int sommePerdue = getArgent();
		perdreArgent(sommePerdue);
		parler("Jai perdu mon duel et mes " + sommePerdue + " sous, snif, .. J'ai d�shonor� le clan de " + clan);
		return sommePerdue;
	}
	
	public void gagner(int argentGagnee) {
		reputation++;
		parler(" Ce ronin pensait vraiment battre Yaku Le Noir du clan de " + clan + " ? Je l'ai d�pouill� de ses " + argentGagnee + " sous.");
	}
	
}
