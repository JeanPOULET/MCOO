public class EvaluatorVisitor implements IVisitor {

    public boolean eval = false;
    public Object visit(EgalArit o) {
        for(Expression expr : o.ExpressionList) {
            if (((Litteral) o.ExprG).declare) {
                if (o.ExprD instanceof Ensemble || o.ExprD instanceof  Entier){
                    ((Litteral) o.ExprG).expr = o.ExprD;
                    eval = true;
                }
            }
        }

        return o;
    }

}
