public class StrictInferieur extends NonTerminal {

    public Expression ExprD;
    public Expression ExprG;

    public StrictInferieur(Expression D, Expression G){
        ExprD = D;
        ExprG = G;
    }

    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ StrictInferieur");
        prefixe = prefixe+"|___";
        ExprD.afficher(prefixe);
        ExprG.afficher(prefixe);
    }

}
