package com.loop;

public class PrimeFrom1to20 {
    public static boolean isPrime(int n){
        if(n==2) return true;
        for (int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int sum = 0;
        for(int i=0;i<20;i++)
        {
            if(isPrime(i))
            {
                sum+=i;
            }
        }
        System.out.println("Sum of Prime Numbers From 1 to 20 = "+sum);
    }
}
