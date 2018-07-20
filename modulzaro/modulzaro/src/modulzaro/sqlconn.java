/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulzaro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author gabor_hanacsek
 */
public class sqlconn {

    String driver;
    String url;
    String username;
    String password;
    ResultSet rs;
    Connection conn = null;
    Statement stmt = null;

    sqlconn(String driver, String url, String username, String password) throws ClassNotFoundException, SQLException {

        this.driver = driver;
        this.url = url;
        this.username = username;
        this.password = password;
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(url, username, password);
        stmt = conn.createStatement();

    }

    public Object lekerdez(String query) throws SQLException, ClassNotFoundException, Exception {

        rs = stmt.executeQuery(query);

        return rs;

    }

    public void feltolt(String Query) throws SQLException, ClassNotFoundException {

        stmt.executeUpdate(Query);

    }

}
