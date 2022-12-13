/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neu.edu.csye6200.interfaces;

public class TeacherFactory extends AbstractFactory{
    private static TeacherFactory factoryInstance =null; 
    private static TeacherDataManagement teacherDataManagement=null;

    private TeacherFactory() {
       
    }
    
    public static AbstractFactory getFactoryInstance() {
        if(factoryInstance==null){
           factoryInstance = new TeacherFactory();
        }
        return factoryInstance;
    }
    @Override
    public DataManagement getObject() {
        if(teacherDataManagement == null)
            teacherDataManagement = new TeacherDataManagement();
        return teacherDataManagement;
    }
    
}
