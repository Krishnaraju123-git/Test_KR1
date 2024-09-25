package com.obsqura.JavaTraining.inheritance;

import java.util.Scanner;
public class Addition {
      int result;
      public int addition(int num1,int num2) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number 1");
      System.out.println("Enter number 2");
      num1 = sc.nextInt();
      num2 = sc.nextInt();
      System.out.println("Number1 is "+num1);
      System.out.println("Number2 is "+num2);
      int result = num1 + num2;
      return result;
    }
  }