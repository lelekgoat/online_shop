package htl.swp2.oop.online_shop;

public class Produkte {
    private double preis;
    private String produktname;

    public Produkte(double preis, String produktname) {
        this.preis = preis;
        this.produktname = produktname;
    }

    public String getProduktinfo() {
        return produktname + " (" + preis + "€)";
    }
    public void setProduktinfo(double preis, String produktname) {
        this.preis = preis;
        this.produktname = produktname;
    }
    public void Produktinfo() {
        System.out.println("Produkt: " + produktname + ", Preis: " + preis + "€");
    }

}
