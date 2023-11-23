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
        
    public void serialiser(Branche b)
    {
        _fichier = new File(_nomFichier);
        try {
            _writer = new FileWriter(_fichier);
            _writer.write("<html>\n<body>");
            b.accepter(this);
            _writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String visiterFeuille(Feuille f) {
        return "";
    }

    @Override
    public String visiterBranche(Branche b) {
        String texte = "<li><span>Texte: " + b.texte + "  Nombre: " + b.nombre + "  V/F: " + b.bool + "</span>\n<ul>\n";
    }  
    
}
