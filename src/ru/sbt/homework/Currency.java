package ru.sbt.homework;

public enum Currency {

    RUB("Российский рубль"),
    EUR("Евро"),
    USD("Доллар США"),
    EXEPTION_CURRENCE("Ошибочная валюта");

    private String title;

    Currency(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    Currency() {    }
}
