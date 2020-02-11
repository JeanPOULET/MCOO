public class Inclusion extends NonTerminal {

    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ Inclusion");
        prefixe = prefixe+"|___";
    }

}
