package ru.javabegin.training.fastjava2.Lesson2;

public class task5_12 {
    public static void main(String[] args) {
        double p0 = 1.29;
        double z = 1.25 * Math.pow(10, -4);
        System.out.println("Таблица зависимости плотности воздуха от высоты");
        for (double h = 0; h <= 1000; h = h + 100) {
            double a = (-(h * z));
            double p = p0 * (Math.exp(a));
            System.out.println("h = " + h + "       " + "P = " + p);

        }
    }
}
