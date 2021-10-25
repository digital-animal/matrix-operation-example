package com.zahid.exception;

public class OrderMismatchException extends Exception {

    public OrderMismatchException() {
    }

    public OrderMismatchException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Orders of the two matrix do not match";
    }
    
    
}
