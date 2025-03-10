/*
 * Programmer: A1101 GROUP 9 | Cocal, V., Franco, C., Jardeliza, L., Valenzuela, A.
 * Date: March 2025
 * Project: MotorPH Payroll System - Reads Employee Data from CSV File
 */

package motorph;

public class EmployeTimeRecord extends Employee {

    private int timeIn;
    private int timeOut;

    public int getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(int timeIn) {
        this.timeIn = timeIn;
    }

    public int getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(int timeOut) {
        this.timeOut = timeOut;
    }

}
