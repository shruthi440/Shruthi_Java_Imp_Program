// Source code is decompiled from a .class file using FernFlower decompiler.
package com.array.www;

public class Task2 {
   public Task2() {
   }

   boolean method(int[] arr) {
      return arr[0] != 2 && arr[0] != 3 && arr[arr.length - 1] != 2 && arr[arr.length - 1] != 3;
   }

   public static void main(String[] args) {
      Task2 task2 = new Task2();
      int[] input = new int[]{3, 2};
      boolean result = task2.method(input);
      System.out.println(result);
   }
}
