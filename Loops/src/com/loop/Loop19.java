package com.loop;


// 19. Generate the Series... 5 10 15 20 25 30 35 40 45 50

import java.util.Scanner;

public class Loop19 {
    public void forLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            System.out.println(i*5);
        }
    }
    public void whileLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while (i<=n) {
            System.out.println(i*5);
            i++;
        }
    }
    public void doWhileLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        do {
            System.out.println(i*5);
            i++;
        }while (i<=n);
    }
    public static void main(String[] args) {
        Loop19 loop = new Loop19();
        loop.forLoop();
        loop.whileLoop();
        loop.doWhileLoop();
    }
}
