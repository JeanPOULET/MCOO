import java.security.*;
import java.util.*;

public class Main {

    public static void main(String[] argv)throws Exception{
        ExprFactory f = ExprFactory.getInstance();
        Expression x = f.makeLeaf("Litteral", "x");
        Expression X = f.makeLeaf("Litteral", "X");
        Expression[] nb = new Expression[4];
        for (int i=0; i < 4; i++) {
            nb[i] = f.makeLeaf("Number", i);
        }
        Expression ens123 = f.makeNode("EnsembleEnExtension", nb[1], nb[2], nb[3]);
        Expression exemple1 = f.makeNode("EtLogique",
                f.makeNode("Egalite", X, ens123),
                f.makeNode("QuelqueSoit", x, f.makeNode("Appartient", x, X), f.makeNode("Sup", x, nb[0]))
        );
    }

}
