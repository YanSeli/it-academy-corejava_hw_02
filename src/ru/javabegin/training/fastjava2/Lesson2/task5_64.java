package ru.javabegin.training.fastjava2.Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task5_64 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nmDistr = 12;
        double nmPeople = 0;
        double areaDistr = 0;
        for (int i = 1; i <= nmDistr; i++) {
            System.out.println("Введите количетво человек для района " + i);
            String nmS = br.readLine();
            double nm = Double.parseDouble(nmS);
            nmPeople = nmPeople + nm;
        }
        for (int i = 1; i <= nmDistr; i++) {
            System.out.println("Введите площадь района " + i);
            String nmS = br.readLine();
            double ar = Double.parseDouble(nmS);
            areaDistr = areaDistr + ar;
        }
        System.out.println("Средняя плотность населения области - " + nmPeople/areaDistr + "тыс. чел/км.кв");
    }
}
