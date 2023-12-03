public interface IComponent {
    public void ajouter(IComponent enfant);
    public void supprimer(IComponent enfant);
    public String accepter(IVisiteur v);
}