public class Not extends NonTerminal  {

    public Expression Expr;

    public Not(Expression D){
        Expr = D;
    }

    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ Not");
        prefixe = prefixe+"|___";
        Expr.afficher(prefixe);
    }

}

