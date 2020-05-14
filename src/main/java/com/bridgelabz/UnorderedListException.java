package com.bridgelabz;

public class UnorderedListException extends Throwable {

    enum ExceptionType {
        ENTERED_NULL,ENTERED_EMPTY, ENTERED_WRONG_POSITION,FILE_NOT_FOUND,INPUT_OUTPUT_EXCEPTION;
    }
    ExceptionType type;

    public UnorderedListException(ExceptionType type, String message) {
        super(message);
        this.type=type;
    }

}
