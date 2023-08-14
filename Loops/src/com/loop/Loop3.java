package com.loop;


//3. Write a Program To print 1 to 100 Odd nos.

public class Loop3 {
    public void forLoop()
    {
        for(int i=1;i<=100;i++){
            if(i%2!=0)
                System.out.println(i);
        }
    }
    public void whileLoop()
    {
        int i=1;
        while (i<=100)
        {
            if(i%2!=0)
                System.out.println(i);
            i++;
        }
    }
    public void doWhileLoop()
    {
        int i=1;
        do
        {
            if(i%2!=0)
                System.out.println(i);
            i++;
        }while (i<=100);
    }
    public static void main(String[] args) {
        Loop3 loop = new Loop3();
        loop.forLoop();
        loop.whileLoop();
        loop.doWhileLoop();
    }
}
