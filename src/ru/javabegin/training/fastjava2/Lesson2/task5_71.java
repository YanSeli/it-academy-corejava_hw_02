package ru.javabegin.training.fastjava2.Lesson2;

public class task5_71 {
    public static void main(String[] args) {
        int rubles = 1000;
        double profit1 = 0;
        double profit2 = 0;
        double sum = 0;
        //Вариант а)
        for (int i = 1; i <= 10; i++) {
            profit1 = profit1 + rubles * 0.02;
            System.out.println("Через " + i + " месяцев прирост суммы составит: " + profit1 + " рублей");
        }
        //Вариант б)
        for (int i = 1; i <= 12; i++) {
            profit2 = profit2 + rubles * 0.02;
            sum = rubles + profit2;
            if (i >= 3) {
                System.out.println("Сумма вклада чере " + i + " месяцев составит " + sum + " рублей");
            }
        }
    }
}
