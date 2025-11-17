package histoire;

import personnages.Commercant;
import personnages.Humain;

public class HistoireTP4 {
	
	public static void main(String[] args) {
//		Humain profHumain = new Humain("Prof", "Komboucha", 54);
//		profHumain.direBonjour();
//		profHumain.acheterBien("une boisson", 12);
//		profHumain.boire();
//		profHumain.acheterBien("un jeu", 2);
//		profHumain.acheterBien("un kimono", 50);
		
		Commercant marco = new Commercant("Marco", 10);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
	}
}
