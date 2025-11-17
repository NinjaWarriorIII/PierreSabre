package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {
	
	public static void main(String[] args) {
//		Humain profHumain = new Humain("Prof", "Komboucha", 54);
//		profHumain.direBonjour();
//		profHumain.acheterBien("une boisson", 12);
//		profHumain.boire();
//		profHumain.acheterBien("un jeu", 2);
//		profHumain.acheterBien("un kimono", 50);
		
		Commercant marco = new Commercant("Marco", 15);
//		marco.direBonjour();
//		marco.seFaireExtorquer();
//		marco.recevoir(15);
//		marco.boire();
//		Yakuza yaku = new Yakuza("nom du clan", "Yaku Le Noir", "Whisky", 30);
//		yaku.direBonjour();
//		yaku.extorquer(marco);
		Ronin roro = new Ronin("Roro", "shochu", 60);
		roro.direBonjour();
		roro.donner(marco);
	}
}
