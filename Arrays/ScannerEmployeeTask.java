// Source code is decompiled from a .class file using FernFlower decompiler.
package com.arrays1.www;

import java.util.Scanner;

public class ScannerEmployeeTask {
   String empName;
   int empId;
   long empSal;
   String empDept;
   String empAdd;
   Scanner sc;

   public ScannerEmployeeTask() {
      this.sc = new Scanner(System.in);
   }

   void method1() {
      System.out.println("Enter the employeeName:");
      this.empName = this.sc.next();
      System.out.println("Enter the EmployeeId:");
      this.empId = this.sc.nextInt();
      System.out.println("Enter the EmployeeSalary:");
      this.empSal = this.sc.nextLong();
      System.out.println("Enter the Employee Department");
      this.empDept = this.sc.next();
      System.out.println("Enter the Employee Address");
      this.empAdd = this.sc.nextLine();
      this.empAdd = this.sc.nextLine();
   }

   void display() {
      System.out.println("Employee Name:" + this.empName);
      System.out.println("Employee Id:" + this.empId);
      System.out.println("Employee Salary:" + this.empSal);
      System.out.println("Employee Department:" + this.empDept);
      System.out.println("Employee Address:" + this.empAdd);
   }

   public static void main(String[] args) {
      ScannerEmployeeTask obj = new ScannerEmployeeTask();
      obj.method1();
      System.out.println("=====Employee Details=====");
      obj.display();
   }
}
