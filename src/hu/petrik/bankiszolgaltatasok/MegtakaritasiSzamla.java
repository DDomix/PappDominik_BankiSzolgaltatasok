package hu.petrik.bankiszolgaltatasok;

public class MegtakaritasiSzamla extends Szamla{

    private int kamat;
    public  double alapKamat=1.1;

    public MegtakaritasiSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }

    public int getKamat() {
        return kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = (int) kamat;
    }

    @Override
    public boolean Kivesz(int osszeg) {
        if (getAktualisEgyenleg()>=0){
            aktualisEgyenleg-=osszeg;
            return true;
        }else {
            return false;
        }
    }
    public void kamatJovairas(){
        kamat+=alapKamat;
    }
}
