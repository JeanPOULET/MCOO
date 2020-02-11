public class InclusionStricte extends NonTerminal {

    public Expression ExprD;
    public Expression ExprG;

    public InclusionStricte(Expression D, Expression G){
        ExprD = D;
        ExprG = G;
    }

    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ InclusionStricte");
        prefixe = prefixe+"|___";
        ExprD.afficher(prefixe);
        ExprG.afficher(prefixe);
    }

}
