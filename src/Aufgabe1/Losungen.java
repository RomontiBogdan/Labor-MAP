package Aufgabe1;

public class Losungen {
    public static int[] nichtAusreichendeNoten(int[] Noten){
        int[] notenArr;
        notenArr = new int[Noten.length];
        for (int note : Noten){
            if(note < 38){
                int index = notenArr.length;
                notenArr[index] = note;
            }
        }
        return notenArr;
    }

    public static int Durchschnittswert(int[] Noten){
        int summe = 0;
        for (int note : Noten){
            summe += note;
        }
        return summe/Noten.length;
    }

    
}