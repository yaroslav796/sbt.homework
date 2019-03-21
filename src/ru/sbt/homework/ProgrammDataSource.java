package ru.sbt.homework;

import java.util.Date;

/**
 * Created by Yaroslav on 21.03.2019.
 */
public class ProgrammDataSource {

    public DUL documentCreator (String type, String seria, String number, String code, Date date){
        DUL dul = new DUL();
        dul.setType(type);
        dul.setSeria(seria);
        dul.setNumber(number);
        dul.setCode(code);
        dul.setDate(date);

        return dul;
    }

    public Client createClient(String fio, Date date, DUL dul){
        Client client = new Client(fio, date, dul);

        return client;
    }

}
