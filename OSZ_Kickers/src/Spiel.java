public class Spiel {
    private String gegner;
    private boolean heimspiel; // true = unsere Mannschaft war Heimmannschaft
    private String datum;      // z. B. "2026-10-10"
    private int heimTore;
    private int gastTore;

    public Spiel(String gegner, boolean heimspiel, String datum,
                 int heimTore, int gastTore) {
        this.gegner = gegner;
        this.heimspiel = heimspiel;
        this.datum = datum;
        this.heimTore = heimTore;
        this.gastTore = gastTore;
    }

    public String getGegner() { return gegner; }
    public boolean isHeimspiel() { return heimspiel; }
    public String getDatum() { return datum; }
    public int getHeimTore() { return heimTore; }
    public int getGastTore() { return gastTore; }

    @Override
    public String toString() {
        return "Spiel am " + datum + ": "
             + (heimspiel ? "Heimspiel" : "Auswärtsspiel")
             + " gegen " + gegner
             + ", Ergebnis " + heimTore + ":" + gastTore;
    }
}
