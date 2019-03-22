package ru.sbt.homework;

public enum Wday {
    MON(new Operator("MonOperator", "asdas")),
    WEN(new Operator("WenOperator", "asdas")),
    FRI(new Operator("FriOperator", "asdas"));

    private Operator operator;

    Wday(Operator operator) {
        this.operator = operator;
    }

    public Operator getOperator() {
        return operator;
    }
}
