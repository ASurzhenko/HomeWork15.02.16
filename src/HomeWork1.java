/**
 * Created by Александр on 15.02.2016.
 */
public class HomeWork1 {
    public static void main(String[] args) {
        int v1 = 100;
        int v2 = 10;
        int v3 = 10;

        if(v1 <= v2 && v1 <= v3)
            System.out.println("Min is " + v1);
        if(v2 <= v1 && v2 <= v3)
            System.out.println("Min is " + v2);
        if(v3 <= v1 && v3 <= v2)
            System.out.println("Min is " + v3);
    }
}
