package Planten.java.dao;

import Planten.java.model.InfoTables;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**@author Siebe*/
public class InfoTablesDAO implements Queries{
    private Connection dbConnection;
    private PreparedStatement stmtSelectInfoTable;

    public InfoTablesDAO(Connection dbConnection) throws SQLException {
        this.dbConnection = dbConnection;
        stmtSelectInfoTable = dbConnection.prepareStatement(GETINFOTABLE);
    }
}
