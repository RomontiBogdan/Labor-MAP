package Aufgaben;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] noten = new int[] {34, 67, 20, 38, 37, 53, 90, 22, 46, 40, 27, 33, 48};
        System.out.println("nicht ausreichendes Array = " + Arrays.toString(Aufgabe1.nichtAusreichendeNoten(noten)));
        System.out.println("Durchschnittsnote = " + Aufgabe1.durchschnittswert(noten));
        System.out.println("Array mit abgerundeten Noten = " + Arrays.toString(Aufgabe1.abgerundeteNoten(noten)));
        System.out.println("die maximale abgerundete Note = " + Aufgabe1.maximaleAbgerundeteNoten(noten));

        int[] zahlen = {1,2,3,4,64,32,34,23,65,234,23};

        System.out.println("Liste von Zahlen: " + Arrays.toString(zahlen));
        System.out.println("maximale Zahl = " + Aufgabe2.minimaleZahl(zahlen));
        System.out.println("minimale Zahl = " + Aufgabe2.maximaleSumme(zahlen));
        System.out.println("maximale Summe = " + Aufgabe2.maximaleSumme(zahlen));
        System.out.println("minimale Summe = " + Aufgabe2.minimaleSumme(zahlen));

        int[] a = new int[] {9,3,4,5,6,5,5,5};
        int[] b = new int[] {1,2,3,4,5,4,4,4};
        System.out.println("Summe = " + Arrays.toString(Aufgabe3.Summe(a, b)));
        System.out.println("Differenz = " + Arrays.toString(Aufgabe3.Differenz(a, b)));
        System.out.println("Multiplikation = " + Arrays.toString(Aufgabe3.Multiplikation(a, 2)));
        System.out.println("Division = " + Arrays.toString(Aufgabe3.Division(a, 2)));


        int[] tastatur = new int[] {40, 35, 70, 15, 45, 60};
        int[] USB = new int[] {29, 67, 11, 20, 38, 37, 80};
        int budget = 60;

        Shop shop = new Shop(tastatur, USB);
        System.out.println("billigste Tastaur = " + shop.billigsteTastatur());
        System.out.println("teuerste Gegenstand = " + shop.teuerstenGegenstand());
        System.out.println("buget USB = " + shop.teuersteUSB(budget));
        System.out.println("Max Preis = " + shop.maxTastaturUsbPreis(budget));

    }
}

