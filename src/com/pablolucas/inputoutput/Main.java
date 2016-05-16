package com.pablolucas.inputoutput;

import java.io.FileWriter;

/**
 * Created by paul on 15/05/16.
 */
public class Main {

    public static void main(String[] args) {

        String text = "Hello file";
        String fileName = "MyFile.txt";
        String route = "/example/route";

        try {
            FileWriter file = new FileWriter(route + fileName);
            file.write(text);
            file.close();
        } catch (Exception e) {

        }
    }
}
