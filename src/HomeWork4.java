/**
 * Created by Александр on 15.02.2016.
 */

//Найти ближайшее к 10 из 2х заданных чисел. Например, среди чисел 8 и 11 ближайшее к десяти 11
public class HomeWork4 {

    public static void main(String[] args) {

        int v1 = 8;
        int v2 = 13;

        int abs_v1 = v1 > 10 ? v1 - 10 : 10 - v1;
        int abs_v2 = v2 > 10 ? v2 - 10 : 10 - v2;

        if (abs_v1 > abs_v2) {
            System.out.println(v2 + " ближе к 10 чем " + v1);
        } else if (abs_v2 > abs_v1) {
            System.out.println(v1 + " ближе к 10 чем " + v2);
        } else {
            System.out.println("оба числа одинаково близки к 10");
        }
    }
}

