package com.company;

public class SwapingWithThree {
    public static void SwapWithThree(int a, int b){
        System.out.println("A before : "+ a + " B before : "+ b);
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
        System.out.println("A after : "+a+" B after : "+b);
    }
}
