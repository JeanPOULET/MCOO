public class IlExiste extends NonTerminal {

    public Expression ExprD;
    public Expression ExprG;

    public IlExiste(Expression D, Expression G){
        ExprD = D;
        ExprG = G;
    }

    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ IlExiste");
        prefixe = prefixe+"|___";
        ExprD.afficher(prefixe);
        ExprG.afficher(prefixe);
    }

}
