/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package neu.edu.csye6200.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import neu.edu.csye6200.interfaces.ImmunizationFactory;
import neu.edu.csye6200.interfaces.StudentFactory;
import neu.edu.csye6200.model.Immunization;
import neu.edu.csye6200.model.Student;
import neu.edu.csye6200.views.PanelAlert;

/**
 *
 * @author aravind
 */
public class AlertsController {
    private final PanelAlert alertJPanel;
    private static AlertsController instance;
    
    private AlertsController(PanelAlert alertJPanel) {
        this.alertJPanel = alertJPanel;
    }
    
    public static AlertsController getInstance(PanelAlert alertJPanel) {
        instance = new AlertsController(alertJPanel);
        return instance;
    }
    
    public void renderTableRecords() {
        DefaultTableModel dtm = (DefaultTableModel)alertJPanel.getTblAlertRecords().getModel();
        dtm.setRowCount(0);
        
        for (Object studentObj: StudentFactory.getFactoryInstance().getObject().getDataList()) {
            Object[] row = new Object[dtm.getColumnCount()];
            
            Student student = (Student) studentObj;
            int stuId = student.getStuId();
            
            for (Object immuObj: ImmunizationFactory.getFactoryInstance().getObject().getDataList(stuId)) {
                Immunization immu = (Immunization) immuObj;
                SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
                Calendar vaccineTaken= Calendar.getInstance();
               vaccineTaken.setTime(immu.getImmunDate());
               vaccineTaken.add(Calendar.MONTH, Integer.valueOf(immu.getDuration()));
               Date today= new Date();
                if (!immu.isStatus() || vaccineTaken.getTime().before(new Date())) {
                    
                  System.out.println("vaccine taken"+ sdf.format(immu.getImmunDate())+" today"+sdf.format(today)+ " calendar"+sdf.format(vaccineTaken.getTime()));
                  
                    
                    row[0] = student.getFirstName();
                    row[1] = student.getLastName();
                    row[2] = immu.getImmunName();
                    
                    row[3]= ( immu.isStatus() && vaccineTaken.getTime().before(new Date()))?"EXPIRED":"NOT TAKEN";
                   
                    row[4] = (!immu.isStatus())?"-":sdf.format(immu.getImmunDate());
                    row[5] = (!immu.isStatus())?"-":immu.getDuration()+ " Months";
                    
                    dtm.addRow(row);
                }
            }
        }
    }
}
