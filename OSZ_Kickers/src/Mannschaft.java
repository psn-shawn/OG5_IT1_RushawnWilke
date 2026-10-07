public class Mannschaft {
    private static final int MIN_SPIELER = 11;
    private static final int MAX_SPIELER = 22;
    private static final int MAX_SPIELE = 100;

    private String name;
    private String spielklasse;

    // Assoziationen
    private Trainer trainer;       // genau 1 Trainer
    private Spieler[] spieler;     // 11 bis 22 Spieler
    private int anzahlSpieler;
    private Spiel[] spiele;        // beliebig viele Spiele (hier max. 100)
    private int anzahlSpiele;

    public Mannschaft(String name, String spielklasse, Trainer trainer) {
        this.name = name;
        this.spielklasse = spielklasse;
        this.trainer = trainer;
        this.spieler = new Spieler[MAX_SPIELER];
        this.anzahlSpieler = 0;
        this.spiele = new Spiel[MAX_SPIELE];
        this.anzahlSpiele = 0;
    }

    public String getName() { return name; }
    public String getSpielklasse() { return spielklasse; }
    public Trainer getTrainer() { return trainer; }

    // liefert false, wenn die Mannschaft schon voll ist (22 Spieler)
    public boolean addSpieler(Spieler s) {
        if (anzahlSpieler < MAX_SPIELER) {
            spieler[anzahlSpieler] = s;
            anzahlSpieler++;
            return true;
        }
        return false;
    }

    public int getAnzahlSpieler() { return anzahlSpieler; }

    public Spieler getSpieler(int index) {
        if (index >= 0 && index < anzahlSpieler) {
            return spieler[index];
        }
        return null;
    }

    // true, wenn mindestens 11 Spieler zugeordnet sind
    public boolean istSpielbereit() {
        return anzahlSpieler >= MIN_SPIELER;
    }

    // liefert false, wenn das Spiele-Array voll ist
    public boolean addSpiel(Spiel s) {
        if (anzahlSpiele < MAX_SPIELE) {
            spiele[anzahlSpiele] = s;
            anzahlSpiele++;
            return true;
        }
        return false;
    }

    public int getAnzahlSpiele() { return anzahlSpiele; }

    public Spiel getSpiel(int index) {
        if (index >= 0 && index < anzahlSpiele) {
            return spiele[index];
        }
        return null;
    }

    @Override
    public String toString() {
        return "Mannschaft " + name + " (" + spielklasse + ")"
             + ", Trainer: " + trainer.getName()
             + ", Spieler: " + anzahlSpieler
             + ", Spiele: " + anzahlSpiele
             + ", spielbereit: " + (istSpielbereit() ? "ja" : "nein");
    }
}
