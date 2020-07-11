package FacadePattern;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement prep = null;
        CallableStatement call = null;
        ResultSet rset = null;

        JDBCdemoFacade facade = new JDBCdemoFacade();

        facade.establishDBConnection(conn, prep, call, rset);

    }
}
