
package java_hotel_system;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Clients {
                CONNECTION myconnection=new CONNECTION();

    public boolean addClients(String Fname,String lname,String phone1,String phone2,String email)
    {
  
        PreparedStatement st;
        ResultSet rs; 
        String addQuery="INSERT INTO `clients`(`first_name`, `last_name`, `email`) VALUES (?,?,?)";
        String addQuery2="INSERT INTO `phone`(`phone number`,`Client ID`) VALUES (?,?),(?,?)";
        try {
            st=myconnection.CreateConnection().prepareStatement(addQuery);
            st.setString(1, Fname);
            st.setString(2, lname);
            st.setString(3, email);
            if(st.executeUpdate()>0)
            {   st.execute("Select `id` from `clients`");
                rs = st.getResultSet();
                rs.last();
                
                st=myconnection.CreateConnection().prepareStatement(addQuery2);
                st.setString(1, phone1);
                st.setInt(2, rs.getInt("id"));
                st.setString(3, phone2);
                st.setInt(4, rs.getInt("id"));
                if(st.executeUpdate()>0)
                {return true ;}
                else return false;
            }
            else
            
              return false; 
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(Clients.class.getName()).log(Level.SEVERE, null, ex);
        }
 
              return false; 

    }
    
    public void fillClientsJTABLE(JTable table)
    {
      PreparedStatement ps;
      ResultSet      rs;
      ResultSet      rs2;
      String SelectQuery="SELECT * FROM `clients`";
      String SelectQuery2="SELECT `phone number` FROM `phone` WHERE `Client ID` = ? ";
                    try {
                        ps=myconnection.CreateConnection().prepareStatement(SelectQuery);
                        rs=ps.executeQuery();
                        
                        DefaultTableModel tableModel =(DefaultTableModel)table.getModel();
                        
                        Object [] row;
                        while(rs.next())
                        {
                         ps=myconnection.CreateConnection().prepareStatement(SelectQuery2);
                         ps.setInt(1, rs.getInt("id"));
                         rs2=ps.executeQuery();
                         
                         row=new Object[6];
                         row[0]=rs.getInt(1);
                         row[1]=rs.getString(2);
                         row[2]=rs.getString(3);
                         rs2.next();
                         row[3]=rs2.getString(1);
                         rs2.next();
                         row[4]=rs2.getString(1);
                         row[5]=rs.getString(4);
                         tableModel.addRow(row);
                        }
                        
                        
                        
                    } catch (SQLException ex) {
                        Logger.getLogger(Clients.class.getName()).log(Level.SEVERE, null, ex);
                    }
      
      
    }
    public boolean editCilent(int id,String Fname,String lname,String phone1,String phone2,String email)
    {
      PreparedStatement st;
        ResultSet rs;
        String editQuery="UPDATE `clients` SET `first_name`=?,`last_name`=?,`email`=? WHERE `id`=?";
        String editQuery2="UPDATE `phone` SET `phone number`=? WHERE `phone number`=? AND `Client ID`=?";
        try {
            st=myconnection.CreateConnection().prepareStatement(editQuery);
            st.setString(1, Fname);
            st.setString(2, lname);
            st.setString(3, email);
            st.setInt(4, id);
            if(st.executeUpdate()>0)
            { 
               st=myconnection.CreateConnection().prepareStatement("Select `phone number` from `phone` WHERE `Client ID`=?");
               st.setInt(1, id);
               rs=st.executeQuery();
               rs.next();
                st=myconnection.CreateConnection().prepareStatement(editQuery2);
              st.setString(1, phone1);
              st.setString(2,rs.getString("phone number"));
              st.setInt(3, id);
              if(st.executeUpdate()>0)
              {rs.next();
              st=myconnection.CreateConnection().prepareStatement(editQuery2);
              st.setString(1, phone2);
              st.setString(2,rs.getString("phone number"));
              st.setInt(3, id);
                   return st.executeUpdate()>0;
              }
            
            }
            else return false;
           
        } catch (SQLException ex) {
            Logger.getLogger(Clients.class.getName()).log(Level.SEVERE, null, ex);
        }
 
              return false; 
    }

public boolean removeClient(int id)
{
PreparedStatement st;
        ResultSet rs; 
        String deleteQuery="DELETE FROM `clients` WHERE `id`=?";
        try {
            st=myconnection.CreateConnection().prepareStatement(deleteQuery);
          
            st.setInt(1, id);
            return (st.executeUpdate()>0);
           
        } catch (SQLException ex) {
            Logger.getLogger(Clients.class.getName()).log(Level.SEVERE, null, ex);
        }
 
              return false; 


}

}

