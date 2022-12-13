/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neu.edu.csye6200.views;

import java.awt.CardLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JToggleButton;
import neu.edu.csye6200.model.ClassRoom;

public class PanelClassRoom extends javax.swing.JPanel {

    private JPanel userProcessControlJPanel;
    public PanelClassRoom(JPanel userProcessControlJPanel) {
        initComponents();
        this.userProcessControlJPanel = userProcessControlJPanel;
    }

    public JPanel getUserProcessControlJPanel() {
        return userProcessControlJPanel;
    }

    public void setUserProcessControlJPanel(JPanel userProcessControlJPanel) {
        this.userProcessControlJPanel = userProcessControlJPanel;
    }
    


    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClassRooms = new javax.swing.JTable();
        btnShowDetail = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(0, 102, 204));

        lblTitle.setFont(new java.awt.Font("Charter", 6, 40)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(251, 243, 228));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("CLASSROOOMS");
        tblClassRooms.getTableHeader().setPreferredSize(new Dimension(100, 22));
        tblClassRooms.getTableHeader().setFont(new java.awt.Font("Tahoma", 6, 20));
        tblClassRooms.setBackground(new java.awt.Color(251, 243, 228));
         // NOI18N
        tblClassRooms.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Age", "Group Size", "Ratio", "Max Groups"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClassRooms.setFont(new java.awt.Font("Charter", 4, 16));
        jScrollPane1.setViewportView(tblClassRooms);

        btnShowDetail.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        btnShowDetail.setForeground(new java.awt.Color(204, 0, 0));
        btnShowDetail.setText("Show Detail");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnShowDetail)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnShowDetail)
                .addContainerGap(146, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnShowDetail;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblClassRooms;
    // End of variables declaration//GEN-END:variables

    public JToggleButton getBtnShowDetail() {
        return btnShowDetail;
    }

    public void setBtnShowDetail(JToggleButton btnShowDetail) {
        this.btnShowDetail = btnShowDetail;
    }

    public JTable getTblClassRooms() {
        return tblClassRooms;
    }

    public void setTblClassRooms(JTable tblClassRooms) {
        this.tblClassRooms = tblClassRooms;
    }

}
