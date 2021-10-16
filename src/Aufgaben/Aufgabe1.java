package Aufgaben;

public class Aufgabe1 {
    /**
     * Liefert die nicht ausreichende Noten aus einer Menge von Noten
     * @param Noten
     * @return Ein Array von nicht ausreichende Noten
     * */
    public static int[] nichtAusreichendeNoten(int[] Noten){
        int[] notenArr;
        notenArr = new int[Noten.length];
        int index = 0;
        for (int note : Noten){
            if(note < 38){
                notenArr[index++] = note;
            }
        }
        int[] noten = new int[index];
        for(int i = 0; i < index; i++)
            noten[i] = notenArr[i];
        return noten;
    }

    /**
     * Liefert die Durchschnittswert einer Menge von Noten
     * @param Noten
     * @return Durschnittswert dieser Noten
     */
    public static int durchschnittswert(int[] Noten){
        int summe = 0;
        for (int note : Noten){
            summe += note;
        }
        return summe/Noten.length;
    }

    /**
     * Liefert ein Array von abgerundete Noten
     * @param Noten
     * @return  Array mit denselben Noten, aber abgerudet
     */
    public static int[] abgerundeteNoten(int[] Noten){
        for (int i = 0; i < Noten.length; i++) {
            if(Noten[i] % 5 >= 3)
                Noten[i] += 5 - Noten[i] % 5;
            else
                Noten[i] -= Noten[i] % 5;
        }
        return Noten;
    }

    /**
     * Rundet eine Note ab
     * @param Noten
     * @return Der abgerundeten Wert dieser Note
     */
    public static int maximaleAbgerundeteNoten(int[] Noten) {
        int maximaleNote = 0;
        Noten = abgerundeteNoten(Noten);
        for(int note : Noten){
            if(note > maximaleNote)
                maximaleNote = note;
        }
        return maximaleNote;
    }
}