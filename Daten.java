package htl.swp2.oop.online_shop;

public class Daten {
    public static void main(String[] args) {
        Adresse a1 = new Adresse("6020", "Innsbruck", "General-Eccher-Straße" , "28");
        Adresse a2 = new Adresse("6040", "Yozgat", "Yarrak-Straße" , "31");

        Kunde paul = new Kunde("Paul",a1 ,"Häfele");
        Kunde ali = new Kunde("Ali", a1, "Aktas");
        Kunde azad = new Kunde("Azad",a1,"Köter");
        azad.kundenProfilAnzeigen();
        azad.setAdresse(a2);
        azad.kundenProfilAnzeigen();


    }
}
