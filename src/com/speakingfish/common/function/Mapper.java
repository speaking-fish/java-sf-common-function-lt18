package com.speakingfish.common.function;

public interface Mapper<RESULT, SOURCE> {
    
    RESULT apply(SOURCE src);
    
}
