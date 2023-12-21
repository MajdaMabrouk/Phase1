package Services;

import Models.Departement;
import Models.Enseignant;
import java.util.ArrayList;


public class EnseignantServices {
    public static ArrayList<Enseignant>enseignants=new ArrayList<Enseignant>();
    //Ajouter/modifier/supprimer /pour incremnter id
    public static int Ens=0;
    public static int getEnseignantById(){
        Ens++;
        return Ens;
    }
    public static  Enseignant addEnseignant(String nom ,String Prenom ,String email ,String grade ,Departement departement){
        Enseignant enseignant =new Enseignant ();
        enseignant.setNom(nom);
        enseignant.setPrenom(Prenom);
        enseignant.setEmail(email);
        enseignant.setGrade(grade);
        enseignant.setDept(departement);
        enseignant.setId(getEnseignantById());



        enseignants.add(enseignant);
        return enseignant ;
    }
    public  static Enseignant updateEnseignant ( int id ,String nom ,String Prenom ,String email ,String grade ,Departement departement) {
        for(Enseignant enseignant :enseignants){
            if (enseignant.getId() == id) {
                enseignant.setNom(nom);
                enseignant.setPrenom(Prenom);
                enseignant.setEmail(email);
                enseignant.setGrade(grade);
                enseignant.setDept(departement);
                return enseignant;
            }
        }
        return new Enseignant();

    }
    public static  ArrayList<Enseignant> deleteEnseignant(int id ){
        enseignants.remove(enseignantByid(id));
        return enseignants ;

    }

    public  static Enseignant enseignantByid(int id){
        for(Enseignant enseignant :enseignants ){
            if (enseignant.getId()==id ){
                return enseignant;
            }
        }
        return new Enseignant();
    }
}
