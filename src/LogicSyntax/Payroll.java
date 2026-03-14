package LogicSyntax;

import java.math.BigDecimal;
import java.util.Scanner;

public class Payroll {
    //Calculate a salary after a 12.5% tax and a$500$bonus.
    //You must use BigDecimal for the money calculation to avoid floating-point errors.
    // Use a Scannerthat only accepts doubleor int; if the user types a string,
    // the program must not crash (use hasNextDouble()).
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = 0;
        System.out.println("Enter Salary :");
        while (!sc.hasNextDouble())
        {
            System.out.println("Invalid Input");
                sc.next();
            System.out.println("Enter Salary :");
        }
        salary=sc.nextDouble();
        BigDecimal salary_am=BigDecimal.valueOf(salary);
        BigDecimal tax_per=BigDecimal.valueOf(0.125);
        BigDecimal bonus_am=BigDecimal.valueOf(500);
        BigDecimal tax=salary_am.multiply(tax_per);
        BigDecimal salary_final=salary_am.subtract(tax).add(bonus_am);

        System.out.println("Original Salary: $" + salary_am);
        System.out.println("Tax (12.5%): $" + tax);
        System.out.println("Bonus: $" + bonus_am);
        System.out.println("Final Salary after tax and bonus: $" + salary_final);

    }
}
