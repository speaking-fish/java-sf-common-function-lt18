package com.speakingfish.common.function;

public interface Callback<T> {
    
    void callback(T value) throws Exception;

}
