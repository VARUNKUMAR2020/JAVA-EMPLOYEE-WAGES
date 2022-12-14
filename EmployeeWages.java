package com.employeewages;

import java.util.*;

public class EmployeeWages {
    public static final int partTime = 2;
    public static final int fullTime = 1;
    public static final int employeeRate = 20;
    public static int employeehours = 0;
    public static int employeeWages = 0;
    public static int numberOfWorkingDays = 20;
    public static int totalEmployeeWages = 0;

    public static void employeeWagesCalculation(String companyName, int employeeRate, int numberOfWorkingDays,
            int employeehours) {
        System.out.println(companyName + " Employee Wage Computation :");
        // To check Employee is present or absent using random
        int randomCheck = (int) Math.floor(Math.random() * 10) % 2;
        String check;
        System.out.println(check = (fullTime == randomCheck || partTime == randomCheck) ? "Employee is Present"
                : "Employee is Absent");

        // Working hours is 100
        int hoursInMonth = 100, workingDays = 0;
        while (employeehours <= hoursInMonth && workingDays < numberOfWorkingDays) {
            workingDays++;
            int optioncheck = (int) Math.floor(Math.random() * 10) % 3;
            // TO check Wages of Full & Part Time using switch case
            switch (optioncheck) {
                case fullTime:
                    employeehours = 8;
                    break;
                case partTime:
                    employeehours = 4;
                    break;
                default:
                    employeehours = 0;

            }
            totalEmployeeWages += employeeRate;
            System.out.println("Day:" + workingDays + "  Hours: " + employeeRate);
        }

        int totalEmpWages = totalEmployeeWages * employeeRate;
        System.out.println("Total employee wages is " + totalEmpWages);
        System.out.println("------------------------------------------");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Company Name: ");
        String companyName = input.nextLine();
        System.out.println("Enter the Employee Rate: ");
        int rate = input.nextInt();
        System.out.println("Enter the number of working days: ");
        int workingDays = input.nextInt();
        System.out.println("Enter the employee hours: ");
        int hours = input.nextInt();
        employeeWagesCalculation(companyName, rate, workingDays, hours);

    }

}