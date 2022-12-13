/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neu.edu.csye6200.views;

import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author 
 */
public class PanelUpdateStudent extends javax.swing.JPanel {

    /**
     * Creates new form PanelUpdateStudent
     */
     private JPanel userProcessControllerJPanel;
    private PanelAddImmnunization addImmunJPanel;
    private PanelUpdateImmuization updateImmunJPanel;
    public PanelUpdateStudent(JPanel userProcessControllerJPanel) {
        this.userProcessControllerJPanel = userProcessControllerJPanel;
        initComponents();
    }
    public void addImmunization(){
       addImmunJPanel = new PanelAddImmnunization();
       userProcessControllerJPanel.add("AddImmunizationJPanel",addImmunJPanel);
       CardLayout layout = (CardLayout) userProcessControllerJPanel.getLayout();
       layout.next(userProcessControllerJPanel);
    }
    public void updateImmunization(){
       updateImmunJPanel = new PanelUpdateImmuization();
       userProcessControllerJPanel.add("updateImmunizationJPanel",updateImmunJPanel);
       CardLayout layout = (CardLayout) userProcessControllerJPanel.getLayout();
       layout.next(userProcessControllerJPanel);
    }

    public PanelAddImmnunization getAddImmunJPanel() {
        return addImmunJPanel;
    }

    public void setAddImmunJPanel(PanelAddImmnunization addImmunJPanel) {
        this.addImmunJPanel = addImmunJPanel;
    }

    public PanelUpdateImmuization getUpdateImmunJPanel() {
        return updateImmunJPanel;
    }

    public void setUpdateImmunJPanel(PanelUpdateImmuization updateImmunJPanel) {
        this.updateImmunJPanel = updateImmunJPanel;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblParentName = new javax.swing.JLabel();
        lblParentEmail = new javax.swing.JLabel();
        lblStudentId = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtParentName = new javax.swing.JTextField();
        txtParentEmail = new javax.swing.JTextField();
        txtStudentId = new javax.swing.JTextField();
        btnUpdateStudent = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblImmunInfo = new javax.swing.JTable();
        btnUpdateImmun = new javax.swing.JButton();
        btnDeleteImmun = new javax.swing.JButton();
        btnAddImmun = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblTitle2 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setBackground(new java.awt.Color(0, 102, 204));

        lblFirstName.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblFirstName.setForeground(new java.awt.Color(251, 243, 228));
        lblFirstName.setText("First Name:");

        lblLastName.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblLastName.setForeground(new java.awt.Color(251, 243, 228));
        lblLastName.setText("Last Name:");

        lblAge.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblAge.setForeground(new java.awt.Color(251, 243, 228));
        lblAge.setText("Age:");

        lblParentName.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblParentName.setForeground(new java.awt.Color(251, 243, 228));
        lblParentName.setText("Parent Name:");

        lblParentEmail.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblParentEmail.setForeground(new java.awt.Color(251, 243, 228));
        lblParentEmail.setText("Parent Email:");

        lblStudentId.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblStudentId.setForeground(new java.awt.Color(251, 243, 228));
        lblStudentId.setText("Student Id:");

        txtFirstName.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N

        txtAge.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N

        txtLastName.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N

        txtParentName.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        txtParentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParentNameActionPerformed(evt);
            }
        });

        txtParentEmail.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N

        txtStudentId.setEditable(false);
        txtStudentId.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        txtStudentId.setToolTipText("ID cant be changed");

        btnUpdateStudent.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        btnUpdateStudent.setForeground(new java.awt.Color(204, 0, 0));
        btnUpdateStudent.setText("Update");

        jScrollPane2.setForeground(new java.awt.Color(251, 243, 228));

        tblImmunInfo.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        tblImmunInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Immun Name", "Immun ID", "Duration", "Status", "Immunization Anniversary"
            }
        ));
        jScrollPane2.setViewportView(tblImmunInfo);
        if (tblImmunInfo.getColumnModel().getColumnCount() > 0) {
            tblImmunInfo.getColumnModel().getColumn(4).setResizable(false);
        }

        btnUpdateImmun.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        btnUpdateImmun.setForeground(new java.awt.Color(204, 0, 0));
        btnUpdateImmun.setText("Update Immunization");

        btnDeleteImmun.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        btnDeleteImmun.setForeground(new java.awt.Color(204, 0, 0));
        btnDeleteImmun.setText("Delete Immunization");

        btnAddImmun.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        btnAddImmun.setForeground(new java.awt.Color(204, 0, 0));
        btnAddImmun.setText("Add Immunization");
        btnAddImmun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddImmunActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Charter", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(251, 243, 228));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("UPDATE STUDENT");

        lblTitle2.setFont(new java.awt.Font("Charter", 1, 24)); // NOI18N
        lblTitle2.setForeground(new java.awt.Color(251, 243, 228));
        lblTitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle2.setText("IMMUNIZATION INFO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(btnUpdateImmun)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeleteImmun)
                                .addGap(18, 18, 18)
                                .addComponent(btnAddImmun))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblParentName, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                    .addComponent(lblStudentId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblParentEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFirstName)
                                    .addComponent(txtAge, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                    .addComponent(txtLastName)
                                    .addComponent(txtParentName)
                                    .addComponent(txtParentEmail)
                                    .addComponent(txtStudentId)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(334, 334, 334)
                                .addComponent(btnUpdateStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblAge, lblFirstName, lblLastName, lblParentEmail, lblParentName, lblStudentId});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAge, txtFirstName, txtLastName, txtParentEmail, txtParentName, txtStudentId});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAge)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(lblParentName))
                    .addComponent(txtParentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblParentEmail)
                    .addComponent(txtParentEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStudentId)
                    .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(btnUpdateStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateImmun)
                    .addComponent(btnDeleteImmun)
                    .addComponent(btnAddImmun))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblAge, lblFirstName, lblLastName, lblParentEmail, lblParentName, lblStudentId, txtAge, txtFirstName, txtLastName, txtParentEmail, txtParentName, txtStudentId});

    }// </editor-fold>//GEN-END:initComponents

    private void txtParentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParentNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtParentNameActionPerformed

    private void btnAddImmunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddImmunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddImmunActionPerformed

    public JTable getTblImmunInfo() {
        return tblImmunInfo;
    }

    public void setTblImmunInfo(JTable tblImmunInfo) {
        this.tblImmunInfo = tblImmunInfo;
    }

    public JTextField getTxtFieldAge() {
        return txtAge;
    }

    public void setTxtFieldAge(JTextField txtFieldAge) {
        this.txtAge = txtFieldAge;
    }

    public JTextField getTxtFieldFName() {
        return txtFirstName;
    }

    public void setTxtFieldFName(JTextField txtFieldFName) {
        this.txtFirstName = txtFieldFName;
    }

    public JTextField getTxtFieldParentName() {
        return txtParentName;
    }

    public void setTxtFieldParentName(JTextField txtFieldParentName) {
        this.txtParentName = txtFieldParentName;
    }

    public JTextField getTxtFieldLName() {
        return txtLastName;
    }

    public void setTxtFieldLName(JTextField txtFieldLName) {
        this.txtLastName = txtFieldLName;
    }

    public JTextField getTxtFieldParentEmail() {
        return txtParentEmail;
    }

    public void setTxtFieldParentEmail(JTextField txtFieldParentEmail) {
        this.txtParentEmail = txtFieldParentEmail;
    }

    public JTextField getTxtFieldStudentId() {
        return txtStudentId;
    }

    public void setTxtFieldStudentId(JTextField txtFieldStudentId) {
        this.txtStudentId = txtFieldStudentId;
    }

    public JButton getBtnUpdate() {
        return btnUpdateStudent;
    }

    public void setBtnUpdate(JButton btnUpdate) {
        this.btnUpdateStudent = btnUpdate;
    }

    public JButton getBtnDeleteImmun() {
        return btnDeleteImmun;
    }

    public JButton getBtnUpdateImmun() {
        return btnUpdateImmun;
    }

    public JButton getBtnAddImmun() {
        return btnAddImmun;
    }

    public void setBtnAddImmun(JButton btnAddImmun) {
        this.btnAddImmun = btnAddImmun;
    }

    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddImmun;
    private javax.swing.JButton btnDeleteImmun;
    private javax.swing.JButton btnUpdateImmun;
    private javax.swing.JButton btnUpdateStudent;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblParentEmail;
    private javax.swing.JLabel lblParentName;
    private javax.swing.JLabel lblStudentId;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle2;
    private javax.swing.JTable tblImmunInfo;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtParentEmail;
    private javax.swing.JTextField txtParentName;
    private javax.swing.JTextField txtStudentId;
    // End of variables declaration//GEN-END:variables
}
