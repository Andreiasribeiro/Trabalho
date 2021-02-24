/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

/**
 *
 * @author Andreia
 */
public class Employee {
    
    
    //properties of ALL employeee
    private String firstname, surname;
    private String PPSN;
    private int emp_ID;
    private double wallet;
    
    //constructor
    public Employee(String firstname, String surname, String PPSN, int ID){
        
        this.firstname = firstname;
        this.surname = surname;
        this.PPSN = PPSN;
        this.emp_ID = ID;
        
        this.wallet = 0;
    }

    //methods
    
    /**
     *  All employees can work - the sub-class must decide how
     * @return a message describing the work
     */
    public String work() {
        
        return this.firstname + " is working now";
        
    }
    
    
    /**
     *  Pay the employee - add to wallet
     * @param salary - the amount paid
     */
    public void payday(int salary){
        
        this.wallet += salary;
    }
    
}
