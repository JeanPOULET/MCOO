public class InvalidTyping extends Exception {

    private Object type;
    private String expression;

    public InvalidTyping(String type, String expr ) {
        this.expression = expr;
        this.type = type;
    }

    public Object getWrongTyping() {
        return type;
    }
    public Object getExpression() {
        return expression;
    }

}
