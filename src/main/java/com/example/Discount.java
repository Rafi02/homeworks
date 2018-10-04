package com.example;

import java.sql.SQLOutput;

public class Discount {
    public static void main(String[] args) {
        int age = 40;
        boolean isVip = true;
        System.out.println("discount = " + getDiscount(age, isVip));
        System.out.println("discount = " + getDiscount(10, true));
        System.out.println("discount = " + getDiscount(70, false));
    }
public static int getDiscount (int age, boolean isVip) {
    int discount = 0;
    if (age > 64)   {
        discount = 10;
    } else if (age < 18) {
        discount = 25;
    }
    if (isVip) {
        discount = discount + 5;
    }
        return discount;
}
}
