package com.seb;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();

        int x = 1 + r.nextInt(10);
        System.out.println("Generate 10 random integers between 1 and 6");

        System.out.println("My random number is " + x);

        System.out.println("Here are somes number from 1 to 6! ");
        for (int i = 1; i <= 50; ++i) {
            System.out.println(1 + r.nextInt(15) + "\t");
        }
        System.out.println();

//
    }
}
