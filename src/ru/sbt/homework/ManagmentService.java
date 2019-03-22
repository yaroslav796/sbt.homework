package ru.sbt.homework;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Yaroslav on 21.03.2019.
 */
public class ManagmentService {

    public Operator getTodayOperator(){
        SimpleDateFormat toDay = new SimpleDateFormat("E", Locale.ENGLISH);
        String day = (toDay.format(new Date())).toUpperCase();
        Operator operator = Wday.valueOf(day).getOperator();
        return operator;
    }
}
