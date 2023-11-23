public class Feuille extends Noeud{

    @Override
    public void execute() {
        throw new UnsupportedOperationException("Unimplemented method 'execute'");
    }

    @Override
    public void accepter(IVisiteur v) {
        v.visiterFeuille(this);
    }
    
}
