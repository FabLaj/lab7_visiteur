import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class VisiteurSerialiserTexte implements IVisiteur{

    private String _nomFichier;
    private File _fichier;
    private FileWriter _writer;

    public VisiteurSerialiserTexte(String nomFichier)
    {
        _nomFichier = nomFichier;
    }
        
    public void serialiser(IComponent c)
    {
        _fichier = new File(_nomFichier);
        try {
            _writer = new FileWriter(_fichier);
            _writer.write(c.accepter(this));
            _writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String visiterTexte(FeuilleTexte f) {
        return "s " + f._texte + " " + f._enfants.size();
    }

    @Override
    public String visiterNombre(FeuilleNombre f) {
        return "n " + f._nombre + " " + f._enfants.size();
    }

    @Override
    public String visiterBool(FeuilleBool f) {
        return "b " + f._bool + " " + f._enfants.size() ;
    }  
    
}
