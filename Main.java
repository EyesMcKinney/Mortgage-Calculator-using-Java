package com.IsaacM;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner PrincipalAmount = new Scanner(System.in);
        Scanner AnnualInterestRate = new Scanner(System.in);
        Scanner Time = new Scanner(System.in);

        int PA = 0;
        double MIR = 0;
        double Years = 0;

        System.out.println("Enter a Number between 1,000 and 1,000,000");
        while (true){
            System.out.print("Principal Amount?: ");
            PA = PrincipalAmount.nextInt();
            if (PA >= 1000 && PA <= 1000000)
                break;
            System.out.println("Enter a Number between 1,000 and 1,000,000");
        }

        while (true){
            System.out.println("Enter a number between 1 and 30");
            System.out.print("Annual Interest Rate?: ");
            double AIR = AnnualInterestRate.nextDouble();
            if (AIR >= 1 && AIR <= 30) {
                MIR = AIR / 100 / 12;
                break;
            }
            System.out.println("Enter a number between 1 and 30");
        }

        while (true) {
            System.out.println("Enter a number between 1 and 30");
            System.out.print("Years?: ");
            Years = Time.nextInt() * 12;
            if (Years >= 12 && Years <= 360) {
                break;
            }
            System.out.println("Enter a number between 1 and 30");
        }

        double Mortgage = PA * ((MIR * Math.pow(1 + MIR, Years)) / (Math.pow(1 + MIR, Years) - 1));
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(Mortgage);
        System.out.println(result);
    }

}

