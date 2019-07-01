package ru.javabegin.training.fastjava2.Lesson2;

import org.omg.PortableInterceptor.INACTIVE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task7_20 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число n");
        String nS = br.readLine();
        int n = Integer.parseInt(nS);
        int a = 0;
        int a1 = 0;
        int a2 = 0;
        for (int i = 1; i <= n; i++) {
            String xS = br.readLine();
            int x = Integer.parseInt(xS);
            //Вариант а)
            /*
            if (i % 2 != 0){
                a = a + x;
            }
            else {
                a = a - x;
            }
            System.out.println(a);
            */
            //Вариант б)

            if (i ==1){
                a1 = x;
                System.out.println(a1+x);
            }

            //Вариант в)
            if (i == 2){
                a2 = x;
                System.out.println(a1 - a2);
            }

        }
    }
}