package personnages;

import java.util.Random;

public class Traitre extends Samurai {
	private int niveauTraitrise = 0;
	private Random random = new Random();
	
	public Traitre(String seigneur, String nomString, String boissonString, int argent) {
		super(seigneur, nomString, boissonString, argent);
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un traître et mon niveau de traîtrise est : " + niveauTraitrise + ". Chut !");
	}
	
	public void ranconner(Commercant commercant) {
		if(niveauTraitrise < 3) {
			int argentRanconne = commercant.getArgent() / 5;
			commercant.perdreArgent(argentRanconne);
			gagnerArgent(argentRanconne);
			parler("Si tu veux ma protection contre les Yakuza, il va falloir payer ! "
					+ "Donne-moi " + argentRanconne + " sous ou gare à toi");
			commercant.parler("Tout de suite grand " + getNomString() + " .");
			niveauTraitrise++;
		}
		else {
			parler("Je ne peux plus ranconner personne sinon un samourai risuqe de me demasquer !");
		}
		
	}
	
	public void faireLeGentil() {
		if(niveauTraitrise < 1) {
			parler("Je ne peux  pas faire ami ami avec personne car je ne connais personne. Snif !");
		}
		else {
			int don = getArgent() / 20;
			if (nbConnaissance <= 0) {
				parler("Je ne connais encore personne, impossible de faire le gentil.");
				return;
			}
			int numeroRandom = random.nextInt(nbConnaissance);
			Humain ami = memoireHumain[numeroRandom];
			String nomAmi = ami.getNomString();
			parler("il faut absoulement remonter ma cote de confiance. Je vais faire ami ami avec" + nomAmi + ".");
			parler("Bonjour l'ami ! Je voudrais vous aider en vous donnant " + don + " sous.");
			ami.gagnerArgent(don);
			perdreArgent(don);
			String nomString = getNomString();
			ami.parler("Merci " + nomString + ". Vous êtes quelqu'un de bien.");
			if(niveauTraitrise > 1) {
				niveauTraitrise--;
			}
			
		}
	}

}