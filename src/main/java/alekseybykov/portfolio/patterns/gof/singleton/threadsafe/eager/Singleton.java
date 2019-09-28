package alekseybykov.portfolio.patterns.gof.singleton.threadsafe.eager;

final class Singleton {

    private static final Singleton singleton = new Singleton();

    private Singleton() { }

    public static Singleton getSingleton() {
        return singleton;
    }
}
