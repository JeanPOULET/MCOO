public class Conjonction extends NonTerminal {

    public Expression ExprD;
    public Expression ExprG;

    public Conjonction(Expression D, Expression G){
        ExprD = D;
        ExprG = G;
    }

    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ Conjonction");
        prefixe = prefixe+"|___";
        ExprD.afficher(prefixe);
        ExprG.afficher(prefixe);
    }
}
