package com.codegnan.oop.interfaces;

import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); // dummy input (ignored)

        Vehicle v = new Car1();
        System.out.println(v.move());
        }
    }