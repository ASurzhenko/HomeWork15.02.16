/**
 * Created by Александр on 15.02.2016.
 */

//Даны 2 числа, определить делится ли первое число на второе без остатка
public class HomeWork3 {
    public static void main(String[] args) {
        int v1 = 14;
        int v2 = 7;

        if (v1 % v2 == 0) {
            System.out.println(v1 + " делится на " + v2 + " без остатка");
        } else {
            System.out.println(v1 + " не делится на " + v2 + " без остатка");
        }
    }
}
