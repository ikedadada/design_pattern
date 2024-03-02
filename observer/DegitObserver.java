package observer;

public class DegitObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("DegitObserver:" + generator.getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
