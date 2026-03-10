package htl.swp2.oop.online_shop;

public class Daten {
    public static void main(String[] args) {
        Kunde paul = new Kunde("Paul","Schützenweg 34","Häfele");
        Kunde ali = new Kunde("Ali","Hötting", "Aktas");
        Kunde azad = new Kunde("Azad", "Hundegasse","Köter");
        azad.kundenProfilAnzeigen();


    }
}
