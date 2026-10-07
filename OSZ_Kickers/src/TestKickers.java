public class TestKickers {
    public static void main(String[] args) {
        // --- Personen (wie in A6.1) ---
        Spieler s1 = new Spieler("Lukas Meier", "0511-111111", 9, "Stürmer");
        s1.setJahresbeitragBezahlt(true);

        Trainer t1 = new Trainer("Karin Bauer", "0511-222222", 'A', 450.0);
        t1.setJahresbeitragBezahlt(true);

        Schiedsrichter r1 = new Schiedsrichter("Horst Klein", "0511-333333", 42);

        Mannschaftsleiter m1 = new Mannschaftsleiter("Jonas Weber", "0511-444444",
                                                     1, "Torwart", "A-Jugend", 30.0);
        m1.setJahresbeitragBezahlt(true);

        Mitglied[] verein = { s1, t1, r1, m1 };
        for (Mitglied m : verein) {
            System.out.println(m);
        }

        // --- Erweiterung A6.2: Mannschaft, Spiele, Assoziationen ---
        Mannschaft a1 = new Mannschaft("A-Jugend", "Kreisliga A", t1);
        a1.addSpieler(s1);
        a1.addSpieler(m1); // Mannschaftsleiter ist auch ein Spieler

        Spiel sp1 = new Spiel("FC Nordstadt", true, "2026-10-10", 3, 1);
        Spiel sp2 = new Spiel("SV Linden", false, "2026-10-17", 0, 2);
        a1.addSpiel(sp1);
        a1.addSpiel(sp2);

        System.out.println();
        System.out.println(a1);
        System.out.println("Spieler der Mannschaft:");
        for (int i = 0; i < a1.getAnzahlSpieler(); i++) {
            System.out.println("  " + a1.getSpieler(i));
        }
        System.out.println("Spiele der Mannschaft:");
        for (int i = 0; i < a1.getAnzahlSpiele(); i++) {
            System.out.println("  " + a1.getSpiel(i));
        }
    }
}
