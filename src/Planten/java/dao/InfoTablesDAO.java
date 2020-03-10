package Planten.java.dao;

import Planten.java.model.InfoTables;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class InfoTablesDAO implements Queries{
    private Connection dbConnection;
    private PreparedStatement stmtSelectInfoTable;

    public InfoTablesDAO(Connection dbConnection) throws SQLException {
        this.dbConnection = dbConnection;
        stmtSelectInfoTable = dbConnection.prepareStatement(GETINFOTABLE);
    }

    public void getInfoTables(){
        InfoTables infoTables = new InfoTables(
                //TODO omzetten naar queries -> makkelijker onderhoud en anti-hardcoding
                //Plant
                getInfoTableString("type_naam","types"),
                getInfoTableString("familie_naam","familie"),

                //Fenotype
                getInfoTableString("kleur","kleuren"),
                getInfoTableString("waarde","maxbladgrootte"),
                getInfoTableString("waarde","bladvorm"),
                getInfoTableString("waarde","ratio_bloeiblad"),
                getInfoTableString("waarde","spruitfenologie"),
                getInfoTableString("waarde","bloeiwijze"),
                getInfoTableBlob("afbeelding","bloeiwijze"),
                getInfoTableString("waarde","habitus"),
                getInfoTableBlob("afbeelding","habitus"),
                getInfoTableString("waarde","levensvorm"),

                //Abiotische factoren
                getInfoTableString("waarde","bezonning"),
                getInfoTableString("waarde","grondsoort"),
                getInfoTableString("waarde","vochtbehoefte"),
                getInfoTableString("waarde","voedingsbehoefte"),
                getInfoTableString("waarde","reactieomgeving"),
                getInfoTableString("waarde","habitat"),

                //Commensalisme
                getInfoTableString("waarde","ontwikkelingssnelheid"),
                getInfoTableString("waarde","levensduur_concurrentiekracht"),
                getInfoTableInt("waarde","sociabiliteit"),
                getInfoTableString("waarde","stratergie"),

                //Extra
                getInfoTableInt("waarde","nectarwaarde"),
                getInfoTableInt("waarde","pollenwaarde")
        );
    }

    private List<Blob> getInfoTableBlob(String colomn, String table) {
        return null;
    }

    private List<Integer> getInfoTableInt(String colomn, String table) {
        return null;
    }

    private List<String> getInfoTableString(String colomn, String table) {
        return null;
    }
}
