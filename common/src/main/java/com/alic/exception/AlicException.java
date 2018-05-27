package com.alic.exception;

/**
 * 自定义异常
 *
 * @author suxingzhe
 * @create 2018-05-23
 **/
public class AlicException extends RuntimeException {
    public AlicException(){
        super();
    }

    public AlicException(String name){
        super(name);
    }

    public AlicException(Throwable cause){
        super(cause);
    }

    public AlicException(String name, Throwable cause){
        super(name, cause);
    }
}
