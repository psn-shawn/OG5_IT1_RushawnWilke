public class Spieler extends Mitglied {
    private int trikotnummer;
    private String position;

    public Spieler(String name, String telefonnummer,
                   int trikotnummer, String position) {
        super(name, telefonnummer);
        this.trikotnummer = trikotnummer;
        this.position = position;
    }

    public int getTrikotnummer() { return trikotnummer; }
    public String getPosition() { return position; }

    @Override
    public String getRolle() { return "Spieler"; }

    @Override
    public String toString() {
        return super.toString() + ", Trikot: " + trikotnummer
             + ", Position: " + position;
    }
}
