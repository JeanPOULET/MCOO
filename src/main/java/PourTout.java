public class PourTout extends NonTerminal {

    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ PourTout");
        prefixe = prefixe+"|___";
    }

}
