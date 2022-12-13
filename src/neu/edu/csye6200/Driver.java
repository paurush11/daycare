/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jarvis
 */
package neu.edu.csye6200;

import neu.edu.csye6200.controller.DashboardController;
import neu.edu.csye6200.views.LoginPage;
import neu.edu.csye6200.views.MainJFrame;

public class Driver {
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            	LoginPage login = new LoginPage();
        		login.setVisible(true);
            }
        });
    }
    
}
