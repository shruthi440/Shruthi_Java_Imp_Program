// Source code is decompiled from a .class file using FernFlower decompiler.
package com.arrays1.www;

public class ArrayTask3 {
   public ArrayTask3() {
   }

   void method1(int b) {
      for(int a = 10; a < 20; ++a) {
         if (a == 15) {
            while(b <= 30 && b != 25) {
               System.out.println("b value is====>" + b);
               ++b;
            }
         }

         System.out.println("a value is=====>" + a);
      }

   }

   public static void main(String[] args) {
      (new ArrayTask3()).method1(20);
   }
}
