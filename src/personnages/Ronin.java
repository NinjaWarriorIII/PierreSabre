package personnages;

public class Ronin extends Humain{

	public Ronin(String nomString, String boissonString, int argent) {
		super(nomString, boissonString, argent);
		
	}
	
	public void donner(Commercant beneficiare) {
		int donnation = getArgent()/10;
		perdreArgent(donnation);
		parler(beneficiare.getNomString() + " prend ces " + donnation + " sous.");
		beneficiare.recevoir(donnation);
	}
}
