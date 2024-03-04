package interpreter;


public class Context {
    private String[] tokens;
    private String lastToken;
    private int index;

    public Context(String text) {
        this.tokens = text.split(" ");
        this.index = 0;

    }

    public String nextToken() {
        if (index < tokens.length) {
            lastToken = tokens[index];
            index++;
        } else {
            lastToken = null;
        }
        return lastToken;
    }

    public String currentToken() {
        return tokens[index];
    }

    public void skipToken(String token) throws ParseException {
        if (currentToken() == null) {
            throw new ParseException(
                    "Error: '" + token + "' is expected, but '" + currentToken() + "' is found.");
        } else if (!token.equals(currentToken())) {
            throw new ParseException(
                    "Error: '" + token + "' is expected, but '" + currentToken() + "' is found.");
        }
        nextToken();
    }

    public int currentNumber() throws ParseException {
        int number = 0;
        try {
            number = Integer.parseInt(currentToken());
        } catch (NumberFormatException e) {
            throw new ParseException("Error: '" + currentToken() + "' is not a number.");
        }
        return number;
    }

}
