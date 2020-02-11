public class Not extends NonTerminal  {

    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ Not");
        prefixe = prefixe+"|___";
    }

}

