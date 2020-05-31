package alekseybykov.portfolio.patterns.gof.creational.singleton.threadsafe.doublechecked;

/**
 * @author Aleksey Bykov
 * @since 29.09.2019
 */
final class DoubleCheckedSingleton {

    private DoubleCheckedSingleton() {};

    private static DoubleCheckedSingleton singleton;

    public static DoubleCheckedSingleton getSingleton() {
        if (singleton == null) {
            synchronized (DoubleCheckedSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckedSingleton();
                }
            }
        }
        return singleton;
    }
}
