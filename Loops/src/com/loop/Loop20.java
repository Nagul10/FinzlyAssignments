package com.loop;

// 20. Generate the Series... 1 10 100 1000.

import java.util.Scanner;

public class Loop20 {
    public void forLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            System.out.println((int)Math.pow(10,i));
        }
    }
    public void whileLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while (i<=n) {
            System.out.println((int)Math.pow(10,i));
            i++;
        }
    }
    public void doWhileLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        do {
            System.out.println((int)Math.pow(10,i));
            i++;
        }while (i<=n);
    }
    public static void main(String[] args) {
        Loop20 loop = new Loop20();
        loop.forLoop();
        loop.whileLoop();
        loop.doWhileLoop();
    }
}
