package ru.javabegin.training.fastjava2.Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task6_82 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите любое натуральное число.");
        String s = br.readLine();
        int n = Integer.parseInt(s);
        int min = n % 10;
        int max = n % 10;
        while (n>0){
            if (n%10>max){
                max = n%10;
            }else if (n%10<min){
                min = n%10;
            }
            n = n/10;
    }
        System.out.println("max = "+max);
        System.out.println("min = "+min);
        if ((max - min)%2==0){
            System.out.println("Разность четная");
        }else{
            System.out.println("Разность не четная");
        }
}
}
