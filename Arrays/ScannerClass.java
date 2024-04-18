// Source code is decompiled from a .class file using FernFlower decompiler.
package com.arrays1.www;

import java.util.Scanner;

public class ScannerClass {
   Scanner sc;

   public ScannerClass() {
      this.sc = new Scanner(System.in);
   }

   void method1() {
      System.out.println("Enter the first number");
      int a = this.sc.nextInt();
      System.out.println("Enter the second number");
      int b = this.sc.nextInt();
      System.out.println("a:" + a);
      System.out.println("b:" + b);
      System.out.println("sum of two values is" + (a + b) + " ");
   }

   int method2() {
      System.out.println("method2 called");
      System.out.println("Please enter a number to return from the method");
      return this.sc.nextInt();
   }

   void method3(int a, int b) {
      System.out.println("method3 called");
      System.out.println("multiplication value:" + a * b);
   }

   void method4() {
      System.out.println("enter the name:");
      String str = this.sc.next();
      System.out.println("Name:" + str);
   }

   void method5() {
      System.out.println("enter the name:");
      String str = this.sc.nextLine();
      System.out.println("Name:" + str);
   }

   public static void main(String[] args) {
      ScannerClass obj = new ScannerClass();
      obj.method5();
   }
}
