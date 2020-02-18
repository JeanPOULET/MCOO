
public interface IVisitor {
    Object visit(Appartient o);
    Object visit(Card o);
    Object visit(Conjonction o);
    Object visit(DifferentArit o);
    Object visit(DifferentEnsemble o);
    Object visit(EnsembleEnExtension o);

    Object visit(Disjonction o);
    Object visit(EgalArit o);
    Object visit(EgalEnsemble o);
    Object visit(Entier o);
    Object visit(ExprBool o);
    Object visit(IlExiste o);
    Object visit(Inclusion o);
    Object visit(InclusionStricte o);
    Object visit(Inferieur o);
    Object visit(Litteral o);
    Object visit(Moins o);
    Object visit(Not o);
    Object visit(Plus o);
    Object visit(PourTout o);
    Object visit(StrictInferieur o);
    Object visit(StrictSuperieur o);
    Object visit(Superieur o);
}
