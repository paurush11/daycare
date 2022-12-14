/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neu.edu.csye6200.views;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author 
 */
public class PanelAddTeacher extends javax.swing.JPanel {

    /**
     * Creates new form AddTeacherJPanel
     */
    public PanelAddTeacher() {
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

        lblTeacherFirstName = new javax.swing.JLabel();
        lblTeacherLastName = new javax.swing.JLabel();
        txtTeacherFirstName = new javax.swing.JTextField();
        txtTeacherLastName = new javax.swing.JTextField();
        btnAddTeacher = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 255));
        setRequestFocusEnabled(false);

        lblTeacherFirstName.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblTeacherFirstName.setForeground(new java.awt.Color(251, 243, 228));
        lblTeacherFirstName.setText("First Name");

        lblTeacherLastName.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblTeacherLastName.setForeground(new java.awt.Color(251, 243, 228));
        lblTeacherLastName.setText("Last Name:");

        txtTeacherFirstName.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N

        btnAddTeacher.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        btnAddTeacher.setForeground(new java.awt.Color(204, 0, 0));
        btnAddTeacher.setText("Add New Teacher");

        lblTitle.setFont(new java.awt.Font("Charter", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(251, 243, 228));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("ADD TEACHER");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTeacherFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTeacherLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddTeacher)
                    .addComponent(txtTeacherLastName)
                    .addComponent(txtTeacherFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(383, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtTeacherFirstName, txtTeacherLastName});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTeacherFirstName)
                    .addComponent(txtTeacherFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTeacherLastName)
                    .addComponent(txtTeacherLastName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(407, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblTeacherFirstName, lblTeacherLastName, txtTeacherFirstName, txtTeacherLastName});

    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnAdd() {
        return btnAddTeacher;
    }

    public void setBtnAdd(JButton btnAdd) {
        this.btnAddTeacher = btnAdd;
    }

    public JTextField getTxtFieldFName() {
        return txtTeacherFirstName;
    }

    public void setTxtFieldFName(JTextField txtFieldFName) {
        this.txtTeacherFirstName = txtFieldFName;
    }

    public JTextField getTxtFieldLName() {
        return txtTeacherLastName;
    }

    public void setTxtFieldLName(JTextField txtFieldLName) {
        this.txtTeacherLastName = txtFieldLName;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddTeacher;
    private javax.swing.JLabel lblTeacherFirstName;
    private javax.swing.JLabel lblTeacherLastName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtTeacherFirstName;
    private javax.swing.JTextField txtTeacherLastName;
    // End of variables declaration//GEN-END:variables
}
