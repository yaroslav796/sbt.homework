package ru.sbt.homework;

/**
 * Created by Yaroslav on 21.03.2019.
 */
public class ConvertionStatus {

    static final int OK = 0;
    static final int ERROR = 1;

    int code;
    String message;

    public ConvertionStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
