package sample;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Controller {
    public TextArea unosArtikla;
    public TextArea ispisArtikla;
    public Button dodaj;

    public void ispisi(ActionEvent actionEvent) {

        ArrayList<Artikal> a=new ArrayList<Artikal>();

        String[] str= unosArtikla.getText().split("\n");
        for (String i : str){
            a.add(new Artikal(i));
        }
        Artikal.izbaciDuplikate(a);

        String c ="";
        for(Artikal i : a){
            c=c + i + "\n";
        }
        ispisArtikla.setText(c);
    }
}
