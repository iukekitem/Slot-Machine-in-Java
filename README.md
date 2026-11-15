# Slot Machine in Java: Methods, Arrays, and the Random Class

This project is a Java learning progression that culminates in a console-based
slot machine game. The final project, `SlotMachine.java`, uses arrays, methods,
the `Random` class, user input, validation, loops, conditional logic, and
`switch` expressions to create a complete interactive program.

Before building the slot machine, I created several smaller classes to
practice the individual concepts it would require. `ArraysJava.java` and
`ArrayUserInput.java` introduced array creation, indexing, lengths, and
user-defined sizes. `TwoDArrays.java` and `PhonePad.java` strengthened my
understanding of nested arrays and nested loops. `SearchArray.java` practiced
finding values and comparing strings, while `Varargs.java` introduced methods
that accept a flexible number of arguments. Finally, `QuizGame.java` and
`RockPaperScissors.java` combined arrays with user input, randomness, game
state, validation, and repetition. These exercises served as preparation for
the final slot machine rather than unrelated examples.

The slot machine brings those lessons together: it generates a random row of
symbols, evaluates matching symbols, calculates a payout, updates the
player's balance, and validates whether the player wants to continue.

## Preparation for the final project

The earlier classes were built in stages so each new idea could be understood
before being used in the slot machine:

| Practice class | Preparation for `SlotMachine.java` |
|---|---|
| `ArraysJava.java` | Basic arrays, indexes, `length`, enhanced loops, and `Arrays.fill()` |
| `ArrayUserInput.java` | Runtime array creation and reading values with `Scanner` |
| `TwoDArrays.java` | Nested arrays and nested loops |
| `PhonePad.java` | Printing a two-dimensional character array as a grid |
| `SearchArray.java` | Searching, flags, `break`, and `String.equals()` |
| `Varargs.java` | Reusable methods and array-like method parameters |
| `QuizGame.java` | Parallel arrays, nested arrays, scoring, and repeated input |
| `RockPaperScissors.java` | `Random`, input normalization, validation, and game loops |

After these exercises, `SlotMachine.java` became the final application where
the concepts work together as one complete game.

## Learning goals

By completing this project, I practiced how to:

- Declare, initialize, and access arrays.
- Use zero-based indexes and the `length` property.
- Let a user choose an array's size at runtime.
- Traverse arrays with traditional and enhanced `for` loops.
- Create and print two-dimensional arrays.
- Search an array and report whether an element exists.
- Store related data in parallel arrays.
- Pass arrays to methods and return arrays from methods.
- Generate random array values.
- Use `String` comparison correctly with `.equals()`.
- Validate input with `if`, `else if`, `else`, `continue`, and `break`.
- Repeat a game with `while` and `do-while` loops.
- Use `switch` expressions to calculate results.
- Accept a variable number of method arguments with varargs.
- Break a larger program into focused methods.
- Build a complete program with a start state, repeated turns, and an ending
  condition.

## Project structure

```text
Arrays/
├── README.md
└── src/
    ├── ArraysJava.java
    ├── ArrayUserInput.java
    ├── TwoDArrays.java
    ├── PhonePad.java
    ├── SearchArray.java
    ├── Varargs.java
    ├── QuizGame.java
    ├── RockPaperScissors.java
    └── SlotMachine.java
```

Each class has its own `main` method, so each exercise can be run separately.
The files are intentionally small and focused: each one isolates a concept
before that concept is reused in the final game.

## Exercise progression

### 1. `ArraysJava.java` - basic array operations

This is the first introduction to a one-dimensional array:

```java
String[] fruits = {"apple", "orange", "coconut"};
```

The array contains three `String` values. Because Java arrays are zero-based,
the positions are:

```text
index 0 -> apple
index 1 -> orange
index 2 -> coconut
```

The exercise also demonstrates:

- `fruits.length` to discover the number of elements.
- An enhanced `for` loop to visit every element.
- `Arrays.fill(fruits, "pineapples")` to replace every value.
- The `java.util.Arrays` utility class.

`Arrays.sort(fruits)` and a traditional indexed loop are also explored in the
source comments. A traditional loop is useful when the index is needed; an
enhanced loop is simpler when only the values matter.

### 2. `ArrayUserInput.java` - user-defined array size

This exercise introduces the difference between declaring an array variable and
creating the array itself:

```java
String[] foods;       // declaration
int size = scanner.nextInt();
foods = new String[size]; // creation
```

If the user enters `3`, Java creates three `String` positions. The size is
known only while the program is running, so this is a runtime-sized array.
Once created, a Java array cannot grow or shrink.

The program then fills each position:

```java
for (int i = 0; i < foods.length; i++) {
    System.out.print("Enter a food: ");
    foods[i] = scanner.nextLine();
}
```

The call to `scanner.nextLine()` after `nextInt()` is important. `nextInt()`
reads the number but leaves the Enter key's newline in the input buffer.
Consuming that newline prevents the first food from being read as an empty
line.

This class practices:

- `Scanner` and console input.
- Runtime array allocation with `new`.
- Indexed assignment with `foods[i]`.
- The relationship between an array's size and `length`.
- The input-buffer issue caused by mixing `nextInt()` and `nextLine()`.

### 3. `TwoDArrays.java` - arrays of arrays

A two-dimensional array is an array whose elements are themselves arrays:

```java
String[][] groceries = {
    {"apple", "orange", "banana"},
    {"potato", "onion", "carrot"},
    {"chicken", "pork", "beef", "fish"}
};
```

The first index selects a row and the second selects an item within that row:

```java
groceries[0][0] = "pineapple";
groceries[1][1] = "garlic";
groceries[2][3] = "tuna";
```

The nested enhanced loops print the structure row by row. The rows do not all
need to have the same length; this example demonstrates a *jagged array*,
because the meat row has four elements while the other rows have three.

### 4. `PhonePad.java` - a character matrix

This class uses a two-dimensional `char` array to model a telephone keypad:

```java
char[][] telephone = {
    {'1', '2', '3'},
    {'4', '5', '6'},
    {'7', '8', '9'},
    {'*', '0', '#'}
};
```

It reinforces nested loops while showing that arrays can store primitive
characters as well as objects such as `String`.

### 5. `SearchArray.java` - finding a value

This exercise searches a fruit array for user input:

```java
for (int i = 0; i < fruits.length; i++) {
    if (fruits[i].equals(target)) {
        System.out.println("Element found at index: " + i);
        isFound = true;
        break;
    }
}
```

The `isFound` boolean records the result. The `break` stops searching after
the target is found, avoiding unnecessary work.

A key Java rule appears here: `String` values should be compared with
`.equals()`, not `==`. The `==` operator compares references, while `.equals()`
compares the text. For primitive integers, `==` is appropriate.

### 6. `Varargs.java` - flexible method parameters

Varargs allow a method to receive zero or more values:

```java
static int add(int... numbers)
```

Inside the method, `numbers` behaves like an array. This makes it possible to
call:

```java
add(1, 2, 3, 4, 5, 6);
average();
```

The `average` method also demonstrates defensive handling of an empty argument
list, returning `0` instead of dividing by zero.

### 7. `QuizGame.java` - parallel and nested arrays

The quiz combines related arrays:

- `questions` stores the question text.
- `options` is a two-dimensional array containing four choices per question.
- `answers` stores the correct option number.

The same index connects the data:

```text
questions[0] -> options[0] -> answers[0]
```

The outer loop displays each question, and the inner loop displays that
question's options. The score increases when the user's guess matches the
corresponding answer.

This is an example of parallel data organization. It works for practice, but
larger applications would usually group related data into a class or record so
that a question, its options, and its answer cannot become mismatched.

### 8. `RockPaperScissors.java` - arrays, randomness, and game loops

This program uses:

```java
String[] choices = {"rock", "paper", "scissors"};
```

The computer selects a random entry with:

```java
choices[random.nextInt(choices.length)]
```

The game uses a `do-while` loop because a round should run at least once.
Input is normalized with `toLowerCase()`, then validated before the win
conditions are checked. The user can continue with `"yes"` or finish with
another response.

This exercise is an important bridge between isolated array operations and a
stateful game.

## Final project: `SlotMachine.java`

The slot machine is the capstone exercise. It starts the player with a balance,
accepts a bet, generates a three-symbol row, calculates a payout, and asks
whether the player wants another round.

### Game flow

The program follows this sequence:

1. Create a `Scanner` for keyboard input.
2. Set the starting balance to `$100`.
3. Display the game title and available symbols.
4. Continue while the player has money.
5. Ask for a bet.
6. Reject bets greater than the balance.
7. Reject zero or negative bets.
8. Subtract the valid bet from the balance.
9. Generate three random symbols.
10. Print the row.
11. Calculate the payout.
12. Add a winning payout back to the balance.
13. Ask whether to play again.
14. Repeat for `Y`, stop for `N`, and re-prompt for invalid input.
15. Display the final balance and close the scanner.

The main loop is controlled by:

```java
while (balance > 0) {
    // one complete round
}
```

This means the game automatically ends when the player has no money left.
Inside the loop, `continue` restarts the loop after an invalid bet, while
`break` ends the game when the player chooses `N`.

### `spinRow()`: generating the result

The method stores the possible symbols in an array:

```java
String[] symbols = {"🍒", "🍉", "🍊", "🔔", "⭐"};
String[] row = new String[3];
Random random = new Random();
```

Each of the three positions receives a random symbol:

```java
for (int i = 0; i < 3; i++) {
    row[i] = symbols[random.nextInt(symbols.length)];
}
```

`random.nextInt(symbols.length)` generates an index from `0` through
`symbols.length - 1`, so it always points to a valid symbol. The completed
array is returned to `main`.

This demonstrates a complete method data flow:

```text
main -> spinRow() -> returns String[] row -> main
```

### `printRow()`: formatting an array

The row is passed into a method:

```java
static void printRow(String[] row)
```

`String.join(" | ", row)` creates a readable display:

```text
##############
 🍒 | ⭐ | 🍉
##############
```

The method returns `void` because its job is to display the row, not produce a
value for another calculation.

### `getPayout()`: business rules

The payout method receives both the generated row and the bet:

```java
static int getPayout(String[] row, int bet)
```

It checks the three possible pairs and the three-of-a-kind case:

```java
if (row[0].equals(row[1]) && row[1].equals(row[2])) {
    // all three match
} else if (row[0].equals(row[1])) {
    // first and second match
} else if (row[1].equals(row[2])) {
    // second and third match
} else if (row[0].equals(row[2])) {
    // first and third match
}
```

The three-of-a-kind condition must be checked first. If it were checked after
the pair conditions, a three-symbol win could be incorrectly treated as only a
two-symbol win.

For a matching symbol, a `switch` expression applies the multiplier:

| Result | Cherry | Watermelon | Orange | Bell | Star |
|---|---:|---:|---:|---:|---:|
| Three matching symbols | 3x | 4x | 5x | 10x | 20x |
| Two matching symbols | 2x | 3x | 4x | 5x | 10x |

If there is no match, the method returns `0`.

The calls to `.equals()` are required because the row contains `String`
objects. The `switch` expression's `default -> 0` is a safe fallback if an
unexpected symbol reaches the method.

### Input validation

The bet validation protects the game state:

```java
if (bet > balance) {
    System.out.println("Insufficient funds");
    continue;
} else if (bet <= 0) {
    System.out.println("Bet must be greater than 0");
    continue;
}
```

Only a valid bet reaches the balance update. This is a useful design principle:
validate input before changing important program state.

The replay prompt uses a `do-while` loop:

```java
do {
    playAgain = scanner.nextLine().trim().toUpperCase();
} while (!playAgain.equals("Y") && !playAgain.equals("N"));
```

The loop guarantees that the user is asked at least once and continues asking
until the response is valid. `trim()` accepts accidental spaces, and
`toUpperCase()` makes `y`, `Y`, `n`, and `N` behave consistently.

## Example session

```text
########################
    Welcome to SLOTS
Symbols: 🍒 🍉 🍊 🔔 ⭐
########################
Current balance: $100
Place you bet amount: 10
Spinning...
##############
 🍒 | 🍒 | 🍊
##############
You won $20
Do you want to play again? (Y/N): Y
Current balance: $110
```

The exact symbols and result change because the row is generated randomly.

## Running the project

### IntelliJ IDEA

1. Open the `Arrays` project.
2. Open any class under `src`.
3. Click the green run icon beside that class's `main` method.
4. Choose **Run '<ClassName>.main()'**.

To run the final game, open `SlotMachine.java` and run
`SlotMachine.main()`. Each class has its own entry point, so IntelliJ can run
the selected exercise rather than the previously executed class.

### Terminal

From the project directory:

```bash
cd /Users/joaochristiansen/Documents/Java/Brocode/Exercises/src/Arrays
```

Compile the source files:

```bash
javac src/*.java
```

Run the slot machine. Because the compiled `.class` files are placed beside
the source files by the simple `javac` command, run it with:

```bash
java -cp src SlotMachine
```

To compile and run only one exercise:

```bash
javac src/SlotMachine.java
java -cp src SlotMachine
```

The `switch` expressions used by `SlotMachine` require a modern Java version
(Java 14 or newer; Java 17+ is recommended).

## Design lessons from the final project

### Separate responsibilities

`main` controls the game flow, while the helper methods each have one clear
responsibility:

| Method | Responsibility |
|---|---|
| `spinRow()` | Create and return a random row |
| `printRow()` | Display a row |
| `getPayout()` | Apply the matching and payout rules |

This makes the program easier to read, test, and change than putting every
operation inside `main`.

### Treat arrays as data

The symbol list and the generated row are both arrays, but they serve different
purposes:

- `symbols` is the available set of choices.
- `row` is the result of one spin.

Keeping those roles separate prevents the program from accidentally changing
the available symbol set while creating a result.

### Normalize input at the boundary

Converting replay input with `trim().toUpperCase()` immediately after reading
it gives the rest of the program one predictable format. This is simpler and
safer than handling every possible capitalization in separate conditions.

### Check specific cases before general cases

Three matching symbols also satisfy every two-symbol comparison. Therefore,
three-of-a-kind must be checked first. This is a general conditional-logic
lesson that applies far beyond this game.

## Possible future improvements

The current version is intentionally focused on arrays and beginner Java
fundamentals. Possible next steps include:

- Catch non-numeric bet input with `try`/`catch`.
- Extract the payout multipliers into a map or a dedicated `Symbol` type.
- Add a maximum bet or a configurable starting balance.
- Ask whether the player wants to play before the first round.
- Add a statistics summary: rounds played, wins, losses, and largest payout.
- Use `enum` values instead of raw symbol strings.
- Add automated tests for every payout combination.
- Move game rules into separate classes as the project grows.
- Add a stronger random-number strategy if this becomes more than an
  educational simulation.

## Summary

This repository records a progression from basic arrays to a complete
interactive Java program. The early exercises establish the mechanics:
indexes, lengths, nested arrays, searching, and iteration. The games then add
state, randomness, validation, and control flow. `SlotMachine.java` brings
those ideas together in one program with reusable methods and explicit game
rules.

The most important result is not only the slot machine itself. It is the
development pattern behind it:

```text
learn one structure
-> practice it in isolation
-> combine it with control flow
-> separate responsibilities into methods
-> build a complete interactive program
```
