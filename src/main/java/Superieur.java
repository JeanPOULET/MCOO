public class Superieur extends NonTerminal {

    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ Superieur");
        prefixe = prefixe+"|___";
    }

}
