/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author mokhtar
 */
public class AttendancePage extends javax.swing.JFrame {

    /**
     * Creates new form AttendancePage
     */
    public AttendancePage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        id_txt = new javax.swing.JTextField();
        p_btn = new javax.swing.JButton();
        a_btn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Enter Student id");

        id_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_txtActionPerformed(evt);
            }
        });

        p_btn.setText("Present");
        p_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_btnActionPerformed(evt);
            }
        });

        a_btn.setText("Absent");
        a_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_btnActionPerformed(evt);
            }
        });

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(p_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a_btn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(id_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p_btn)
                    .addComponent(a_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_txtActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        HMS.admin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void p_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_btnActionPerformed
        Student s;
        StudentList stList = new StudentList();
        
        try {
                File myObj = new File("students.txt");
                Scanner reader = new Scanner(myObj);
                 while (reader.hasNextLine()) {
                     String id = reader.nextLine();
                     String name = reader.nextLine();
                     String usr = reader.nextLine();
                     String pas = reader.nextLine();
                     String present = reader.nextLine();
                     String absent = reader.nextLine();
                     s = new Student(name, usr, pas, id, Integer.parseInt(present), Integer.parseInt(absent));
                     stList.insert(s);
                  }
                  reader.close();
                  
                  if(stList.setAttendance(id_txt.getText(), true)){
                      JOptionPane.showMessageDialog(rootPane, "Attendance has been recorded", null,JOptionPane.INFORMATION_MESSAGE);
                  }else{
                      JOptionPane.showMessageDialog(rootPane, "Wrong id !", null,JOptionPane.WARNING_MESSAGE);
                  }
                  HMS.writeToFile(stList.toString());
                 
                  
                  
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred.");
                     e.printStackTrace();
                }
    }//GEN-LAST:event_p_btnActionPerformed

    private void a_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_btnActionPerformed
        Student s;
        StudentList stList = new StudentList();
        
        try {
                File myObj = new File("students.txt");
                Scanner reader = new Scanner(myObj);
                 while (reader.hasNextLine()) {
                     String id = reader.nextLine();
                     String name = reader.nextLine();
                     String usr = reader.nextLine();
                     String pas = reader.nextLine();
                     String present = reader.nextLine();
                     String absent = reader.nextLine();
                     s = new Student(name, usr, pas, id, Integer.parseInt(present), Integer.parseInt(absent));
                     stList.insert(s);
                  }
                  reader.close();
                  
                  if(stList.setAttendance(id_txt.getText(), false)){
                      JOptionPane.showMessageDialog(rootPane, "Attendance has been recorded", null,JOptionPane.INFORMATION_MESSAGE);
                  }else{
                      JOptionPane.showMessageDialog(rootPane, "Wrong id !", null,JOptionPane.WARNING_MESSAGE);
                  }
                  HMS.writeToFile(stList.toString());
                 
                  
                  
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred.");
                     e.printStackTrace();
                }
    }//GEN-LAST:event_a_btnActionPerformed

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
            java.util.logging.Logger.getLogger(AttendancePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AttendancePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AttendancePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AttendancePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AttendancePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton a_btn;
    private javax.swing.JTextField id_txt;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton p_btn;
    // End of variables declaration//GEN-END:variables
}
