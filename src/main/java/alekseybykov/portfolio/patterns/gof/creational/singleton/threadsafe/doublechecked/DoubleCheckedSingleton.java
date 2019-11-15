package alekseybykov.portfolio.patterns.gof.creational.singleton.threadsafe.doublechecked;

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
