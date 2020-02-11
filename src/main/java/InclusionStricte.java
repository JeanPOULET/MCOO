public class InclusionStricte extends NonTerminal {

    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ InclusionStricte");
        prefixe = prefixe+"|___";
    }

}
