public class Inferieur extends NonTerminal {

    public Expression ExprD;
    public Expression ExprG;

    public Inferieur(Expression D, Expression G){
        ExprD = D;
        ExprG = G;
    }

    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ Inferieur");
        prefixe = prefixe+"|___";
        ExprD.afficher(prefixe);
        ExprG.afficher(prefixe);
    }

}
