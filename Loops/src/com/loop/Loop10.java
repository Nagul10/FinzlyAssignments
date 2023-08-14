package com.loop;


// 10. Write a Program To print even and odd No

import java.util.Scanner;

public class Loop10 {
    public void forLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Odd Numbers");
        for (int i=1;i<=n;i++) {
            if (i % 2 != 0)
                System.out.println(i);
        }
        System.out.println("Even numbers");
        for (int i=1;i<=n;i++){
            if(i%2==0)
                System.out.println(i);
        }
    }
    public void whileLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        System.out.println("Odd Numbers");
        while (i<=n){
            if (i % 2 != 0)
                System.out.println(i);
            i++;
        }
        System.out.println("Even numbers");
        i=1;
        while (i<=n){
            if(i%2==0)
                System.out.println(i);
            i++;
        }
    }
    public void doWhileLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        System.out.println("Odd Numbers");
        do{
            if (i % 2 != 0)
                System.out.println(i);
            i++;
        }while (i<=n);
        System.out.println("Even numbers");
        i=1;
        do{
            if(i%2==0)
                System.out.println(i);
            i++;
        }while (i<=n);
    }
    public static void main(String[] args) {
        Loop10 loop = new Loop10();
        loop.forLoop();
        loop.whileLoop();
        loop.doWhileLoop();
    }
}
