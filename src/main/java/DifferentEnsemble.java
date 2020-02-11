public class DifferentEnsemble extends NonTerminal {

    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ DifferentEnsemble");
        prefixe = prefixe+"|___";
    }

}
