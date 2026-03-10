package htl.swp2.oop.online_shop;

public class Kunde {
    private String vorname;
    private Adresse adresse;
    private String nachname;


    public Kunde(String vorname, Adresse adresse, String nachname){
        this.vorname = vorname;
        this.adresse = adresse;
        this.nachname = nachname;
    }
    public void kundenProfilAnzeigen(){
        System.out.printf("%s  %s  %s " , vorname , nachname , adresse.getVollstaendigeAdresse());

    }
    public void setAdresse(Adresse a){
        this.adresse=a;
    }
}
