public class EgalEnsemble extends NonTerminal {

    public Expression ExprD;
    public Expression ExprG;

    public EgalEnsemble(Expression D, Expression G){
        ExprD = D;
        ExprG = G;
    }

    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ EgalEnsemble");
        prefixe = prefixe+"|___";
        ExprD.afficher(prefixe);
        ExprG.afficher(prefixe);
    }

}
