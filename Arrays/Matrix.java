// Source code is decompiled from a .class file using FernFlower decompiler.
package com.array.www;

public class Matrix {
   public Matrix() {
   }

   public static void main(String[] args) {
      int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

      for(int i = 0; i < 3; ++i) {
         for(int j = 0; j < 3; ++j) {
            System.out.print(arr[i][j] + " ");
         }

         System.out.println();
      }

   }
}
