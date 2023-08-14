package com.loop;

// 4. Write a Program To print 1 to 100 even nos.

public class Loop4 {
    public void forLoop()
    {
        for(int i=1;i<=100;i++){
            if(i%2==0)
                System.out.println(i);
        }
    }
    public void whileLoop()
    {
        int i=1;
        while (i<=100) {
            if(i%2==0) {
                System.out.println(i);
            }
            i++;
        }
    }
    public void doWhileLoop()
    {
        int i=1;
        do {
            if(i%2==0) {
                System.out.println(i);
            }
            i++;
        }while (i<=100);
    }
    public static void main(String[] args) {
        Loop4 loop = new Loop4();
        loop.forLoop();
        loop.whileLoop();
        loop.doWhileLoop();
    }
}
