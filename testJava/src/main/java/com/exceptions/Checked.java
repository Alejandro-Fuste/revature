package com.exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class Checked {

    public static void createFile(String path, String text) throws IOException{
        FileWriter writer = new FileWriter(path, true);
        writer.write(text);
        writer.close();

    }

    public static void main(String[] args) {
        String filePath = "src/main/resources/newFile.txt";
        String text = "Hello World!";

        try {
            createFile(filePath, text);
        } catch (IOException e){
            System.out.println("Error creating your file");
        }

    }
}
