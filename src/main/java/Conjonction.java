public class Conjonction extends NonTerminal {
    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ Conjonction");
        prefixe = prefixe+"|___";
    }
}
