
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

    public boolean addClients(String Fname,String lname,String phone,String email)
    {
  
        PreparedStatement st;
        ResultSet rs; 
        String addQuery="INSERT INTO `clients`(`first_name`, `last_name`, `phone`, `email`) VALUES (?,?,?,?)";
        try {
            st=myconnection.CreateConnection().prepareStatement(addQuery);
            st.setString(1, Fname);
            st.setString(2, lname);
            st.setString(3, phone);
            st.setString(4, email);
            if(st.executeUpdate()>0)
            {
               return true ;
            }
            else
            {
              return false; 
            }
        } catch (SQLException ex) {
            Logger.getLogger(Clients.class.getName()).log(Level.SEVERE, null, ex);
        }
 
              return false; 

    }
    
    public void fillClientsJTABLE(JTable table)
    {
      PreparedStatement ps;
      ResultSet      rs;
      String SelectQuery="SELECT * FROM `clients`";
                    try {
                        ps=myconnection.CreateConnection().prepareStatement(SelectQuery);
                        rs=ps.executeQuery();
                        DefaultTableModel tableModel =(DefaultTableModel)table.getModel();
                        
                        Object [] row;
                        while(rs.next())
                        {
                         row=new Object[5];
                         row[0]=rs.getInt(1);
                         row[1]=rs.getString(2);
                         row[2]=rs.getString(3);
                         row[3]=rs.getString(4);
                         row[4]=rs.getString(5);
                         tableModel.addRow(row);
                        }
                        
                        
                        
                    } catch (SQLException ex) {
                        Logger.getLogger(Clients.class.getName()).log(Level.SEVERE, null, ex);
                    }
      
      
    }
    public boolean editCilent(int id,String Fname,String lname,String phone,String email)
    {
      PreparedStatement st;
        ResultSet rs; 
        String editQuery="UPDATE `clients` SET `first_name`=?,`last_name`=?,`phone`=?,`email`=? WHERE `id`=?";
        try {
            st=myconnection.CreateConnection().prepareStatement(editQuery);
            st.setString(1, Fname);
            st.setString(2, lname);
            st.setString(3, phone);
            st.setString(4, email);
            st.setInt(5, id);
            return (st.executeUpdate()>0);
           
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

