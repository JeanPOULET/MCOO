public class Litteral implements Terminal {

    private String nom;

    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ Litteral : "+nom);
    }

    public Litteral(String str){
        nom = str;
    }

}
