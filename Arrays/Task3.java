// Source code is decompiled from a .class file using FernFlower decompiler.
package com.array.www;

public class Task3 {
   public Task3() {
   }

   int method(int[] arr) {
      if (arr.length == 0) {
         return 0;
      } else {
         return arr.length == 1 ? arr[0] : arr[0] + arr[1];
      }
   }

   public static void main(String[] args) {
      Task3 task3 = new Task3();
      int[] input = new int[]{10, 23, 34};
      int result = task3.method(input);
      System.out.println(result);
   }
}
