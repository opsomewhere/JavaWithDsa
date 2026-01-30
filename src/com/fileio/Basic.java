package com.fileio;
import java.io.File;
import java.io.IOException;

public class Basic {
    static void main(String[] args) {
        // file name

        File file = new File("D:\\JavaWithDsa\\src\\com\\fileio\\tr.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}