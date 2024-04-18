// Source code is decompiled from a .class file using FernFlower decompiler.
package com.array.www;

public class Task1 {
   public Task1() {
   }

   int[] method1() {
      int[] arr = new int[]{2, 3, 3};

      for(int i = 0; i < arr.length - 1; ++i) {
         if (arr[i] == 2 && arr[i + 1] == 3) {
            arr[i + 1] = 0;
         }
      }

      return arr;
   }

   public static void main(String[] args) {
      Task1 task1 = new Task1();
      int[] result = task1.method1();
      int[] var6 = result;
      int var5 = result.length;

      for(int var4 = 0; var4 < var5; ++var4) {
         int x = var6[var4];
         System.out.print(x + " ");
      }

   }
}
