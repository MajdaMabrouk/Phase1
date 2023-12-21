import Controllers.*;
import Models.Departement;
import Models.Enseignant;
import Models.Filiere;
import Services.DepartementServices;
import Services.FilieresServices;

import java.io.FileWriter;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Connection;

import static Services.DepartementServices.departements;
import static Services.EnseignantServices.enseignants;
import static Services.EnseignantServices.getEnseignantById;
import static Services.FilieresServices.filieres;

public class Main {

    public static void showPrincipalMenu(){
        System.out.println("-------------------------[ Bienvenu ]---------------------------");


        System.out.println("1: Pour gérer les départements");
        System.out.println("2: Pour gérer les filières");
        System.out.println("3: Pour gérer les enseignants");
        System.out.println("4: Pour gérer les modules");
        System.out.println("5: Pour gérer les étudiants");
        System.out.println("0: Pour sortir");

        System.out.println("Veuillez sélectionner une option : ");
        Scanner s =new Scanner(System.in);
        int option=s.nextInt();
        switch(option) {
            case 1:
                DepartementsController.showMenu();
                break;
            case 2:
                FilieresController.showMenu();
                break;
            case 3:
                EnseignantsController.showMenu();
                break;
            case 4:
                ModulesController.showMenu();
                break;
            case 5:
                EtudiantsController.showMenu();
                break;
            default:
                System.out.println("aucun de ces choix");
        }



    }
    public static void main(String[] args) {


        Enseignant enseignant = new Enseignant();
        enseignant.setNom("Majda");
        enseignant.setPrenom("Mabrouk");
        enseignant.setEmail("test@gmail.com");
        enseignant.setGrade("Prof");
        enseignant.setId(getEnseignantById());
        enseignants.add(enseignant);
        Departement dep =new Departement();
        dep.setIntitule("GEGM");
        dep.setChef(enseignant);
        dep.setId(DepartementServices.getDepartementId());
        departements.add(dep);
        Filiere filiere=new Filiere();
        filiere.setIntitule("PH");
        filiere.setChef(enseignant);
        filiere.setDept(dep);
        filiere.setId(FilieresServices.getFiliereById());
        filieres.add(filiere);

        showPrincipalMenu();
    }
}