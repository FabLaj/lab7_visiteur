import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.Icon;

public class Branche extends Noeud {

    List<IComponent> _enfants = new ArrayList<IComponent>();

    public Branche(int nombre, String texte, boolean bool)
    {
        this.nombre = nombre;
        this.texte = texte;
        this.bool = bool;
    }

    public void ajouter(IComponent enfant)
    {
        _enfants.add(enfant);
    }

    public void supprimer(IComponent enfant)
    {
        _enfants.remove(enfant);
    }

    public void genererArbreAleatoire(int nombre)
    {
        IComponent component;
        int nbAleatoire = 10;
        while(nombre > 0)
        {
            nombre--;
            nbAleatoire = new Random().nextInt(2);
            if(nbAleatoire == 0)
            {
                Branche b = new Branche(10 - nombre, "branche: " + (10 -nombre), true);
                nombre = b.genererBranche(nombre);
                component = b;
            }
            else
            {
                component = new Feuille(10 - nombre, "Feuille: " + (10 -nombre), false);
            }
            _enfants.add(component);
        }
    }

    private int genererBranche(int nombre)
    {
        IComponent component;
        int nbAleatoire = 10;
        while(nombre > 0)
        {
            nombre--;
            nbAleatoire = new Random().nextInt(3);
            if(nbAleatoire == 0)
            {
                Branche b = new Branche(10 - nombre, "branche: " + (10 -nombre), true);
                nombre = b.genererBranche(nombre);
                component = b;
            }
            else if(nbAleatoire == 1)
            {
                component = new Feuille(10 - nombre, "Feuille: " + (10 -nombre), false);
            }
            else
            {
                return nombre;
            }
            _enfants.add(component);
        }
        return nombre;
    }

    @Override
    public void executer() {
        for (IComponent c : _enfants)
        {
            c.executer();    
        }
    }

    @Override
    public String accepter(IVisiteur v) {
        return v.visiterBranche(this);
    }
    
}
