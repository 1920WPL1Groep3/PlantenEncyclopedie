package Planten.java.dao;

import Planten.java.Beheerdaad_Eigenschap;
import Planten.java.model.Beheer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class BeheerDAO implements Queries {
    private Connection dbConnection;
    private PreparedStatement stmtSelectBeheerByID;

    public BeheerDAO(Connection dbConnection) throws SQLException {
        this.dbConnection = dbConnection;
        stmtSelectBeheerByID = dbConnection.prepareStatement(GETBEHEERBYPLANTID);
    }

    //TODO te testen
    public Beheer getBeheerById(int id) throws SQLException {
        Beheer beheer = null;

        beheer = new Beheer(
                id,
                getBeheerdaden(id)
        );
        return beheer;
    }

    //TODO te testen
    private List<Beheerdaad_Eigenschap> getBeheerdaden(int id) throws SQLException {
        List<Beheerdaad_Eigenschap> abioMulti = null;

        stmtSelectBeheerByID.setInt(1, id);
        ResultSet rs = stmtSelectBeheerByID.executeQuery();
        while (rs.next()) {
            Beheerdaad_Eigenschap beheerdaad = new Beheerdaad_Eigenschap(
                    rs.getInt("beheer_id"),
                    rs.getString("beheerdaad"),
                    rs.getString("opmerking"),
                    rs.getString("maand"),
                    rs.getInt("frequentie_jaar")
            );
            abioMulti.add(beheerdaad);
        }
        return abioMulti;
    }

    //TODO getByKenmerken toevoegen
}
