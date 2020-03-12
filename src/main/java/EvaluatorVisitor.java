public class EvaluatorVisitor implements IVisitor {

    public boolean eval = false;

    public Object visit(Appartient o){
        for(Expression expr : o.ExpressionList) {
            if(o.ExprD instanceof EnsembleEnExtension){
                for(int i = 0; i < ((EnsembleEnExtension) o.ExprD).Expr.length; i++){
                    if(((EnsembleEnExtension) o.ExprD).Expr[i] == o.ExprG){
                        eval = true;
                        break;
                    }
                }
            }
            expr.accept(this, o);
        }
        return eval;
    }

    public Object visit(Card o){ // A FINIR PARCE QUE JE SAIS PAS OU FOUTRE LE RESULTAT
        for(Expression expr : o.ExpressionList) {
            if(o.Expr instanceof EnsembleEnExtension) {
                for(int i = 0; i < ((EnsembleEnExtension) o.Expr).Expr.length; i++) {
                    eval = true;
                }
            }
            expr.accept(this, o);
        }
        return eval;
    }

    public Object visit(Conjonction o){
        return eval;
    }

    public Object visit(DifferentArit o){
        for(Expression expr : o.ExpressionList) {
            if(o.ExprD instanceof ExprArithmetique) {

                Expression exG = o.ExprG;
                Expression exD = o.ExprD;

                if(o.ExprG instanceof Litteral){
                    exG = ((Litteral) o.ExprG).expr;
                }

                if(o.ExprD instanceof Litteral){
                    exD = ((Litteral) o.ExprD).expr;
                }

                if(exG != exD) {
                    eval = true;
                }
            }
            expr.accept(this, o);
        }

        return eval;
    }

    public Object visit(DifferentEnsemble o){
        for(Expression expr : o.ExpressionList) {

            Expression exG = o.ExprG;
            Expression exD = o.ExprD;

            if(o.ExprG instanceof Litteral){
                exG = ((Litteral) o.ExprG).expr;
            }

            if(o.ExprD instanceof Litteral){
                exD = ((Litteral) o.ExprD).expr;
            }

            if(((EnsembleEnExtension) exG).Expr.length == ((EnsembleEnExtension) exD).Expr.length) {
                for (int i = 0; i < ((EnsembleEnExtension) exG).Expr.length; i++) {
                    boolean found = false;
                    for (int j = 0; j < ((EnsembleEnExtension) exD).Expr.length; j++) {
                        if (((EnsembleEnExtension) exG).Expr[i] == ((EnsembleEnExtension) exD).Expr[j]) {
                            found = true;
                        }
                    }
                    if (!found) {
                        eval = true;
                    }else{
                        for (int k = 0; k < ((EnsembleEnExtension) exD).Expr.length; k++) {
                            boolean foundReverse = false;
                            for (int l = 0; l < ((EnsembleEnExtension) exG).Expr.length; l++) {
                                if (((EnsembleEnExtension) exD).Expr[k] == ((EnsembleEnExtension) exG).Expr[l]) {
                                    found = true;
                                }
                            }
                            if (!found) {
                                eval = true;
                            }
                        }
                    }
                }
            }else{
                eval = true;
            }

            expr.accept(this, o);
        }
        return eval;
    }

    public Object visit(EnsembleEnExtension o){
        return eval;
    }

    public Object visit(Disjonction o){
        return eval;
    }

    public Object visit(EgalArit o){
        for(Expression expr : o.ExpressionList) {
            if (((Litteral) o.ExprG).declare) {
                if (o.ExprD instanceof  Entier){
                    ((Litteral) o.ExprG).expr = o.ExprD;
                    eval = true;
                }
            }else {
                Expression exG = o.ExprG;
                Expression exD = o.ExprD;

                if (o.ExprG instanceof Litteral) {
                    exG = ((Litteral) o.ExprG).expr;
                }

                if (o.ExprD instanceof Litteral) {
                    exD = ((Litteral) o.ExprD).expr;
                }

                if (exG == exD) {
                    eval = true;
                }
            }
            expr.accept(this, o);
        }

        return eval;
    }

    public Object visit(EgalEnsemble o){
        for(Expression expr : o.ExpressionList) {
            if(((Litteral) o.ExprG).declare) {
                if (o.ExprD instanceof Ensemble) {
                    ((Litteral) o.ExprG).expr = o.ExprD;
                    eval = true;
                }
            }else{
                Expression exG = o.ExprG;
                Expression exD = o.ExprD;

                if(o.ExprG instanceof Litteral){
                    exG = ((Litteral) o.ExprG).expr;
                }

                if(o.ExprD instanceof Litteral){
                    exD = ((Litteral) o.ExprD).expr;
                }

                if(((EnsembleEnExtension) exG).Expr.length == ((EnsembleEnExtension) exD).Expr.length) {
                    for (int i = 0; i < ((EnsembleEnExtension) exG).Expr.length; i++) {
                        boolean found = false;
                        for (int j = 0; j < ((EnsembleEnExtension) exD).Expr.length; j++) {
                            if (((EnsembleEnExtension) exG).Expr[i] == ((EnsembleEnExtension) exD).Expr[j]) {
                                found = true;
                            }
                        }
                        if (!found) {
                            eval = false;
                        }else{
                            for (int k = 0; k < ((EnsembleEnExtension) exD).Expr.length; k++) {
                                boolean foundReverse = false;
                                for (int l = 0; l < ((EnsembleEnExtension) exG).Expr.length; l++) {
                                    if (((EnsembleEnExtension) exD).Expr[k] == ((EnsembleEnExtension) exG).Expr[l]) {
                                        found = true;
                                    }
                                }
                                if (!found) {
                                    eval = false;
                                }
                            }
                        }
                    }
                }else{
                    eval = false;
                }
            }
            expr.accept(this, o);
        }
        return eval;
    }

    public Object visit(Entier o){
        return eval;
    }

    public Object visit(ExprBool o){
        return eval;
    }

    public Object visit(IlExiste o){
        return eval;
    }

    public Object visit(Inclusion o){
        for(Expression expr : o.ExpressionList) {
            Expression exG = o.ExprG;
            Expression exD = o.ExprD;

            if(o.ExprG instanceof Litteral){
                exG = ((Litteral) o.ExprG).expr;
            }

            if(o.ExprD instanceof Litteral){
                exD = ((Litteral) o.ExprD).expr;
            }

            if(((EnsembleEnExtension) exG).Expr.length > ((EnsembleEnExtension) exD).Expr.length) {
                for (int i = 0; i < ((EnsembleEnExtension) exG).Expr.length; i++) {
                    boolean found = false;
                    for (int j = 0; j < ((EnsembleEnExtension) exD).Expr.length; j++) {
                        if (((EnsembleEnExtension) exG).Expr[i] == ((EnsembleEnExtension) exD).Expr[j]) {
                            found = true;
                        }
                    }
                    if (!found) {
                        eval = false;
                    }else{
                        for (int k = 0; k < ((EnsembleEnExtension) exD).Expr.length; k++) {
                            boolean foundReverse = false;
                            for (int l = 0; l < ((EnsembleEnExtension) exG).Expr.length; l++) {
                                if (((EnsembleEnExtension) exD).Expr[k] == ((EnsembleEnExtension) exG).Expr[l]) {
                                    found = true;
                                }
                            }
                            if (!found) {
                                eval = true;
                            }
                        }
                    }
                }
            }else{
                eval = false;
            }
        }
        return eval;
    }

    public Object visit(InclusionStricte o){
        for(Expression expr : o.ExpressionList) {
            Expression exG = o.ExprG;
            Expression exD = o.ExprD;

            if(o.ExprG instanceof Litteral){
                exG = ((Litteral) o.ExprG).expr;
            }

            if(o.ExprD instanceof Litteral){
                exD = ((Litteral) o.ExprD).expr;
            }

            if(((EnsembleEnExtension) exG).Expr.length > ((EnsembleEnExtension) exD).Expr.length) {
                for (int i = 0; i < ((EnsembleEnExtension) exG).Expr.length; i++) {
                    boolean found = false;
                    for (int j = 0; j < ((EnsembleEnExtension) exD).Expr.length; j++) {
                        if (((EnsembleEnExtension) exG).Expr[i] == ((EnsembleEnExtension) exD).Expr[j]) {
                            found = true;
                        }
                    }
                    if (!found) {
                        eval = false;
                    }
                }
            }else{
                eval = false;
            }
        }
        return eval;
    }

    public Object visit(Inferieur o){
        for(Expression expr : o.ExpressionList) {
            if(o.ExprD instanceof Entier && o.ExprG instanceof Entier) {
                if(((Entier) o.ExprG).getValue() <= ((Entier) o.ExprD).getValue()) {
                    eval = true;
                }
            }
            expr.accept(this, o);
        }
        return eval;
    }

    public Object visit(Litteral o){
        return eval;
    }

    public Object visit(Moins o){
        return eval;
    }

    public Object visit(Not o){
        return eval;
    }

    public Object visit(Plus o){
        return eval;
    }

    public Object visit(PourTout o){
        return eval;
    }

    public Object visit(StrictInferieur o){
        for(Expression expr : o.ExpressionList) {
            if(o.ExprD instanceof Entier && o.ExprG instanceof Entier) {
                if(((Entier) o.ExprG).getValue() < ((Entier) o.ExprD).getValue()) {
                    eval = true;
                }
            }
            expr.accept(this, o);
        }
        return eval;
    }

    public Object visit(StrictSuperieur o){
        for(Expression expr : o.ExpressionList) {
            if(o.ExprD instanceof Entier && o.ExprG instanceof Entier) {
                if(((Entier) o.ExprG).getValue() > ((Entier) o.ExprD).getValue()) {
                    eval = true;
                }
            }
            expr.accept(this, o);
        }
        return eval;
    }

    public Object visit(Superieur o){
        for(Expression expr : o.ExpressionList) {
            if(o.ExprD instanceof Entier && o.ExprG instanceof Entier) {
                if(((Entier) o.ExprG).getValue() >= ((Entier) o.ExprD).getValue()) {
                    eval = true;
                }
            }
            expr.accept(this, o);
        }
        return eval;
    }
}
