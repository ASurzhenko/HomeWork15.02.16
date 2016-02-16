/**
 * Created by Александр on 16.02.2016.
 */
public class HomeWork4WitFunction {
    public static int result(int number) {
        if (number < 0) {
            number = -number;
        }
        return number;
    }

    public static void main(String[] args) {

        int v1 = 2;
        int v2 = 13;

        int res1 = result(10 - v1);
        int res2 = result(10 - v2);
        if (res1 > res2) {
            System.out.println(v2 + " ближе к 10 чем " + v1);
        } else if (res2 > res1) {
            System.out.println(v1 + " ближе к 10 чем " + v2);
        } else {
            System.out.println("оба числа одинаково близки к 10");
        }
    }
}
