package com.bridgelabz;

public class UnorderedListException extends Throwable {

    enum ExceptionType {
        ENTERED_NULL,ENTERED_EMPTY;
    }
    ExceptionType type;

    public UnorderedListException(ExceptionType type, String message) {
        super(message);
        this.type=type;
    }

}
