import java.util.ArrayList;
import java.util.List;

public class FeuilleBool implements IComponent{

    public boolean _bool;

    public List<IComponent> _enfants = new ArrayList<IComponent>();

    public FeuilleBool(boolean bool)
    {
        _bool = bool;
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
        return v.visiterBool(this);
    }
    
}