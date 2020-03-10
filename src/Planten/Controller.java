package Planten;

import Planten.java.dao.Database;
import Planten.java.dao.FenotypeDao;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import org.controlsfx.control.CheckComboBox;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Controller {
    public ComboBox cboType;
    public ComboBox cboFamilie;
    public TextField txtNaam;
    public Spinner nudMinBloeiHoogte;
    public Spinner nudMinBladHoogte;
    public Spinner nudMaxBloeiHoogte;
    public Spinner nudMaxBladHoogte;
    public ColorPicker clrBladKleur;
    public ColorPicker clrBloeiKleur;
    public ComboBox cboHabitat;
    public CheckBox chkZand;
    public CheckBox chkLeem;
    public CheckBox chkKlei;
    public Slider slrBezonning;
    public Slider slrVochtbehoefte;
    public Button btnZoek;
    public ComboBox cboBladgrootte;
    public Button btnminimize;
    public Button btnExit;
    public Button btnMaximize;
    public CheckComboBox ccbBladKleur;
    boolean maximized=false;



    public void initialize() {
        /*instellen exit, minimize en resize button*/
        btnExit.setOnAction(e ->
                ((Stage) ((Button) e.getSource()).getScene().getWindow()).close()
        );

        btnminimize.setOnAction(e ->
                ((Stage) ((Button) e.getSource()).getScene().getWindow()).setIconified(true)
        );

        resize();


        final ObservableList<String> strings = FXCollections.observableArrayList();
        for (int i = 0; i <= 100; i++) {
            strings.add("Item " + i);
        }

        /*ccbBladKleur.getItems().addAll(strings);*/

    }

    /*Functie om scherm te grootte van scherm aan te passen*/
    public void resize(){
        if(maximized == true){
            btnMaximize.setOnAction(e ->
                    ( (Stage) ( (Button) e.getSource() ).getScene().getWindow() ).setMaximized(false));
            maximized=false;
        } else {
            btnMaximize.setOnAction(e ->
                    ( (Stage) ( (Button) e.getSource() ).getScene().getWindow() ).setMaximized(true));
            maximized=true;
        }
    }


    public void Clicked_Resize(MouseEvent mouseEvent) {
        resize();
    }


}

