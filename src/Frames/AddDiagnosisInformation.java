/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import javax.swing.JOptionPane;
import database.connectionProvider;
import java.sql.*;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Gautam Rawat
 */
public class AddDiagnosisInformation extends javax.swing.JFrame {
    boolean flage = false;

    /**
     * Creates new form AddDiagnosisInformation
     */
    public AddDiagnosisInformation() {
        initComponents();
        nexist.setVisible(false);
        combobox.setVisible(false);
        typeofward.setVisible(false);
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
        jLabel1 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        nexist = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        symptomps = new javax.swing.JTextField();
        dia = new javax.swing.JTextField();
        med = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        checkbox = new javax.swing.JCheckBox();
        typeofward = new javax.swing.JLabel();
        combobox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(590, 150));
        setMaximumSize(new java.awt.Dimension(800, 550));
        setMinimumSize(new java.awt.Dimension(800, 550));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(850, 600));
        setSize(new java.awt.Dimension(800, 550));

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 24)); // NOI18N
        jLabel1.setText("Patient ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 37, 130, 40));
        jPanel1.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 38, 129, 44));

        jButton1.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/search.png"))); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 35, -1, 44));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 125, 843, 42));

        nexist.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        nexist.setForeground(new java.awt.Color(255, 0, 0));
        nexist.setText("Patient Id does't exist");
        jPanel1.add(nexist, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 94, 243, 25));

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 24)); // NOI18N
        jLabel3.setText("Symptom's");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 223, 217, 43));

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 24)); // NOI18N
        jLabel4.setText("Diagnosis");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 287, 217, 43));

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 24)); // NOI18N
        jLabel5.setText("Medicines");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 359, 217, 43));

        symptomps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                symptompsActionPerformed(evt);
            }
        });
        jPanel1.add(symptomps, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 226, 236, 43));
        jPanel1.add(dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 287, 236, 43));
        jPanel1.add(med, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 359, 236, 43));

        jButton2.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/save-icon--1.png"))); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 140, 50));

        jButton3.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 24)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/Close.png"))); // NOI18N
        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 520, 150, 50));

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 24)); // NOI18N
        jLabel6.setText("Ward Required?");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 230, 221, 29));

        checkbox.setText("Yes");
        checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxActionPerformed(evt);
            }
        });
        jPanel1.add(checkbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(759, 238, 87, -1));

        typeofward.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        typeofward.setText("Type of Ward");
        jPanel1.add(typeofward, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 287, 143, 43));

        combobox.setFont(new java.awt.Font("HP Simplified Hans Light", 1, 14)); // NOI18N
        combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "Single", "Duo" }));
        jPanel1.add(combobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(704, 295, 97, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void symptompsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_symptompsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_symptompsActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int action = JOptionPane.showConfirmDialog(null,"Do you wants to cancel", "cancel",JOptionPane.YES_NO_OPTION);
        if(action==0)
        {
            setVisible(false);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxActionPerformed
        // TODO add your handling code here:
        boolean action = checkbox.isSelected();
        if(action)
        {
            combobox.setVisible(true);
            typeofward.setVisible(true);   
        }
        else
        {
            combobox.setVisible(false);
            typeofward.setVisible(false);
        }
        
    }//GEN-LAST:event_checkboxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String id = ID.getText();
        Connection Conn = connectionProvider.getConn();
        try
        {
            Statement stmt = Conn.createStatement();
            
            String sql = "Select * from patient where patientID='"+id+"';";
            System.out.println(sql);
            ResultSet rs = stmt.executeQuery(sql);
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            if(!rs.first())
            {
                nexist.setVisible(true);
            }
            else
            {
                nexist.setVisible(false);
                ID.setEditable(false);
                flage = true;
            }
        }
        catch(Exception e)
        {
                 JOptionPane.showMessageDialog(null,"Not record!");
        }
            
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(flage)
        {
            String ID1 = ID.getText();
            String symptom = symptomps.getText();
            String diagnosis = dia.getText();
            String medicine  = med.getText();
            String wardReq;
            String typeWard;
            if(checkbox.isSelected())
            {
                wardReq = "YES";
                typeWard = (String)combobox.getSelectedItem();
            }
            else
            {
                wardReq = "NO";
                typeWard = "Nothing";
            }
            try
            {
                Connection conn = connectionProvider.getConn();
                Statement  stmt = conn.createStatement();
                String sql = "INSERT INTO PATIENTREPORT VALUES('"+ID1+"','"+symptom+"','"+diagnosis+"','"+medicine+"','"+wardReq+"','"+typeWard+"');";
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Recorded Successfully.");
                setVisible(false);
                new AddDiagnosisInformation().setVisible(true);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Not Recorded");
            }
        }
                
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AddDiagnosisInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDiagnosisInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDiagnosisInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDiagnosisInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDiagnosisInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JCheckBox checkbox;
    private javax.swing.JComboBox<String> combobox;
    private javax.swing.JTextField dia;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField med;
    private javax.swing.JLabel nexist;
    private javax.swing.JTextField symptomps;
    private javax.swing.JLabel typeofward;
    // End of variables declaration//GEN-END:variables
}
