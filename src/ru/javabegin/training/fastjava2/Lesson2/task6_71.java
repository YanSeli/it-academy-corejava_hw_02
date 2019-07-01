package ru.javabegin.training.fastjava2.Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class task6_71 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int bestChild;
        System.out.println("Введите рост первого ученика");
        String cC = br.readLine();
        int currentChild = Integer.parseInt(cC);
        System.out.println("Введите рост следующего ученика.");
        for (; ; ) {
            String tS = br.readLine();
            bestChild = Integer.parseInt(tS);
            if (bestChild < currentChild) {
                currentChild = bestChild;
                System.out.println("Список упорядочен");
            } else {
                System.out.println("Список не упорядочен");
                break;
            }

        }
    }
}
