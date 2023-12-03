import java.util.ArrayList;
import java.util.List;

public class FeuilleNombre implements IComponent{

    public int _nombre;

    public List<IComponent> _enfants = new ArrayList<IComponent>();

    public FeuilleNombre(int nombre)
    {
        _nombre = nombre;
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
        return v.visiterNombre(this);
    }
    
}