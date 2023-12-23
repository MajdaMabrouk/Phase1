package TD1.Boucles.Ex3;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int position = 0, i = 0;
        int number;
        do {
            System.out.println("entrer 0 pour arreter ");
            number = s.nextInt();
            i++;
            if (number > max) {
                max = number;
                position = i;
            }
        } while (number != 0);
        System.out.println("le max de ces nombres est : " +max+ " sa position " +position);
    }
}
