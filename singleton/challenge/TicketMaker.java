package singleton.challenge;

public class TicketMaker {
    private static TicketMaker INSTANCE = new TicketMaker();
    private int ticket = 1000;



    private TicketMaker() {}

    public static TicketMaker getInstance() {
        return INSTANCE;
    }

    public int getNextTicketNumber() {
        return ticket++;
    }

}
