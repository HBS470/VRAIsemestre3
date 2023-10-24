import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    public static void main(String[] args) {
        Connection connection = null;

        try {
            // Établir la connexion en utilisant les paramètres
            connection = DriverManager.getConnection(Parametres.url, Parametres.user, Parametres.mdp);
        } catch (SQLException e) {
            System.out.println("Erreur lors de la connexion à la base de données");
        }
        if (connection != null) {
                    System.out.println("Connexion à la base de données établie avec succès!");
        }
    }
}
