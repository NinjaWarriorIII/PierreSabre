package personnages;

import java.util.Random;

public class GrandMere extends Humain {
	private TypeHumain[] types = TypeHumain.values();
	private Random random = new Random();
	
	public GrandMere(String nom, int argent) {
		super(nom, "tisane", argent);
		nbMaxConnaissance = 5;
	}
	
	@Override
	public void memoriser(Humain humain) {
		if(nbConnaissance < nbMaxConnaissance) {
			memoireHumain[nbConnaissance] = humain;
			nbConnaissance++;
		}
		else {
			parler("Oh ma tête ! Je ne peux plus retenir le nom d'une personne supplémentaire !");
		}
	}
	
	private String humainHsard() {
		int index = random.nextInt(types.length);
		return types[index].toString();
	}
	
	public void ragoter() {
		for(int i = 0; i < nbConnaissance; i++) {
			Humain humain = memoireHumain[i];
			if(humain instanceof Traitre) {
				parler(" Je sais que " + humain.getNomString() + " est un traître. Petit chenapan !");
			}
			else {
				parler("Je crois savoir que " + humain.getNomString() + " est un " + humainHsard() + ".");
			}
		}
	}

}
