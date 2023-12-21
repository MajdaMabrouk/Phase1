package Services;

import Models.Departement;
import Models.Enseignant;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class DepartementServices {
    public static ArrayList<Departement>departements=new ArrayList<Departement>();
    //Ajouter/modifier/supprimer /pour incremnter id
    static int DeptId=0;
    public static int getDepartementId(){
        DeptId++;
        return DeptId;
    }
    private static final String url = "jdbc:mysql://localhost:3306/JDBCJAVA";
    private static final String user = "root";
    private static final String password = ""; // Mettez votre mot de passe si nécessaire

    public static void createTable(Connection cx) throws SQLException {
        String query = "CREATE TABLE IF NOT EXISTS departements (" +
                "id int primary key auto_increment, " +
                "intitule varchar(255), " +
                "chef int, " +
                "FOREIGN KEY (chef) REFERENCES enseignants(id)" +
                ")";

        try (Statement st = cx.createStatement()) {
            st.execute(query);
            System.out.println("Table 'departements' créée avec succès !");
        } catch (SQLException e) {
            System.out.println("Erreur lors de la création de la table 'departements'");
            e.printStackTrace();
        }
    }

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
    public static  Departement addDepartement(String intitule,Enseignant Chef){
        Departement departement =new Departement ();
        departement.setIntitule(intitule);
        departement.setChef(Chef);
        departement.setId(getDepartementId());
       /* departements.add(departement);
        return departement;*/
        //bdd
        try (Connection conn = connect()) {
            String query = "INSERT INTO departements (intitule, chef) VALUES (?, ?)";
            PreparedStatement ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, intitule);
            ps.setInt(2, departement.getChef().getId());
            ps.executeUpdate();

            ResultSet generatedKeys = ps.getGeneratedKeys();
            if (generatedKeys.next()) {
                departement.setId(generatedKeys.getInt(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return departement;
    }

    public static List<Departement> getAllDepartements() {
        List<Departement> departements = new ArrayList<>();

        try (Connection conn = connect()) {
            String query = "SELECT d.id, d.intitule, d.chef as chef_id, e.nom as chef_nom, e.prenom as chef_prenom " +
                    "FROM departements d " +
                    "LEFT JOIN enseignants e ON d.chef = e.id";
            Statement st = conn.createStatement();
            ResultSet r = st.executeQuery(query);

            while (r.next()) {
                int id = r.getInt("id");
                String intitule = r.getString("intitule");
                int chefId = r.getInt("chef_id");
                String chefNom = r.getString("chef_nom");
                String chefPrenom = r.getString("chef_prenom");

                Departement departement = new Departement(intitule, null);
                departement.setId(id);

                Enseignant chef = new Enseignant(chefNom, chefPrenom, null, null, null);
                chef.setId(chefId);

                departement.setChef(chef);
                departements.add(departement);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return departements;
    }

   /* public  static Departement updateDepartement (int id , String intitule ,Enseignant Chef) {
       for(Departement departement :departements){
            if (departement.getId() == id) {
                departement.setIntitule(intitule);
                departement.setChef(Chef);
                return departement ;
            }
        }

        return new Departement();
    }*/
        public static Departement updateDepartement(int id, String intitule, Enseignant chef) {
            Departement departementModifie = null;

            try (Connection conn = connect()) {
                String query = "UPDATE departements SET intitule = ?, chef = ? WHERE id = ?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, intitule);
                ps.setInt(2, chef.getId());
                ps.setInt(3, id);

                int rowsAffected = ps.executeUpdate();

                if (rowsAffected > 0) {
                    departementModifie = new Departement(intitule, chef);
                    departementModifie.setId(id);
                } else {
                    System.out.println("Aucun département n'a été modifié. Vérifiez l'ID du département.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return departementModifie;
        }
    public static  void  deleteDepartement(int id ){
     /*   departements.remove(DepartementByid(id));
        return departements ;*/
        try (Connection conn = connect()) {
            String sql = "DELETE FROM departements WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Département supprimé avec succès !");
        } catch (SQLException e) {
            System.out.println("Erreur lors de la suppression du département");
            e.printStackTrace();
        }
        }



    public  static Departement DepartementByid(int id){
        for(Departement departement :departements ){
            if (departement.getId()==id ){
                return departement ;
            }
        }
        return new Departement();
    }
}
