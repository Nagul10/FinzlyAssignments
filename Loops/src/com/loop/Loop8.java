package com.loop;


// 8. Write a Program To print 50 to 100 nos.

public class Loop8 {
    public void forLoop()
    {
        for(int i=50;i<=100;i++){
            System.out.println(i);
        }
    }
    public void whileLoop()
    {
        int i=50;
        while (i<=100){
            System.out.println(i);
            i++;
        }
    }
    public void doWhileLoop()
    {
        int i=50;
        do{
            System.out.println(i);
            i++;
        }while (i<=100);
    }
    public static void main(String[] args) {
        Loop8 loop = new Loop8();
        loop.forLoop();
        loop.whileLoop();
        loop.doWhileLoop();
    }
}
