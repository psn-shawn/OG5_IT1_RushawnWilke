public class Schiedsrichter extends Mitglied {
    private int gepfiffeneSpiele;

    public Schiedsrichter(String name, String telefonnummer, int gepfiffeneSpiele) {
        super(name, telefonnummer);
        this.gepfiffeneSpiele = gepfiffeneSpiele;
    }

    public int getGepfiffeneSpiele() { return gepfiffeneSpiele; }
    public void setGepfiffeneSpiele(int anzahl) { this.gepfiffeneSpiele = anzahl; }

    @Override
    public String getRolle() { return "Schiedsrichter"; }

    @Override
    public String toString() {
        return super.toString() + ", gepfiffene Spiele: " + gepfiffeneSpiele;
    }
}
