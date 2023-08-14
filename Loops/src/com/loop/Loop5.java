package com.loop;


// 5. Write a Program To print sum of 1 to 50 Odd nos.

public class Loop5 {
    public void forLoop()
    {
        int sum=0;
        for(int i=1;i<=50;i++){
            if(i%2!=0)
                sum+=i;
        }
        System.out.println(sum);
    }
    public void whileLoop()
    {
        int i=1,sum=0;
        while (i<=50)
        {
            if(i%2!=0)
                sum+=i;
            i++;
        }
        System.out.println(sum);
    }
    public void doWhileLoop()
    {
        int i=1,sum=0;
        do {
            if(i%2!=0) {
                sum += i;
            }
            i++;
        }while (i<=50);
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Loop5 loop = new Loop5();
        loop.forLoop();
        loop.whileLoop();
        loop.doWhileLoop();
    }
}
