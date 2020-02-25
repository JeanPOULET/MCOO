import java.util.ArrayList;

public class VerificatorVisitor implements IVisitor {

    private ArrayList<String> erreurs = new ArrayList<String>();

    public void printError(){
        System.out.println("");
        for(String str : erreurs){
            System.out.print(str);
        }
    }

    public int numError(){
        return erreurs.size();
    }

    public VerificatorVisitor(){
        erreurs.add("Listes des erreurs :\n");
    }

    public Object visit(Appartient o) {
        for(Expression expr : o.ExpressionList) {
            if (!(o.ExprD instanceof Ensemble)) {
                if(!erreurs.contains("Probleme de type sur le fils droit de appartient\n")){
                    erreurs.add("Probleme de type sur le fils droit de appartient\n");
                }
            }
            if (!(o.ExprG instanceof ExprArithmetique)) {
                if(!erreurs.contains("Probleme de type sur le fils gauche de appartient\n")){
                    erreurs.add("Probleme de type sur le fils gauche de appartient\n");
                }
            }
            expr.accept(this, o);
        }
        return o;
    }

    public Object visit(Card o) {
        for(Expression expr : o.ExpressionList) {
            if (!(o.Expr instanceof Ensemble)) {
                if(!erreurs.contains("Probleme de type sur le fils de card\n")){
                    erreurs.add("Probleme de type sur le fils de card\n");
                }
            }
            expr.accept(this, o);
        }
        return o;
    }

    public Object visit(Conjonction o) {
        for(Expression expr : o.ExpressionList) {
            if (!(o.ExprD instanceof Expression)) {
                if(!erreurs.contains("Probleme de type sur le fils droit de conjonction\n")){
                    erreurs.add("Probleme de type sur le fils droit de conjonction\n");
                }
            }
            if (!(o.ExprG instanceof Expression)) {
                if(!erreurs.contains("Probleme de type sur le fils gauche de conjonction\n")){
                    erreurs.add("Probleme de type sur le fils gauche de conjonction\n");
                }
            }
            expr.accept(this, o);
        }
        return o;
    }

    public Object visit(DifferentArit o) {
        for(Expression expr : o.ExpressionList) {
            if (!(o.ExprD instanceof ExprArithmetique)) {
                if(!erreurs.contains("Probleme de type sur le fils droit de different arithmetique\n")){
                    erreurs.add("Probleme de type sur le fils droit de different arithmetique\n");
                }
            }
            if (!(o.ExprG instanceof ExprArithmetique)) {
                if(!erreurs.contains("Probleme de type sur le fils gauche de different arithmetique\n")){
                    erreurs.add("Probleme de type sur le fils gauche de different arithmetique\n");
                }
            }
            expr.accept(this, o);
        }
        return o;
    }

    public Object visit(DifferentEnsemble o) {

        for(Expression expr : o.ExpressionList) {
            if (!(o.ExprD instanceof Ensemble)) {
                if(!erreurs.contains("Probleme de type sur le fils droit de different ensemble\n")){
                    erreurs.add("Probleme de type sur le fils droit de different ensemble\n");
                }
            }
            if (!(o.ExprG instanceof Ensemble)) {
                if(!erreurs.contains("Probleme de type sur le fils gauche de different ensemble\n")){
                    erreurs.add("Probleme de type sur le fils gauche de different ensemble\n");
                }
            }
            expr.accept(this, o);
        }
        return o;
    }

    public Object visit(EnsembleEnExtension o) {
        for(Expression expr : o.ExpressionList) {
            for(Expression ensembleChild : o.Expr){
                if(!(ensembleChild instanceof ExprArithmetique)) {
                    if(!erreurs.contains("Probleme de type sur un fils de ensemble en extension\n")){
                        erreurs.add("Probleme de type sur un fils de ensemble en extension\n");
                    }
                }
            }

            expr.accept(this, o);
        }
        return o;
    }

    public Object visit(Disjonction o) {
        for(Expression expr : o.ExpressionList) {
            if (!(o.ExprD instanceof Expression)) {
                if(!erreurs.contains("Probleme de type sur le fils droit de disjonction\n")){
                    erreurs.add("Probleme de type sur le fils droit de disjonction\n");
                }
            }
            if (!(o.ExprG instanceof Expression)) {
                if(!erreurs.contains("Probleme de type sur le fils gauche de disjonction\n")){
                    erreurs.add("Probleme de type sur le fils gauche de disjonction\n");
                }
            }
            expr.accept(this, o);
        }
        return o;
    }

    public Object visit(EgalArit o) {
        for(Expression expr : o.ExpressionList) {
            if (!(o.ExprD instanceof ExprArithmetique)) {
                if(!erreurs.contains("Probleme de type sur le fils droit de egalite arithmetique\n")){
                    erreurs.add("Probleme de type sur le fils droit de egalite arithmetique\n");
                }
            }
            if(o.ExprG instanceof Litteral){
                ((Litteral) o.ExprG).declare = true;
            }
            if (!(o.ExprG instanceof ExprArithmetique)) {
                if(!erreurs.contains("Probleme de type sur le fils gauche de egalite arithmetique\n")){
                    erreurs.add("Probleme de type sur le fils gauche de egalite arithmetique\n");
                }
            }
            expr.accept(this, o);
        }
        return o;
    }

    public Object visit(EgalEnsemble o) {
        for(Expression expr : o.ExpressionList) {
            if (!(o.ExprD instanceof Ensemble)) {
                if(!erreurs.contains("Probleme de type sur le fils droit de egalite ensemble\n")){
                    erreurs.add("Probleme de type sur le fils droit de egalite ensemble\n");
                }
            }
            if (!(o.ExprG instanceof Ensemble)) {
                if(!erreurs.contains("Probleme de type sur le fils gauche de egalite ensemble\n")){
                    erreurs.add("Probleme de type sur le fils gauche de egalite ensemble\n");
                }
            }
            expr.accept(this, o);
        }
        return o;
    }

    public Object visit(Entier o) {
        return o;
    }

    public Object visit(ExprBool o) {
        return o;
    }

    public Object visit(IlExiste o) {
        for(Expression expr : o.ExpressionList) {
            if (!(o.expr[0] instanceof Litteral)) {
                if(!erreurs.contains("Probleme de type sur le premier fils de il existe\n")){
                    erreurs.add("Probleme de type sur le premier fils de il existe\n");
                }
            }else{
                ((Litteral) o.expr[0]).declare = true;
            }
            if (!(o.expr[1] instanceof ExprEnsembliste)) {
                if(!erreurs.contains("Probleme de type sur le second fils de il existe\n")){
                    erreurs.add("Probleme de type sur le second fils de il existe\n");
                }
            }
            if (!(o.expr[2] instanceof Expression)) {
                if(!erreurs.contains("Probleme de type sur le dernier fils de il existe\n")){
                    erreurs.add("Probleme de type sur le dernier fils de il existe\n");
                }
            }
            expr.accept(this, o);
            ((Litteral) o.expr[0]).declare = false;
        }
        return o;
    }

    public Object visit(Inclusion o) {
        for(Expression expr : o.ExpressionList) {
            if (!(o.ExprD instanceof Ensemble)) {
                if(!erreurs.contains("Probleme de type sur le fils droit de inclusion\n")){
                    erreurs.add("Probleme de type sur le fils droit de inclusion\n");
                }
            }
            if (!(o.ExprG instanceof Ensemble)) {
                if(!erreurs.contains("Probleme de type sur le fils gauche de inclusion\n")){
                    erreurs.add("Probleme de type sur le fils gauche de inclusion\n");
                }
            }
            expr.accept(this, o);
        }
        return o;
    }

    public Object visit(InclusionStricte o) {
        for(Expression expr : o.ExpressionList) {
            if (!(o.ExprD instanceof Ensemble)) {
                if(!erreurs.contains("Probleme de type sur le fils droit de inclusion stricte\n")){
                    erreurs.add("Probleme de type sur le fils droit de inclusion stricte\n");
                }
            }
            if (!(o.ExprG instanceof Ensemble)) {
                if(!erreurs.contains("Probleme de type sur le fils gauche de inclusion stricte\n")){
                    erreurs.add("Probleme de type sur le fils gauche de inclusion stricte\n");
                }
            }
            expr.accept(this, o);
        }
        return o;
    }

    public Object visit(Inferieur o) {
        for(Expression expr : o.ExpressionList) {
            if (!(o.ExprD instanceof Ensemble)) {
                if(!erreurs.contains("Probleme de type sur le fils droit de inferieur ou egal\n")){
                    erreurs.add("Probleme de type sur le fils droit de inferieur ou egal\n");
                }
            }
            if (!(o.ExprG instanceof ExprArithmetique)) {
                if(!erreurs.contains("Probleme de type sur le fils gauche de inferieur ou egal\n")){
                    erreurs.add("Probleme de type sur le fils gauche de inferieur ou egal\n");
                }
            }
            expr.accept(this, o);
        }
        return o;
    }

    public Object visit(Litteral o) {
        if(!o.declare){
            if(!erreurs.contains("Le litteral "+o.getValue()+" est mal déclaré\n")){
                erreurs.add("Le litteral "+o.getValue()+" est mal déclaré\n");
            }
        }
        return o;
    }

    public Object visit(Moins o) {
        for(Expression expr : o.ExpressionList) {
            if (!(o.ExprD instanceof ExprArithmetique)) {
                if(!!erreurs.contains("Probleme de type sur le fils droit de moins\n")){
                    erreurs.add("Probleme de type sur le fils droit de moins\n");
                }
            }
            if (!(o.ExprG instanceof ExprArithmetique)) {
                if(!erreurs.contains("Probleme de type sur le fils gauche de moins\n")){
                    erreurs.add("Probleme de type sur le fils gauche de moins\n");
                }
            }
            expr.accept(this, o);
        }
        return o;
    }

    public Object visit(Not o) {
        for(Expression expr : o.ExpressionList) {
            if (!(o.Expr instanceof Expression)) {
                if(!erreurs.contains("Probleme de type sur le fils de not\n")){
                    erreurs.add("Probleme de type sur le fils de not\n");
                }
            }

            expr.accept(this, o);
        }
        return o;
    }

    public Object visit(Plus o) {
        for(Expression expr : o.ExpressionList) {
            if (!(o.ExprD instanceof ExprArithmetique)) {
                if(!erreurs.contains("Probleme de type sur le fils droit de plus\n")){
                    erreurs.add("Probleme de type sur le fils droit de plus\n");
                }
            }
            if (!(o.ExprG instanceof ExprArithmetique)) {
                if(!erreurs.contains("Probleme de type sur le fils gauche de plus\n")){
                    erreurs.add("Probleme de type sur le fils gauche de plus\n");
                }
            }
            expr.accept(this, o);
        }
        return o;
    }

    public Object visit(PourTout o) {
        for(Expression expr : o.ExpressionList) {
            if(!((Litteral) ((Appartient) o.expr[1]).ExprG).getValue().equals(((Litteral) o.expr[0]).getValue())){
                if(!erreurs.contains("Le premier fils du second fils du pour tout doit être le même litteral que le premier fils du pour tout\n")){
                    erreurs.add("Le premier fils du second fils du pour tout doit être le même litteral que le premier fils du pour tout\n");
                }
            }
            if (!(o.expr[0] instanceof Litteral)) {
                if(!erreurs.contains("Probleme de type sur le premier fils de pour tout\n")){
                    erreurs.add("Probleme de type sur le premier fils de pour tout\n");
                }
            }else{
                ((Litteral) o.expr[0]).declare = true;
            }
            if (!(o.expr[1] instanceof ExprEnsembliste)) {
                if(!erreurs.contains("Probleme de type sur le second fils de pour tout\n")){
                    erreurs.add("Probleme de type sur le second fils de pour tout\n");
                }
            }
            if (!(o.expr[2] instanceof Expression)) {
                if(!erreurs.contains("Probleme de type sur le dernier fils de pour tout\n")){
                    erreurs.add("Probleme de type sur le dernier fils de pour tout\n");
                }
            }
            expr.accept(this, o);
            ((Litteral) o.expr[0]).declare = false;
        }
        return o;
    }

    public Object visit(StrictInferieur o) {
        for(Expression expr : o.ExpressionList) {
            if (!(o.ExprD instanceof ExprArithmetique)) {
                if(!erreurs.contains("Probleme de type sur le fils droit de strictement inferieur\n")){
                    erreurs.add("Probleme de type sur le fils droit de strictement inferieur\n");
                }
            }
            if (!(o.ExprG instanceof ExprArithmetique)) {
                if(!erreurs.contains("Probleme de type sur le fils gauche de strictement inferieur\n")){
                    erreurs.add("Probleme de type sur le fils gauche de strictement inferieur\n");
                }
            }
            expr.accept(this, o);
        }
        return o;
    }

    public Object visit(StrictSuperieur o) {
        for(Expression expr : o.ExpressionList) {
            if (!(o.ExprD instanceof ExprArithmetique)) {
                if(!erreurs.contains("Probleme de type sur le fils droit de strictement superieur\n")){
                    erreurs.add("Probleme de type sur le fils droit de strictement superieur\n");
                }
            }
            if (!(o.ExprG instanceof ExprArithmetique)) {
                if(!erreurs.contains("Probleme de type sur le fils gauche de strictement superieur\n")){
                    erreurs.add("Probleme de type sur le fils gauche de strictement superieur\n");
                }
            }
            expr.accept(this, o);
        }
        return o;
    }

    public Object visit(Superieur o) {
        for(Expression expr : o.ExpressionList) {
            if (!(o.ExprD instanceof ExprArithmetique)) {
                if(!erreurs.contains("Probleme de type sur le fils droit de superieur\n")){
                    erreurs.add("Probleme de type sur le fils droit de superieur\n");
                }
            }
            if (!(o.ExprG instanceof ExprArithmetique)) {
                if(!erreurs.contains("Probleme de type sur le fils gauche de superieur\n")){
                    erreurs.add("Probleme de type sur le fils gauche de superieur\n");
                }
            }
            expr.accept(this, o);
        }
        return o;
    }
}
