import java.util.ArrayList;

public abstract class NonTerminal implements Expression{

    //Attributs
    private ArrayList<Expression> ExpressionList = new ArrayList<Expression>();

    //Getteur
    public ArrayList<Expression> getExpressionList(){
        return ExpressionList;
    }

    //Méthodes
    public void ajouter(Expression e){
        ExpressionList.add(e);
    }

    public Expression supprimer(int i){
        Expression e = ExpressionList.get(i);
        ExpressionList.remove(i);
        return e;
    }
}
