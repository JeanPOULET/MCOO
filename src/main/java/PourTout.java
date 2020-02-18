public class PourTout extends NonTerminal {

    public Expression [] expr;


    public PourTout(Expression...  D){
        expr = D;
    }

    public void afficher(String prefixe) {
        System.out.println(prefixe + "|___ PourTout");
        prefixe = prefixe + "|___";
        for (Expression ex : expr){
            ex.afficher(prefixe);
        }
    }

}
