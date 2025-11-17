package personnages;

public class Ronin extends Humain{
	private int honneur = 1;

	public Ronin(String nomString, String boissonString, int argent) {
		super(nomString, boissonString, argent);
		
	}
	
	public void donner(Commercant beneficiare) {
		int donnation = getArgent()/10;
		perdreArgent(donnation);
		parler(beneficiare.getNomString() + " prend ces " + donnation + " sous.");
		beneficiare.recevoir(donnation);
	}
	
	public void provoquerDuel(Yakuza advversiare) {
		if(honneur * 2 > advversiare.getReputation()) {
			honneur++;
			parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre\r\n"
					+ "marchand!");
			parler("Je t'ai eu petit Yakuza");
			int argentGagnee = advversiare.perdre();
			gagnerArgent(argentGagnee);
		}
		else {
			honneur--;
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			int sommePerdue = getArgent();
			perdreArgent(sommePerdue);
			advversiare.gagner(sommePerdue);
		}
	}
}
