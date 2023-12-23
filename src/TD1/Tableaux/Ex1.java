package TD1.Tableaux;

import java.util.Random;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        int N=10+new Random().nextInt(41);
        int [] T = new int[N];
        //remplissage du tableau
        for (int i=0;i<=N ;i++)
            T[i]=1+new Random().nextInt(100);
        //max ,min
        int  max=T[0],min=T[0];
        for (int i=0;i<N;i++)
        {
            if(T[i]<min )
                min=T[i];
            if(T[i]>max )
                max=T[i];
        }
        System.out.println("le max :"+max );
        System.out.println("le min:"+min );

    }
}
