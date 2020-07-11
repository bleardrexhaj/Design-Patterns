package FacadePattern;

import java.sql.*;

public class JDBCdemoFacade {
    public void establishDBConnection(Connection conn, PreparedStatement prep, CallableStatement call, ResultSet rset) {
        try {
            Class.forName("<driver>").newInstance();
            conn = DriverManager.getConnection("<database>");
            String sql = "SELECT * FROM <table> WHERE <column name> = ? ";
            prep = conn.prepareStatement(sql);
            prep.setString(1, "<column value>");
            rset = prep.executeQuery();
            if (rset.next()) {
                System.out.println(rset.getString("<column name"));
            }
            sql = "{call <stored procedure>( ?, ? )}";
            call = conn.prepareCall(sql);
            call.setInt(1, 1972);
            call.registerOutParameter(2, Types.INTEGER);
            call.execute();
            System.out.println(call.getInt(2));
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } finally {
            if (rset != null) {
                try {
                    rset.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            if (prep != null) {
                try {
                    prep.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            if (call != null || conn != null) {
                try {
                    call.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
