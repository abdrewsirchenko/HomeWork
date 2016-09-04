package com.company;

import java.util.Scanner;
public class Task_3 {
    private int n;
    public void Setn(){
        System.out.println("Введите число n");
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
    }
    public void Parity (){
        if (n%2 == 0)
            System.out.println("Введенное число четное");
        else
            System.out.println("Введенное число нечетное");
    }


}