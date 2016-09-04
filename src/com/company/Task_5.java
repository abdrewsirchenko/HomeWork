package com.company;

import java.util.Scanner;
public class Task_5 {
    private double n;
    private double k;
    public void Setparameters(){
        System.out.println("Введите первое целое число");
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        n = in.nextDouble();
        System.out.println("Введите второе целое число");
        k = in.nextDouble();
    }
    private double x;
    private double y;
    public void Selection (){
        if (n - 10 > 0)
        { x = n - 10;}

        else {
            x = 10 - n;
        }
        if (k - 10 > 0)
        { y = k - 10;}
        else {
            y = 10 - k;
        }
        if (y > x) System.out.println("Ближайшее введенное число к десяти " + n);
        else System.out.println("Ближайшее введенное  число к десяти " + k);
    }
}
