/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annotationviewer;

import java.io.InputStream;
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

    public static String dbConnect(String query, String url_port, String user) throws ClassNotFoundException {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(MySQL_Driver + url_port + userForm + user);

            String queryTest = query;

            stmt = conn.createStatement();
            rs = stmt.executeQuery(queryTest);
            while(rs.next()){
                String sequence = rs.getString("sequence");
                String geneName = rs.getString("stable_id");
                System.out.println(geneName);
                System.out.println(sequence);
                return sequence;
            }

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
