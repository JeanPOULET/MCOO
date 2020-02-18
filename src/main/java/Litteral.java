public class Litteral implements Terminal {

    private String nom;

    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ Litteral : "+nom);
    }

    public Litteral(String str){
        nom = str;
    }

    public String getValue(){return this.nom;}

    public Object accept(IVisitor visitor, Object o){

        return visitor.visit(this);
    }


}
