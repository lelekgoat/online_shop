package htl.swp2.oop.online_shop;

public class Adresse {
    private String plz;
    private String stadt;
    private String strasse;
    private String hausnummer;


    public Adresse(){}


    public Adresse(String plz, String stadt, String strasse , String hausnummer){
        this.plz=plz;
        this.stadt=stadt;
        this.strasse=strasse;
        this.hausnummer=hausnummer;
    }
    public String getVollstaendigeAdresse() {
        return plz + " " + stadt + " " + strasse + " " + hausnummer;
    }



}
