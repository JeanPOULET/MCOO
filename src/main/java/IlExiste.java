public class IlExiste extends NonTerminal {

    public void afficher(String prefixe){
        System.out.println(prefixe + "|___ IlExiste");
        prefixe = prefixe+"|___";
    }

}
