package personnages;

public class Commercant extends Humain {

	public Commercant(String nomString, int argent) {
		super(nomString, "thé", argent);
		
	}
	
	public int seFaireExtorquer() {
		parler("J’ai tout perdu! Le monde est trop injuste..");
		int sommePerdue = getArgent();
		perdreArgent(sommePerdue);
		return sommePerdue;
	}
	
	public void recevoir(int argent) {
		parler(argent + " sous ! Je te remercie généreux donateur!");
		gagnerArgent(argent);
	}
}
