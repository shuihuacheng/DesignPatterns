package com.leo.patterns.singleton;

/**
 * android.uitl.Singleton单例工具类
 * @param <T>
 */
public abstract class Singleton<T> {
    private T mInstance;

    protected abstract T create();

    public final T get() {
        synchronized (this) {
            if (mInstance == null) {
                mInstance = create();
            }
            return mInstance;
        }
    }
}
