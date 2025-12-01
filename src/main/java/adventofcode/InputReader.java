package adventofcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * Utility class for reading input files from the resources/inputs folder.
 */
public class InputReader {

    /**
     * Reads all lines from an input file for a specific day.
     *
     * @param day the day number (e.g., 1 for day01.txt)
     * @return a list of strings, one for each line in the file
     * @throws IOException if the file cannot be read
     */
    public static List<String> readLines(int day) throws IOException {
        String filename = String.format("inputs/day%02d.txt", day);
        return readLinesFromResource(filename);
    }

    /**
     * Reads all lines from a resource file.
     *
     * @param resourcePath the path to the resource file
     * @return a list of strings, one for each line in the file
     * @throws IOException if the file cannot be read
     */
    public static List<String> readLinesFromResource(String resourcePath) throws IOException {
        List<String> lines = new ArrayList<>();
        InputStream inputStream = InputReader.class.getClassLoader().getResourceAsStream(resourcePath);
        
        if (inputStream == null) {
            throw new IOException("Resource not found: " + resourcePath);
        }
        
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
        
        return lines;
    }

    /**
     * Reads the entire content of an input file for a specific day as a single string.
     *
     * @param day the day number (e.g., 1 for day01.txt)
     * @return the entire file content as a string
     * @throws IOException if the file cannot be read
     */
    public static String readAsString(int day) throws IOException {
        List<String> lines = readLines(day);
        return String.join("\n", lines);
    }
}
