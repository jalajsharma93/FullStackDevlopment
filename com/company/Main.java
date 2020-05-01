package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers for Swaping ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Swaping with Two Number");
        SwapingWithTwo swt = new SwapingWithTwo();
        swt.swapWithTwo(a,b);
        System.out.println("Swaping with Three Number");
        SwapingWithThree sw = new SwapingWithThree();
        sw.SwapWithThree(a,b);

        //Adding two number and have third variable.
        System.out.println("Enter numbers for Adding ");
        AddingTwoBetween atb = new AddingTwoBetween();
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x >= 1 && x<=10 && y>=1 && y<= 10) {
            System.out.println("Addition : " + atb.adding(x, y));
        }else{
            System.out.println("Entered number are not between 1 to 10");
        }
        //Test for divisibility
        DivisibilityTest dt = new DivisibilityTest();
        System.out.println("Entered number to test divisibility");
        int n = sc.nextInt();
        dt.test(n);
        //for Formatting String
        StringFormatting sf = new StringFormatting();
        sf.formatting();
    }
}
