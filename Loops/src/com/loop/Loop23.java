package com.loop;


// 23. Generate the Series... 0 1 1 2 3 5 8 13 21.

import java.util.Scanner;

public class Loop23 {
    public void forLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,sum=0;
        for (int i=1;i<=n;i++)
        {
            sum=a+b;
            System.out.println(sum);
            a=b;
            b=sum;
        }
    }
    public void whileLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,sum=0,i=1;
        while (i<n){
            sum=a+b;
            System.out.println(sum);
            a=b;
            b=sum;
            i++;
        }
    }
    public void doWhileLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,sum=0,i=1;
        do{
            sum=a+b;
            System.out.println(sum);
            a=b;
            b=sum;
            i++;
        }while (i<n);
    }
    public static void main(String[] args) {
        Loop23 loop = new Loop23();
        loop.forLoop();
        loop.whileLoop();
        loop.doWhileLoop();
    }
}
