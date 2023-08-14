package com.loop;


// 11. Write a Program To print 1 to 100 no.

public class Loop11 {
    public void forLoop()
    {
        for(int i=1;i<=100;i++){
            System.out.println(i);
        }
    }
    public void whileLoop() {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }
    public void doWhileLoop()
    {
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while (i<=100);
    }
    public static void main(String[] args) {
        Loop11 loop = new Loop11();
        loop.forLoop();
        loop.whileLoop();
        loop.doWhileLoop();
    }
}
