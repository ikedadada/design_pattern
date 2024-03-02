package template_method.challenge_4;

// ConcreteClass役
public class StringDisplay implements AbstractDisplay {
    private String string;
    private int width;

    public StringDisplay(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine() {
        System.out.print("*");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("*");
    }

}
