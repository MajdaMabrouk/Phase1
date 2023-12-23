package TD1.Boucles.Ex3;

import java.util.Scanner;

public class Quest1 {
    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= 20; i++)
        {
            System.out.println("enter le nombre " +i);
            int N = s.nextInt();
            if (N> max )
                max =N ;

        }
        System.out.println(" le max de ces nombres est : " +max);



    }
}
