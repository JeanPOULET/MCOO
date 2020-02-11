public class Appartient extends NonTerminal {

    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ Appartient");
        prefixe = prefixe+"|___";
    }

}
