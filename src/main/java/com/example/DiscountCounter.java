package com.example;

public class DiscountCounter {

    public static void main(String[] args) {

        int discount_0_number = 0;
        int discount_5_number = 0;
        int discount_10_number = 0;
        int discount_15_number = 0;
        int discount_25_number = 0;
        int discount_30_number = 0;

    for (int vipCounter = 0; vipCounter < 2; vipCounter++) {
        boolean vipStatus;
//        if (vipCounter == 0) {
//            vipStatus = false;
//        } else {
//            vipStatus = true;
//        }
//        vipStatus = (vipCounter == 0) ? true : false;
//        vipStatus = (vipCounter == 0);
//      vipStatus = !(vipCounter == 0);
//    if vipCounter == 0 then VipStatus = false
//        vipStatus = !(vipCounter == 0); if vipCounter != 0 then VipStatus = true
        for (int age = 16; age < 81; age++) {
//            int discount = Discount.getDiscount(age, vipStatus);
            int discount = Discount.getDiscount(age, !(vipCounter == 0));
    //        System.out.println("age = " + age + "; discount = " + discount); ctrl + /
            if (discount == 0) {
                discount_0_number++;
            } else if (discount == 5) {
                discount_5_number++;
            } else if (discount == 10) {
                discount_10_number++;
            } else if (discount == 15) {
                discount_15_number++;
            } else if (discount == 25) {
                discount_25_number++;
            } else if (discount == 30) {
                discount_30_number++;
            } else {
                System.out.println("Unexpected discount!!! ->" + discount);
            }
        }
    }
        System.out.println("discount_0_number = " + discount_0_number);
        System.out.println("discount_5_number = " + discount_5_number);
        System.out.println("discount_10_number = " + discount_10_number);
        System.out.println("discount_15_number = " + discount_15_number);
        System.out.println("discount_25_number = " + discount_25_number);
        System.out.println("discount_30_number = " + discount_30_number);
    }
}
