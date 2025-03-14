/*
 * Programmer: A1101 GROUP 9 | Cocal, V., Franco, C., Jardeliza, L., Valenzuela, A.
 * Date: March 2025
 * Project: MotorPH Payroll System
 */

package motorph;

public class SalaryDeductions {

    private double salary;
    /* 
     * OOP PRINCIPLE: ENCAPSULATION
     * The private access modifier ensures that these attributes cannot be accessed directly from outside the class.
     */
    
    // SSS Deduction Calculation
    private double getSSSdeduction() {
        final int constant = 25000;
        if ((int) Math.round(salary) < constant) {
            return salary * 0.045;
        }
        return constant * 0.045;
    }

    // WITHHOLDING TAX CALCULATION
    private double getWithholdingTax() {
        double withHoldingTax = 0;
        if (salary > 20833 && salary <= 33333) {
            withHoldingTax = (salary - 20833) * 0.15;
        } else if (salary >= 33333 && salary <= 66667) {
            withHoldingTax = 1875 + (salary - 33333) * 0.2;
        } else if (salary >= 66667 && salary <= 166667) {
            withHoldingTax = 8541 + (salary - 66667) * 0.25;
        } else if (salary >= 166667 && salary <= 666667) {
            withHoldingTax = 33541 + (salary - 166667) * 0.3;
        } else if (salary > 666667) {
            withHoldingTax = 183541 + (salary - 666667) * 0.35;
        }
        return withHoldingTax;
    }

    // PAG-IBIG DEDUCTION CALCULATION
    private double getPagibigDeduction() {
        final double minimunCompensation = 1500;
        if (salary > minimunCompensation) {
            return salary * 0.02;
        }
        return salary * 0.01;
    }

    // PHILHEALTH DEDUCTION CALCULATION
    private double getPhilHealthDeduction() {
        return salary * 0.05;
    }

    // TOTAL DEDUCTIONS
    public double getTotalDeductions(double salary) {
        this.salary = salary;
        return getSSSdeduction() + getPagibigDeduction() + getPhilHealthDeduction() + getWithholdingTax();
    }

}
