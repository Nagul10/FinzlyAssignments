package com.loop;


// 26. Generate the Series... 7 14 21 28 35 42 49 56 63 70.

import java.util.Scanner;

public class Loop26 {
    public void forLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            System.out.println(i*7);
        }
    }
    public void whileLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while (i<=n) {
            System.out.println(i*7);
            i++;
        }
    }
    public void doWhileLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        do {
            System.out.println(i*7);
            i++;
        }while (i<=n);
    }
    public static void main(String[] args) {
        Loop26 loop = new Loop26();
        loop.forLoop();
        loop.whileLoop();
        loop.doWhileLoop();
    }
}
