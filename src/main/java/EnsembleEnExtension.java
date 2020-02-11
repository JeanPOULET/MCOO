public class EnsembleEnExtension extends NonTerminal {

    public Expression [] Expr;

    public EnsembleEnExtension(Expression... D){
        Expr = D;
    }

    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ EnsembleEnExtension");
        prefixe = prefixe+"|___";
        for(int i = 0; i < Expr.length; i++) {
            Expr[i].afficher(prefixe);
        }
    }

}
