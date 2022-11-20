package assignment9;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectionConfig {

    public static Connection getConnection() {
        Connection connection = null;

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@oracle12c.scs.ryerson.ca:1521/orcl12c",
                    "hpstuart", "11060173");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return connection;
    }

}