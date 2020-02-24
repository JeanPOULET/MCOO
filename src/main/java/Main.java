import java.util.ArrayList;

public class Main {

    public static void main(String[] argv)throws InvalidExpression,InvalidTyping{

        try {
            ViewerVisitor prettyVisitor = new ViewerVisitor();
            VerificatorVisitor verificatorVisitor = new VerificatorVisitor();
            ExprFactory f = ExprFactory.getInstance();
            Expression x = f.makeLeaf("Litteral", "x");
            Expression X = f.makeLeaf("Litteral", "X");

            Expression[] nb = new Expression[4];
            for (int i = 0; i < 4; i++) {
                nb[i] = f.makeLeaf("Entier", i);
            }
            Expression ens123 = f.makeNode("EnsembleEnExtension", nb[1], nb[2], nb[3]);
            Expression exemple1 = f.makeNode("Conjonction",
                    f.makeNode("EgalArit", X, ens123),
                    f.makeNode("PourTout", x, f.makeNode("Appartient", x, X), f.makeNode("Superieur", x, nb[0]))
            );
            Expression ex = f.makeNode("Appartient", x, x);
            exemple1.accept(prettyVisitor,exemple1);
            exemple1.accept(verificatorVisitor,exemple1);
            System.out.println("");
            for(String str : verificatorVisitor.erreurs){
                System.out.print(str);
            }
        }

        catch(InvalidExpression e){
            System.out.println("Erreur le type de l'expression : "+e.getWrongExpression()+" n'existe pas !");
        }
        catch (InvalidTyping e ){
            System.out.println("Erreur de typage, le type :"+e.getWrongTyping()+" pour un terminal : ");
        }


    }
}
