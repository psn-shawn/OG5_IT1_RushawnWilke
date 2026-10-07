public class Mannschaftsleiter extends Spieler {
    private String mannschaftsname;
    private double rabatt; // in Prozent, 0 bis 50

    public Mannschaftsleiter(String name, String telefonnummer,
                             int trikotnummer, String position,
                             String mannschaftsname, double rabatt) {
        super(name, telefonnummer, trikotnummer, position);
        this.mannschaftsname = mannschaftsname;
        setRabatt(rabatt);
    }

    public String getMannschaftsname() { return mannschaftsname; }
    public double getRabatt() { return rabatt; }

    public void setRabatt(double rabatt) {
        if (rabatt < 0) rabatt = 0;
        if (rabatt > 50) rabatt = 50;
        this.rabatt = rabatt;
    }

    @Override
    public String getRolle() { return "Mannschaftsleiter"; }

    @Override
    public String toString() {
        return super.toString() + ", Mannschaft: " + mannschaftsname
             + ", Rabatt: " + rabatt + "%";
    }
}
