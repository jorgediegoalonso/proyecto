package com.ejemplos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import lombok.Cleanup;

public class cleanUp {
    public static void main(String[] args) {
        System.out.println("Java:");
        final String path = "ejem/src/main/java/com/ejemplos/";
        try {
            copy(path + "output.txt", path + "input.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n");
        System.out.println("Lombok:");
        try {
            copy(path + "outputLombok.txt", path + "inputLombok.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void copy(String output, String input) throws IOException {
        @Cleanup
        InputStream inputStream = new FileInputStream(input);
        @Cleanup
        OutputStream outputStream = new FileOutputStream(output);

        byte[] buffer = new byte[100000];
        while (true) {
            int totalByteRead = inputStream.read(buffer);
            if (totalByteRead == -1)
                break;
            outputStream.write(buffer, 0, totalByteRead);
        }
    }
}
