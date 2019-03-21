package ru.sbt.homework;

/**
 * Created by Yaroslav on 21.03.2019.
 */
public class Administrator extends Operator {
    String password;

    public Administrator(String password) {
        this.password = password;
    }

    public Administrator(String login, String vsp, String password) {
        super(login, vsp);
        this.password = password;
    }

    public Administrator(){}
}
