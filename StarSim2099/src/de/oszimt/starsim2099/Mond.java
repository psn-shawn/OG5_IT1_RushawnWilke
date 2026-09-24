package de.oszimt.starsim2099;

public class Mond extends OBERBOSS {

		private String erzart;
		private String art;
		

	public Mond() {
	}
	public static char[][] getDarstellung() {
		char[][] planetShape = { { '\0', '/', '*', '*', '\\', '\0' }, { '|', '*', '*', '*', '*', '|' },
				{ '\0', '\\', '*', '*', '/', '\0' } };
		return planetShape;
	}

	public String getErzart() {
		return erzart;
	}


	public void setErzart(String erzart) {
		this.erzart = erzart;
	}


	public String getArt() {
		return art;
	}


	public void setArt(String art) {
		this.art = art;
	}
}
