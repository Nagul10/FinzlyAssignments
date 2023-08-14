package com.loop;


// 12. Write a Program To print 100 to 1 no.

public class Loop12 {
    public void forLoop()
    {
        for(int i=100;i>=1;i--){
            System.out.println(i);
        }
    }
    public void whileLoop()
    {
        int i=100;
        while (i>=1){
            System.out.println(i);
            i--;
        }
    }
    public void doWhileLoop()
    {
        int i=100;
        do{
            System.out.println(i);
            i--;
        }while (i>=1);
    }
    public static void main(String[] args) {
        Loop12 loop = new Loop12();
        loop.forLoop();
        loop.whileLoop();
        loop.doWhileLoop();
    }
}
