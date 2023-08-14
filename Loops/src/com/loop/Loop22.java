package com.loop;


// 22. Generate the Series... 8 16 24 32 40 48 56 64 72 80.

import java.util.Scanner;

public class Loop22 {
    public void forLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            System.out.println(i*8);
        }
    }
    public void whileLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while (i<=n) {
            System.out.println(i*8);
            i++;
        }
    }
    public void doWhileLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        do {
            System.out.println(i*8);
            i++;
        }while (i<=n);
    }
    public static void main(String[] args) {
        Loop22 loop = new Loop22();
        loop.forLoop();
        loop.whileLoop();
        loop.doWhileLoop();
    }
}
