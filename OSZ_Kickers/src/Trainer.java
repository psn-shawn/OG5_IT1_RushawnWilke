public class Trainer extends Mitglied {
    private char lizenzklasse;             // 'A', 'B' oder 'C'
    private double aufwandsentschaedigung; // 125 bis 450 Euro monatlich

    public Trainer(String name, String telefonnummer,
                   char lizenzklasse, double aufwandsentschaedigung) {
        super(name, telefonnummer);
        this.lizenzklasse = lizenzklasse;
        this.aufwandsentschaedigung = aufwandsentschaedigung;
    }

    public char getLizenzklasse() { return lizenzklasse; }
    public double getAufwandsentschaedigung() { return aufwandsentschaedigung; }

    @Override
    public String getRolle() { return "Trainer"; }

    @Override
    public String toString() {
        return super.toString() + ", Lizenz: " + lizenzklasse
             + ", Aufwandsentschädigung: " + aufwandsentschaedigung + " EUR";
    }
}
