public class ViewerVisitor implements IVisitor {


    public Object visit(Appartient o) {
        System.out.print(" "+o.cara);
        return o;
    }

    public Object visit(Card o) {
        System.out.print(" "+o.str+"(");
        return o;
    }

    public Object visit(Conjonction o) {
        System.out.print(" "+o.cara);
        return o;
    }

    public Object visit(DifferentArit o) {
        System.out.print(" "+o.cara);
        return o;
    }

    public Object visit(DifferentEnsemble o) {
        System.out.print(" "+o.cara);
        return o;
    }

    public Object visit(EnsembleEnExtension o) {
        System.out.print(" "+o.cara);
        return o;
    }

    public Object visit(Disjonction o) {
        System.out.print(" "+o.cara);
        return o;
    }

    public Object visit(EgalArit o) {
        System.out.print(" "+o.cara);
        return o;
    }

    public Object visit(EgalEnsemble o) {
        System.out.print(" "+o.cara);
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
        return o;
    }

    public Object visit(Inclusion o) {
        System.out.print(" "+o.cara);
        return o;
    }

    public Object visit(InclusionStricte o) {
        System.out.print(" "+o.cara);
        return o;
    }

    public Object visit(Inferieur o) {
        System.out.print(" "+o.cara);
        return o;
    }

    public Object visit(Litteral o) {
        System.out.print(" "+o.getValue());
        return o;
    }

    public Object visit(Moins o) {
        System.out.print(" "+o.cara);
        return o;
    }

    public Object visit(Not o) {
        System.out.print(" "+o.str);
        return o;
    }

    public Object visit(Plus o) {
        System.out.print(" "+o.cara);
        return o;
    }

    public Object visit(PourTout o) {
        System.out.print(" "+o.cara);
        return o;
    }

    public Object visit(StrictInferieur o) {
        System.out.print(" "+o.cara);
        return o;
    }

    public Object visit(StrictSuperieur o) {
        System.out.print(" "+o.cara);
        return o;
    }

    public Object visit(Superieur o) {
        System.out.print(" "+o.cara);
        return o;
    }
}
