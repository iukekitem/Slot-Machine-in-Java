I just finished a Java project that started with arrays and ended with a
slot machine game.

I chose a slot machine for a personal reason. I work as a Compliance Engineer
for a gaming lab, so gaming systems are already part of my professional world.
Building a small version myself gave me a way to connect what I am learning in
Java with something I see in my work. It also made the practice more
interesting than creating another generic calculator or to-do list.

I did not start by building the game all at once. I worked through several
smaller classes first:

- `ArraysJava.java` helped me understand array declaration, indexes, length,
  enhanced `for` loops, sorting, and filling an array.
- `ArrayUserInput.java` showed me how to let the user choose an array size at
  runtime and then fill the array from the console.
- `TwoDArrays.java` and `PhonePad.java` helped me work with arrays inside
  arrays, nested loops, and grid-style output.
- `SearchArray.java` introduced searching, boolean flags, `break`, and the
  difference between comparing strings with `.equals()` and using `==`.
- `Varargs.java` gave me practice writing methods that accept a flexible
  number of arguments.
- `QuizGame.java` combined questions, options, answers, scoring, and nested
  arrays.
- `RockPaperScissors.java` added random choices, input validation, and a game
  loop.

Those exercises prepared me for `SlotMachine.java`, which became the final
project. The game starts the player with a balance, asks for a bet, generates
three random symbols, displays the result, calculates the payout, and updates
the balance. It also checks that the bet is valid and keeps asking whether the
player wants to continue until they enter `Y` or `N`.

The main concepts I practiced were:

- One-dimensional and two-dimensional arrays
- `Scanner` for user input
- The `Random` class
- `while` and `do-while` loops
- `if`, `else if`, `continue`, and `break`
- Methods that receive and return arrays
- `String.equals()`
- `switch` expressions
- Input validation
- Keeping a program's state in a balance variable

I also split the final game into smaller methods instead of putting everything
inside `main`:

```java
spinRow();
printRow(row);
payout = getPayout(row, bet);
```

That was one of the most useful parts of the project. The game became easier
to follow because each method had one job: generate the row, display the row,
or apply the payout rules.

The project is still a beginner console application, but it represents a
milestone for me. I started by learning how arrays store values, then used
that knowledge to build a program with input, randomness, rules, validation,
and a complete game loop.

I am looking forward to taking these fundamentals into larger Java projects
and learning how the same ideas translate into more structured applications.

#Java #Programming #SoftwareDevelopment #LearningInPublic #GamingTechnology
