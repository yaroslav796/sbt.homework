package ru.sbt.homework;

public enum Wday {
    MON(new Operator("MonOperator", "111111")),
    TUE(new Operator("TueOperator", "222222")),
    WEN(new Operator("WenOperator", "333333")),
    THU(new Operator("ThuOperator", "444444")),
    FRI(new Operator("FriOperator", "555555")),
    SAT(new Operator("SatOperator", "666666")),
    SUN(new Operator("SunOperator", "777777"));

    private Operator operator;

    Wday(Operator operator) {
        this.operator = operator;
    }

    public Operator getOperator() {
        return operator;
    }
}
