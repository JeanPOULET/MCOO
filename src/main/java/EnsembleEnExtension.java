public class EnsembleEnExtension extends Ensemble {

    public Expression [] Expr;
    public char cara = '{';

    public EnsembleEnExtension(Expression... E){
        Expr = E;
    }

    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ EnsembleEnExtension");
        prefixe = prefixe+"|___";
        for(int i = 0; i < Expr.length; i++) {
            Expr[i].afficher(prefixe);
        }
    }

    public Object accept(IVisitor visitor, Object o){
        return visitor.visit(this);
    }

}
