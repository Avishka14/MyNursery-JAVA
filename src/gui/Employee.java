/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import com.formdev.flatlaf.FlatDarkLaf;
import java.sql.ResultSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.MySQL;

/**
 *
 * @author Avishka
 */
public class Employee extends javax.swing.JFrame {

    /**
     * Creates new form Employee
     */
    public Employee() {
        initComponents();
        TableLoad();
        jButton7.setVisible(false);
    }

    
    
      private void ResetField(){
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        buttonGroup1.clearSelection();
       
    }
    
   
     
    private void TableLoad(){
        
        try {            
            ResultSet resultSet = MySQL.executeSearch("SELECT * FROM `employee` INNER JOIN `gender` ON `employee`.`gender_id`=`gender`.`id`");
            
            DefaultTableModel DefTab = (DefaultTableModel)jTable1.getModel();
            DefTab.setRowCount(0);
            
            while(resultSet.next()){
                
                Vector vector = new Vector();
                vector.add(resultSet.getString("first_name"));
                vector.add(resultSet.getString("last_name"));
                vector.add(resultSet.getString("nic"));
                vector.add(resultSet.getString("address"));
                vector.add(resultSet.getString("contact"));
                vector.add(resultSet.getString("position"));
                vector.add(resultSet.getString("gender.name"));
                
                DefTab.addRow(vector);              
                
            }
            
            jTable1.setModel(DefTab);
            
            
            
        } catch (Exception e) {
          e.printStackTrace();
        }
         
    }  
      

      
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField6 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Management");

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Employee Management");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 25, 286, 59));

        jLabel2.setText("First Name");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 90, 145, -1));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 112, 248, -1));

        jLabel4.setText("Last Name");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 144, -1, -1));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 166, 248, -1));

        jLabel5.setText("NIC");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 198, -1, -1));
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 220, 248, -1));

        jLabel6.setText("Address");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 252, -1, -1));
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 274, 248, -1));

        jLabel7.setText("Contact");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 306, -1, -1));
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 328, 248, -1));

        jLabel10.setText("Position");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 362, 79, -1));
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 433, 250, -1));

        jLabel8.setText("Gender");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 416, -1, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Male");
        jRadioButton1.setActionCommand("1");
        jPanel2.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 439, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Female");
        jRadioButton2.setActionCommand("2");
        jPanel2.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 439, -1, -1));

        jButton1.setText("Add New");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 472, -1, -1));

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 472, -1, -1));

        jButton3.setText("Remove");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 472, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "NIC", "Address", "Contact", "Position", "Gender"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 472, 558, 60));
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 384, 245, -1));

        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 433, 84, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "NIC", "Address", "Contact", "Position", "Gender"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 112, 562, 266));

        jLabel9.setText("Find Employee with NIC");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 411, 136, -1));

        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 505, 83, -1));

        jButton6.setText("Teacher Management");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 505, 162, -1));

        jButton7.setText("Enter New Data");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 80, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 925, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
        Student stu = new Student();
        stu.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Teacher teach = new Teacher();
        teach.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String first_name = jTextField1.getText();
        String last_name = jTextField2.getText();
        String nic = jTextField3.getText();
        String address = jTextField4.getText();
        String contact = jTextField5.getText();
        String position = jTextField6.getText();
        ButtonModel gender = buttonGroup1.getSelection();
        
          
        if(first_name.isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter Your First Name", "Alert", JOptionPane.ERROR_MESSAGE);
            jTextField1.grabFocus();
        }else if(last_name.isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter Your Last Name", "Alert", JOptionPane.ERROR_MESSAGE);
            jTextField2.grabFocus();
        }else if(nic.isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter Your NIC", "Alert", JOptionPane.ERROR_MESSAGE);
            jTextField3.grabFocus();
        }else if(address.isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter Your Address", "Alert", JOptionPane.ERROR_MESSAGE);
            jTextField4.grabFocus();
        }else if(contact.isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter Your Contact Number", "Alert", JOptionPane.ERROR_MESSAGE);
            jTextField5.grabFocus();
        }else if(contact.length() >10){
            JOptionPane.showMessageDialog(this, "Invalid number", "Alert", JOptionPane.ERROR_MESSAGE);
            jTextField5.grabFocus();
        }else if(position.isEmpty()){
             JOptionPane.showMessageDialog(this, "Enter Your Position", "Alert", JOptionPane.ERROR_MESSAGE);
            jTextField6.grabFocus();
        }else if(gender == null){
           JOptionPane.showMessageDialog(this, "Select Your Gender", "Alert", JOptionPane.ERROR_MESSAGE);  
           
        }else {
           
              String SelectedGender = gender.getActionCommand();
              
              try {
                
                  Integer insert = MySQL.executeIUD("INSERT INTO `employee` (`first_name`,`last_name`,`nic`,`address`,`contact`,`position`,`gender_id`) "
                         + "   VALUES ('"+first_name+"','"+last_name+"','"+nic+"','"+address+"','"+contact+"','"+position+"','"+SelectedGender+"') ");
                  ResetField();
                  TableLoad();
                  JOptionPane.showMessageDialog(this, "Registration Success ", "Success", JOptionPane.PLAIN_MESSAGE);
                  
                  
            } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Internal Error Appeared Please Try Again Error"+e, "Error", JOptionPane.ERROR_MESSAGE);
            }
              
              
    }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           
             String nic =  jTextField3.getText();
             
             if(nic.isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter Your NIC to Update Data !", "Alert", JOptionPane.ERROR_MESSAGE);
            jTextField3.grabFocus();    
             }else{
                 
                 try {
                     ResultSet resultSet = MySQL.executeSearch("SELECT * FROM `employee` WHERE `nic`='"+nic+"'");
                       
                      if(resultSet.next()){
                          
                          jTextField1.setText(resultSet.getString("first_name"));
                          jTextField2.setText(resultSet.getString("last_name"));
                          jTextField4.setText(resultSet.getString("address"));
                          jTextField5.setText(resultSet.getString("contact"));
                          jTextField6.setText(resultSet.getString("position"));
                          
                          String gender = String.valueOf(resultSet.getInt("gender_id"));
                         if(gender.equals("1")){
                             jRadioButton1.setSelected(true);
                         }else{
                             jRadioButton2.setSelected(true);
                         }
                          
                         jTextField3.disable();
                         jButton1.setVisible(false);
                         jButton7.setVisible(true);
                                                               
                      }else{
                           JOptionPane.showMessageDialog(this, "Invalid NIC Or Employee Doesn't Exists !", "Alert", JOptionPane.ERROR_MESSAGE);
                           jTextField3.grabFocus();  
                      }
                     
                     
                     
                 } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Internal Error Appeared Please Try Again Error"+e, "Error", JOptionPane.ERROR_MESSAGE);
                 }
                 
                 
                 
             }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       
        String first_name = jTextField1.getText();
        String last_name = jTextField2.getText();
        String nic = jTextField3.getText();
        String address = jTextField4.getText();
        String contact = jTextField5.getText();
        String position = jTextField6.getText();
        ButtonModel gender = buttonGroup1.getSelection();
        
          
        if(first_name.isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter Your First Name", "Alert", JOptionPane.ERROR_MESSAGE);
            jTextField1.grabFocus();
        }else if(last_name.isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter Your Last Name", "Alert", JOptionPane.ERROR_MESSAGE);
            jTextField2.grabFocus();
        }else if(nic.isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter Your NIC", "Alert", JOptionPane.ERROR_MESSAGE);
            jTextField3.grabFocus();
        }else if(address.isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter Your Address", "Alert", JOptionPane.ERROR_MESSAGE);
            jTextField4.grabFocus();
        }else if(contact.isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter Your Contact Number", "Alert", JOptionPane.ERROR_MESSAGE);
            jTextField5.grabFocus();
        }else if(contact.length() >10){
            JOptionPane.showMessageDialog(this, "Invalid number", "Alert", JOptionPane.ERROR_MESSAGE);
            jTextField5.grabFocus();
        }else if(position.isEmpty()){
             JOptionPane.showMessageDialog(this, "Enter Your Position", "Alert", JOptionPane.ERROR_MESSAGE);
            jTextField6.grabFocus();
        }else if(gender == null){
           JOptionPane.showMessageDialog(this, "Select Your Gender", "Alert", JOptionPane.ERROR_MESSAGE);  
           
        }else {
           
              String SelectedGender = gender.getActionCommand();
             
              try {
                
              Integer update = MySQL.executeIUD("UPDATE `employee` SET `first_name`='"+first_name+"', `last_name`='"+last_name+"', "
                      + " `nic`='"+nic+"', `address`='"+address+"', `contact`='"+contact+"', `position`='"+position+"', `gender_id`='"+SelectedGender+"' ");
                  
                  jTextField3.enable();
                  jButton7.setVisible(false);
                  jButton1.setVisible(true);
                  ResetField();
                  TableLoad();
                  JOptionPane.showMessageDialog(this, "Update Success !", "Success", JOptionPane.PLAIN_MESSAGE);
                  
                  
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Internal Error Appeared Please Try Again Error"+e, "Error", JOptionPane.ERROR_MESSAGE);
            }
              
                           
        }
            
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
        String nic =  jTextField3.getText();
      
        if(nic.isEmpty()){
           JOptionPane.showMessageDialog(this, "Enter Your NIC to Update Data !", "Alert", JOptionPane.ERROR_MESSAGE);
            jTextField3.grabFocus();    
      }else{
           
            try {
                
                ResultSet search = MySQL.executeSearch("SELECT * FROM `employee` WHERE `nic`='"+nic+"' ");
                
                if(search.next()){
                    
                   Integer delete = MySQL.executeIUD("DELETE FROM `employee` WHERE `nic`='"+nic+"' ");
                   TableLoad();
                   ResetField();
                   JOptionPane.showMessageDialog(this, "Remove Success !", "Success", JOptionPane.PLAIN_MESSAGE);
                    
                    
                    
                }else{
                    JOptionPane.showMessageDialog(this, "Invalid NIC Number or Employee Doesn't Exists !", "Alert", JOptionPane.ERROR_MESSAGE);
                }
                
                
            } catch (Exception e) {
              JOptionPane.showMessageDialog(this, "Internal Error Appeared Please Try Again Error"+e, "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            
           
            
            
        }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
       String nic = jTextField7.getText();
       
       if(nic.isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter Your NIC to Find!", "Alert", JOptionPane.ERROR_MESSAGE);
            jTextField3.grabFocus();    
       }else{
           
           try {
               
               ResultSet search = MySQL.executeSearch("SELECT * FROM `employee` INNER JOIN `gender`  ON `employee`.`gender_id`= `gender`.`id`"
                       + "  WHERE `nic`='"+nic+"' ");
               if(search.next()){
                   
                   DefaultTableModel defTab = (DefaultTableModel)jTable2.getModel();
                   defTab.setRowCount(0);
                   
                   Vector vector = new Vector();
                    vector.add(search.getString("first_name"));
                    vector.add(search.getString("last_name"));
                    vector.add(search.getString("nic"));
                    vector.add(search.getString("address"));
                    vector.add(search.getString("contact"));
                    vector.add(search.getString("position"));
                    vector.add(search.getString("gender.name"));
                    
                    defTab.addRow(vector);
                    jTable2.setModel(defTab);
                     
               }else{
                    JOptionPane.showMessageDialog(this, "Invalid NIC Number or Employee Doesn't Exists !", "Alert", JOptionPane.ERROR_MESSAGE);
               }
               
               
           } catch (Exception e) {
           JOptionPane.showMessageDialog(this, "Internal Error Appeared Please Try Again Error"+e, "Error", JOptionPane.ERROR_MESSAGE);
           }        
           
       }
        
                     
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatDarkLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
