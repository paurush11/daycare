/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neu.edu.csye6200.views;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author 
 */
public class PanelUpdateImmuization extends javax.swing.JPanel {

    /**
     * Creates new form UpdateImmuizationJPanel
     */
    public PanelUpdateImmuization() {
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

        lblImmunName = new javax.swing.JLabel();
        txtImmunName = new javax.swing.JTextField();
        lblImmunDate = new javax.swing.JLabel();
        txtImmunDate = new javax.swing.JTextField();
        lblIsImmunTaken = new javax.swing.JLabel();
        radioBtnYes = new javax.swing.JRadioButton();
        raadioBtnNo = new javax.swing.JRadioButton();
        lblDuration = new javax.swing.JLabel();
        txtDuration = new javax.swing.JTextField();
        btnUpdateImmunization = new javax.swing.JButton();
        lblImmunId = new javax.swing.JLabel();
        txtImmunId = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 204));

        lblImmunName.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblImmunName.setForeground(new java.awt.Color(251, 243, 228));
        lblImmunName.setText("Immunization Name:");

        txtImmunName.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N

        lblImmunDate.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblImmunDate.setForeground(new java.awt.Color(251, 243, 228));
        lblImmunDate.setText("Immunization Date:");

        txtImmunDate.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N

        lblIsImmunTaken.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblIsImmunTaken.setForeground(new java.awt.Color(251, 243, 228));
        lblIsImmunTaken.setText("Is Immunization Taken:");

        radioBtnYes.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        radioBtnYes.setForeground(new java.awt.Color(251, 243, 228));
        radioBtnYes.setText("Yes");
        radioBtnYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnYesActionPerformed(evt);
            }
        });

        raadioBtnNo.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        raadioBtnNo.setForeground(new java.awt.Color(251, 243, 228));
        raadioBtnNo.setText("No");
        raadioBtnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raadioBtnNoActionPerformed(evt);
            }
        });

        lblDuration.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblDuration.setForeground(new java.awt.Color(251, 243, 228));
        lblDuration.setText("Duration:");

        txtDuration.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        txtDuration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDurationActionPerformed(evt);
            }
        });

        btnUpdateImmunization.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        btnUpdateImmunization.setForeground(new java.awt.Color(204, 0, 0));
        btnUpdateImmunization.setText("Update Immunization");
        btnUpdateImmunization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateImmunizationActionPerformed(evt);
            }
        });

        lblImmunId.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblImmunId.setForeground(new java.awt.Color(251, 243, 228));
        lblImmunId.setText("Immunization Id:");

        txtImmunId.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        txtImmunId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImmunIdActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Charter", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(251, 243, 228));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("UPDATE IMMUNIZATION");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblIsImmunTaken)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioBtnYes)
                            .addComponent(raadioBtnNo)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblImmunName, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtImmunName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblImmunDate)
                        .addGap(18, 18, 18)
                        .addComponent(txtImmunDate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblImmunId, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtImmunId, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(112, 125, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(btnUpdateImmunization)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblDuration, lblImmunDate, lblImmunId, lblImmunName, lblIsImmunTaken});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {raadioBtnNo, radioBtnYes, txtDuration, txtImmunDate, txtImmunId, txtImmunName});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblImmunName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtImmunName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblImmunDate, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtImmunDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblIsImmunTaken)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radioBtnYes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(raadioBtnNo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDuration)
                    .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblImmunId, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtImmunId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnUpdateImmunization)
                .addGap(127, 127, 127))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblDuration, lblImmunDate, lblImmunId, lblImmunName, lblIsImmunTaken});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {raadioBtnNo, radioBtnYes, txtDuration, txtImmunDate, txtImmunId, txtImmunName});

    }// </editor-fold>//GEN-END:initComponents

    private void radioBtnYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnYesActionPerformed
        raadioBtnNo.setSelected(false);
    }//GEN-LAST:event_radioBtnYesActionPerformed

    private void raadioBtnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raadioBtnNoActionPerformed
        // TODO add your handling code here:
        radioBtnYes.setSelected(false);
    }//GEN-LAST:event_raadioBtnNoActionPerformed

    private void txtDurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDurationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDurationActionPerformed

    private void btnUpdateImmunizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateImmunizationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateImmunizationActionPerformed

    private void txtImmunIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImmunIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImmunIdActionPerformed

    public JButton getBtnUpdateImmunization() {
        return btnUpdateImmunization;
    }

    public JTextField getTextFieldId() {
        return txtImmunId;
    }
    

    public JRadioButton getRaadioBtnNo() {
        return raadioBtnNo;
    }

    public JRadioButton getRadioBtnYes() {
        return radioBtnYes;
    }

    public JTextField getTextFieldDate() {
        return txtImmunDate;
    }

    public JTextField getTextFieldDuration() {
        return txtDuration;
    }

    public JTextField getTextFieldName() {
        return txtImmunName;
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdateImmunization;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JLabel lblImmunDate;
    private javax.swing.JLabel lblImmunId;
    private javax.swing.JLabel lblImmunName;
    private javax.swing.JLabel lblIsImmunTaken;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JRadioButton raadioBtnNo;
    private javax.swing.JRadioButton radioBtnYes;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtImmunDate;
    private javax.swing.JTextField txtImmunId;
    private javax.swing.JTextField txtImmunName;
    // End of variables declaration//GEN-END:variables
}
