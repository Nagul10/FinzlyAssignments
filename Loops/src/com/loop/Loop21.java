package com.loop;


// 21. Generate the Series... 1  3  6  10  15  21  28  36  45.

import java.util.Scanner;

public class Loop21 {
    public void forLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++)
        {
            sum+=i;
            System.out.println(sum);
        }
    }
    public void whileLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,i=0;
        while (i<=n){
            sum+=i;
            System.out.println(sum);
            i++;
        }
    }
    public void doWhileLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,i=0;
        do{
            sum+=i;
            System.out.println(sum);
            i++;
        }while (i<=n);
    }
    public static void main(String[] args) {
        Loop21 loop = new Loop21();
        loop.forLoop();
        loop.whileLoop();
        loop.doWhileLoop();
    }
}
