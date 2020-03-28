package utils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesWriter {

    public static void writeToFile (String value) throws IOException {
        File file = new File("userAnswers.txt");
        file.createNewFile();
        FileWriter writer = new FileWriter(file, true);
        writer.write(value + "\n");
        writer.flush();
        writer.close();
    }

    public static void writeResultsFile (String results) throws IOException {
        File file = new File("jobresults.txt");
        file.createNewFile();
        FileWriter writer = new FileWriter(file, true);
        writer.write(results + "\n");
        writer.flush();
        writer.close();
    }

    public static String readFromFile (int line) throws IOException {
        return Files.readAllLines(Paths.get("userAnswers.txt")).get(line);
    }

    public static void cleanFile () throws IOException {
        FileWriter fwOb = new FileWriter("userAnswers.txt", false);
        PrintWriter pwOb = new PrintWriter(fwOb, false);
        pwOb.flush();
        pwOb.close();
        fwOb.close();
    }
}
