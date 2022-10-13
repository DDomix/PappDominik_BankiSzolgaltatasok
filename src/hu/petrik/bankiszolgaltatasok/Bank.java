package hu.petrik.bankiszolgaltatasok;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Szamla> szamlalista=new ArrayList<>();

    public Bank(int max) {

    }
    public Szamla szamlanyitas(Tulajdonos tulajdonos,int hitelKeret){
        Szamla sz;

        if (hitelKeret==0){
            sz=new MegtakaritasiSzamla(tulajdonos);
        }else {
            sz=new HitelSzamla(tulajdonos,hitelKeret);
        }
        return sz;
    }
    public int getOsszegyenleg(Tulajdonos tulajdonos){

        return szamlalista.stream().filter(x-> x.getTulajdonos()==tulajdonos).map(x-> x.getAktualisEgyenleg()).reduce(Integer::sum).orElse(0);
    }
}
