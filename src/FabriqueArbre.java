// import java.io.File;
// import java.io.FileNotFoundException;
// import java.util.Scanner;

// public class FabriqueArbre {
//     public IComponent creerArbre(String nomFichier)
//     {
//         Branche racine = new Branche();
//         Branche branche = racine;
//         Branche ancienneBranche = racine;
//         try
//         {
//             File fichier = new File(nomFichier);
//             Scanner sc = new Scanner(fichier);
//             //Enlever le header
//             String ligne = sc.nextLine();
//             while(sc.hasNextLine())
//             {
//                 ligne = sc.nextLine();
//                 //J'ai comme envie de faire une pile avec une liste de branche à part auquel je descend et remonte, je sais pas si c'est possible mais je feel comme quoi
//                 //Comment je le fais c'est pas la bonne méthode à avoir
//                 if(ligne.contains("</ul>"))
//                 {
//                     branche = ancienneBranche;
//                 }
//                 if(ligne.contains("Branche"))
//                 {
//                     ancienneBranche = branche;
//                     Branche nouvelleBranche = new Branche();
//                     branche.ajouter(nouvelleBranche);
//                     branche = nouvelleBranche;
//                 }
//                 else if(ligne.contains("Texte"))
//                 {
//                     FeuilleTexte feuille = new FeuilleTexte(ligne.substring(ligne.indexOf(" ") + 1, ligne.lastIndexOf("</li>")));
//                     branche.ajouter(feuille);
//                 }
//                 else if(ligne.contains("V/F"))
//                 {
//                     FeuilleBool feuille = new FeuilleBool(Boolean.parseBoolean(ligne.substring(ligne.indexOf(" ") + 1, ligne.lastIndexOf("</li>"))));
//                     branche.ajouter(feuille);
//                 }
//                 else if(ligne.contains("Nombre"))
//                 {
//                     FeuilleNombre feuille = new FeuilleNombre(Integer.parseInt(ligne.substring(ligne.indexOf(" ") + 1, ligne.lastIndexOf("</li>"))));
//                     branche.ajouter(feuille);
//                 }
//             }
//             sc.close();
//         }
//         catch(FileNotFoundException e)
//         {
//             e.printStackTrace();
//         }
        
//         return branche;
//     }
// }
