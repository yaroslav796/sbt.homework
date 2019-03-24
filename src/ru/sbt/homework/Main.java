package ru.sbt.homework;

import java.io.File;

/**
 * Created by Yaroslav on 18.03.2019.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Converter converter = new Converter();
        converter.run();
//        File directoryFile = new File("src\\resources\\clients.txt");
//        FileDataSource file = new FileDataSource(directoryFile);
//        file.getConvertData();
    }
}
