package com.employeewages;

public class EmployeeWages {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        // To check Employee is present or absent using random
        double present = 1;
        double randomCheck = Math.floor(Math.random() * 10) % 2;
        String check = " ";
        System.out.println(check = (present == randomCheck) ? "Employee is Present" : "Employee is Absent");

        // Calculate Daily Wages
        int employeeWages = 0;
        int employeehours = 0;
        int employeeRate = 20;
        employeehours = (randomCheck == present) ? 8 : 0;// ternary operator
        employeeWages = employeehours * employeeRate;
        System.out.println("Employee Wage is " + employeeWages);

    }
}
