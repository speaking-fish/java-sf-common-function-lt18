package com.speakingfish.common.function;

public interface Acceptor<T> {
    
    boolean test(T t);
}
