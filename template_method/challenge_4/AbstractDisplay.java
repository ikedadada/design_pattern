package template_method.challenge_4;


// AbstractClass役
public interface AbstractDisplay {

    void open();
    void print();
    void close();

    public default void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }


}
