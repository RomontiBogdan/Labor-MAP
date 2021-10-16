package Aufgaben;
import java.util.Arrays;

public class Aufgabe2 {
    /**
     * Findet die maximale Zahl aus einem Array
     * @param zahlen
     * @return Die maximale Zahl aus dieser Array
     */
    public static int maximaleZahl(int[] zahlen){
        int maxZahl = -1;
        for(int n : zahlen){
            if(n > maxZahl)
                maxZahl = n;
        }

        return maxZahl;
    }

    /**
     * Findet die minimale Zahl aus einem Array
     * @param zahlen
     * @return Die minimale Zahl aus dieser Array
     */
    public static int minimaleZahl(int[] zahlen){
        int minZahl = zahlen[0];
        for(int n : zahlen){
            if(n < minZahl)
                minZahl = n;
        }
        return minZahl;
    }

    /**
     * Findet die Summe von Zahlen aus einem Array
     * @param zahlen
     * @return Die Summe von Zahlen aus Array
   */
    public static int ArraySumme(int[] zahlen){
        int summe = 0;
        for (int zahl : zahlen) {
            summe += zahl;
        }
        return summe;
    }

    /**
     * Findet die maximale Summe von n-1 Zahlen aus einem Array
     * @param zahlen
     * @return Die maximale Summe von n-1 Zahlen
     */
    public static int maximaleSumme(int[] zahlen){
        return ArraySumme(zahlen) - minimaleZahl(zahlen);
    }

    /**
     * Findet die maximale Summe von n-1 Zahlen aus einem Array
     * @param zahlen
     * @return Die maximale Summe von n-1 Zahlen
    */
    public static int minimaleSumme(int[] zahlen){
        return ArraySumme(zahlen) - maximaleZahl(zahlen);
    }
}
