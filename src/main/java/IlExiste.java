public class IlExiste extends ExprLogique {

    public Expression [] expr;
    public char cara = '∃';

    public IlExiste(Expression...  E){
        expr = E;
    }

    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ IlExiste");
        prefixe = prefixe+"|___";
        for (Expression ex : expr){
            ex.afficher(prefixe);
        }
    }

    public Object accept(IVisitor visitor, Object o){

        return visitor.visit(this);
    }

}
