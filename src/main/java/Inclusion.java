public class Inclusion extends NonTerminal {

    public Expression ExprD;
    public Expression ExprG;

    public Inclusion(Expression D, Expression G){
        ExprD = D;
        ExprG = G;
    }

    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ Inclusion");
        prefixe = prefixe+"|___";
        ExprD.afficher(prefixe);
        ExprG.afficher(prefixe);
    }

}
