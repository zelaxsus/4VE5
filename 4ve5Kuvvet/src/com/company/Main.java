package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int log;
        System.out.println("Bir sayı giriniz");
        log=inp.nextInt();
        System.out.println("4 ile");
        for(int i=1; i<=log; i*=4)
        {
            System.out.println(i);
        }
        System.out.println("5 İLE");
        for(int i=1; i<=log; i*=5)
        {
            System.out.println(i);
        }
    }
}
