package com.epam.task.first.data;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDataAcquirer implements DataAcquirer {

    private String fileName;

    FileDataAcquirer(String fileName) {
        this.fileName = fileName;
    }

    public String[] getData() throws IOException {
        String str = new String(Files.readAllBytes(Paths.get(fileName)));
        return str.split("\\s+");
    }
}
