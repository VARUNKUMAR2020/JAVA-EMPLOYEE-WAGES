package com.employeewages;

public class EmployeeWages {
    public static final int partTime = 2;
    public static final int fullTime = 1;
    public static final int employeeRate = 20;
    public static int employeehours = 0;
    public static int employeeWages = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        // To check Employee is present or absent using random
        int randomCheck = (int) Math.floor(Math.random() * 10) % 3;
        String check = " ";
        System.out.println(check = (fullTime == randomCheck) ? "Employee is Present" : "Employee is Absent");

        // TO check Wages of Full & Part Time using switch case
        switch (randomCheck) {
            case fullTime:
                employeehours = 8;
                break;
            case partTime:
                employeehours = 4;
                break;
            default:
                employeehours = 0;

        }
        employeeWages = employeehours * employeeRate;
        System.out.println("Employee Wage is " + employeeWages);

    }
}
