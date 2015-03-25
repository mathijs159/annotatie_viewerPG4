/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annotationviewer;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mathijs
 */
public class dbConnect {

    Statement statement = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    String JDBC_Driver = "com.mysql.jdbc.Driver";

    public static void dbConnect(String query, String url_port, String user) {
        try {
            Connection connect = DriverManager.getConnection(url_port, user, null);
        } catch (SQLException ex) {
            Logger.getLogger(dbConnect.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
