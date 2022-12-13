package neu.edu.csye6200.views;

import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import neu.edu.csye6200.controller.DashboardController;

public class MainJFrame extends javax.swing.JFrame {
   private PanelStudent studentJPanel;
   private PanelTeacher teacherJPanel;
   private PanelAdmin adminJPanel;
   private PanelClassRoom classRoomJPanel;
   private PanelImmRules immRulesJPanel;
   private PanelAlert alertsJPanel;

    public MainJFrame() {
        initComponents();
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);    
        setVisible(true);
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        containerJPanel = new javax.swing.JPanel();
        splitPane = new javax.swing.JSplitPane();
        controlJPanel = new javax.swing.JPanel();
        btnTeacher = new javax.swing.JButton();
        btnStudent = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        lblMainTitle = new javax.swing.JLabel();
        immRulesBtn = new javax.swing.JButton();
        btnAlert = new javax.swing.JButton();
        userProcessControllerJPanel = new javax.swing.JPanel();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        containerJPanel.setBackground(new java.awt.Color(255, 255, 255));
        containerJPanel.setSize(new java.awt.Dimension(900, 600));

        splitPane.setDividerLocation(300);
        splitPane.setDividerSize(30);
        
        splitPane.setMinimumSize(new java.awt.Dimension(800, 25));

        controlJPanel.setBackground(new java.awt.Color(130, 187, 181));

        btnTeacher.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        btnTeacher.setForeground(new java.awt.Color(51, 0, 102));
        btnTeacher.setText("Teachers");
        btnTeacher.setToolTipText("teacher");
        btnTeacher.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTeacher.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnStudent.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        btnStudent.setForeground(new java.awt.Color(51, 0, 102));
        btnStudent.setText("Students");
        btnStudent.setToolTipText("Student");
        btnStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnStudent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentActionPerformed(evt);
            }
        });

        btnAdmin.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        btnAdmin.setForeground(new java.awt.Color(51, 0, 102)); // andar kla color
        btnAdmin.setText("Classrooms");
        btnAdmin.setToolTipText("Student");
        btnAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        lblMainTitle.setFont(new java.awt.Font("Charter", 1, 24)); // NOI18N
        lblMainTitle.setForeground(new java.awt.Color(51, 0, 102));
        lblMainTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMainTitle.setText("DAY CARE");

        immRulesBtn.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        immRulesBtn.setForeground(new java.awt.Color(51, 0, 102));
        immRulesBtn.setText("Immunization Rules");
        immRulesBtn.setToolTipText("teacher");
        immRulesBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        immRulesBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        immRulesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                immRulesBtnActionPerformed(evt);
            }
        });

        btnAlert.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        btnAlert.setForeground(new java.awt.Color(51, 0, 102));
        btnAlert.setText("Dashboard");
        btnAlert.setToolTipText("Student");
        btnAlert.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAlert.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAlert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlJPanelLayout = new javax.swing.GroupLayout(controlJPanel);
        controlJPanel.setLayout(controlJPanelLayout);
        controlJPanelLayout.setHorizontalGroup(
            controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMainTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(controlJPanelLayout.createSequentialGroup()
                .addGroup(controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlJPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlJPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(controlJPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTeacher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(immRulesBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        controlJPanelLayout.setVerticalGroup(
            controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlJPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblMainTitle)
                .addGap(42, 42, 42)
                .addComponent(btnAlert)
                .addGap(18, 18, 18)
                .addComponent(btnStudent)
                .addGap(18, 18, 18)
                .addComponent(btnTeacher)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(immRulesBtn)
                .addGap(18, 18, 18)
                .addComponent(btnAdmin)
                .addContainerGap(388, Short.MAX_VALUE))
        );

        controlJPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdmin, btnStudent, btnTeacher});

        splitPane.setLeftComponent(controlJPanel);

        userProcessControllerJPanel.setBackground(new java.awt.Color(255, 255, 255));
        userProcessControllerJPanel.setLayout(new java.awt.CardLayout());
        splitPane.setRightComponent(userProcessControllerJPanel);

        javax.swing.GroupLayout containerJPanelLayout = new javax.swing.GroupLayout(containerJPanel);
        containerJPanel.setLayout(containerJPanelLayout);
        containerJPanelLayout.setHorizontalGroup(
            containerJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        containerJPanelLayout.setVerticalGroup(
            containerJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerJPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerJPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentActionPerformed
        
    }//GEN-LAST:event_btnStudentActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdminActionPerformed

    private void immRulesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_immRulesBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_immRulesBtnActionPerformed

    private void btnAlertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlertActionPerformed
    public void classRoomJPanel(){
        classRoomJPanel = new PanelClassRoom(userProcessControllerJPanel);
        userProcessControllerJPanel.add("classRoomJPanel",classRoomJPanel);
        CardLayout layout = (CardLayout) userProcessControllerJPanel.getLayout();
        layout.next(userProcessControllerJPanel);
    }
//    public void adminJPanel(){
//        adminJPanel = new PanelAdmin();
//        userProcessControllerJPanel.add("adminJPanel",adminJPanel);
//        CardLayout layout = (CardLayout) userProcessControllerJPanel.getLayout();
//        layout.next(userProcessControllerJPanel);
//   }
    public void studentJPanel(){
       studentJPanel = new PanelStudent(userProcessControllerJPanel);
       userProcessControllerJPanel.add("studentJPanel",studentJPanel);
       CardLayout layout = (CardLayout) userProcessControllerJPanel.getLayout();
       layout.next(userProcessControllerJPanel);
   }
   public void teacherJPanel(){
       teacherJPanel = new PanelTeacher(userProcessControllerJPanel);
        userProcessControllerJPanel.add("teacherJPanel",teacherJPanel);
        CardLayout layout = (CardLayout) userProcessControllerJPanel.getLayout();
        layout.next(userProcessControllerJPanel);
   }
   public void immRulesJPanel(){
       immRulesJPanel = new PanelImmRules(userProcessControllerJPanel);
       userProcessControllerJPanel.add("immRulesJPanel",immRulesJPanel);
       CardLayout layout = (CardLayout) userProcessControllerJPanel.getLayout();
       layout.next(userProcessControllerJPanel);
   }
   
    public void alertsJPanel(){
     alertsJPanel = new PanelAlert(userProcessControllerJPanel);
     userProcessControllerJPanel.add("alertsJPanel",alertsJPanel);
     CardLayout layout = (CardLayout) userProcessControllerJPanel.getLayout();
     layout.next(userProcessControllerJPanel);
   }
   
    public JButton getAdminBtn() {
        return btnAdmin;
    }
    
    public JButton getStudentBtn1() {
        return btnStudent;
    }

    public JButton getTeacherBtn() {
        return btnTeacher;
    }
    
    public JButton getImmRulesBtn(){
        return immRulesBtn;
    }
    
    public JButton getAlertBtn() {
        return btnAlert;
    }
    
    public void setStudentJPanel(PanelStudent studentJPanel) {
        this.studentJPanel = studentJPanel;
    }

    public void setTeacherJPanel(PanelTeacher teacherJPanel) {
        this.teacherJPanel = teacherJPanel;
    }

    public void setImmRulesJPanel(PanelImmRules immRulesJPanel) {
        this.immRulesJPanel = immRulesJPanel;
    }
    
    public void setAlertJPanel(PanelAlert alertsJPanel) {
        this.alertsJPanel = alertsJPanel;
    }
    
    public PanelStudent getStudentJPanel() {
        return studentJPanel;
    }

    public PanelTeacher getTeacherJPanel() {
        return teacherJPanel;
    }
    
    public PanelImmRules getImmRulesJPanel() {
        return immRulesJPanel;
    }
    
    public PanelAlert getAlertJPanel() {
        return alertsJPanel;
    }
    
    public JPanel getUserProcessControllerJPanel() {
        return userProcessControllerJPanel;
    }

    public PanelAdmin getAdminJPanel() {
        return adminJPanel;
    }

    public void setAdminJPanel(PanelAdmin adminJPanel) {
        this.adminJPanel = adminJPanel;
    }

    public PanelClassRoom getClassRoomJPanel() {
        return classRoomJPanel;
    }

    public void setClassRoomJPanel(PanelClassRoom classRoomJPanel) {
        this.classRoomJPanel = classRoomJPanel;
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnAlert;
    private javax.swing.JButton btnStudent;
    private javax.swing.JButton btnTeacher;
    private javax.swing.JPanel containerJPanel;
    private javax.swing.JPanel controlJPanel;
    private javax.swing.JButton immRulesBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMainTitle;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel userProcessControllerJPanel;
    // End of variables declaration//GEN-END:variables
}
