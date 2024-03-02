package flyweight;

import java.util.HashMap;
import java.util.Map;

public class BigCharFactory {
    private Map<String, BigChar> pool = new HashMap<>();
    private static BigCharFactory singleton = new BigCharFactory();

    private BigCharFactory() {}

    public static BigCharFactory getInstance() {
        return singleton;
    }

    public synchronized BigChar getBigChar(char charName) {
        BigChar bigChar = pool.get(String.valueOf(charName));
        if (bigChar == null) {
            bigChar = new BigChar(charName);
            pool.put("" + charName, bigChar);
        }
        return bigChar;
    }

}
