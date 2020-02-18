public class ViewerVisitor implements IVisitorPrinter {


    public void visit(Appartient o) {
        System.out.print(" "+o.cara);
    }

    public void visit(Card o) {
        System.out.print(" "+o.cara+"(");
    }

    public void visit(Conjonction o) {
        System.out.print(" "+o.cara);
    }

    public void visit(DifferentArit o) {
        System.out.print(" "+o.cara);
    }

    public void visit(DifferentEnsemble o) {
        System.out.print(" "+o.cara);
    }

    public void visit(Disjonction o) {
        System.out.print(" "+o.cara);
    }

    public void visit(EgalArit o) {
        System.out.print(" "+o.cara);
    }

    public void visit(EgalEnsemble o) {
        System.out.print(" "+o.cara);
    }

    public void visit(Entier o) {
        System.out.print(" "+o.getValue());
    }

    public void visit(ExprBool o) {
        System.out.print(" "+o.getValue());
    }

    public void visit(IlExiste o) {
        System.out.print(" "+o.cara);
    }

    public void visit(Inclusion o) {
        System.out.print(" "+o.cara);
    }

    public void visit(InclusionStricte o) {
        System.out.print(" "+o.cara);
    }

    public void visit(Inferieur o) {
        System.out.print(" "+o.cara);
    }

    public void visit(Litteral o) {
        System.out.print(" "+o.getValue());
    }

    public void visit(Moins o) {
        System.out.print(" "+o.cara);
    }

    public void visit(Not o) {
        System.out.print(" "+o.cara);
    }

    public void visit(Plus o) {
        System.out.print(" "+o.cara);
    }

    public void visit(PourTout o) {
        System.out.print(" "+o.cara);
    }

    public void visit(StrictInferieur o) {
        System.out.print(" "+o.cara);
    }

    public void visit(StrictSuperieur o) {
        System.out.print(" "+o.cara);
    }

    public void visit(Superieur o) {
        System.out.print(" "+o.cara);
    }
}
