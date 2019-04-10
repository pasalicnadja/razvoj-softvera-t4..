package sample;
import  java.util.ArrayList;
public class Artikal {
    String Sifra,Naziv;
    double Cijena;
public Artikal(String unesi ){
    String[] unos = unesi.split(",");
    setSifra( unos[0]);
    setNaziv(unos[1]);
    setCijena(Double.parseDouble(unos[2]));
}

public String getSifra(){
    return Sifra;
    }
    public void setSifra(String Sifra){
    if(Sifra.equals(null) || Sifra.isEmpty()){
        throw new IllegalArgumentException("Unos je neispravan!");
    }
    this.Sifra= Sifra ;

    }


    public String getNaziv(){
    return Naziv;
    }

    public void setNaziv(String Naziv){
        if(Naziv.equals(null) || Naziv.isEmpty()){
            throw new IllegalArgumentException("Unos je neispravan!");
        }
    this.Naziv= Naziv;
    }



    public double getCijena(){
    return Cijena;
    }
    public void setCijena(double Cijena){
    if(Cijena < 0 || Cijena == 0){
        throw new IllegalArgumentException("Unos je neispravan");
    }
    this.Cijena= Cijena;
    }

@Override
    public String toString(){
    return Sifra + "," + Naziv + "," + Cijena;
}
    public boolean equals(Object o){
    Artikal artikal= (Artikal)o;
    if(!this.Sifra.equals(artikal.getSifra())) return false;
        if(!this.Naziv.equals(artikal.getNaziv())) return false;
        if(!(this.Cijena==artikal.getCijena())) return false;
       return true;
    }

public static ArrayList<Artikal> izbaciDuplikate(ArrayList<Artikal> lista){
    for(int i=0; i<lista.size();i++){
        for (int j = i + 1; j < lista.size(); j++) {
            if(lista.get(i).equals(lista.get(j))){
                lista.remove(j);
            }
        }
    }



    return lista;
}

}
