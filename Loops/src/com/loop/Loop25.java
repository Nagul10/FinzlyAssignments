package com.loop;


// 25. Generate the series... 3 6 9 12 15 18 21 24 27 30

import java.util.Scanner;

public class Loop25 {
    public void forLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            System.out.println(i*3);
        }
    }
    public void whileLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while (i<=n) {
            System.out.println(i*3);
            i++;
        }
    }
    public void doWhileLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        do {
            System.out.println(i*3);
            i++;
        }while (i<=n);
    }
    public static void main(String[] args) {
        Loop25 loop = new Loop25();
        loop.forLoop();
        loop.whileLoop();
        loop.doWhileLoop();
    }
}
