public class StrictSuperieur extends NonTerminal {

    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ StrictSuperieur");
        prefixe = prefixe+"|___";
    }

}
