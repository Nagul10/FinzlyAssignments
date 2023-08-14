package com.loop;


// 18. Generate the Series... 1 -2 3 -4 5 -6 7 -8 9 -10.

import java.util.Scanner;

public class Loop18 {
    public void forLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            if(i%2==0)
                System.out.println(i*-1);
            else
                System.out.println(i);
        }
    }
    public void whileLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while (i<=n){
            if(i%2==0)
                System.out.println(i*-1);
            else
                System.out.println(i);
            i++;
        }
    }
    public void doWhileLoop()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        do{
            if(i%2==0)
                System.out.println(i*-1);
            else
                System.out.println(i);
            i++;
        }while (i<=n);
    }
    public static void main(String[] args) {
        Loop18 loop = new Loop18();
        loop.forLoop();
        loop.whileLoop();
        loop.doWhileLoop();

    }
}
