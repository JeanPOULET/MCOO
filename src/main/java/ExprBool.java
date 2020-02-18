public class ExprBool implements Terminal {

    private boolean valeur;

    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ Boolean : "+valeur);
    }

    public ExprBool(boolean val){
        valeur = val;
    }

    public Object accept(IVisitor visitor, Object o){
        return visitor.visit(this);
    }
}
