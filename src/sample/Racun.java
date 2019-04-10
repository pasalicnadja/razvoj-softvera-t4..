package sample;
import java.util.ArrayList;

public class Racun {
private ArrayList<produkt> produkti;

 public Racun(){
     produkti=new ArrayList<>();
 }
 public void ubaci(Artikal artikal,int kolicina){
     produkti.add(new produkt(artikal,kolicina));
 }

 public double vrijedinost() {

     double rezultat = 0;
     for (produkt p : produkti) {
         rezultat = rezultat + p.kolicina * p.artikal.getCijena();
     }
     return rezultat;
 }
  private class produkt{
     int kolicina;
     Artikal artikal;
     produkt(){}
     produkt(Artikal artikal, int kolicina){
         this.artikal=artikal;
         this.kolicina=kolicina;
     }

     @Override
      public String toString(){
         String c="";
         for(produkt p: produkti){
             c=c+String.format("%-8s %-4d %0.2f\\n\",p.artikal.getSifra(),p.kol,p.kol * p.artikal.getCijena()");
         }
c=c+String.format("\"%-8s %-4d %0.2f\\n\",\"Za platiti: \",vrijednost()");
         return c;
     }
  }

}
