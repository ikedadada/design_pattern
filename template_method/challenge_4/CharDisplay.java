package template_method.challenge_4;

// ConcreteClass役
public class CharDisplay implements AbstractDisplay {
    private char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(this.ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }

}
