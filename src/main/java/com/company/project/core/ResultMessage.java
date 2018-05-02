package com.company.project.core;

/**
 * Created by edward on 18/4/30.
 */
public enum ResultMessage {
    SUCCESSFUL("success");

    String message;

    public String getMessage() {
        return message;
    }

    ResultMessage(String message) {
        this.message = message;
    }
}
