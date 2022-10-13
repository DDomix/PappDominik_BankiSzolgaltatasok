package hu.petrik.bankiszolgaltatasok;

public abstract class Szamla extends BankiSzolgaltatas{

    protected int aktualisEgyenleg;
    public Szamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }

    public int getAktualisEgyenleg() {
        return aktualisEgyenleg;
    }

    public void Befizet(int osszeg){
        osszeg+=aktualisEgyenleg;
    }
    public abstract boolean Kivesz(int osszeg);

    public Kartya ujKartya(String kartyaszam){
        Kartya kartya=new Kartya(getTulajdonos().toString(),this,kartyaszam);
        return kartya;
    }
}
