package com.loop;


// 7. Write a Program To print -45 to +45 nos.  // negative no and positive no

public class Loop7 {
    public void forLoop()
    {
        for(int i=-45;i<=45;i++){
            System.out.println(i);
        }
    }
    public void whileLoop()
    {
        int i=-45;
        while (i<=45) {
            System.out.println(i);
            i++;
        }
    }
    public void doWhileLoop()
    {
        int i=-45;
        do {
            System.out.println(i);
            i++;
        }while (i<=45);
    }
    public static void main(String[] args) {
        Loop7 loop = new Loop7();
        loop.forLoop();
        loop.whileLoop();
        loop.doWhileLoop();
    }
}
