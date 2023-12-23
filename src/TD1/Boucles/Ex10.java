package TD1.Boucles;

import java.util.Scanner;

public class Ex10 {
    public static void main (String [] args)
    {
        Scanner s= new Scanner(System.in);
        for (int i = 100; i <= 999; i++) {
            int hundreds = i / 100;
            int tens = (i / 10) % 10;
            int units = i % 10;

            int sumOfCubes = (int) (Math.pow(hundreds, 3) + Math.pow(tens, 3) + Math.pow(units, 3));

            if (sumOfCubes == i) {
                System.out.println(i);
            }
        }
    }
}
