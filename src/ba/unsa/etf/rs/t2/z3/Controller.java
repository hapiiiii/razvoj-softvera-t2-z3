package ba.unsa.etf.rs.t2.z3;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    public TextField informacija;
    public Label rezultat;

    public void oke(ActionEvent actionEvent) {

        String strin = new String();
        strin = informacija.getText();
        String str = new String();

            for (String rijec : strin.split(" ")) {
                if (rijec.length() > str.length())
                    str = rijec;
            }
            strin = strin.replace(str, str.toUpperCase());
            rezultat.setText(strin);
        }
    }







