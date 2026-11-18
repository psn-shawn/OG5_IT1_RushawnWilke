
public class Testprotokoll {

    public static void main(String[] args) {

        int[] groessen = {1000, 10000, 100000, 1000000, 20000000};

        System.out.println("TESTPROTOKOLL SUCHALGORITHMEN");
        System.out.println();

        for (int groesse : groessen) {

            long[] liste = SortedListGenerator.getSortedList(groesse);
            long gesucht = liste[groesse - 1];

            System.out.println("Listengroesse: " + groesse);
            System.out.println("Gesuchte Zahl: " + gesucht);

            // Interpolationssuche
            long start = System.nanoTime();

            int ergebnisInterpolation =
                Suchalgorithmen.interpolationsSuche(liste, gesucht);

            long ende = System.nanoTime();

            double zeitInterpolation =
                (ende - start) / 1_000_000.0;

            // Lineare Suche
            start = System.nanoTime();

            int ergebnisLinear =
                Suchalgorithmen.lineareSuche(liste, gesucht);

            ende = System.nanoTime();

            double zeitLinear =
                (ende - start) / 1_000_000.0;

            System.out.println("Interpolationssuche:");
            System.out.println("Gefunden an Index: " + ergebnisInterpolation);
            System.out.println("Laufzeit: " + zeitInterpolation + " ms");

            System.out.println("Lineare Suche:");
            System.out.println("Gefunden an Index: " + ergebnisLinear);
            System.out.println("Laufzeit: " + zeitLinear + " ms");

            

            
        }

        System.out.println("FEDDICH MIDDE TESTS!!!");
    }
}


