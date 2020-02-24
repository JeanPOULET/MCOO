public class Card extends ExprArithmetique {
    public Expression Expr;
    public String str = "card";

    public Card(Expression E){
        Expr = E;
    }

    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ Card");
        prefixe = prefixe+"|___";
        Expr.afficher(prefixe);
    }

    public Object accept(IVisitor visitor, Object o){
        return visitor.visit(this);
    }
}
