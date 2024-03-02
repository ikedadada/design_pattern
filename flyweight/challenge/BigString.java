package flyweight.challenge;

import java.util.function.Function;
import flyweight.BigChar;
import flyweight.BigCharFactory;

public class BigString {
    private BigChar[] bigChars;

    public BigString(String string) {
        BigCharFactory factory = BigCharFactory.getInstance();
        bigChars = new BigChar[string.length()];
        for (int i = 0; i < string.length(); i++) {
            bigChars[i] = factory.getBigChar(string.charAt(i));
        }
    }

    public BigString(String string, boolean shared) {
        Function<Character, BigChar> getBigCharFunction;
        if (shared) {
            getBigCharFunction = BigCharFactory.getInstance()::getBigChar;
        } else {
            getBigCharFunction = BigChar::new;
        }

        bigChars = new BigChar[string.length()];
        for (int i = 0; i < string.length(); i++) {
            bigChars[i] = getBigCharFunction.apply(string.charAt(i));
        }
    }

    public void print() {
        for (BigChar bigChar : bigChars) {
            bigChar.print();
        }
    }

}
