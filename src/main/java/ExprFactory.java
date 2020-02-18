
public class ExprFactory {

    private static ExprFactory INSTANCE = null;

    public static ExprFactory getInstance(){
        if(INSTANCE == null){
            INSTANCE = new ExprFactory();
        }

        return INSTANCE;
    }

    public Expression makeLeaf(String type, Object value) throws Exception {
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

        throw new Exception();
    }

    public Expression makeNode(String type, Expression... children) throws Exception {
        NonTerminal a;
        if(type.equals("Appartient")){
            a = new Appartient(children[0], children[1]);
        }
        else if(type.equals("Card")){
            a = new Card(children[0]);
        }
        else if(type.equals("Conjonction")){
            a = new Conjonction(children[0], children[1]);
        }
        else if(type.equals("DifferentArit")){
            a = new DifferentArit(children[0], children[1]);
        }
        else if(type.equals("Disjonction")){
            a = new Disjonction(children[0], children[1]);
        }
        else if(type.equals("IlExiste")){
            a = new IlExiste(children[0], children[1]);
        }
        else if(type.equals("Inclusion")){
            a = new Inclusion(children[0], children[1]);
        }
        else if(type.equals("InclusionStricte")){
            a = new InclusionStricte(children[0], children[1]);
        }
        else if(type.equals("Inferieur")){
            a = new Inferieur(children[0], children[1]);
        }
        else if(type.equals("Moins")){
            a = new Moins(children[0], children[1]);
        }
        else if(type.equals("Not")){
            a = new Not(children[0]);
        }
        else if(type.equals("Plus")){
            a = new Plus(children[0], children[1]);
        }
        else if(type.equals("PourTout")){
            a = new PourTout(children);
        }
        else if(type.equals("StrictInferieur")){
            a = new StrictInferieur(children[0], children[1]);
        }
        else if(type.equals("StrictSuperieur")){
            a = new StrictSuperieur(children[0], children[1]);
        }
        else if(type.equals("Superieur")){
            a = new Superieur(children[0], children[1]);
        }
        else if(type.equals("DifferentEnsemble")){
            a = new DifferentEnsemble(children[0], children[1]);
        }
        else if(type.equals("EgalArit")){
            a = new EgalArit(children[0], children[1]);
        }
        else if(type.equals("EgalEnsemble")){
            a = new EgalEnsemble(children[0], children[1]);
        }
        else if(type.equals("EnsembleEnExtension")){
            a = new EnsembleEnExtension(children);
        }
        else{
            throw new Exception();
        }

        for(int i = 0; i < children.length; i++){
            a.ajouter(children[i]);
        }

        return a;
    }
}
