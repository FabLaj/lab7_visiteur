import java.util.ArrayList;
import java.util.List;

public class Branche extends Noeud {

    List<IComponent> _enfants = new ArrayList<IComponent>();

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
        
    }

    @Override
    public void executer() {
        for (IComponent c : _enfants)
        {
            c.executer();    
        }
    }

    //Ici, est ce que c'est bon de faire le depth first comme ça ? dans le code de la branche, je sais que c'est la responsabilité du visiteur,
    //Mais c'est une fonction du visiteur
    @Override
    public void accepter(IVisiteur v) {
        v.visiterBranche(this);
        for (IComponent c : _enfants) {
            c.accepter(v);
        }
    }
    
}
