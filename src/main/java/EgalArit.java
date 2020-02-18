public class EgalArit extends NonTerminal {

    public Expression ExprD;
    public Expression ExprG;
    public char cara = '=';

    public EgalArit(Expression D, Expression G){
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
