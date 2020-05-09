
package java_hotel_system;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RESERVATION {
    
  //  ALTER TABLE reservations ADD CONSTRAINT fk_client_id FOREIGN KEY(client_id) REFERENCES clients(id) ON DELETE CASCADE
    //ALTER TABLE reservations ADD CONSTRAINT fk_room_number FOREIGN KEY(room_number) REFERENCES rooms(r_number) ON DELETE CASCADE
//ALTER TABLE rooms ADD CONSTRAINT fk_type_id FOREIGN KEY(type) REFERENCES type(id) ON DELETE CASCADE
                    CONNECTION myconnection=new CONNECTION();
                    ROOMS room=new ROOMS ();
 public boolean addReservation(int client_id,int room_type,String dateIn,String dateOut,int Recp)
    {
  
        PreparedStatement st;
        ResultSet rs; 
        String addQuery="INSERT INTO `reservations`(`client_id`, `room_number`, `date_in`, `date_out`, `RepID`) VALUES (?,?,?,?,?)";
        try {
            st=myconnection.CreateConnection().prepareStatement(addQuery);
            st.setInt(1, client_id);
            st.setInt(2, room_type);
            st.setString(3, dateIn);
            st.setString(4, dateOut);
            st.setInt(5, Recp);

            if(room.ISRoomReserved(room_type).equals("No"))
            {
            
             if(st.executeUpdate()>0) 
            {
           room.SetRoomToReserved(room_type, "Yes");
            return true;
            }else
            {
                    return false;
                    }
            
            }else{
            
                      JOptionPane.showMessageDialog(null, " This Room Is Already Reserved", "Room Reservation", JOptionPane.WARNING_MESSAGE);

            return false; 
            
            }
            
            
      
        } catch (SQLException ex) {
            Logger.getLogger(Clients.class.getName()).log(Level.SEVERE, null, ex);
        }
 
              return false; 
    }
 public boolean editReservation(int reservation_id,int client_id,int room_number,String dataIn,String dateOut,int Recep)
    {
      PreparedStatement st;
        ResultSet rs; 
        String editQuery="UPDATE `reservations` SET `client_id`=?,`room_number`=?,`date_in`=?,`date_out`=?,`RepID`=? WHERE `id`=?";
        try {
            st=myconnection.CreateConnection().prepareStatement(editQuery);
            st.setInt(1, client_id);
            st.setInt(2, room_number);
            st.setString(3, dataIn);
            st.setString(4, dateOut);
            st.setInt(5, Recep);
            st.setInt(6, reservation_id);

            return (st.executeUpdate()>0);
           
        } catch (SQLException ex) {
            Logger.getLogger(Clients.class.getName()).log(Level.SEVERE, null, ex);
        }
 
              return false; 
    }
     
 
     public boolean removeReservation(int reservation_id)
{
PreparedStatement st;
        ResultSet rs; 
        String deleteQuery="DELETE FROM `reservations` WHERE `id`=?";
        try {
            st=myconnection.CreateConnection().prepareStatement(deleteQuery);
          
            st.setInt(1, reservation_id);
            int roomNumber=getRoomNumberFromReservation(reservation_id);
              if(st.executeUpdate()>0) 
            {
                room.SetRoomToReserved(roomNumber, "No");
            return true;
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
     
     public void fillReservationTYPEJTABLE(JTable table)
    {
      PreparedStatement ps;
      ResultSet      rs;
      String SelectQuery="SELECT * FROM `reservations`";
                    try {
                        ps=myconnection.CreateConnection().prepareStatement(SelectQuery);
                        rs=ps.executeQuery();
                        DefaultTableModel tableModel =(DefaultTableModel)table.getModel();
                        
                        Object [] row;
                        while(rs.next())
                        {
                         row=new Object[6];
                         row[0]=rs.getInt(1);
                         row[1]=rs.getInt(2);
                         row[2]=rs.getInt(3);
                         row[3]=rs.getString(4);
                         row[4]=rs.getString(5);
                         row[5]=rs.getInt(6);
                         
                         tableModel.addRow(row);
                        }
                        
                        
                        
                    } catch (SQLException ex) {
                        Logger.getLogger(Clients.class.getName()).log(Level.SEVERE, null, ex);
                    }
      
      
    }
     
     public int getRoomNumberFromReservation(int Reservation)
     {
     
     PreparedStatement ps;
      ResultSet      rs;
      String SelectQuery="SELECT `room_number`FROM `reservations` WHERE `id`=?";
                    try {
                        ps=myconnection.CreateConnection().prepareStatement(SelectQuery);
                                  ps.setInt(1, Reservation);

                        rs=ps.executeQuery();
                      
                        if(rs.next())
                        {
                           return rs.getInt(1);
                            
                        }
                        else{return 0;}
                    }
     
           catch (SQLException ex) {
                        Logger.getLogger(Clients.class.getName()).log(Level.SEVERE, null, ex);
           } return 0;
                    
      
      
}
     
     public void fillReservationInformationJTABLE(JTable table)
    {
      PreparedStatement ps;
      ResultSet      rs;
      String SelectQuery="SELECT * FROM clients,reservations WHERE clients.id=reservations.client_id";
                    try {
                        ps=myconnection.CreateConnection().prepareStatement(SelectQuery);
                        rs=ps.executeQuery();
                        DefaultTableModel tableModel =(DefaultTableModel)table.getModel();
                        
                        Object [] row;
                        while(rs.next())
                        {

                         row=new Object[11];
                         row[0]=rs.getInt(1);
                         row[1]=rs.getString(2);
                         row[2]=rs.getString(3);
                         row[3]=rs.getString(4);
                         row[4]=rs.getString(5);
                         row[5]=rs.getInt(6);
                         row[6]=rs.getInt(7);
                         row[7]=rs.getInt(8);
                         row[8]=rs.getString(9);
                         row[9]=rs.getString(10);
                         row[10]=rs.getInt(11);

                                 
                         tableModel.addRow(row);
                        }
                        
                        
                        
                    } catch (SQLException ex) {
                        Logger.getLogger(Clients.class.getName()).log(Level.SEVERE, null, ex);
                    }
     
     
}
}