
package java_hotel_system;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Reception {


        PreparedStatement ps;
         ResultSet rs; 
                    public int RecptionEnter (String username,String password)
                    {
                    
                    try {
                CONNECTION myconnection=new CONNECTION();
                String selectQuery="SELECT * FROM `users` WHERE `username`=? AND `password`=?";
                ps=myconnection.CreateConnection().prepareStatement(selectQuery);
                ps.setString(1, username);
                ps.setString(2, password);
                rs=ps.executeQuery();
                
                if(rs.next())
                { int k=rs.getInt("id");
                 
                    return k;
                    
                }
                else {
                    
                    return 0;
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
            }
                    return 0;
                    
                    }
       
                    
    
}
