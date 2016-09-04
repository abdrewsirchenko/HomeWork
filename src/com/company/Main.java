package com.company;

import java.util.Scanner;
public class Main {
    public static void main (String [] args) {
        System.out.println("Введите номер задания");
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        int numberTask = in.nextInt();
        System.out.println("Вы выбрали задание " +numberTask);
        switch (numberTask){
            case 1: {Task_1 a = new Task_1();
                a.out_variables();
                break;}
            case 2:{ Dog myDog = new Dog();
                Dog myDog1 = new Dog();
                myDog.SetParameters("spot" , "Ruff!");
                myDog.GetParameters();
                myDog1.SetParameters("scruffy", "Wurf!");
                myDog1.GetParameters();
                break;
            }
            case 3: {Task_3 a = new Task_3();
                a.Setn();
                a.Parity();
                break;
            }
            case 4: {Task_4 a = new Task_4();
                a.Setn();
                a.Sum();
                break;
            }
            case 5: {Task_5 a = new Task_5();
                a.Setparameters();
                a.Selection();
            }
        }
    }
}