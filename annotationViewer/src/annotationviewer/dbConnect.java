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

    static String MySQL_Driver = "jdbc:mysql://";
    static String userForm = "?user=";
    static Statement stmt = null;
    static ResultSet rs = null;

    public static ResultSet dbConnect(String query, String url_port, String user) {

        try {
            Connection conn
                    = DriverManager.getConnection(MySQL_Driver + url_port + userForm + user);

            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            return rs;

        } catch (SQLException ex) {
            Logger.getLogger(dbConnect.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (rs != null) {
                try {
                    rs.close();

                } catch (SQLException sqlEx) {
                }
                rs = null;
            }
        }
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException sqlEx) {
            }
            stmt = null;
        }
        return null;

    }
}
