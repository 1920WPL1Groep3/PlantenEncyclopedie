package Planten.java.dao;

import Planten.java.model.Extra;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExtraDAO implements Queries{
    private Connection dbConnection;
    private PreparedStatement stmtSelectExtraByID;

    public ExtraDAO(Connection dbConnection) throws SQLException {
        this.dbConnection = dbConnection;
        stmtSelectExtraByID = dbConnection.prepareStatement(GETEXTRABYPLANTID);
    }

    //TODO te testen
    public Extra getExtraById(int id) throws SQLException {
        Extra extra = null;

        stmtSelectExtraByID.setInt(1, id);
        ResultSet rs = stmtSelectExtraByID.executeQuery();
        if (rs.next()) {
            extra = new Extra(
                    rs.getInt("extra_id"),
                    rs.getInt("plant_id"),
                    rs.getInt("nectarwaarde"),
                    rs.getInt("pollenwaarde"),
                    rs.getString("bijvriendelijk"),
                    rs.getString("eetbaar_kruidgebruik"),
                    rs.getString("eetbaar_kruidgebruik"),
                    rs.getString("geurend"),
                    rs.getString("vorstgevoelig")
            );
        }
        return extra;
    }
}
