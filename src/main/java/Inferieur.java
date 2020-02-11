public class Inferieur extends NonTerminal {

    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ Inferieur");
        prefixe = prefixe+"|___";
    }

}
