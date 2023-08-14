package com.loop;

// 28. Generate the Series... 10 20 30 40 50 60 70 80 90 100.

import java.util.Scanner;

public class Loop28 {
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
        Loop28 loop = new Loop28();
        loop.forLoop();
        loop.whileLoop();
        loop.doWhileLoop();
    }
}
