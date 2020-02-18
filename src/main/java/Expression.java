public  interface Expression {

    void afficher(String prefixe);
    Object accept(IVisitorPrinter vis, Object o);
}
