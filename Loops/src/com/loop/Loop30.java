package com.loop;


// 30. Generate the Series... 6 12 18 24 30 36 42 48 54 60.

import java.util.Scanner;

public class Loop30 {
    public void forLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            System.out.println(i*6);
        }
    }
    public void whileLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while (i<=n) {
            System.out.println(i*6);
            i++;
        }
    }
    public void doWhileLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        do {
            System.out.println(i*6);
            i++;
        }while (i<=n);
    }
    public static void main(String[] args) {
        Loop30 loop = new Loop30();
        loop.forLoop();
        loop.whileLoop();
        loop.doWhileLoop();
    }
}
