package com.employeewages;

public class EmployeeWages {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        // To check Employee is present or absent using random
        double fullTime = 1;
        double randomCheck = Math.floor(Math.random() * 10) % 3;
        String check = " ";
        System.out.println(check = (fullTime == randomCheck) ? "Employee is Present" : "Employee is Absent");

        // Calculate Daily Wages
        int employeeWages = 0;
        int employeehours = 0;
        int employeeRate = 20;

        // TO check Wages of Full & Part Time
        double partTime = 2;
        employeehours = (randomCheck == 0) ? 0 : (randomCheck == fullTime) ? 8 : 4;// ternary operator
        employeeWages = employeehours * employeeRate;
        System.out.println("Employee Wage is " + employeeWages);

    }
}
