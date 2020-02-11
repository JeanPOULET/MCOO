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

        throw new Exception();
    }

    public Expression makeNNode(String type, Expression... children) throws Exception {
        NonTerminal a;
        if(type ==  "Appartient"){
            a = new Appartient();
        }
        else if(type ==  "Card"){
            a = new Card();
        }
        else if(type ==  "Conjonction"){
            a = new Conjonction();
        }
        else if(type ==  "DifferentArit"){
            a = new DifferentArit();
        }
        else if(type ==  "Disjonction"){
            a = new Disjonction();
        }
        else if(type ==  "IlExiste"){
            a = new IlExiste();
        }
        else if(type ==  "Inclusion"){
            a = new Inclusion();
        }
        else if(type ==  "InclusionStricte"){
            a = new InclusionStricte();
        }
        else if(type ==  "Inferieur"){
            a = new Inferieur();
        }
        else if(type ==  "Moins"){
            a = new Moins();
        }
        else if(type ==  "Not"){
            a = new Not();
        }
        else if(type ==  "Plus"){
            a = new Plus();
        }
        else if(type ==  "PourTout"){
            a = new PourTout();
        }
        else if(type ==  "StrictInferieur"){
            a = new StrictInferieur();
        }
        else if(type ==  "StrictSuperieur"){
            a = new StrictSuperieur();
        }
        else if(type ==  "Superieur"){
            a = new Superieur();
        }
        else if(type ==  "DifferentEnsemble"){
            a = new DifferentEnsemble();
        }
        else if(type ==  "EgalArit"){
            a = new EgalArit();
        }
        else if(type ==  "EgalEnsemble"){
            a = new EgalEnsemble();
        }
        else if(type ==  "EnsembleEnExtension"){
            a = new EnsembleEnExtension();
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
