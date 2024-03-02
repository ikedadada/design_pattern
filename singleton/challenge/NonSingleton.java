package singleton.challenge;


public class NonSingleton {
    private static NonSingleton nonsingleton = null;

    private NonSingleton() {}

    public static NonSingleton getInstance() {
        if (nonsingleton == null) {
            nonsingleton = new NonSingleton();
        }

        return nonsingleton;
    }

}
