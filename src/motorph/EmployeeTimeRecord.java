/*
 * Programmer: A1101 GROUP 9 | Cocal, V., Franco, C., Jardeliza, L., Valenzuela, A.
 * Date: March 2025
 * Project: MotorPH Payroll System
 */

package motorph;

public class EmployeeTimeRecord extends Employee {
/* 
 * OOP PRINCIPLE: INHERITANCE
 * EmployeeTimeRecord is a child class of Employee, inheriting its properties and methods.
 */

    private int timeIn;
    private int timeOut;
    /* 
     * OOP PRINCIPLE: ENCAPSULATION
     * The private access modifier ensures that these attributes cannot be accessed directly from outside the class.
     */
    
    // GETTER METHOD for timeIn| returns the value of timeIn
    public int getTimeIn() {
        return timeIn;
    }

    // SETTER METHOD for timeIn | assigns the passed value to timeIn
    public void setTimeIn(int timeIn) {
        this.timeIn = timeIn;
    }

    // GETTER METHOD for timeOut| returns the value of timeOut
    public int getTimeOut() {
        return timeOut;
    }

    // SETTER METHOD for timeOut | assigns the passed value to timeOut
    public void setTimeOut(int timeOut) {
        this.timeOut = timeOut;
    }
    /* 
     * OOP PRINCIPLE: ENCAPSULATION
     * Provides controlled access to modify timeIn without exposing it directly.
     */

}
