package ru.javabegin.training.fastjava2.Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task5_38 {
    public static void main(String[] args) throws IOException {
        int way = 1000; //расстояние в метрах
        int wayAfter1Iter = way + (way/2) + 130 + 140;
        int n = 100;
        int allWay = wayAfter1Iter * (100/4);
        int w = 0;
        for (int i = 0; i < n; i++){

        }
    //Вариант б)
        System.out.println("Всего прошел за " + n + " этапов " + allWay/1000 + " км.");
    //Вариант а)
    //System.out.println("После " + n + " этапов, находится на расстоянии " + w/1000 + " км. от дома.");

    }
}