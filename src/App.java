import java.nio.charset.Charset;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        IComponent racine = genererArbreAleatoire(20);
        VisiteurSerialiserTexte serialiserTexte = new VisiteurSerialiserTexte("index.html");
        serialiserTexte.serialiser(racine);
        // FabriqueArbre fabrique = new FabriqueArbre();
        // IComponent nouvelArbre = fabrique.creerArbre("index.html");
        // VisiteurSerialiserTexte serialiserTexte2 = new VisiteurSerialiserTexte("index2.html");
        // serialiserTexte2.serialiser(nouvelArbre);
    }

    public static IComponent genererArbreAleatoire(int taille)
    {
        IComponent racine = new FeuilleNombre(0);
        while(taille > 0)
        {
            taille = generer(taille, racine);
        }
        return racine;
    }

    public static int generer(int taille, IComponent racine)
    {
        while(taille > 0)
        {
            IComponent component = null;
            int nbAleatoire = new Random().nextInt(5);
            switch (nbAleatoire) {
                case 0:
                    component = new FeuilleBool(new Random().nextBoolean());
                    break;
                case 1:
                    component = new FeuilleNombre(new Random().nextInt(10000));
                    break;
                case 2:
                    String chars = "abcdefghijqlmnopqrstuvwxyz";
                    StringBuilder sb = new StringBuilder();
                    for(int i=0; i < 7; i++)
                    {
                        sb.append(chars.charAt(new Random().nextInt(chars.length())));
                    }
                    component = new FeuilleTexte(sb.toString());
                    break;
                default:
                    return taille;
            }
            racine.ajouter(component);
            taille--;
        }
        return 0;
    }
}


//Enlever la branche

//Supprimer affichage HTML (C'est de la grosse merde)

//loader dans un tableau, avec l'id de son parent



//noeud n 42 - 1
//noeud b v - 0

//ou n 42 (tab)  b V

//N 42 2
//B v 0
//S bonjouer 0