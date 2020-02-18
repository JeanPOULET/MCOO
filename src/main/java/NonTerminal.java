import java.util.ArrayList;

public abstract class NonTerminal implements Expression{

    public ArrayList<Expression> ExpressionList = new ArrayList<Expression>();

    public ArrayList<Expression> getExpressionList(){
        return ExpressionList;
    }

    public void ajouter(Expression e){
        ExpressionList.add(e);
    }

    public Expression supprimer(int i){
        Expression e = ExpressionList.get(i);
        ExpressionList.remove(i);
        return e;
    }
}
