  public static void main(String[] args) {

        int[] zahlen = {
            10, 20, 30, 40, 50,
            60, 70, 80, 90, 100
        };

        int[] suchwerte = {
            10, 50, 100, 80, 20,
            55, 5, 110
        };

        int[] erwartetePositionen = {
            0, 4, 9, 7, 1,
            -1, -1, -1
        };

        int bestanden = 0;
        int fehlgeschlagen = 0;

        for (int i = 0; i < suchwerte.length; i++) {

            int gesucht = suchwerte[i];

            int ergebnis = interpolationssuche(
                zahlen, gesucht
            );

            boolean erfolgreich =
                ergebnis == erwartetePositionen[i];

            System.out.println("\nTest " + (i + 1));
            System.out.println("Suchwert: " + gesucht);
            System.out.println("Erwartete Position: "
                    + erwartetePositionen[i]);
            System.out.println("Gefundene Position: "
                    + ergebnis);

            if (erfolgreich) {
                System.out.println("Ergebnis: BESTANDEN");
                bestanden++;
            } else {
                System.out.println("Ergebnis: FEHLGESCHLAGEN");
                fehlgeschlagen++;
            }
        }

        
        System.out.println("Bestanden: " + bestanden);
        System.out.println("Fehlgeschlagen: " + fehlgeschlagen);
        System.out.println("Gesamte Tests: "
                + (bestanden + fehlgeschlagen));
    }

  private static int interpolationssuche(int[] zahlen, int gesucht) {
	// TODO Auto-generated method stub
	return 0;
}
