package Planten.java.dao;

import Planten.java.model.Plant;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PlantDao{
    private static final String GETPLANTNAMEBYID =
            "SELECT geslacht,soort,variatie FROM Plant WHERE plant_id = ?";
    private static final String GETPLANTNAMEBYNAME =
            "SELECT geslacht,soort,variatie FROM Plant WHERE geslacht LIKE %?% OR WHERE soort LIKE %?% OR WHERE variatie LIKE %?%";
    
    private Connection dbConnection;
    private PreparedStatement stmtSelectById;
    private PreparedStatement stmtSelectByName;


    public PlantDao(Connection dbConnection) throws SQLException {
        this.dbConnection = dbConnection;
        stmtSelectById =dbConnection.prepareStatement(GETPLANTNAMEBYID);
        stmtSelectByName =dbConnection.prepareStatement(GETPLANTNAMEBYNAME);

    }

    public Plant getPlantById(int id) throws SQLException
    {
        Plant plant = null;


        stmtSelectById.setInt(1,id);
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


}
