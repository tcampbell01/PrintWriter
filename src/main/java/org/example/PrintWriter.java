package org.example;

import java.io.FileNotFoundException;

public class PrintWriter {
    public static void main(String[] args) {
        String outFileName = "myData.txt";
        java.io.PrintWriter writer = null;
        try {
            writer = new java.io.PrintWriter(outFileName);
            for (int i = 1; i <= 9; i++) {
                writer.printf("%d, ", i * i);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Unable to write to " + outFileName);
        } finally {
            if (writer != null) writer.close();

        }
    }
}