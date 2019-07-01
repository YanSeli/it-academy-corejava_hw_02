package ru.javabegin.training.fastjava2.Lesson2;

public class task6_34 {
    public static void main(String[] args) {
        int count = 0;
        int x = 0;
        while (count <= 15) {
            if ((100 + x) % 19 == 0) {
                System.out.println(100 + x);
                count++;
            }
            x++;
        }
    }
}