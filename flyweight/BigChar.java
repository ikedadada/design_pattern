package flyweight;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BigChar {
    @SuppressWarnings("unused")
    private char charName;
    private String fontData;

    public BigChar(char charName) {
        this.charName = charName;
        try (Scanner scanner = new Scanner(new FileReader("flyweight/big" + charName + ".txt"))) {
            StringBuilder buffer = new StringBuilder();
            while (scanner.hasNext()) {
                buffer.append(scanner.nextLine());
                buffer.append("\n");
            }
            this.fontData = buffer.toString();
        } catch (IOException e) {
            this.fontData = charName + "?";
        }
    }

    public void print() {
        System.out.println(fontData);
    }

}
