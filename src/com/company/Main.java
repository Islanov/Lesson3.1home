package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] men = {1.13, -12.1, 13.12, 15.5, 5.21, -2.25, -3.14, 6.15, 12.56, -40.45, 6.80, -20.57, 4.88, 5.1, 85.5}; // double это дробные числа
        double summa = 0; // summa 0 для того чтобы сохр.положительное число
        int amountNumber = 0; //
        boolean isPositive = false;

        for (double i : men) {
            if (i < 0) {
                isPositive = true;
            } else if (isPositive) {
                summa += i;
                amountNumber++;

            }


        }
        System.out.println(men);
        System.out.println(summa);
        System.out.println("Среднее арифметичиское:" + summa / amountNumber);


        boolean sortNumbers = false;
        while (!sortNumbers) {
            sortNumbers = true;
            for (int i = 1; i < men.length; i++) {
                if (men[i] < men[i - 1]) {
                    double women = men[i];
                    men[i] = men[i - 1];
                    men[i - 1] = women;
                    sortNumbers = false;
                }

            }
            for (int i = 0; i < men.length; i++) {
                if (i < 0) {
                    System.out.println(", ");
                }
            }
            System.out.println(Arrays.toString(men));
        }
    }
}



