package alekseybykov.portfolio.patterns.gof.creational.singleton.threadsafe.doublechecked;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
final class DoubleCheckedSingleton {

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
