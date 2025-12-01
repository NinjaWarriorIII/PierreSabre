package personnages;

public enum TypeHumain {
	COMMERCANT("Commerçant"), RONIN("Ronin"), SAMURAI("Samurai"), YAKUZA("Yakuza"), 
	TRAITRE("Traitre"), GRANDMERE("Grand-mère");
	
	private String nomString;
	
	TypeHumain(String string) {
		nomString = string;
	}

	@Override
	public String toString() {
		return nomString;
	}
}
