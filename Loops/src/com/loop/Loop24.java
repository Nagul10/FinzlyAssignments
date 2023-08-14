package com.loop;


// 24. Generate the series... 1 4 9 16 25 36 49 64 81 100.

import java.util.Scanner;

public class Loop24 {
    public void forLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            System.out.println((int)Math.pow(i,2));
        }
    }
    public void whileLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while (i<=n){
            System.out.println((int)Math.pow(i,2));
            i++;
        }
    }
    public void doWhileLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        do{
            System.out.println((int)Math.pow(i,2));
            i++;
        }while (i<=n);
    }
    public static void main(String[] args) {
        Loop24 loop = new Loop24();
        loop.forLoop();
        loop.whileLoop();
        loop.doWhileLoop();
    }
}
