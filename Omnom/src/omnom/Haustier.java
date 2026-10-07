package omnom;

public class Haustier {

	private int hunger;
	private int muede;
	private int zufrieden;
	private int gesund;
	private String name;

	// Standard-Konstruktor: alle Werte mit 100 initialisieren
	public Haustier() {
		this.hunger = 100;
		this.muede = 100;
		this.zufrieden = 100;
		this.gesund = 100;
		this.name = "Haustier";
	}

	// Konstruktor mit Namen: alle Werte mit 100 initialisieren
	public Haustier(String name) {
		this.hunger = 100;
		this.muede = 100;
		this.zufrieden = 100;
		this.gesund = 100;
		this.name = name;
	}

	// Hilfsmethode: begrenzt einen Wert auf 0 bis 100
	private int begrenze(int wert) {
		if (wert < 0) {
			return 0;
		}
		if (wert > 100) {
			return 100;
		}
		return wert;
	}

	// ---------- Getter ----------

	public int getHunger() {
		return hunger;
	}

	public int getMuede() {
		return muede;
	}

	public int getZufrieden() {
		return zufrieden;
	}

	public int getGesund() {
		return gesund;
	}

	public String getName() {
		return name;
	}

	// ---------- Setter (Werte nur von 0 bis 100) ----------

	public void setHunger(int hunger) {
		this.hunger = begrenze(hunger);
	}

	public void setMuede(int muede) {
		this.muede = begrenze(muede);
	}

	public void setZufrieden(int zufrieden) {
		this.zufrieden = begrenze(zufrieden);
	}

	public void setGesund(int gesund) {
		this.gesund = begrenze(gesund);
	}

	public void setName(String name) {
		this.name = name;
	}

	// ---------- Methoden ----------

	// addiert den Parameterwert auf hunger (Begrenzung uebernimmt der Setter)
	public void fuettern(int anzahl) {
		setHunger(this.hunger + anzahl);
	}

	// addiert den Parameterwert auf muede (Begrenzung uebernimmt der Setter)
	public void schlafen(int dauer) {
		setMuede(this.muede + dauer);
	}

	// addiert den Parameterwert auf zufrieden (Begrenzung uebernimmt der Setter)
	public void spielen(int dauer) {
		setZufrieden(this.zufrieden + dauer);
	}

	// setzt gesund auf 100
	public void heilen() {
		setGesund(100);
	}
}
