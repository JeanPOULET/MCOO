public class Not extends NonTerminal  {

    public Expression Expr;
    public String str = "not";

    public Not(Expression D){
        Expr = D;
    }

    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ Not");
        prefixe = prefixe+"|___";
        Expr.afficher(prefixe);
    }

    public Object accept(IVisitor visitor, Object o){
        return visitor.visit(this);
    }
}

