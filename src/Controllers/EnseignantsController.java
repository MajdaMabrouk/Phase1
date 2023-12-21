package Controllers;

import Models.Enseignant;
import Services.DepartementServices;
import Services.EnseignantServices;
import static Services.EnseignantServices.enseignants;
import static java.util.Objects.isNull;
import java.util.Scanner;
public class EnseignantsController {
    public static void showMenu(){
        System.out.println("***********************[ enseignants ]**************************");

        System.out.println("1: Pour ajouter un enseignant");
        System.out.println("2: Pour afficher les enseignants");
        System.out.println("3: Pour modifier un enseignant");
        System.out.println("4: Pour supprimer un enseignant");
        System.out.println("0: Pour retourner au menu principal");

        Scanner s =new Scanner(System.in);

        System.out.println ("Veuillez sélectionner une option : ");
        int option =s.nextInt();
        switch(option) {
            case 1:
                createEnseignant();
                break;
            case 2:
                showEnseignants();
                break;
            case 3:
                editEnseignant();
                break;
            case 4:
                destroyEnseignant();
                break;
            default:
                showMenu();
        }
    }
    public static void showEnseignants(){
        for (Enseignant enseignant : enseignants) {
            System.out.print("Id : " + enseignant.getId());
            System.out.print(" | nom : " + enseignant.getNom());
            System.out.print(" | prenom : " + enseignant.getPrenom());
            System.out.print(" | email : " + enseignant.getEmail());
            System.out.print(" | grade : " + enseignant.getGrade());
            if (! isNull(enseignant.getDept())) {
                System.out.print(" | departement : " + enseignant.getDept().getIntitule() );}
            else {
                System.out.print(" | departement : " + enseignant.getDept());}
            System.out.println("");

        }

    }

    public static void createEnseignant(){
        Scanner s =new Scanner (System.in);
        System.out.println("Entrez Nom  :");
        String nom=s.nextLine();
        System.out.println("Entrez Prenom :");
        String prenom =s.nextLine();
        System.out.println("email :");
        String email =s.nextLine();
        System.out.println("Entrez grade :");
        String grade =s.nextLine();
        DepartementsController.showDepartements();
        System.out.println("Sélecionnez un departement  par id :");
        int id =s.nextInt();
        EnseignantServices.addEnseignant(nom ,prenom , email , grade ,DepartementServices.DepartementByid(id));
        showEnseignants();
        showMenu();
    }
    public static void editEnseignant(){
        showEnseignants();
        Scanner s =new Scanner(System.in);
        System.out.println("Sélecionnez un enseigant par id");
        int id =s.nextInt();
        s.nextLine();
        System.out.println("Entrez Nom  :");
        String nom=s.nextLine();
        System.out.println("Entrez Prenom :");
        String prenom =s.nextLine();
        System.out.println("email :");
        String email =s.nextLine();
        System.out.println("Entrez grade :");
        String grade =s.nextLine();
        DepartementsController.showDepartements();
        System.out.println("Sélecionnez un departement par id");
        int id1=s.nextInt();
        EnseignantServices.updateEnseignant(id,nom ,prenom,email,grade, DepartementServices.DepartementByid(id1));
        showEnseignants();
        showMenu();

    }
    public static void destroyEnseignant(){
        Scanner s=new Scanner (System.in);
        showEnseignants();
        System.out.println("Sélecionnez un enseigant par id :");
        int id =s.nextInt();
        EnseignantServices.deleteEnseignant(id);
        showEnseignants();
    }

}
