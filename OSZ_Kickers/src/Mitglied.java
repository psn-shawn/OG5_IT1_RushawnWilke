public abstract class Mitglied {
    private String name;
    private String telefonnummer;
    private boolean jahresbeitragBezahlt;

    public Mitglied(String name, String telefonnummer) {
        this.name = name;
        this.telefonnummer = telefonnummer;
        this.jahresbeitragBezahlt = false;
    }

    public String getName() { return name; }
    public String getTelefonnummer() { return telefonnummer; }
    public boolean isJahresbeitragBezahlt() { return jahresbeitragBezahlt; }
    public void setJahresbeitragBezahlt(boolean bezahlt) {
        this.jahresbeitragBezahlt = bezahlt;
    }

    // abstrakte Methode: jede Unterklasse muss ihre Rolle selbst angeben
    public abstract String getRolle();

    @Override
    public String toString() {
        return getRolle() + ": " + name
             + ", Tel: " + telefonnummer
             + ", Beitrag bezahlt: " + (jahresbeitragBezahlt ? "ja" : "nein");
    }
}
