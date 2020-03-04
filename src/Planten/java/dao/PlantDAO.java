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

    public PlantDAO(Connection dbConnection) throws SQLException {
        this.dbConnection = dbConnection;
        stmtSelectById = dbConnection.prepareStatement(GETPLANTBYID);
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

    /**
     * @param plantQuery -> query van de kenmerken uit de plant tabel
     * @return -> lijst met planten die voldoen aan de zoekqueries
     * @throws SQLException
     */
    public List<Plant> getPlantBySearch(String plantQuery) throws SQLException {
        List<Plant> planten = null;
        String query = plantQuery;


        PreparedStatement stmtSelectBySearch = dbConnection.prepareStatement(query);
        ResultSet rs = stmtSelectBySearch.executeQuery();
        while (rs.next()) {
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

    /**
     * @param type -> type van de plant
     * @param naam -> familie + geslacht + soort + variant
     * @return -> geeft een SQL querry terug die zoekt op alle plant kenmerken
     */
    public String getPlantSearchQuery(String type, String naam) {
        int counter = 0;
        String query = "SELECT * FROM plant WHERE";
        if (type != null && !type.equals("")) {
            query += " type LIKE " + type + "";
            counter++;
        }
        if (naam != null && !naam.equals("")) {
            if (counter > 0) {
                query += " AND";
            }
            query += " fgsv LIKE %" + naam + "%";
        }
        System.out.println(query);
        return query;
    }
}
