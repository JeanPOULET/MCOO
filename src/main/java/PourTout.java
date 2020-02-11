public class PourTout extends NonTerminal {

    public Expression ExprD;
    public Expression ExprG;

    public PourTout(Expression D, Expression G){
        ExprD = D;
        ExprG = G;
    }

    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ PourTout");
        prefixe = prefixe+"|___";
        ExprD.afficher(prefixe);
        ExprG.afficher(prefixe);
    }

}
