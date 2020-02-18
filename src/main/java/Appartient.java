public class Appartient extends NonTerminal {

    public Expression ExprD;
    public Expression ExprG;
    public char ch  = 'a';

    public Appartient(Expression D, Expression G){
        ExprD = D;
        ExprG = G;
    }

    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ Appartient");
        prefixe = prefixe+"|___";
        ExprD.afficher(prefixe);
        ExprG.afficher(prefixe);
    }

    public Object accept(IVisitorPrinter visitor, Object o){
        return visitor.visit(this);
    }

}
