import java.util.ArrayList;
import java.util.List;

public class FeuilleTexte implements IComponent{

    public String _texte;

    public List<IComponent> _enfants = new ArrayList<IComponent>();

    public FeuilleTexte(String texte)
    {
        _texte = texte;
    }

    @Override
    public void ajouter(IComponent enfant)
    {
        _enfants.add(enfant);
    }

    @Override
    public void supprimer(IComponent enfant)
    {
        _enfants.remove(enfant);
    }

    @Override
    public String accepter(IVisiteur v) {
        return v.visiterTexte(this);
    }
    
}
