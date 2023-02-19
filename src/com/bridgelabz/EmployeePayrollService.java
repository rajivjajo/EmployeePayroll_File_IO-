package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    private List<EmployeePayrollData> employeePayrollList;
    public EmployeePayrollService(List<EmployeePayrollData> employeePayrollDataList) {
        this.employeePayrollList = employeePayrollDataList;
    }


    public static void main(String[] args) {
        ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(consoleInputReader);
        employeePayrollService.writeEmployeePayrollData();
    }

    private void writeEmployeePayrollData() {
        System.out.println(employeePayrollList);
    }

    private void readEmployeePayrollData( Scanner consoleInputReader) {
        System.out.println("Enter Employee id : ");
        int id = consoleInputReader.nextInt();
        System.out.println(" Enter Employee Name : ");
        String name = consoleInputReader.next();
        System.out.println(" Enter Employee Salary : ");
        double salary = consoleInputReader.nextDouble();
        employeePayrollList.add(new EmployeePayrollData(id,name,salary));

    }
}
