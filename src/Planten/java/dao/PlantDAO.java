package Planten.java.dao;

import Planten.java.model.Plant;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class PlantDAO implements Queries {

    private Connection dbConnection;
    private PreparedStatement stmtSelectById;
    private PreparedStatement stmtSelectByPlant;

    public PlantDAO(Connection dbConnection) throws SQLException {
        this.dbConnection = dbConnection;
        stmtSelectById = dbConnection.prepareStatement(GETPLANTBYID);
        stmtSelectByPlant = dbConnection.prepareStatement(GETPLANTSBYPLANT);
    }

    //TODO te testen
    public Plant getPlantById(int id) throws SQLException {
        Plant plant = null;

        stmtSelectById.setInt(1, id);
        ResultSet rs = stmtSelectById.executeQuery();
        if (rs.next()) {
            plant = new Plant(
                    rs.getInt("plant_id"),
                    rs.getString("type"),
                    rs.getString("familie"),
                    rs.getString("geslacht"),
                    rs.getString("soort"),
                    rs.getString("variatie"),
                    rs.getInt("plantdichtheid_min"),
                    rs.getInt("plantdichtheid_max")
            );
        }
        return plant;
    }

    //TODO te testen

    /**
     * @param fgsv -> familie, geslacht, soort, variant
     * @return Geeft een lijst terug van alle planten die voldoen aan de ingegeven kenmerken
     */
    public List<Plant> getPlantsByKenmerken (String type, String familie, String fgsv) throws SQLException {
        List<Plant> planten = null;

        int iTrue = (type.isBlank())? 1:0;
        stmtSelectByPlant.setString(1,type);
        stmtSelectByPlant.setInt(2,iTrue);

        iTrue = (familie.isBlank())? 1:0;
        stmtSelectByPlant.setString(3,type);
        stmtSelectByPlant.setInt(4,iTrue);

        iTrue = (fgsv.isBlank())? 1:0;
        stmtSelectByPlant.setString(5,type);
        stmtSelectByPlant.setInt(6,iTrue);

        ResultSet rs = stmtSelectByPlant.executeQuery();
        while (rs.next()){
            Plant plant = new Plant(
                    rs.getInt("plant_id"),
                    rs.getString("type"),
                    rs.getString("familie"),
                    rs.getString("geslacht"),
                    rs.getString("soort"),
                    rs.getString("variatie"),
                    rs.getInt("plantdichtheid_min"),
                    rs.getInt("plantdichtheid_max")
            );
            planten.add(plant);
        }
        return planten;
    }
}
