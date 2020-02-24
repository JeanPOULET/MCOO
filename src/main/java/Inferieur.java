public class Inferieur extends ComparaisonArithmetique {

    public Expression ExprD;
    public Expression ExprG;
    public char cara = '≤';

    public Inferieur(Expression G, Expression D){
        ExprG = G;
        ExprD = D;
    }

    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ Inferieur");
        prefixe = prefixe+"|___";
        ExprD.afficher(prefixe);
        ExprG.afficher(prefixe);
    }

    public Object accept(IVisitor visitor, Object o){
        return visitor.visit(this);
    }
}
