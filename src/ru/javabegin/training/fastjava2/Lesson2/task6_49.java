package ru.javabegin.training.fastjava2.Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task6_49 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);
        //Вариант а)
        if (n % 10 == 3 || n / 10 == 3) {
            System.out.println("В числе есть цифра 3");
        } else {
            System.out.println("В числе нет цифры 3");
        }
        //Вариант б)
        if ((n % 10 == 2 || n / 10 == 2) && (n % 10 == 5 || n / 10 == 5)) {
            System.out.println("В числе есть цифры 2 и 5");
        } else {
            System.out.println("В числе нет цифр 2 и 5");
        }
    }
}
