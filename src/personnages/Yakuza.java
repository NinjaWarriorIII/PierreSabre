package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String clan, String nomString, String boissonString, int argent) {
		super(nomString, boissonString, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNomString() + ", si tu tiens à la vie donne moi ta bourse !");
		int argentVoler = victime.seFaireExtorquer();
		parler("J’ai piqué les " + argentVoler + " sous de Marco, ce qui me fait " + getArgent() + " sous dans ma poche. Hi ! Hi !");
	}
	
}
