package htl.swp2.oop.online_shop;

public class Kunde {
    private String vorname;
    private String anschrift;
    private String nachname;


    public Kunde(String vorname, String anschrift, String nachname){
        this.vorname = vorname;
        this.anschrift = anschrift;
        this.nachname = nachname;
    }
    public void kundenProfilAnzeigen(){
        System.out.printf("%s ; %s ; %s" , vorname , nachname , anschrift);

    }
    public void zeigeDaten(){}
}
