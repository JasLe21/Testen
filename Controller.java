
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.beans.value.*;
import javafx.collections.*;

import javafx.scene.image.ImageView;

public class Controller {

    private Schildkroete schildi;

    @FXML
    private ImageView imgTurtle;

    @FXML
    private Button btnOben;

    @FXML
    private Label lblX;

    @FXML
    private Label lblY;
    
    @FXML
    private Label lblGroesse;

    public Controller()
    {
        schildi = new Schildkroete();
    }

    @FXML
    private void initialize()   {
        schildi.setX(100);
        schildi.setY(100);
        schildi.setGroesse(62);
        ansichtAktualisieren();

    }

    public void ansichtAktualisieren()
    {
        imgTurtle.setX(schildi.getX());
        imgTurtle.setY(schildi.getY());       
        imgTurtle.setFitWidth(schildi.getGroesse());
        lblX.setText("x = " + schildi.getX());
        lblY.setText("y = " + schildi.getY());
       lblGroesse.setText("groesse = " + schildi.getGroesse());
        
    }

    @FXML
    void nachLinks(ActionEvent event) {
        schildi.nachLinks();
        ansichtAktualisieren();
    }

    @FXML
    void nachOben(ActionEvent event) {
        schildi.nachOben();
        ansichtAktualisieren();
    }

    @FXML
    void nachRechts(ActionEvent event) {
        schildi.nachRechts();
        ansichtAktualisieren();
    }

    @FXML
    void nachUnten(ActionEvent event) {
        schildi.nachUnten();
        ansichtAktualisieren();

    }

    @FXML
    void schrumpfen(ActionEvent event) {
        schildi.schrumpfen();
        ansichtAktualisieren();

    }

    @FXML
    void wachsen(ActionEvent event) {
        schildi.wachsen();
        ansichtAktualisieren();

    }

}
