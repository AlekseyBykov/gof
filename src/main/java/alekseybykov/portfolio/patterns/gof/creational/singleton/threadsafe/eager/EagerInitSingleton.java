package alekseybykov.portfolio.patterns.gof.creational.singleton.threadsafe.eager;

final class EagerInitSingleton {

    static int numberOfInstances = 0;

    private static final EagerInitSingleton singleton = new EagerInitSingleton();

    private EagerInitSingleton() {
        numberOfInstances++;
    }

    public static EagerInitSingleton getSingleton() {
        return singleton;
    }

    static void checkForEagerInit() {
        System.out.println("Singleton instance is created");
    }
}
