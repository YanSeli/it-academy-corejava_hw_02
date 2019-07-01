package ru.javabegin.training.fastjava2.Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task7_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число а: ");
        String aS = br.readLine();
        int a = Integer.parseInt(aS);
        System.out.println("Введите число b: ");
        String bS = br.readLine();
        int b = Integer.parseInt(bS);
        System.out.println("Введите число c: ");
        String cS = br.readLine();
        int c = Integer.parseInt(cS);
        for (int i = a; i < b; i++){
            if (i%c==0){
                System.out.println(i + "- кратно с");
            }
        }
    }
}
