public class Card extends NonTerminal {
    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ Card");
        prefixe = prefixe+"|___";
    }

}
