package java_hotel_system;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection ;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CONNECTION {
    
    
    public Connection CreateConnection()
    {
   Connection connection=null;
   MysqlDataSource mds=new MysqlDataSource ();
    mds.setServerName("localhost");
    mds.setPortNumber(3306);
    mds.setUser("root");
    mds.setPassword("");
    mds.setDatabaseName("java_hotel_db");
        try {
            connection=mds.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(CONNECTION.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
    
}
