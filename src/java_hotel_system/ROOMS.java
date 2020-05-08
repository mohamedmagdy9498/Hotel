
package java_hotel_system;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ROOMS {
                    CONNECTION myconnection=new CONNECTION();

      public void fillRoomsTYPEJTABLE(JTable table)
    {
      PreparedStatement ps;
      ResultSet      rs;
      String SelectQuery="SELECT * FROM `rooms";
                    try {
                        ps=myconnection.CreateConnection().prepareStatement(SelectQuery);
                        rs=ps.executeQuery();
                        DefaultTableModel tableModel =(DefaultTableModel)table.getModel();
                        
                        Object [] row;
                        while(rs.next())
                        {
                         row=new Object[4];
                         row[0]=rs.getInt(1);
                         row[1]=rs.getInt(2);
                         row[2]=rs.getString(3);
                         row[3]=rs.getString(4);

                         
                         tableModel.addRow(row);
                        }
                        
                        
                        
                    } catch (SQLException ex) {
                        Logger.getLogger(Clients.class.getName()).log(Level.SEVERE, null, ex);
                    }
      
      
    }
    public void fillRooms_TYPE_JCOMBOBOX(JComboBox combobox)
    {
      PreparedStatement ps;
      ResultSet      rs;
      String SelectQuery="SELECT * FROM `type`";
                    try {
                        ps=myconnection.CreateConnection().prepareStatement(SelectQuery);
                        rs=ps.executeQuery();
                        
                 
                        while(rs.next())
                        {
                      
                         combobox.addItem(rs.getInt(1));
                         
                        }
                        
                        
                        
                    } catch (SQLException ex) {
                        Logger.getLogger(Clients.class.getName()).log(Level.SEVERE, null, ex);
                    }
      
      
    }
    public boolean addRooms(int Number,int Type,String phone)
    {
  
        PreparedStatement st;
        ResultSet rs; 
        String addQuery="INSERT INTO `rooms`(`r_number`, `type`, `phone`, `reserved`) VALUES (?,?,?,?)";
        try {
            st=myconnection.CreateConnection().prepareStatement(addQuery);
            st.setInt(1, Number);
            st.setInt(2, Type);
            st.setString(3, phone);
             st.setString(4, "No");

        
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
    
     public boolean editRoom(int Number,int Type,String phone,String isReserved)
    {
      PreparedStatement st;
        ResultSet rs; 
        String editQuery="UPDATE `rooms` SET`type`=?,`phone`=?,`reserved`=? WHERE `r_number`=?";
        try {
            st=myconnection.CreateConnection().prepareStatement(editQuery);
            st.setInt(1, Type);
            st.setString(2,phone);
            st.setString(3, isReserved);
            st.setInt(4, Number);
            return (st.executeUpdate()>0);
           
        } catch (SQLException ex) {
            Logger.getLogger(Clients.class.getName()).log(Level.SEVERE, null, ex);
        }
 
              return false; 
    }
     
     public boolean removeRoom(int RoomNumber)
{
PreparedStatement st;
        ResultSet rs; 
        String deleteQuery="DELETE FROM `rooms` WHERE `r_number`=?";
        try {
            st=myconnection.CreateConnection().prepareStatement(deleteQuery);
          
            st.setInt(1, RoomNumber);
            return (st.executeUpdate()>0);
           
        } catch (SQLException ex) {
            Logger.getLogger(Clients.class.getName()).log(Level.SEVERE, null, ex);
        }
 
              return false; 


}
      public boolean SetRoomToReserved(int Number,String isReserved)
    {
      PreparedStatement st;
        ResultSet rs; 
        String editQuery="UPDATE `rooms` SET`reserved`=? WHERE `r_number`=?";
        try {
            st=myconnection.CreateConnection().prepareStatement(editQuery);
         
            st.setString(1, isReserved);
            st.setInt(2, Number);
            return (st.executeUpdate()>0);
           
        } catch (SQLException ex) {
            Logger.getLogger(Clients.class.getName()).log(Level.SEVERE, null, ex);
        }
 
              return false; 
    }
     
 public String ISRoomReserved(int Number)
    {
      PreparedStatement st;
        ResultSet rs; 
        String editQuery="SELECT  `reserved` FROM `rooms` WHERE `r_number`=?";
        try {
            st=myconnection.CreateConnection().prepareStatement(editQuery);
         
            st.setInt(1, Number);
            rs=st.executeQuery();
            if(rs.next())
            {
             
               return rs.getString(1);
            
            }
            else
            {
            
             return "";
            }
        } catch (SQLException ex) {
            Logger.getLogger(Clients.class.getName()).log(Level.SEVERE, null, ex);
        }
 
              return ""; 
    }
 
 
 
 public void fillTYPEJTABLE(JTable table)
    {
      PreparedStatement ps;
      ResultSet      rs;
      String SelectQuery="SELECT * FROM `type`";
                    try {
                        ps=myconnection.CreateConnection().prepareStatement(SelectQuery);
                        rs=ps.executeQuery();
                        DefaultTableModel tableModel =(DefaultTableModel)table.getModel();
                        
                        Object [] row;
                        while(rs.next())
                        {
                         row=new Object[3];
                         row[0]=rs.getInt(1);
                         row[1]=rs.getString(2);
                         row[2]=rs.getInt(3);

                         
                         tableModel.addRow(row);
                        }
                        
                        
                        
                    } catch (SQLException ex) {
                        Logger.getLogger(Clients.class.getName()).log(Level.SEVERE, null, ex);
                    }
}
}
