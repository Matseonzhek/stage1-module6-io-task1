package com.epam.mjc.io;

import java.io.File;
import java.nio.file.Path;

public class TestFileReader {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        final Path TEXT_PATH = Path.of("src/main/resources/Profile.txt");
        File file = new File(TEXT_PATH.toUri());
        fileReader.getDataFromFile(file);
    }
}
