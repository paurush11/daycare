package neu.edu.csye6200.views;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JPanel;

import neu.edu.csye6200.controller.DashboardController;
public class LoginPage  extends javax.swing.JFrame{

	private static final long serialVersionUID = 9166711651953611140L;
	public static Map<String,String> credentialsMap;
	static {
		credentialsMap = new HashMap<>();
		credentialsMap.put("admin", "admin");
	}
	
	
	
    public LoginPage() {
        initComponents();
    }
    private void initComponents() {

        jLabel1LogoImg = new javax.swing.JLabel();
        jXPanel1 = new org.jdesktop.swingx.JXPanel();
        jXPanel2 = new org.jdesktop.swingx.JXPanel();
        jLabel2 = new javax.swing.JLabel();
        JxLabel1_UserId = new org.jdesktop.swingx.JXLabel();
        jXLabel2_Password = new org.jdesktop.swingx.JXLabel();
        jButton1_Submit = new javax.swing.JButton();
        jPasswordField = new javax.swing.JPasswordField();
        jLabel1Response = new javax.swing.JLabel();
        jTextField1EmailAddress = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(89, 165, 189));
        JPanel panel = new javax.swing.JPanel() {
            protected void paintComponent(Graphics g) {
               if (g instanceof Graphics2D) {
                  final int R = 89;
                  final int G = 165;
                  final int B = 189;                
                  Paint p =
                     new GradientPaint(0.0f, 0.0f, new Color(R, G, B, 0),
                     getWidth(), getHeight(), new Color(R, G, B, 255), true);
                  Graphics2D g2d = (Graphics2D)g;
                  g2d.setPaint(p);
                  g2d.fillRect(0, 0, getWidth(), getHeight());
               } else {
                  super.paintComponent(g);
               }
            }
         };
         setContentPane(panel);
        
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1LogoImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bell5.jpeg"))); // NOI18N
        getContentPane().add(jLabel1LogoImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 80,650, 750));

//        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lmd3.png"))); // NOI18N
        jLabel2.setText("Login Here");
        jLabel2.setFont(new Font("Tahoma", Font.BOLD, 25));
        
        JxLabel1_UserId.setText("UserId");
        JxLabel1_UserId.setToolTipText("");
        JxLabel1_UserId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jXLabel2_Password.setText("Password");
        jXLabel2_Password.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jButton1_Submit.setText("Submit");
        jButton1_Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_SubmitActionPerformed(evt);
            }
        });
        jButton1_Submit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1_SubmitKeyPressed(evt);
            }
        });

        jPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldActionPerformed(evt);
            }
        });

        jLabel1Response.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1Response.setForeground(new java.awt.Color(200, 0, 0));

        jTextField1EmailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1EmailAddressActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jXPanel2Layout = new javax.swing.GroupLayout(jXPanel2);
        jXPanel2.setLayout(jXPanel2Layout);
        jXPanel2.setOpaque(false);
        jXPanel2Layout.setHorizontalGroup(
            jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel2Layout.createSequentialGroup()
                .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jXPanel2Layout.createSequentialGroup()
                        .addContainerGap().addGap(400, 400, 400)
                        .addComponent(jLabel2))
                    .addGroup(jXPanel2Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jXPanel2Layout.createSequentialGroup()
                                .addComponent(jXLabel2_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(605, 605, 605)
                            .addGroup(jXPanel2Layout.createSequentialGroup()
                                .addComponent(JxLabel1_UserId, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jXPanel2Layout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addComponent(jLabel1Response, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jXPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1EmailAddress)
                                        .addGap(12, 12, 12))))))
                    .addGroup(jXPanel2Layout.createSequentialGroup()
                        .addGap(380, 390, 400)
                        .addComponent(jButton1_Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jXPanel2Layout.setVerticalGroup(
            jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel2Layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jLabel1Response)
                .addGap(0, 0, 0)
                .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JxLabel1_UserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1EmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXLabel2_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jButton1_Submit)
                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout jXPanel1Layout = new javax.swing.GroupLayout(jXPanel1);
        jXPanel1.setLayout(jXPanel1Layout);
        jXPanel1.setOpaque(false);
        jXPanel1Layout.setHorizontalGroup(
            jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jXPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jXPanel1Layout.setVerticalGroup(
            jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel1Layout.createSequentialGroup()
                .addComponent(jXPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 48, Short.MAX_VALUE))
        );

        getContentPane().add(jXPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 54, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldActionPerformed

    private void jButton1_SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_SubmitActionPerformed
        // TODO add your handling code here:
    	if(!jTextField1EmailAddress.getText().isBlank() && credentialsMap.containsKey(jTextField1EmailAddress.getText())) {
    		if(!String.valueOf(jPasswordField.getPassword()).isBlank() && 
    				String.valueOf(jPasswordField.getPassword()).equals(credentialsMap.get(jTextField1EmailAddress.getText()))) {
    			jLabel1Response.setText("Welcome "+jTextField1EmailAddress.getText()+"!"+" Login Successfull");
    			MainJFrame view = new MainJFrame();
                view.setVisible(true);
                setVisible(false);
                DashboardController controller = new DashboardController(view);
                
    		}
    		else {
    			jLabel1Response.setText("Please verify password");
    			
    		}
    		
    	}
    	else {
    		System.out.println("Admin login successfull!");
    		jLabel1Response.setText("Oops "+jTextField1EmailAddress.getText()+"!"+" Incorrect user name");
    		
    	}
      
    }//GEN-LAST:event_jButton1_SubmitActionPerformed

    private void jTextField1EmailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1EmailAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1EmailAddressActionPerformed

    private void jButton1_SubmitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1_SubmitKeyPressed
      
    }//GEN-LAST:event_jButton1_SubmitKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Steel".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXLabel JxLabel1_UserId;
    private javax.swing.JButton jButton1_Submit;
    private javax.swing.JLabel jLabel1LogoImg;
    private javax.swing.JLabel jLabel1Response;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextField1EmailAddress;
    private org.jdesktop.swingx.JXLabel jXLabel2_Password;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private org.jdesktop.swingx.JXPanel jXPanel2;
    // End of variables declaration//GEN-END:variables


}
