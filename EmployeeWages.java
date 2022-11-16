package com.employeewages;

public class EmployeeWages {
    public static final int partTime = 2;
    public static final int fullTime = 1;
    public static final int employeeRate = 20;
    public static int employeehours = 0;
    public static int employeeWages = 0;
    public static int numberOfWorkingDays = 20;
    public static int totalEmployeeWages = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        // To check Employee is present or absent using random
        int randomCheck = (int) Math.floor(Math.random() * 10) % 3;
        System.out.println((fullTime == randomCheck || partTime == randomCheck) ? "Employee is Present" : "Employee is Absent");

        //Working days is 20
        for(int day=0;day<=numberOfWorkingDays;day++){
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
        totalEmployeeWages += employeeRate;
        System.out.println("Employee Wage is " + employeeWages);
    }
    System.out.println("Total Employee Wage is " +totalEmployeeWages );

    }
}