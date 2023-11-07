package com.galaxy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<arr.length; i++)
        {
            int a = sc.nextInt();
            arr[i] = a;
        }

        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }

        Student[] students = new Student[5];
        Student anurag;

    }

    class Student{
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];


    }

}
