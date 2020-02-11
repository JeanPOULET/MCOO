public class Disjonction extends NonTerminal {

    public Expression ExprD;
    public Expression ExprG;

    public Disjonction(Expression D, Expression G){
        ExprD = D;
        ExprG = G;
    }

    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ Disjonction");
        prefixe = prefixe+"|___";
        ExprD.afficher(prefixe);
        ExprG.afficher(prefixe);
    }

}
