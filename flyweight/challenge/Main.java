package flyweight.challenge;

public class Main {
    private static BigString[] bs = new BigString[1000];

    public static void main(String[] args) {
        if (args.length > 1) {
            System.out.println("Usage: java Main shared");
            System.out.println("Example: java Main 1212123");
            System.exit(0);
        }
        Boolean shared = args.length == 1 ? Boolean.parseBoolean(args[0]) : false;
        testAllocation(shared);

    }


    public static void testAllocation(boolean shared) {
        for (int i = 0; i < bs.length; i++) {
            bs[i] = new BigString("1212123", shared);
        }
        showMemoryUsage();

    }

    public static void showMemoryUsage() {
        Runtime.getRuntime().gc();
        long used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("Used memory: " + used);
    }

}
