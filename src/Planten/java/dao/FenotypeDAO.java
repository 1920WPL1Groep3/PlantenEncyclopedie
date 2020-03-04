package Planten.java.dao;

import Planten.java.FenoMulti_Eigenschap;
import Planten.java.model.Fenotype;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class FenotypeDAO implements Queries{

    private Connection dbConnection;
    private PreparedStatement stmtSelectFenoByID;
    private PreparedStatement stmtSelectFenoMultiByID;

    public FenotypeDAO(Connection dbConnection) throws SQLException {
        this.dbConnection = dbConnection;
        stmtSelectFenoByID = dbConnection.prepareStatement(GETFENOTYPEBYPLANTID);
        stmtSelectFenoMultiByID = dbConnection.prepareStatement(GETFENOTYPEMULTIBYPLANTID);
    }

    //TODO te testen
    public Fenotype getFenoById(int id) throws SQLException {
        Fenotype feno = null;

        stmtSelectFenoByID.setInt(1, id);
        ResultSet rs = stmtSelectFenoByID.executeQuery();
        if (rs.next()) {
            feno = new Fenotype(
                    rs.getInt("fenotype_id"),
                    rs.getInt("plant_id"),
                    rs.getString("bladvorm"),
                    rs.getInt("levensvorm"),
                    rs.getString("habitus"),
                    rs.getString("bloeiwijze"),
                    rs.getInt("bladgrootte"),
                    rs.getString("ratio_bloei_blad"),
                    rs.getString("spruitfenelogie"),
                    getFenoMulti(id)
            );
        }
        return feno;
    }

    //TODO te testen
    private List<FenoMulti_Eigenschap> getFenoMulti(int id) throws SQLException {
        List<FenoMulti_Eigenschap> commMulti = null;

        stmtSelectFenoMultiByID.setInt(1, id);
        ResultSet rs = stmtSelectFenoMultiByID.executeQuery();
        while (rs.next()) {
            FenoMulti_Eigenschap fenoEigenschap = new FenoMulti_Eigenschap(
                    rs.getInt("fenotype_id"),
                    rs.getString("eigenschap"),
                    rs.getString("jan"),
                    rs.getString("feb"),
                    rs.getString("maa"),
                    rs.getString("apr"),
                    rs.getString("mei"),
                    rs.getString("jun"),
                    rs.getString("jul"),
                    rs.getString("aug"),
                    rs.getString("sep"),
                    rs.getString("okt"),
                    rs.getString("nov"),
                    rs.getString("dec")
            );
            commMulti.add(fenoEigenschap);
        }
        return commMulti;
    }
}
