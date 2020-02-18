public class Entier implements Terminal {

    private int valeur;

    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ Entier : "+valeur);
    }

    public Entier(int i){
        valeur = i;
    }

    public int getValue(){return this.valeur;}
}
