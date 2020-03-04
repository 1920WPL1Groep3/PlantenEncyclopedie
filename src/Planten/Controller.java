package Planten;

import Planten.java.dao.BeheerDAO;
import Planten.java.dao.Database;
import Planten.java.dao.PlantDAO;
import Planten.java.model.Beheer;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

import java.sql.Connection;
import java.sql.SQLException;

public class Controller {
    public Label lbl;
    private Connection dbConnection;

    public void initialize() throws SQLException {
        dbConnection = Database.getInstance().getConnection();
    }

    public void click(MouseEvent mouseEvent) throws SQLException {
        PlantDAO plantDAO = new PlantDAO(dbConnection);

        String plantQuery = plantDAO.getPlantSearchQuery("knolgewassen","fli");
        plantDAO.getPlantBySearch(plantQuery);
    }
}
