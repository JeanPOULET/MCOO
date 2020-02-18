public class Conjonction extends NonTerminal {

    public Expression ExprD;
    public Expression ExprG;
    public char cara = '∧';

    public Conjonction(Expression D, Expression G){
        ExprG = G;
        ExprD = D;
    }

    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ Conjonction");
        prefixe = prefixe+"|___";
        ExprD.afficher(prefixe);
        ExprG.afficher(prefixe);
    }

    public Object accept(IVisitor visitor, Object o){
        return visitor.visit(this);
    }
}
