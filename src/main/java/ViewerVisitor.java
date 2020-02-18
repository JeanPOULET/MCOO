public class ViewerVisitor implements IVisitor {


    public Object visit(Appartient o) {
        int i=0;

        for(Expression expr : o.ExpressionList){
            if(i==1){
                System.out.print(" "+o.cara);
            }
            expr.accept(this,o);
            i++;
        }
        return o;
    }

    public Object visit(Card o) {
        System.out.print(" "+o.str+"(");
        for(Expression expr : o.ExpressionList){
            expr.accept(this,o);
        }

        return o;
    }

    public Object visit(Conjonction o) {
        int i=0;

        for(Expression expr : o.ExpressionList){
            if(i==1){
                System.out.print(" "+o.cara);
            }
            expr.accept(this,o);
            i++;
        }
        return o;
    }

    public Object visit(DifferentArit o) {
        int i=0;

        for(Expression expr : o.ExpressionList){
            if(i==1){
                System.out.print(" "+o.cara);
            }
            expr.accept(this,o);
            i++;
        }
        return o;
    }

    public Object visit(DifferentEnsemble o) {
        int i=0;

        for(Expression expr : o.ExpressionList){
            if(i==1){
                System.out.print(" "+o.cara);
            }
            expr.accept(this,o);
            i++;
        }
        return o;
    }

    public Object visit(EnsembleEnExtension o) {
        System.out.print(" {");
        for(Expression expr : o.ExpressionList){
            expr.accept(this,o);
            System.out.print(",");
        }
        System.out.print(" }");
        return o;
    }

    public Object visit(Disjonction o) {
        int i=0;

        for(Expression expr : o.ExpressionList){
            if(i==1){
                System.out.print(" "+o.cara);
            }
            expr.accept(this,o);
            i++;
        }
        return o;
    }

    public Object visit(EgalArit o) {
        int i=0;

        for(Expression expr : o.ExpressionList){
            if(i==1){
                System.out.print(" "+o.cara);
            }
            expr.accept(this,o);
            i++;
        }
        return o;
    }

    public Object visit(EgalEnsemble o) {
        int i=0;

        for(Expression expr : o.ExpressionList){
            if(i==1){
                System.out.print(" "+o.cara);
            }
            expr.accept(this,o);
            i++;
        }
        return o;
    }

    public Object visit(Entier o) {
        System.out.print(" "+o.getValue());
        return o;
    }

    public Object visit(ExprBool o) {
        System.out.print(" "+o.getValue());
        return o;
    }

    public Object visit(IlExiste o) {
        System.out.print(" "+o.cara);
        System.out.print(" (");

        for(Expression expr : o.ExpressionList){
            expr.accept(this,o);
        }
        System.out.print(" )");
        return o;
    }

    public Object visit(Inclusion o) {
        int i=0;

        for(Expression expr : o.ExpressionList){
            if(i==1){
                System.out.print(" "+o.cara);
            }
            expr.accept(this,o);
            i++;
        }
        return o;
    }

    public Object visit(InclusionStricte o) {
        int i=0;

        for(Expression expr : o.ExpressionList){
            if(i==1){
                System.out.print(" "+o.cara);
            }
            expr.accept(this,o);
            i++;
        }
        return o;
    }

    public Object visit(Inferieur o) {
        int i=0;

        for(Expression expr : o.ExpressionList){
            if(i==1){
                System.out.print(" "+o.cara);
            }
            expr.accept(this,o);
            i++;
        }
        return o;
    }

    public Object visit(Litteral o) {
        System.out.print(" "+o.getValue());
        return o;
    }

    public Object visit(Moins o) {
        int i=0;

        for(Expression expr : o.ExpressionList){
            if(i==1){
                System.out.print(" "+o.cara);
            }
            expr.accept(this,o);
            i++;
        }
        return o;
    }

    public Object visit(Not o) {
        System.out.print(" "+o.str);
        for(Expression expr : o.ExpressionList){
            expr.accept(this,o);
        }

        return o;
    }

    public Object visit(Plus o) {
        int i=0;

        for(Expression expr : o.ExpressionList){
            if(i==1){
                System.out.print(" "+o.cara);
            }
            expr.accept(this,o);
            i++;
        }
        return o;
    }

    public Object visit(PourTout o) {
        int i=0;
        System.out.print(" "+o.cara);
        System.out.print(" (");

        for(Expression expr : o.ExpressionList){
            expr.accept(this,o);
        }
        System.out.print(" )");
        return o;
    }

    public Object visit(StrictInferieur o) {
        int i=0;

        for(Expression expr : o.ExpressionList){
            if(i==1){
                System.out.print(" "+o.cara);
            }
            expr.accept(this,o);
            i++;
        }
        return o;
    }

    public Object visit(StrictSuperieur o) {
        int i=0;

        for(Expression expr : o.ExpressionList){
            if(i==1){
                System.out.print(" "+o.cara);
            }
            expr.accept(this,o);
            i++;
        }
        return o;
    }

    public Object visit(Superieur o) {
        int i=0;

        for(Expression expr : o.ExpressionList){
            if(i==1){
                System.out.print(" "+o.cara);
            }
            expr.accept(this,o);
            i++;
        }

        return o;
    }
}
