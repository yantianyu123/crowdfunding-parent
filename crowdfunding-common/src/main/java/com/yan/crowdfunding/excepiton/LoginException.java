package com.yan.crowdfunding.excepiton;

/**
 * @author
 * @date 2020/3/6 13:24
 */
public class LoginException extends RuntimeException {

    public LoginException(){}

    public LoginException(String message){
        super(message);
    }
}
