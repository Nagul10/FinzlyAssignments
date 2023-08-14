package com.loop;

//2. Write a Program To print 25 to 1 nos.

public class Loop2 {
    public void forLoop()
    {
        for (int i=25;i>=1;i--)
        {
            System.out.println(i);
        }
    }
    public void whileLoop()
    {
        int i=25;
        while (i>=1)
        {
            System.out.println(i);
            i--;
        }
    }
    public void doWhileLoop()
    {
        int i=25;
        do
        {
            System.out.println(i);
            i--;
        }while (i>=1);
    }
    public static void main(String[] args) {
        Loop2 loop = new Loop2();
        loop.forLoop();
        loop.whileLoop();
        loop.doWhileLoop();
    }
}
