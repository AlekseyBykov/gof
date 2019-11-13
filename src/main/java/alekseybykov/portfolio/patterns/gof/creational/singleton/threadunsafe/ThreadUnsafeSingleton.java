package alekseybykov.portfolio.patterns.gof.creational.singleton.threadunsafe;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
final class ThreadUnsafeSingleton {

    private static ThreadUnsafeSingleton singleton;

    public static ThreadUnsafeSingleton getSingleton() {
        if (singleton == null) {
            singleton = new ThreadUnsafeSingleton();
        }
        return singleton;
    }
}
