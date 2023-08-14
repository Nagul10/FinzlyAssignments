package com.loop;

// 29. Generate the Series... 1 2 3 4 5 4 3 2 1.

import java.util.Scanner;

public class Loop29 {
    public void forLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<n;i++)
        {
            System.out.println(i);
        }
        for (int i=n;i>0;i--)
        {
            System.out.println(i);
        }
    }
    public void whileLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while (i<n){
            System.out.println(i);
            i++;
        }

        while (i>0){
            System.out.println(i);
            i--;
        }
    }
    public void doWhileLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while (i<n);

        do{
            System.out.println(i);i--;
        }while (i>0);
    }
    public static void main(String[] args) {
        Loop29 loop = new Loop29();
        loop.forLoop();
        loop.whileLoop();
        loop.doWhileLoop();
    }
}
