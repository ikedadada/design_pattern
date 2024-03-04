package interpreter;

// <primitive command> ::= go | right | left
public class PrimitiveCommand extends Node {

    private String name;

    @Override
    public void parse(Context context) throws ParseException {
        name = context.currentToken();
        if (name == null) {
            throw new ParseException("Missing command");
        } else if (!name.equals("go") && !name.equals("right") && !name.equals("left")) {
            throw new ParseException(name + " is undefined");
        }
        context.skipToken(name);
    }

    @Override
    public String toString() {
        return name;
    }

}
