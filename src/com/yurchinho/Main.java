package com.yurchinho;
import java.lang.String;
import java.util.Scanner;

public class Main {
    public  static  void Task1(double b, double c)
    {
        System.out.println("Завдання 1: Створити консольний застосунок згідно свого варіанта. Виконати завдання двома способами:\n");
        double a;
        try {
            if(b == 0) throw new Exception();
           /* if (c == 5) {
                System.out.println("Результат роботи: " + (Math.sqrt(b) + 2 * Math.sqrt(c)));
            }
            if (c == 0) {
                System.out.println("Результат роботи: " + (b / c - 8));
            }
            if (c == -5) {
                System.out.println("Результат роботи: " + (b + 12 * Math.pow(c, 4)));
            }

            */

            if(c == 5)
            {
                System.out.println("Результат роботи: " + (Math.sqrt(b) + 2*Math.sqrt(c)) + "\n");
            }
            else if(c == 0)
            {
                System.out.println("Результат роботи: " + (b /c -8) + "\n");
            }
            else if(c == -5)
            {
                System.out.println("Результат роботи: " + (b + 12 * Math.pow(c, 4)) + "\n");
            }
            else
            {
                System.out.println("ERROR 404"+ "\n");
            }

        }
        catch (Exception exception)
        {
            System.out.println("Сталась помилка\n"+ "\n");
        }
    }

    public static void Task2(int x)  //Дано ціле число х.Вивести рядок-опис даного числа вигляду: "парне від'ємне число", "число нуль", "непарне додатне число" і т.д.
    {

        System.out.println("Завдання 2: Вивести рядок-опис даного числа вигляду: \"парне від'ємне число\", \"число нуль\", \"непарне додатне число\" і т.д.");
        if(x == 0)
        {
            System.out.println("Число нуль!");
        }
        else if(x %2 ==0)
        {
            if(x > 0)
            {
                System.out.println("Парне додатне чило");
            }
            else
            {

                System.out.println("Парне від'ємне число");
            }
        }
        else
        {
            if(x > 0)
            {
                System.out.println("Непарне додатне чило");
            }
            else
            {
                System.out.println("Непарне від'ємне число");
            }
        }
    }

    public static void Task3(int number)
    {
        System.out.println("Завдання 3: Написати програму, яка в залежності від порядкового номера кольору у спектрі (1,2,...7) виводить його назву.");
        switch(number)
        {
            case 1: System.out.println("\nЧервоний"); break;
            case 2: System.out.println("\tПомаранчевий"); break;
            case 3: System.out.println("\tЖовтий"); break;
            case 4: System.out.println("\tЗелений"); break;
            case 5: System.out.println("\tБлакитний"); break;
            case 6: System.out.println("\tСиній"); break;
            case 7: System.out.println("\tФіолетовий");break;
            default:  System.out.println("\tПомилка! Введыть число від 1 до 7.");
        }
    }

    public static void Task4(int a, int b)
    {
        try {
            System.out.println("Завдання 4: Обчислити значення функції.");
            if(a==0||b==0)
            {
                throw new Exception();
            }

            System.out.println("Результат обчислення функції:\n" +  ((int)((2 * a - b) * (2 * b + a) / Math.sqrt(a - 2 * b) + 2 * b)));
        }
        catch (Exception ex)
        {
            System.out.println("Спрацювало виключення");
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {

        boolean bool = true;
        while (bool)
        {
            System.out.println("Головне меню.\n\t1 - Завдання №1.\n\t2 - Завдання №2\n\t3 - Завдання №3\n\t4 - Завдання №4");
            System.out.print("Введіть цифру від 1 до 4: ");
            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Введіть b: ");
                    Scanner in1 = new Scanner(System.in);
                    double b = in.nextDouble();
                    System.out.println("Введіть c: ");
                    Scanner in2 = new Scanner(System.in);
                    double c = in.nextDouble();
                    Task1(b,c); break;
                case 2:
                    System.out.println("Введіть цифру: ");
                    Scanner in3 = new Scanner(System.in);
                    int number = in.nextInt();
                    Task2(number); break;
                case 3:
                    System.out.println("Введіть цифру: ");
                    Scanner in4 = new Scanner(System.in);
                    int number2 = in.nextInt();
                    Task3(number2);
                    break;
                case 4:
                    System.out.println("Введіть a: ");
                    Scanner in5 = new Scanner(System.in);
                    int a = in.nextInt();
                    System.out.println("Введіть b: ");
                    Scanner in6 = new Scanner(System.in);
                    int b2 = in.nextInt();
                    Task4(a , b2);
                    break;
                default: System.out.println("Неправильно введене число! Спробуйте ще раз.");
            }
            System.out.println("Якщо хочете прожовжити або закінчити програму натисніть:\n\t1 - Якщо хочете продовжити.\n\t2 - Якщо хочете закінчити.");
            Scanner in2 = new Scanner(System.in);
            int choice2 = in.nextInt();
            if(choice2 == 1)
            {
                bool = true;
            }
            else
            {
                bool = false;
            }
        }
    }
}
