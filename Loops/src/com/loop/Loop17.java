package com.loop;


// 17. Generate the Series... 9 18 27 36 45 54 63 72 81 90.

import java.util.Scanner;

public class Loop17 {
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
        while (i<=n){
            System.out.println(i*3);
            i++;
        }
    }
    public void doWhileLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        do{
            System.out.println(i*3);
            i++;
        }while (i<=n);
    }
    public static void main(String[] args) {
        Loop17 loop = new Loop17();
        loop.forLoop();
        loop.whileLoop();
        loop.doWhileLoop();
    }
}
