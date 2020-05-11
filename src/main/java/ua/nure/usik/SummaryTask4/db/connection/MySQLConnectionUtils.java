package ua.nure.usik.SummaryTask4.db.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectionUtils {

    public static Connection getMySQLConnection()
            throws ClassNotFoundException, SQLException {
//        String hostName = "localhost";
//        String dbName = "final_project_db";
//        String userName = "root";
//        String password = "admin";
        String hostName = "eu-cdbr-west-03.cleardb.net";
        String dbName = "heroku_975e72f23644e41";
        String userName = "b21eecb2f5c2b8";
        String password = "90785761";
        return getMySQLConnection(hostName, dbName, userName, password);
    }

    public static Connection getMySQLConnection(String hostName, String dbName,
                                                String userName, String password) throws SQLException,
            ClassNotFoundException {

        Class.forName("com.mysql.jdbc.Driver");


        String connectionURL
                = "jdbc:mysql://" + hostName + ":3306/" + dbName + "?useUnicode=true&serverTimezone=UTC&reconnect=true";

        Connection conn = DriverManager.getConnection(connectionURL, userName,
                password);
        return conn;
    }
}
