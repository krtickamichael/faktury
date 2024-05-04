package com.engeto.invoice;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        String item = "trekové boty sedmimílovky";
        int quantity = 3;
        double weight = 0.45;
        int price = 1300;
        LocalDate dateofissue = LocalDate.of(2022,4,7);
        boolean isDiscounted = true;

        double totalWeight = (quantity * weight);
        System.out.println("Celková váha je " +totalWeight +"Kg");

        int totalPrice = (quantity * price);
        System.out.println("Celková cena je " +totalPrice +"Kč");

        int shippingPrice = 45;
        System.out.println("Celková cena po započtení dopravy je " +(totalPrice + shippingPrice) +"Kč");

        int Discount = (totalPrice/100)*5;
        System.out.println("Velikost slevy "+Discount);
        System.out.println("Celková cena po započtení slevy 5% je " +(totalPrice - Discount + shippingPrice) +"Kč");

        if (isDiscounted)
        {
            System.out.println("Máte nárok na slevu");
        } else {
            System.out.println("nemáte nárok na slevu");
        }

        int count= 3;
        for (int i=0; i < count; i++){
            System.out.println("trekové boty sedmimílovky");
        }

    }
}