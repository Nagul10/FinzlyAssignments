package com.loop;


// 16. Generate the Series... 2 4 6 8 10 12 14 16 18 20.

import java.util.Scanner;

public class Loop16 {
    public void forLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            System.out.println(i*2);
        }
    }
    public void whileLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while (i<=n) {
            System.out.println(i*2);
            i++;
        }
    }
    public void doWhileLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        do {
            System.out.println(i*2);
            i++;
        }while (i<=n);
    }
    public static void main(String[] args) {
        Loop16 loop = new Loop16();
        loop.forLoop();
        loop.whileLoop();
        loop.doWhileLoop();
    }
}
