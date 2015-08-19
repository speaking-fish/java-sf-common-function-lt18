package com.speakingfish.common.function;

public interface ThrowableGetter<T> {

    T get() throws Exception;
}
