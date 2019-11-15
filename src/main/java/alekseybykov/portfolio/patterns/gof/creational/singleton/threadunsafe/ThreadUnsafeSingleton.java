package alekseybykov.portfolio.patterns.gof.creational.singleton.threadunsafe;

final class ThreadUnsafeSingleton {

    private ThreadUnsafeSingleton() {};

    private static ThreadUnsafeSingleton singleton;

    public static ThreadUnsafeSingleton getSingleton() {
        if (singleton == null) {
            singleton = new ThreadUnsafeSingleton();
        }
        return singleton;
    }
}
