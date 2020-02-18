public class Entier implements Terminal {

    private int valeur;

    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ Entier : "+valeur);
    }

    public Entier(int i){
        valeur = i;
    }

    public Object accept(IVisitor visitor, Object o){
        return visitor.visit(this);
    }
}
