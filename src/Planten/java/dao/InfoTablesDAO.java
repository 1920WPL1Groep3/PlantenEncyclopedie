package Planten.java.dao;

import Planten.java.model.InfoTables;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**@author Siebe*/
public class InfoTablesDAO implements Queries{
    private Connection dbConnection;

    public InfoTablesDAO(Connection dbConnection) throws SQLException {
        this.dbConnection = dbConnection;
    }

    /**
     * @param Query
     * @return
     */
    public List<String> getInfoTableString(String Query,String eigenschapnaam) throws SQLException{
        List<String> Strings = new ArrayList<String>();

            Statement stmt = dbConnection.createStatement();
            ResultSet rs = stmt.executeQuery(Query);
            while (rs.next()) {
                Strings.add(rs.getString(eigenschapnaam));
            }
        return Strings;
    }

    /**
     * @param Query
     * @return
     */
    public List<Integer> getInfoTableInt(String Query,String eigenschapnaam) throws SQLException {
        List<Integer> Strings = new ArrayList<Integer>();

        Statement stmt = dbConnection.createStatement();
        ResultSet rs = stmt.executeQuery(Query);
        while (rs.next()) {
            Strings.add(rs.getInt(eigenschapnaam));
        }
        return Strings;
    }

    /**
     * @param Query
     * @return
     */
    public List<Blob> getInfoTableBlob(String Query,String eigenschapnaam) throws SQLException {
        List<Blob> Strings = new ArrayList<Blob>();

        Statement stmt = dbConnection.createStatement();
        ResultSet rs = stmt.executeQuery(Query);
        while (rs.next()) {
            Strings.add(rs.getBlob(eigenschapnaam));
        }
        return Strings;
    }

    // functie om de String Query in te vullen bij 'getInfoTable'
  public InfoTables getInfoTables() throws SQLException{
        InfoTables infoTables = new InfoTables(
                getInfoTableString(GETTYPEBYPLANTID, "type_naam"),
                getInfoTableString(GETFAMILIEBYPLANTID, "familie_naam"),
                getInfoTableString(GETKLEURENBYKLEUREN, "kleur"),
                getInfoTableInt(GETBLADGROOTTE, "waarde"),
                getInfoTableString(GETBLADVORMBYBLADVORM, "waarde"),
                getInfoTableString(GETRATIOBYRATIOBLOEIBLAD, "waarde"),
                getInfoTableString(GETSPRUITBYSPRUITFENOLOGIE, "waarde"),
                getInfoTableString(GETBLOEIWIJZEBYBLOEIWIJZE, "waarde"),
                getInfoTableBlob(GETFOTOBlOEIWIJZE, "afbeelding"),
                getInfoTableString(GETHABITUSBYHABITUS, "waarde"),
                getInfoTableBlob(GETFOTOHABITUS, "afbeelding"),
                getInfoTableString(GETLEVENSVORM, "waarde"),
                getInfoTableString(GETBEZONNINGBYBEZONNING, "waarde"),
                getInfoTableString(GETGRONDSOORTBYGRONDSOORT, "waarde"),
                getInfoTableString(GETVOCHTBYVOCHTBEHOEFTE, "waarde"),
                getInfoTableString(GETVOEDINGBYVOEDINGSBEHOEFTE, "waarde"),
                getInfoTableString(GETREACTIEBYREACTIEOMGEVING, "waarde"),
                getInfoTableString(GETHABITATBYHABITAT, "waarde"),
                getInfoTableString(GETONTWIKKELBYONTWIKKELSNELHEID, "waarde"),
                getInfoTableString(GETLEVENSDUURBYLEVENSDUUR, "waarde"),
                getInfoTableInt(GETSOCIABILITEITBYSOCIABILITEIT, "waarde"),
                getInfoTableString(GETSTRATEGIEBYSTRATEGIE, "waarde"),
                getInfoTableInt(GETNECTARBYNECTARWAARDE, "waarde"),
                getInfoTableInt(GETPOLLENBYPOLLENWAARDE, "waarde")
        );
        return null;
    }
}
