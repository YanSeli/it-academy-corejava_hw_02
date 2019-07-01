package ru.javabegin.training.fastjava2.Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1_17 {
    public static void main(String[] args) throws IOException {
        //Вариант а)
        /*
        double x1= Math.pow(enterNum(), 2);
        double x2= Math.pow(enterNum(), 2);
        System.out.println(Math.sqrt(x1 + x2));
        */
        //Вариант б)
        /*
        int x1 = enterNum();
        int x2 = enterNum();
        int x3 = enterNum();
        int x4 = enterNum();
        System.out.println((x1*x2) + (x1*x3) + (x2*x3));
        */
        //Вариант в)
        /*
        int v = enterNum();
        int t = enterNum();
        int a = enterNum();
        System.out.println((v*t)+(a*Math.pow(t,2)/2));
        */
        //Вариант г)
        /*
        int m = enterNum();
        double v = Math.pow(enterNum(), 2);
        int g = enterNum();
        int h = enterNum();
        System.out.println((m * v) / 2 + (m * g * h));
        */
        //Вариант д)
        /*
        int r1 = enterNum();
        int r2 = enterNum();
        System.out.println((1 / r1) + (1 / r2));
        */
        //Вариант е)
        /*
        int m = enterNum();
        int g = enterNum();
        double a = Math.cos(enterNum());
        System.out.println(m * g * a);
        */
        //Вариант ж)
        /*
        int r = enterNum();
        System.out.println(2 * Math.PI * r);
         */
        //Вариант з)
        /*
        double b = Math.pow(enterNum(), 2);
        int a = enterNum();
        int c = enterNum();
        System.out.println(b - (4 * a * c));
        */
        //Вариант и)
        /*
        int y = enterNum();
        int m1 = enterNum();
        int m2 = enterNum();
        double r = Math.pow(enterNum(), 2);
        System.out.println(y * ((m1 * m2) / r));
        */
        //Вариант к)
        /*
        double i = Math.pow(enterNum(), 2);
        int r = enterNum();
        System.out.println(i * r);
        */
        //Вариант л)
        /*
        int a = enterNum();
        int b = enterNum();
        double c = Math.sin(enterNum());
        System.out.println(a * b * c);
        */
        //Вариант м)
        /*
        int a = enterNum();
        int b = enterNum();
        double c = Math.cos(enterNum());
        System.out.println(Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)) - 2 * a * b * c));
         */
        //Вариант н)
        /*
        int a = enterNum();
        int b = enterNum();
        int c = enterNum();
        int d = enterNum();
        System.out.println((a*d + b*c)/(a*d));
        */
        //Вариант о)
        /*
        double x = Math.pow((Math.sin(enterNum())), 2);
        System.out.println(Math.sqrt(1 - x));
         */
        //Вариант п)
        /*
        int a = enterNum();
        int b = enterNum();
        int c = enterNum();
        int x = enterNum();
        double d = 1 / (Math.sqrt(a * Math.pow(x, 2) + b * x + c));
        System.out.println(d);
         */
        //Вариант р)
        /*
        int x = enterNum();
        System.out.println(((Math.sqrt(x + 1)) + (Math.sqrt(x - 1))) / (2 * Math.sqrt(x)));
         */
        //Вариант с)
        /*
        int x = enterNum();
        System.out.println(Math.abs(x) + Math.abs(x + 1));
        */
        //Вариант т)
        int x = Math.abs(enterNum());
        System.out.println(Math.abs(1 - x));
    }

    //метод ввода числа
    static int enterNum() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите любое число");
        String s = br.readLine();
        int numMenu = Integer.parseInt(s);
        return numMenu;
    }
}