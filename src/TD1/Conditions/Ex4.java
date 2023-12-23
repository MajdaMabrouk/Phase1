package TD1.Conditions;

import java.util.Scanner;

public class Ex4 {
    public static void main(String [] args )
    {
        Scanner s =new Scanner(System.in);
        System.out.println("entrer la moyenne :");
        float moyenne =s.nextFloat();
        //1er methode
        if (moyenne >=16)
        { System.out.println(" tres bien"); }
        else if (moyenne >=14)
        { System.out.println(" bien"); }
        else if (moyenne >=12)
        { System.out.println("assez  bien"); }
        else if (moyenne >=10)
        { System.out.println("passable"); }
        else
        { System.out.println("note insuffisante"); }
    }
    /*2eme methode
    switch ((int)moyenne)
  { case 16 :
    case 17 :
    case 18 :
    case 19 :
    case 20 :
    System.out.println("mention tres bien ");
    break ;
    case 14 :
    case 15 :
    System.out.println("mention bien ");
    break ;
    case 12 :
    case 13 :
    System.out.println("assez bien ");
    break ;
    case 10 :
    case 11 :
    System.out.println("passable ");
    break ;
    default :
    System.out.println("aucune de ces choix ");}*/

}
