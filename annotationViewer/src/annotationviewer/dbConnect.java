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

    public static void dbConnect(String query, String url_port, String user) {
        try {
            Connection conn = 
                    DriverManager.getConnection(MySQL_Driver+url_port+userForm+user);
        } catch (SQLException ex) {
            Logger.getLogger(dbConnect.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
