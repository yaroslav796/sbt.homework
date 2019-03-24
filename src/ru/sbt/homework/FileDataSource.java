package ru.sbt.homework;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Yaroslav on 24.03.2019.
 */
public class FileDataSource implements IDataSource {

    private File file;

    @Override
    public ConvertData getConvertData() {
        ArrayList<String> fileLines = new ArrayList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        DUL dul = new DUL();
        Client client = new Client();
        Money money = new Money();
        Currency currency = null;

        try{
            FileInputStream fstream = new FileInputStream(this.file);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while ((strLine = br.readLine()) != null){
                fileLines.add(strLine);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Неизвестная ошибка");
            e.printStackTrace();
        }

        for (int i = 0; i < fileLines.size(); i++) {
            if (fileLines.get(i).equals("Section:DUL")){
                try {
                    dul.setType(fileLines.get(i + 1));
                    dul.setSeria(fileLines.get(i + 2));
                    dul.setNumber(fileLines.get(i + 3));
                    dul.setDate(dateFormat.parse(fileLines.get(i + 4)));
                    dul.setCode(fileLines.get(i + 5));
                } catch (Exception e) {
                    System.out.println("Ошибка создания DUL");
                    e.printStackTrace();
                }
            }

            if (fileLines.get(i).equals("Section:FIO")){
                try {
                    String fio = fileLines.get(i + 1);
                    Date birthDate = (dateFormat.parse(fileLines.get(i + 2)));
                    client = new Client(fio, birthDate, dul);
                } catch (Exception e) {
                    System.out.println("Ошибка загрузки/создания клиента");
                    e.printStackTrace();
                }
            }

            if (fileLines.get(i).equals("Section:FROM")) {
                try {
                    double cash = Double.parseDouble(fileLines.get(i + 1));
                    Currency currencyFrom = Currency.valueOf(fileLines.get(i + 2));
                    money = new Money(currencyFrom, cash);
                } catch (IllegalArgumentException e) {
                    System.out.println("Ошибка создания объекта Money");
                    e.printStackTrace();
                }
            }

            if (fileLines.get(i).equals("Section:TO")){
                try {
                    currency = Currency.valueOf(fileLines.get(i + 1));
                } catch (IllegalArgumentException e) {
                    System.out.println("Ошибка создания валюты");
                    e.printStackTrace();
                }
            }


        }

        ConvertData convertData = new ConvertData(client, money, currency);
        return convertData;
    }

    public FileDataSource(File file) {
        this.file = file;
    }
}
