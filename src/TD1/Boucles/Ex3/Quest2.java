package TD1.Boucles.Ex3;

import java.util.Scanner;

public class Quest2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int position =0;

        for (int i = 1; i <= 20; i++)
        {
            System.out.println("enter le nombre " +i);
            int N = s.nextInt();
            if (N> max )
            {  max =N ;
                position=i;

            }

        }
        System.out.println(" le max de ces nombres est : " +max+ " sa position : " + position);


    }
}
