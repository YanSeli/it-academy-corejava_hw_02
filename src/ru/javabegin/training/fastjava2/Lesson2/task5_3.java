package ru.javabegin.training.fastjava2.Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task5_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Вариант а)
        /*for (int i = 20; i >= 35; i++) {
            System.out.println(i);
        }*/
        //Вариант б)
        /*System.out.println("Введите число b в диапазоне от 1 до 10");
        String endS;
        int b;
        do {
            endS = br.readLine();
            b = Integer.parseInt(endS);
        } while (b < 10);
        for (int i = 10; i <= b; i++) {
            System.out.println(i * i);
        }*/
        //Вариант в)
        /*System.out.println("Введите число a в диапазоне от 1 до 50");
        String endS;
        int a;
        do {
            endS = br.readLine();
            a = Integer.parseInt(endS);
        } while (a > 50);
        for (int i = a; i <= 50; i++){
            System.out.println("Число а в третьей степени " + Math.pow(i, 3));
        }*/
        //Вариант г)
        System.out.println("Введите число a.");
        String endS = br.readLine();
        int a = Integer.parseInt(endS);
        System.out.println("Введите число b большое, либо равное числу а.");
        String endSb;
        int b;
        do {
            endSb = br.readLine();
            b = Integer.parseInt(endSb);
        } while (b < a);
        for (int i = a; i <= b; i++){
            System.out.println(i);
        }
    }
}
