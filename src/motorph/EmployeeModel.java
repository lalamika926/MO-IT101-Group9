/*
 * Programmer: A1101 GROUP 9 | Cocal, V., Franco, C., Jardeliza, L., Valenzuela, A.
 * Date: March 2025
 * Project: MotorPH Payroll System - Reads Employee Data from CSV File
 */

package motorph;

public abstract class EmployeeModel {

    //Declaring an Employee object array
    protected Employee[] employees;

    protected abstract Employee[] getEmployeeModelList();

}
