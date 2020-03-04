package Planten.java.dao;

import Planten.java.CommMulti_Eigenschap;
import Planten.java.model.Commensalisme;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CommensalismeDAO implements Queries {
    private Connection dbConnection;
    private PreparedStatement stmtSelectCommeByID;
    private PreparedStatement stmtSelectCommeMultiByID;

    public CommensalismeDAO(Connection dbConnection) throws SQLException {
        this.dbConnection = dbConnection;
        stmtSelectCommeByID = dbConnection.prepareStatement(GETCOMMENSALISMEBYPLANTID);
        stmtSelectCommeMultiByID = dbConnection.prepareStatement(GETCOMMENSALISMEMULTIBYPLANTID);
    }

    //TODO te testen
    public Commensalisme getCommById(int id) throws SQLException {
        Commensalisme comm = null;

        stmtSelectCommeByID.setInt(1, id);
        ResultSet rs = stmtSelectCommeByID.executeQuery();
        if (rs.next()) {
            comm = new Commensalisme(
                    rs.getInt("commensialisme_id"),
                    rs.getInt("plant_id"),
                    rs.getString("strategie"),
                    rs.getString("ontwikkelingssnelheid"),
                    getCommMulti(id)
            );
        }
        return comm;
    }

    //TODO te testen
    private List<CommMulti_Eigenschap> getCommMulti(int id) throws SQLException {
        List<CommMulti_Eigenschap> commMulti = null;

        stmtSelectCommeMultiByID.setInt(1, id);
        ResultSet rs = stmtSelectCommeMultiByID.executeQuery();
        while (rs.next()) {
            CommMulti_Eigenschap commEigenschap = new CommMulti_Eigenschap(
                    rs.getInt("commensialisme_id"),
                    rs.getString("eigenschap"),
                    rs.getString("waarde")
            );
            commMulti.add(commEigenschap);
        }
        return commMulti;
    }
}
