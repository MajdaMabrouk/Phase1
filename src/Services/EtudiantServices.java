package Services;

import Models.Etudiant;
import Models.Filiere;
import java.util.ArrayList;
public class EtudiantServices {
    public static  ArrayList<Etudiant>etudiants=new ArrayList<Etudiant>();
    //Ajouter/modifier/supprimer /pour incremnter id
    public static int Etu=0;
    public static int getEtudiantById(){
        Etu++;
        return Etu;
    }
    public static Etudiant addEtudiant(String nom ,String Prenom ,String email ,int apogee ,Filiere filiere){
        Etudiant etudiant =new Etudiant();
        etudiant.setNom(nom);
        etudiant.setPrenom(Prenom);
        etudiant.setEmail(email);
        etudiant.setApogee(apogee);
        etudiant.setFiliere(filiere);
        etudiant.setId(getEtudiantById());

        etudiants.add(etudiant);

        return etudiant ;

    }
    public  static Etudiant updateEtudiant ( int id ,String nom ,String Prenom ,String email ,int apogee,Filiere filiere) {
        for(Etudiant etudiant :etudiants){
            if (etudiant.getId() == id) {
                etudiant.setNom(nom);
                etudiant.setPrenom(Prenom);
                etudiant.setEmail(email);
                etudiant.setApogee(apogee);
                etudiant.setFiliere(filiere);
                return etudiant;
            }
        }
        return new Etudiant();

    }
    public static  ArrayList<Etudiant> deleteEtudiant(int id ){
        etudiants.remove(etudiantByid(id));
        return etudiants ;

    }

    public  static Etudiant etudiantByid(int id){
        for(Etudiant etudiant :etudiants ){
            if (etudiant.getId()==id ){
                return etudiant;
            }
        }
        return new Etudiant();
    }
}
