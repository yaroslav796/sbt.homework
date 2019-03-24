package ru.sbt.homework;

import java.util.Date;

public class Client extends Person {
    String fio;
    Date birthday;
    DUL document;

    public Client(String fio, Date birthday, DUL document) {
        super.name = fio;
        this.birthday = birthday;
        this.document = document;
    }

    public Client() {
    }
}
