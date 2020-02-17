package com.pingan.second;

public class SeriesOrder {
    public static void main(String[] args) {
        printSeries(100);
    }


    public static void printSeries(int n) {
        int temp = n / 2;
        int k = 1;
        if (n % 2 == 0) {
            for (; n > temp; n--) {
                System.out.print(n);
                System.out.print(",");
                //另外一半
                System.out.print(k);
                if (k != temp) {
                    System.out.print(",");
                }
                k++;
            }
        } else if (n % 2 == 1) {
            for (; n > (temp+1); n--) {
                System.out.print(n);
                System.out.print(",");
                //另外一半
                System.out.print(k);
                System.out.print(",");
                k++;
            }
            System.out.println(k);

        }

    }


}
