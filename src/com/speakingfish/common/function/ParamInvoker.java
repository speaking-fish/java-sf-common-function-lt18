package com.speakingfish.common.function;

public interface ParamInvoker<T, PARAM> {
    
    void invoke(T value, PARAM param);

}
