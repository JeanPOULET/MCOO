public class EgalArit extends NonTerminal {

    public Expression ExprD;
    public Expression ExprG;

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

}
