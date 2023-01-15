package school.mjc.stage0.conditions.task3;

import javax.swing.*;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if(salary <= 10000){
            float without_taxes = (float) ((float) salary-(salary * 0.15));
            System.out.println(without_taxes);
        } else if (10000 < salary && salary <= 20000)  {
            float without_taxes = (float) ((float) salary-(salary * 0.18));
            System.out.println(without_taxes);
        } else if (salary > 20000) {
            float without_taxes = (float) ((float) salary-(salary * 0.2));
            System.out.println(without_taxes);
        }
        else {
            System.out.println("wrong input!");
        }
    }
}
