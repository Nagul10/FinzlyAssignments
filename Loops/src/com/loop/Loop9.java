package com.loop;


// 9. Write a Program To print sum of odd and even no.

import java.util.Scanner;

public class Loop9 {
    public void forLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int odd=0,even=0;
        for (int i=0; i<n; i++) {
            if(i%2==0)
                even+=i;
            else
                odd+=i;
        }
        System.out.println("Sum of odd numbers = "+odd);
        System.out.println("Sum of even numbers ="+even);
    }
    public void whileLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int odd=0,even=0,i=0;
        while (i<n){
            if(i%2==0)
                even+=i;
            else
                odd+=i;
            i++;
        }
        System.out.println("Sum of odd numbers = "+odd);
        System.out.println("Sum of even numbers ="+even);
    }
    public void doWhileLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int odd=0,even=0,i=0;
        do{
            if(i%2==0)
                even+=i;
            else
                odd+=i;
            i++;
        }while (i<n);
        System.out.println("Sum of odd numbers = "+odd);
        System.out.println("Sum of even numbers ="+even);
    }
    public static void main(String[] args) {
        Loop9 loop = new Loop9();
        loop.forLoop();
        loop.whileLoop();
        loop.doWhileLoop();
    }
}
