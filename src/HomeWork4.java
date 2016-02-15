/**
 * Created by Александр on 15.02.2016.
 */

//Найти ближайшее к 10 из 2х заданных чисел. Например, среди чисел 8 и 11 ближайшее к десяти 11
public class HomeWork4 {
    public static void main(String[] args) {
        int v1 = 11;
        int v2 = 13;

        if (v1 < 10 && v2 < 10) {
            if (10 - v1 > 10 - v2) {
                System.out.println(v2 + " ближе к 10 чем " + v1);
            } else if (10 - v1 == 10 - v2) {
                System.out.println("оба числа одинаково близки к 10");
            } else {
                System.out.println(v1 + " ближе к 10 чем " + v2);
            }

        } else if (v1 > 10 && v2 < 10) {
            if (v1 - 10 > 10 - v2) {
                System.out.println(v2 + " ближе к 10 чем " + v1);
            } else if (v1 - 10 == 10 - v2) {
                System.out.println("оба числа одинаково близки к 10");
            } else {
                System.out.println(v1 + " ближе к 10 чем " + v2);
            }

        } else if (v1 < 10 && v2 > 10) {
            if (10 - v1 > v2 - 10) {
                System.out.println(v2 + " ближе к 10 чем " + v1);
            } else if (10 - v1 == v2 - 10) {
                System.out.println("оба числа одинаково близки к 10");
            } else {
                System.out.println(v1 + " ближе к 10 чем " + v2);
            }

        } else {
            if (v1 - 10 > v2 - 10) {
                System.out.println(v2 + " ближе к 10 чем " + v1);
            } else if (10 - v1 == 10 - v2) {
                System.out.println("оба числа одинаково близки к 10");
            } else {
                System.out.println(v1 + " ближе к 10 чем " + v2);
            }
        }
    }
}
