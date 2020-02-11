
public class ExprFactory {

    private static ExprFactory INSTANCE = null;

    public static ExprFactory getInstance(){
        if(INSTANCE == null){
            INSTANCE = new ExprFactory();
        }

        return INSTANCE;
    }

    public Expression makeLeaf(String type, Object value) throws InvalidExpression, InvalidTyping {
        if(type.equals("Litteral")){
            Litteral l = new Litteral((String)value);
            return l;
        }else if(type.equals("Entier")){
            Entier e = new Entier((Integer)value);
            return e;
        }else if(type.equals("Boolean")){
            ExprBool b = new ExprBool((Boolean)value);
            return b;
        }

        throw new InvalidExpression(type);
    }

    public Expression makeNode(String type, Expression... children) throws InvalidExpression, InvalidTyping {
        NonTerminal a;
        if(type.equals("Appartient")){
            a = new Appartient();
        }
        else if(type.equals("Card")){
            a = new Card();
        }
        else if(type.equals("Conjonction")){
            a = new Conjonction();
        }
        else if(type.equals("DifferentArit")){
            a = new DifferentArit();
        }
        else if(type.equals("Disjonction")){
            a = new Disjonction();
        }
        else if(type.equals("IlExiste")){
            a = new IlExiste();
        }
        else if(type.equals("Inclusion")){
            a = new Inclusion();
        }
        else if(type.equals("InclusionStricte")){
            a = new InclusionStricte();
        }
        else if(type.equals("Inferieur")){
            a = new Inferieur();
        }
        else if(type.equals("Moins")){
            a = new Moins();
        }
        else if(type.equals("Not")){
            a = new Not();
        }
        else if(type.equals("Plus")){
            a = new Plus();
        }
        else if(type.equals("PourTout")){
            a = new PourTout();
        }
        else if(type.equals("StrictInferieur")){
            a = new StrictInferieur();
        }
        else if(type.equals("StrictSuperieur")){
            a = new StrictSuperieur();
        }
        else if(type.equals("Superieur")){
            a = new Superieur();
        }
        else if(type.equals("DifferentEnsemble")){
            a = new DifferentEnsemble();
        }
        else if(type.equals("EgalArit")){
            a = new EgalArit();
        }
        else if(type.equals("EgalEnsemble")){
            a = new EgalEnsemble();
        }
        else if(type.equals("EnsembleEnExtension")){
            a = new EnsembleEnExtension();
        }
        else{
            throw new InvalidExpression(type);
        }

        for(int i = 0; i < children.length; i++){
            a.ajouter(children[i]);
        }

        return a;
    }
}
