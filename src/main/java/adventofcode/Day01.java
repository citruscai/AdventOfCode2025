package adventofcode;

import java.io.IOException;
import java.util.List;

/**
 * Solution for Advent of Code 2025 - Day 1
 * 
 * This is a template/example class. Replace the solve methods with your actual solution
 * once the puzzle is released.
 */
public class Day01 {

    public static void main(String[] args) {
        try {
            List<String> input = InputReader.readLines(1);
            
            System.out.println("Day 1 - Advent of Code 2025");
            System.out.println("============================");
            System.out.println("Input lines: " + input.size());
            
            // Part 1
            int part1Result = solvePart1(input);
            System.out.println("Part 1: " + part1Result);
            
            // Part 2
            int part2Result = solvePart2(input);
            System.out.println("Part 2: " + part2Result);
            
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
            System.err.println("Make sure you have created src/main/resources/inputs/day01.txt");
        }
    }

    /**
     * Solves Part 1 of the puzzle.
     * Replace this with your actual solution.
     */
    public static int solvePart1(List<String> input) {
        // TODO: Implement your solution for Part 1
        return 0;
    }

    /**
     * Solves Part 2 of the puzzle.
     * Replace this with your actual solution.
     */
    public static int solvePart2(List<String> input) {
        // TODO: Implement your solution for Part 2
        return 0;
    }
}
