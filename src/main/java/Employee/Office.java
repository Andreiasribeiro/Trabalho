/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

import Utilities.InputUtilities;
import java.util.ArrayList;

/**
 *
 * @author Andreia
 */
public class Office {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int ID = 1;
        
        //list of all employees
        ArrayList<Employee> staffList = new ArrayList<Employee>();
        
        for (int i = 0; i<5; i++){
            
            String fname = InputUtilities.getUserText("Please enter your first name");
            String sname = InputUtilities.getUserText("Please enter your surname");
            String PPSN = InputUtilities.getUserText("Please enter your PPSN");
        
        Employee staffMember = new Employee (fname, sname, PPSN, ID);
        
        staffList.add(staffMember);
        
        ID++;
        
    }
    for (Employee e: staffList){
        System.out.println(e.work());
        e.payday(100);
    }
}
}
