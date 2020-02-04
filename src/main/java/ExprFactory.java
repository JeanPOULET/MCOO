
public class ExprFactory {

    public Expression makeLeaf(String type, Object value) throws Exception {
        if(type == "Litteral"){
            Litteral l = new Litteral((String)value);
            return l;
        }else if(type == "Entier"){
            Entier e = new Entier((Integer)value);
            return e;
        }else if(type == "Boolean"){
            ExprBool b = new ExprBool((Boolean)value);
            return b;
        }

        throw new Exception() ;

    }

    public Expression makeNNode(String type, Expression... children) throws Exception {

        throw new Exception();
    }
}
