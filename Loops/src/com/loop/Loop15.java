package com.loop;


// 15. Write a Program To print count of odd No 1 to 25 no.

public class Loop15 {
    public void forLoop()
    {
        int count=0;
        for(int i=1;i<=25;i++){
            if(i%2!=0)
                count++;
        }
        System.out.println(count);
    }
    public void whileLoop()
    {
        int count=0;
        int i=1;
        while (i<=25){
            if(i%2!=0)
                count++;
            i++;
        }
        System.out.println(count);
    }
    public void doWhileLoop()
    {
        int count=0;
        int i=1;
        do{
            if(i%2!=0)
                count++;
            i++;
        }while (i<=25);
        System.out.println(count);
    }
    public static void main(String[] args) {
        Loop15 loop = new Loop15();
        loop.forLoop();
        loop.whileLoop();
        loop.doWhileLoop();
    }
}
