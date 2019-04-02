package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner d = new Scanner(System.in);
        System.out.println("Fibonaci");
        System.out.print("Masukan : ");
        int angka = d.nextInt();
        System.out.println("jumlah : "+fibonacci(angka));
//        long array[] = new long[angka];
//
//        array[0] = 0;
//        array[1] = 1;
//
//        for (int i = 2; i < angka ; i++) {
//            array[i] = array[i-1] + array[1+2];
//        }
//        for (int i = 0; i <angka ; i++) {
//            System.out.print(array[i]+" ");


    }

    static int fibonacci(int angka) {
        if ((angka == 1) || (angka == 2))
                return (1);
        else
            return (fibonacci(angka - 1)+fibonacci(angka - 2));

    }

}

