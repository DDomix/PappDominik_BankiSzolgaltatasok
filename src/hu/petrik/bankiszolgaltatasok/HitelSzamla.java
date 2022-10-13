package hu.petrik.bankiszolgaltatasok;

public class HitelSzamla extends Szamla{

    private int hitelKeret;
    public HitelSzamla(Tulajdonos tulajdonos,int hitelKeret) {
        super(tulajdonos);
        this.hitelKeret=hitelKeret;
    }

    @Override
    public boolean Kivesz(int osszeg) {
        if (hitelKeret>=getAktualisEgyenleg()){
            hitelKeret-=osszeg;
            return true;
        }else {
            return false;
        }
    }

    public int getHitelKeret() {
        return hitelKeret;
    }
}
