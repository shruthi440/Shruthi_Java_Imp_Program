// Source code is decompiled from a .class file using FernFlower decompiler.
package com.arrays1.www;

import java.util.Scanner;

public class VegetableTask {
   public VegetableTask() {
   }

   void method1() {
      Scanner sc;
      label31: {
         sc = new Scanner(System.in);
         System.out.println("Welcome to our vegetable store");
         System.out.println("please choose");
         System.out.println("Onions ");
         System.out.println("chilli ");
         System.out.println("Tomato ");
         System.out.println("Brinjal ");
         System.out.println("LadiesFinger ");
         int kg;
         switch (ch) {
            case "Tomato":
               System.out.println("1 kg of Tomato is 55");
               System.out.println("How many kgs you need");
               kg = sc.nextInt();
               System.out.println(kg + " kgs of Tomato cost is " + 55 * kg);
               break label31;
            case "chilli":
               System.out.println("1 kg of Chilli is 60");
               System.out.println("How many kgs you need");
               kg = sc.nextInt();
               System.out.println(kg + " kgs of Chilli cost is " + 60 * kg);
               break label31;
            case "Onion":
               System.out.println("1 kg of Onion is 30");
               System.out.println("How many kgs you need");
               kg = sc.nextInt();
               System.out.println(kg + " kgs of Onion cost is " + 30 * kg);
               break label31;
            case "LadiesFinger":
               System.out.println("1 kg of LadiesFinger is 40");
               System.out.println("How many kgs you need");
               kg = sc.nextInt();
               System.out.println(kg + " kgs of LadiesFinger cost is " + 40 * kg);
               break label31;
            case "Brinjal":
               System.out.println("1 kg of Brinjal is 50");
               System.out.println("How many kgs you need");
               kg = sc.nextInt();
               System.out.println(kg + " kgs of Brinjal cost is " + 50 * kg);
               break label31;
         }

         System.out.println("Enter the valid input");
      }

      sc.close();
   }

   public static void main(String[] args) {
      VegetableTask obj = new VegetableTask();
      obj.method1();
      System.out.println("Thank you for shopping with us ....please come back ");
   }
}
