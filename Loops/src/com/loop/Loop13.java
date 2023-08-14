package com.loop;


// 13. Write a Program To print 30 to 50 no.

public class Loop13 {
    public void forLoop()
    {
        for(int i=30;i<=50;i++){
            System.out.println(i);
        }
    }
    public void whileLoop()
    {
        int i=30;
        while (i<=50){
            System.out.println(i);
            i++;
        }

    }
    public void doWhileLoop()
    {
        int i=30;
        do{
            System.out.println(i);
            i++;
        }while (i<=50);
    }
    public static void main(String[] args) {
        Loop13 loop = new Loop13();
        loop.forLoop();
        loop.whileLoop();
        loop.doWhileLoop();
    }
}
