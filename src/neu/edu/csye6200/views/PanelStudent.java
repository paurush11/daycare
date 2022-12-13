/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neu.edu.csye6200.views;

import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

/**
 *
 * @author 
 */
public class PanelStudent extends javax.swing.JPanel {

    /**
     * Creates new form PanelStudent
     */
    private PanelUpdateStudent updateStudentJPanel;
    private PanelAddStudent addStudentJPanel;
    private JPanel userProcessControllerJPanel;
    public PanelStudent(JPanel userProcessControllerJPanel) {
        initComponents();
        this.userProcessControllerJPanel = userProcessControllerJPanel;
    }

  
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        lblStudentId = new javax.swing.JLabel();
        txtStudentId = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JToggleButton();
        btnAddNewStudent = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(75, 101, 132));

        lblStudentId.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblStudentId.setForeground(new java.awt.Color(251, 243, 228));
        lblStudentId.setText("Student Id:");

        txtStudentId.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N

        btnUpdate.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(204, 0, 0));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnAddNewStudent.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        btnAddNewStudent.setForeground(new java.awt.Color(204, 0, 0));
        btnAddNewStudent.setText("Add New Student");
        btnAddNewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewStudentActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Charter", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(251, 243, 228));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("STUDENT INFO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(lblStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddNewStudent)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStudentId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdate)
                .addGap(12, 12, 12)
                .addComponent(btnAddNewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(234, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddNewStudent, btnUpdate, lblStudentId, txtStudentId});

    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddNewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewStudentActionPerformed
       
    }//GEN-LAST:event_btnAddNewStudentActionPerformed
    public void updateStudent(){
       updateStudentJPanel = new PanelUpdateStudent(userProcessControllerJPanel);
       userProcessControllerJPanel.add("UpdateStudentJPanel",updateStudentJPanel);
       CardLayout layout = (CardLayout) userProcessControllerJPanel.getLayout();
       layout.next(userProcessControllerJPanel);
    }
    public void addStudent(){
       addStudentJPanel = new PanelAddStudent();
       userProcessControllerJPanel.add("addStudentJPanel",addStudentJPanel);
       CardLayout layout = (CardLayout) userProcessControllerJPanel.getLayout();
       layout.next(userProcessControllerJPanel);
    }
    public JTextField getTxtFieldStudentId() {
        return txtStudentId;
    }

    public void setTxtFieldStudentId(JTextField txtFieldStudentId) {
        this.txtStudentId = txtFieldStudentId;
    }

    public JToggleButton getUpdateStudentBtn() {
        return btnUpdate;
    }

    public void setUpdateStudentBtn(JToggleButton updateStudentBtn) {
        this.btnUpdate = updateStudentBtn;
    }

    public PanelUpdateStudent getUpdateStudentJPanel() {
        return updateStudentJPanel;
    }

    public void setUpdateStudentJPanel(PanelUpdateStudent updateStudentJPanel) {
        this.updateStudentJPanel = updateStudentJPanel;
    }

    public JPanel getUserProcessControllerJPanel() {
        return userProcessControllerJPanel;
    }

    public void setUserProcessControllerJPanel(JPanel userProcessControllerJPanel) {
        this.userProcessControllerJPanel = userProcessControllerJPanel;
    }

    public JButton getBtnAddStudent() {
        return btnAddNewStudent;
    }

    public PanelAddStudent getAddStudentJPanel() {
        return addStudentJPanel;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewStudent;
    private javax.swing.JToggleButton btnUpdate;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel lblStudentId;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtStudentId;
    // End of variables declaration//GEN-END:variables
}
