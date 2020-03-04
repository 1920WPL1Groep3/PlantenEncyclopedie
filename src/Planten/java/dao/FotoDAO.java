package Planten.java.dao;

import Planten.java.Foto_Eigenschap;
import Planten.java.model.Foto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class FotoDAO implements Queries {
    private Connection dbConnection;
    private PreparedStatement stmtSelectFotoByID;

    public FotoDAO(Connection dbConnection) throws SQLException {
        this.dbConnection = dbConnection;
        stmtSelectFotoByID = dbConnection.prepareStatement(GETFOTOBYPLANTID);
    }

    //TODO te testen
    public Foto getFotoById(int id) throws SQLException {
        Foto foto = null;

        foto = new Foto(
                id,
                getFotos(id)
        );
        return foto;
    }

    //TODO te testen
    private List<Foto_Eigenschap> getFotos(int id) throws SQLException {
        List<Foto_Eigenschap> fotos = null;

        stmtSelectFotoByID.setInt(1, id);
        ResultSet rs = stmtSelectFotoByID.executeQuery();
        while (rs.next()) {
            Foto_Eigenschap foto = new Foto_Eigenschap(
                    rs.getInt("foto_id"),
                    rs.getString("eigenschap"),
                    rs.getString("url"),
                    rs.getBlob("figuur")
            );
            fotos.add(foto);
        }
        return fotos;
    }
}
