package com.a6.finalproject.apiusercontroller.utils;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class HelperClass {

    public static String loadJsonFromFile(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }
}