package htl.swp2.oop.online_shop;

import java.util.ArrayList;

public class Bestellung {
    private int bestellnummer;
    private Kunde kunde;
    private ArrayList<Produkte> warenkorb;

    public Bestellung(int bestellnummer,Kunde kunde){
        this.bestellnummer=bestellnummer;
        this.kunde=kunde;
        this.warenkorb=new ArrayList<>();
    }
    public void produktHinzufügen(Produkte p){
        warenkorb.add(p)
    }
    public void rechungDrucken() {
        System.out.println("");
    }

}
