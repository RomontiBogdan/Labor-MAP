package Aufgaben;

public class Shop {
    private int[] Tastatur;
    private int[] USB;

    public Shop() {
        this.Tastatur = new int[0];
        this.USB = new int[0];
    }

    public Shop(int[] tastatur, int[] USB) {
        this.Tastatur = tastatur;
        this.USB = USB;
    }

    /*
    - Findet die Preis der billigste Tastatur
    Pre: Die Liste von Tastaturen
    Post: Preis der billigste Tastatur
     */
    public int billigsteTastatur(){
        int minPreis = this.Tastatur[0];
        for(int preis : this.Tastatur){
            if(preis < minPreis)
                minPreis = preis;
        }
        return minPreis;
    }

    /*
    - Findet den teuersten Gegenstand aus dem Shop
    Pre: Die zwei Listen : Tastaturen und USB Laufwerke
    Post: Die teuerste Gegenstand aus diese Listen
     */
    public int teuerstenGegenstand(){
        int maxPreis = 0;
        for (int preis : this.Tastatur){
            if (preis > maxPreis){
                maxPreis = preis;
            }
        }
        for (int preis : this.USB){
            if (preis > maxPreis){
                maxPreis = preis;
            }
        }
        return maxPreis;
    }

    /*
    - Findet den teuersten USB Laufwerk im Bezug einer Budget
    Pre: Liste von USB Laufwerke und Budget
    Post: Die teuerste USB Laufwerk im Bezug auf dieser Budget
     */
    public int teuersteUSB(int budget){
        int maxPreis = -1;
        for(int preis : this.USB){
            if(preis > maxPreis && preis <= budget)
                maxPreis = preis;
        }
        return maxPreis;
    }

    /*
    - Findet die maximalle Paar Tastatur-USB Laufwerk im Bezug auf Budget
    Pre: Liste Tastaturen, Liste USB Laufwerke und Budget
    Post: Die Maximale Geldbetrag von einer Tastatur und USB Laufwerk,
          oder -1 wenn keine Paaren im Bezug auf dieser Budget kaufen kann
     */
    public int maxTastaturUsbPreis(int budget){
        if (this.Tastatur.length == 0 || this.USB.length == 0)
            return -1;

        int maxPreis = -1;
        int preisSumme;

        for (int i = 0; i < this.Tastatur.length; i++){
            if (this.Tastatur[i] < budget){
                for (int j = 0; j < this.USB.length; j++){
                    preisSumme = this.Tastatur[i] + this.USB[j];
                    if(preisSumme > maxPreis && preisSumme <= budget)
                        maxPreis = preisSumme;
                }
            }
        }

        return maxPreis;
    }


}
