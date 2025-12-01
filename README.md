# AdventOfCode2025

My solutions for [Advent of Code 2025](https://adventofcode.com/2025) in Java!

## Project Structure

```
src/
├── main/
│   ├── java/adventofcode/
│   │   ├── InputReader.java    # Utility class for reading input files
│   │   └── Day01.java          # Solution for Day 1 (template)
│   └── resources/inputs/
│       └── day01.txt           # Input file for Day 1
└── test/
    └── java/adventofcode/      # Tests go here
```

## How to Use

### 1. Add Your Input
Copy your puzzle input from [adventofcode.com](https://adventofcode.com/2025) and paste it into the corresponding input file:
- `src/main/resources/inputs/day01.txt` for Day 1
- `src/main/resources/inputs/day02.txt` for Day 2
- etc.

### 2. Read Input in Your Solution
Use the `InputReader` utility class:

```java
// Read all lines as a List<String>
List<String> lines = InputReader.readLines(1);  // for day 1

// Or read as a single string
String content = InputReader.readAsString(1);
```

### 3. Build and Run

```bash
# Compile the project
mvn compile

# Run a specific day's solution
mvn exec:java -Dexec.mainClass="adventofcode.Day01"
```

## Adding New Days

1. Create a new input file: `src/main/resources/inputs/dayXX.txt`
2. Create a new solution class: `src/main/java/adventofcode/DayXX.java`
3. Use the `Day01.java` template as a starting point

## Requirements

- Java 17+
- Maven 3.6+
