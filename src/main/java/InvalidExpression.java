public class InvalidExpression extends Exception {

    private String expression;

    public InvalidExpression(String expres) {

        this.expression = expres;
    }

    public String getWrongExpression() {
        return expression;
    }
}