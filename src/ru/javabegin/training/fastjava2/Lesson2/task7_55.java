package ru.javabegin.training.fastjava2.Lesson2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task7_55 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int bestTime;
        System.out.println("Введите первый результат");
        String cB = br.readLine();
        int currentBestTime = Integer.parseInt(cB);
        System.out.println("Введите следующий результат.");
        for (; ; ) {
            String tS = br.readLine();
            bestTime = Integer.parseInt(tS);
            if (bestTime < currentBestTime) {
                currentBestTime = bestTime;
                System.out.println("Лучшее время" + currentBestTime);
            } else {
                System.out.println("Лучшее время" + currentBestTime);
            }

        }
    }
}