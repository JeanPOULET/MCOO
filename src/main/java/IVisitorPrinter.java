import jdk.internal.org.jline.utils.DiffHelper;

public interface IVisitorPrinter {
    void visit(Appartient o);
    void visit(Card o);
    void visit(Conjonction o);
    void visit(DifferentArit o);
    void visit(DifferentEnsemble o);
    void visit(Disjonction o);
    void visit(EgalArit o);
    void visit(EgalEnsemble o);
    void visit(Entier o);
    void visit(ExprBool o);
    void visit(IlExiste o);
    void visit(Inclusion o);
    void visit(InclusionStricte o);
    void visit(Inferieur o);
    void visit(Litteral o);
    void visit(Moins o);
    void visit(Not o);
    void visit(Plus o);
    void visit(PourTout o);
    void visit(StrictInferieur o);
    void visit(StrictSuperieur o);
    void visit(Superieur o);
}
