public class EgalArit extends ComparaisonArithmetique {

    public Expression ExprD;
    public Expression ExprG;
    public char cara = '=';

    public EgalArit(Expression G, Expression D){
        ExprD = D;
        ExprG = G;
    }

    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ EgalArit");
        prefixe = prefixe+"|___";
        ExprD.afficher(prefixe);
        ExprG.afficher(prefixe);
    }

    public Object accept(IVisitor visitor, Object o){

        return visitor.visit(this);
    }

}
