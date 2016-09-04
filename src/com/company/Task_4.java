package com.company;

import java.util.Scanner;
public class Task_4 {
    private int n;
    public void Setn(){
        System.out.println("Введите число n");
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
    }
    public void Sum (){
        int S = n/10 + n%10;
        System.out.println("Сумма введенных цифр равна " + S );
    }
}
