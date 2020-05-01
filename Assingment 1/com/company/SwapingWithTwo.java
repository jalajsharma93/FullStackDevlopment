package com.company;
import java.util.Scanner;
public class SwapingWithTwo{
    public static void swapWithTwo(int a, int b){
        System.out.println("A before : "+ a + " B before : "+ b);
	    a = a+b;
	    b=a-b;
	    a=a-b;
	    System.out.println("A after : "+a+" B after : "+b);
    }
}

