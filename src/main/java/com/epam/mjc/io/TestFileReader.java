package com.epam.mjc.io;

import java.io.File;

public class TestFileReader {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        File file = new File("C:\\Users\\matse\\Documents\\projects\\stage1-module6-io-task1\\src\\main\\resources\\Profile.txt");
        fileReader.getDataFromFile(file);
    }
}
