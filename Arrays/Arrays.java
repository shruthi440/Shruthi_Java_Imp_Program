
package com.arrays1.www;

public class Arrays {
   public Arrays() {
   }

   void method1() 
   {
      int[] arr = new int[]{10, 20, 30, 40, 50};
      System.out.println(arr[2]);
      System.out.println("Retrieving the elements from an array by using for loop");

      int x;
      for(x = 0; x < 5; ++x) {
         System.out.println(arr[x] + " ");
      }

      System.out.println("Retrieving the elements from an array  in reverse order by using for loop");

      for(x = 4; x >= 0; --x) {
         System.out.println(arr[x] + " ");
      }

      System.out.println("Retrieving the elements from an array by using for each loop");
      int[] var5 = arr;
      int var4 = arr.length;

      for(int var3 = 0; var3 < var4; ++var3) {
         x = var5[var3];
         System.out.println(x + " ");
      }

   }

   public static void main(String[] args) 
   {
      (new Arrays()).method1();
   }
}
