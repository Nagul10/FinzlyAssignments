package com.loop;

//1. Write a Program To print 1 to 25 nos.

public class Loop1 {

    public void forLoop() {
        for(int i=1;i<=25;i++){
            System.out.println(i);
        }
    }
    public void whileLoop() {
        int i=1;
        while (i<=25)
        {
            System.out.println(i);
            i++;
        }
    }
    public void doWhileLoop() {
        int i=0;
        do
        {
            System.out.println(i);
            i++;
        }while (i<=25);
    }
    public static void main(String[] args) {
        Loop1 loop = new Loop1();
        loop.forLoop();
        loop.whileLoop();
        loop.doWhileLoop();

    }
}
