package Planten.java.dao;

import Planten.java.model.Fenotype;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FenotypeDao {
    private static final String GETFENOTYPEBYID =
            "SELECT * FROM fenotype where plant_id = ?";


    private Connection dbConnection;
    private PreparedStatement stmtSelectFenoByID;

    public FenotypeDao(Connection dbConnection) throws SQLException {
        this.dbConnection = dbConnection;
        stmtSelectFenoByID = dbConnection.prepareStatement(GETFENOTYPEBYID);
    }

    public Fenotype getFenotypeById(int id) throws SQLException {
        Fenotype fenotype = null;
        stmtSelectFenoByID.setInt(1, id);
        ResultSet rs = stmtSelectFenoByID.executeQuery();
        if (rs.next()) {
            fenotype = new Fenotype(
                    rs.getString("bladvorm"),
                    rs.getInt("levensvorm"),
                    rs.getString("habitus"),
                    rs.getString("bloeiwijze"),
                    rs.getInt("bladgrootte"),
                    rs.getString("ratio_bloei_blad"),
                    rs.getString("spruitfenelogie"),
                    rs.getInt("plant_id")
            );
        }
        return fenotype;
    }
}
