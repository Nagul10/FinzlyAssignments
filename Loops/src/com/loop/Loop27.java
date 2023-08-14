package com.loop;

// 27. Generate the Series... 4 8 12 16 20 24 28 32 36 40

import java.util.Scanner;

public class Loop27 {
    public void forLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            System.out.println(i*4);
        }
    }
    public void whileLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while (i<=n) {
            System.out.println(i*4);
            i++;
        }
    }
    public void doWhileLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        do {
            System.out.println(i*4);
            i++;
        }while (i<=n);
    }
    public static void main(String[] args) {
        Loop27 loop = new Loop27();
        loop.forLoop();
        loop.whileLoop();
        loop.doWhileLoop();
    }
}
