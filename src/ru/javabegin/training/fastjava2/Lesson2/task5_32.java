package ru.javabegin.training.fastjava2.Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task5_32 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число a.");
        String endS = br.readLine();
        int a = Integer.parseInt(endS);
        double b = 0;
        for (int i = 1; i <= a; i++) {
            b = b + (double) 1 / i;
        }
        System.out.println(1 + b);
    }
}
