public class EnsembleEnExtension extends NonTerminal {

    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ EnsembleEnExtension");
        prefixe = prefixe+"|___";
    }

}
