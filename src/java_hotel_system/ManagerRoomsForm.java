/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_hotel_system;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Falcao
 */
public class ManagerRoomsForm extends javax.swing.JFrame {

    /**
     * Creates new form ManagerRoomsForm
     */
    public ManagerRoomsForm() {
        initComponents();
        ROOMS room=new ROOMS ();
        room.fillRooms_TYPE_JCOMBOBOX(jComboBoxType);
        room.fillRoomsTYPEJTABLE(jTable1);
        jTable1.setRowHeight(40);
        ButtonGroup bg=new ButtonGroup();
        bg.add(jRadioButtonYes);
        bg.add(jRadioButtonNo);
                        this.setTitle("ManagerRoomsForm");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldPHONE = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonADDRoom = new javax.swing.JButton();
        jButtonEDITRooms = new javax.swing.JButton();
        jButtonREMOVERooms = new javax.swing.JButton();
        jButtonCLEARFIELDS = new javax.swing.JButton();
        jButtonRefresh = new javax.swing.JButton();
        jComboBoxType = new javax.swing.JComboBox<>();
        jButtonShowRoomType = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jRadioButtonYes = new javax.swing.JRadioButton();
        jRadioButtonNo = new javax.swing.JRadioButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        jPanel4.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 44)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Rooms");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(328, 328, 328)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Number:");

        jTextFieldNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Type:");

        jTextFieldPHONE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Phone:");

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "Type", "Phone", "Reserved"
            }
        )

        {public boolean iscelledittable(int row , int column){return false;}}

    );
    jTable1.setGridColor(new java.awt.Color(255, 255, 51));
    jTable1.setSelectionBackground(new java.awt.Color(0, 102, 51));
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTable1MouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(jTable1);

    jButtonADDRoom.setBackground(new java.awt.Color(255, 255, 0));
    jButtonADDRoom.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
    jButtonADDRoom.setText("Add New Rooms");
    jButtonADDRoom.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    jButtonADDRoom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButtonADDRoom.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonADDRoomActionPerformed(evt);
        }
    });

    jButtonEDITRooms.setBackground(new java.awt.Color(255, 255, 0));
    jButtonEDITRooms.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
    jButtonEDITRooms.setText("Edit");
    jButtonEDITRooms.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    jButtonEDITRooms.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButtonEDITRooms.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonEDITRoomsActionPerformed(evt);
        }
    });

    jButtonREMOVERooms.setBackground(new java.awt.Color(255, 255, 0));
    jButtonREMOVERooms.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
    jButtonREMOVERooms.setText("Remove");
    jButtonREMOVERooms.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    jButtonREMOVERooms.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButtonREMOVERooms.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonREMOVERoomsActionPerformed(evt);
        }
    });

    jButtonCLEARFIELDS.setBackground(new java.awt.Color(255, 0, 0));
    jButtonCLEARFIELDS.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
    jButtonCLEARFIELDS.setForeground(new java.awt.Color(255, 255, 255));
    jButtonCLEARFIELDS.setText("Clear Fields");
    jButtonCLEARFIELDS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    jButtonCLEARFIELDS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButtonCLEARFIELDS.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonCLEARFIELDSActionPerformed(evt);
        }
    });

    jButtonRefresh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jButtonRefresh.setText("Refresh");
    jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonRefreshActionPerformed(evt);
        }
    });

    jComboBoxType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

    jButtonShowRoomType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jButtonShowRoomType.setText("Show Type");
    jButtonShowRoomType.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonShowRoomTypeActionPerformed(evt);
        }
    });

    jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(255, 255, 255));
    jLabel6.setText("Reserved:");

    jRadioButtonYes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jRadioButtonYes.setForeground(new java.awt.Color(153, 0, 153));
    jRadioButtonYes.setText("Yes");

    jRadioButtonNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jRadioButtonNo.setForeground(new java.awt.Color(153, 0, 153));
    jRadioButtonNo.setText("No");

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jRadioButtonYes)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
            .addComponent(jRadioButtonNo)
            .addGap(25, 25, 25))
    );
    jPanel5Layout.setVerticalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jRadioButtonNo)
                .addComponent(jRadioButtonYes))
            .addGap(19, 19, 19))
    );

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonShowRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButtonADDRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jButtonEDITRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonREMOVERooms, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonCLEARFIELDS, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE))))
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6)
                        .addComponent(jLabel5))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldPHONE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE)))))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addComponent(jButtonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18))))
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGap(34, 34, 34)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jButtonShowRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(29, 29, 29)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldPHONE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jLabel6)))
                    .addGap(133, 133, 133)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonREMOVERooms, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonADDRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonEDITRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jButtonCLEARFIELDS, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(29, 29, 29)
                    .addComponent(jButtonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(28, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        
         DefaultTableModel model =(DefaultTableModel)jTable1.getModel();
    int rIndex=jTable1.getSelectedRow();
    jTextFieldNumber.setText(model.getValueAt(rIndex, 0).toString());
   jComboBoxType.setSelectedItem(model.getValueAt(rIndex, 1).toString());
    jTextFieldPHONE.setText(model.getValueAt(rIndex, 2).toString());
    String isReserved=model.getValueAt(rIndex, 3).toString();
    if(isReserved.equals("Yes"))
    {
      jRadioButtonYes.setSelected(true);
    
    } else if(isReserved.equals("No"))
    {
            jRadioButtonNo.setSelected(true);

    }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonADDRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonADDRoomActionPerformed
  try{
      ROOMS room=new ROOMS();
     int roomnumber=Integer.valueOf(jTextFieldNumber.getText());
     int roomtype=Integer.valueOf(jComboBoxType.getSelectedItem().toString());
      String phone=jTextFieldPHONE.getText();
   if(room.addRooms(roomnumber, roomtype, phone))
   {
   
          JOptionPane.showMessageDialog(rootPane, " New Room Added Successfully", "Add Room", JOptionPane.INFORMATION_MESSAGE);

   
   }else
   {
   
          JOptionPane.showMessageDialog(rootPane, " Room Not Added", "Add Room Error", JOptionPane.ERROR_MESSAGE);

   }
  } 
  catch(NumberFormatException ex)
        {
       JOptionPane.showMessageDialog(rootPane, ex.getMessage()+"Enter the Room Number", "Room Number Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButtonADDRoomActionPerformed

    private void jButtonEDITRoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEDITRoomsActionPerformed
 ROOMS room=new ROOMS();
        int roomNumber=0;
  int type=Integer.valueOf(jComboBoxType.getSelectedItem().toString());
  String phone=jTextFieldPHONE.getText();
  String isReserved="No";
  
  if(jRadioButtonYes.isSelected())
  {
   isReserved="Yes";
  
  
  }
    if(phone.trim().equals("")  )
    {
    
           JOptionPane.showMessageDialog(rootPane, "Enter the Room phone Number", "Empty Field", JOptionPane.WARNING_MESSAGE);

    }
    else{
        try{
         roomNumber=Integer.valueOf(jTextFieldNumber.getText());
            if(    room. editRoom(roomNumber,type, phone, isReserved))
    {
       JOptionPane.showMessageDialog(rootPane, " Rooom Data Updated Successfully", "Add Room", JOptionPane.INFORMATION_MESSAGE);
    }
    else {
             JOptionPane.showMessageDialog(rootPane, " Room Data Not Updated", "Room  Error", JOptionPane.ERROR_MESSAGE);

    
    }
        }
        catch(NumberFormatException ex)
        {
       JOptionPane.showMessageDialog(rootPane, ex.getMessage()+"Enter the Room ID", "Room Number Error", JOptionPane.ERROR_MESSAGE);
        }
        
    
    
    
    }         

    }//GEN-LAST:event_jButtonEDITRoomsActionPerformed

    private void jButtonREMOVERoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonREMOVERoomsActionPerformed

         ROOMS room=new ROOMS();

        
          try{
     int   roomNumber=Integer.valueOf(jTextFieldNumber.getText());
            if(room.removeRoom(roomNumber))
    {
       JOptionPane.showMessageDialog(rootPane, " Room Removed Successfully", "Remove Room", JOptionPane.INFORMATION_MESSAGE);
    }
    else {
             JOptionPane.showMessageDialog(rootPane, " Room  Not Removed", "Remove Room Error", JOptionPane.ERROR_MESSAGE);

    
    }
        }
        catch(NumberFormatException ex)
        {
       JOptionPane.showMessageDialog(rootPane, ex.getMessage()+"Enter the Room Number", "Room Number Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButtonREMOVERoomsActionPerformed

    private void jButtonCLEARFIELDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCLEARFIELDSActionPerformed
 jTextFieldNumber.setText("");
        jTextFieldPHONE.setText("");
jComboBoxType.setSelectedIndex(0);
       
jRadioButtonNo.setSelected(true);

        
    }//GEN-LAST:event_jButtonCLEARFIELDSActionPerformed

    private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshActionPerformed
 ROOMS room=new ROOMS();
        
         jTable1.setModel(new DefaultTableModel(null,new Object[]{"Number","Type","Phone","Reserved"}));

        room.fillRoomsTYPEJTABLE(jTable1);
    }//GEN-LAST:event_jButtonRefreshActionPerformed

    private void jButtonShowRoomTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowRoomTypeActionPerformed

ALL_ROOMS_TYPE_FORM all_room_type=new ALL_ROOMS_TYPE_FORM();
all_room_type.setVisible(true);
all_room_type.pack();
all_room_type.setLocationRelativeTo(null);
all_room_type.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_jButtonShowRoomTypeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManagerRoomsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerRoomsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerRoomsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerRoomsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerRoomsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonADDRoom;
    private javax.swing.JButton jButtonCLEARFIELDS;
    private javax.swing.JButton jButtonEDITRooms;
    private javax.swing.JButton jButtonREMOVERooms;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JButton jButtonShowRoomType;
    private javax.swing.JComboBox<String> jComboBoxType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButtonNo;
    private javax.swing.JRadioButton jRadioButtonYes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldNumber;
    private javax.swing.JTextField jTextFieldPHONE;
    // End of variables declaration//GEN-END:variables
}
