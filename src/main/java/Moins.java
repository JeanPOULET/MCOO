public class Moins extends NonTerminal {
    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ Moins");
        prefixe = prefixe+"|___";
    }
}
