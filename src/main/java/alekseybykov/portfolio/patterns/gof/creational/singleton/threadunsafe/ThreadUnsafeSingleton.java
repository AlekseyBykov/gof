package alekseybykov.portfolio.patterns.gof.creational.singleton.threadunsafe;

/**
 * @author Aleksey Bykov
 * @since 29.09.2019
 */
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
