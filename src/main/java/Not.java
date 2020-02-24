public class Not extends ExprLogique  {

    public Expression Expr;
    public String str = "not";

    public Not(Expression E){
        Expr = E;
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

