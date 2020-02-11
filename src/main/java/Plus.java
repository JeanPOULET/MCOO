public class Plus extends NonTerminal{

    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ Plus");
        prefixe = prefixe+"|___";
    }

}
