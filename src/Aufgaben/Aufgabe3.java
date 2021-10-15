package Aufgaben;

import java.lang.reflect.Array;

public class Aufgabe3 {
    /*
        - Berechnet die Summe von 2 Zahlen represntiert auf 2 Arrays
        Pre: zwei Arrays mit den gleichen Anzahl von Ziffern
        Post: ein Array der die Summe der Zahlen representiert
     */
    public static int[] Summe(int[] a, int[] b)
    {
        int summe[] = new int[a.length+1];
        int carry = 0;
        for (int i = a.length-1; i >= 0; i--) {
            summe[i+1] = a[i] + b[i] + carry;
            carry = summe[i+1]/10;
            summe[i+1] = summe[i+1] % 10;
        }
        if(carry == 1){
            summe[0] = 1;
        }

        return summe;
    }

    /*
        - Berechnet die Differenz von 2 Zahlen represntiert auf 2 Arrays
        Pre: zwei Arrays mit den gleichen Anzahl von Ziffern
        Post: ein Array der die Differenz der Zahlen representiert
     */
    public static int[] Differenz(int[] a, int[] b)
    {
        int differenz[] = new int[a.length+1];
        int borrow = 0;
        for (int i = a.length-1; i >= 0; i--) {
            if (a[i] - b[i] - borrow < 0){
                differenz[i] = 10 + a[i] - b[i] - borrow;
                borrow = 1;
            } else {
                differenz[i] = a[i] - b[i] - borrow;
                borrow = 0;
            }
        }

        return differenz;
    }

    /*
        - Berechnet die Multiplikation zweier Zahlen rep. auf Arrays
        Pre: Ein Array und eine Zahl
        Post: Die Multiplikation representiert auf ein Array
     */
    public static int[] Multiplikation(int[] a, int b){
        int mul[] = new int[a.length+1];
        int carry = 0;
        for (int i = a.length-1; i >= 0; i--){
            mul[i] = (a[i] * b + carry) % 10;
            carry = mul[i] / 10;
        }
        if (carry != 0){
            mul[0] = carry;
        }

        return mul;
    }

    /*
        - Berechnet die Division zweier Zahlen rep. auf Arrays
        Pre: Ein Array und eine Zahl
        Post: Die Division representiert auf ein Array
     */
    public static int[] Division(int[] a, int b){
        int div[] = new int[a.length+1];
        int carry = 0;
        for (int i = 0; i < a.length; i++){
            div[i] = (carry*10 + a[i]) / b;
            carry = (carry*10 + a[i]) % b;
        }
        return div;
    }
}
