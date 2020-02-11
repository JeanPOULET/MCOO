public class Card extends NonTerminal {
    public Expression Expr;

    public Card(Expression D){
        Expr = D;
    }

    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ Card");
        prefixe = prefixe+"|___";
        Expr.afficher(prefixe);
    }

}
