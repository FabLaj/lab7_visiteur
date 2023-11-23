public class Feuille extends Noeud{

    public Feuille(int nombre, String texte, boolean bool)
    {
        this.nombre = nombre;
        this.texte = texte;
        this.bool = bool;
    }

    @Override
    public void executer() {
        throw new UnsupportedOperationException("Unimplemented method 'execute'");
    }

    @Override
    public String accepter(IVisiteur v) {
        return v.visiterFeuille(this);
    }
    
}
