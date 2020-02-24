public class Moins extends ExprArithmetique {

    public Expression ExprD;
    public Expression ExprG;
    public char cara = '-';

    public Moins(Expression G, Expression D){
        ExprD = D;
        ExprG = G;
    }

    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ Moins");
        prefixe = prefixe+"|___";
        ExprD.afficher(prefixe);
        ExprG.afficher(prefixe);
    }

    public Object accept(IVisitor visitor, Object o){
        return visitor.visit(this);
    }
}
