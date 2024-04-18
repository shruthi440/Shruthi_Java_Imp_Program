// Source code is decompiled from a .class file using FernFlower decompiler.
package com.array.www;

public class Task4 {
   public Task4() {
   }

   boolean firstLast6(int[] nums) {
      return nums[0] == 6 || nums[nums.length - 1] == 6;
   }

   public static void main(String[] args) {
      Task4 task4 = new Task4();
      int[] input = new int[]{1, 2, 6};
      boolean result = task4.firstLast6(input);
      System.out.println(result);
   }
}
