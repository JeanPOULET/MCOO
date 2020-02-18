public  interface Expression {

    void afficher(String prefixe);
    Object accept(IVisitor vis, Object o);
}
