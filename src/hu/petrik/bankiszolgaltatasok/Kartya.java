package hu.petrik.bankiszolgaltatasok;

public class Kartya extends BankiSzolgaltatas{

    private Szamla szamla;
    private String kartyaSzam;

    public Kartya(String tulajdonos, Szamla szamla,String kartyaSzam) {
        super(tulajdonos);
        this.szamla=szamla;
        this.kartyaSzam=kartyaSzam;
    }

    public String getKartyaSzam() {
        return kartyaSzam;
    }
    public boolean vasarlas(int osszeg){
        if (szamla.getAktualisEgyenleg()>=0){
            szamla.aktualisEgyenleg-=osszeg;
            return true;
        }
        else {
            return false;
        }
    }
}
