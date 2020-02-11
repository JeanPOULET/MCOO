public class StrictInferieur extends NonTerminal {

    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ StrictInferieur");
        prefixe = prefixe+"|___";
    }

}
