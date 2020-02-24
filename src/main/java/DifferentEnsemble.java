public class DifferentEnsemble extends ComparaisonEnsembliste  {

    public Expression ExprD;
    public Expression ExprG;
    public char cara = '≠';

    public DifferentEnsemble(Expression G, Expression D){
        ExprD = D;
        ExprG = G;
    }

    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ DifferentEnsemble");
        prefixe = prefixe+"|___";
        ExprD.afficher(prefixe);
        ExprG.afficher(prefixe);
    }

    public Object accept(IVisitor visitor, Object o){
        return visitor.visit(this);
    }

}
