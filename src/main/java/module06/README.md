# 📘 Module 06: Advanced Loops & Method Overloading

---

## Learning Outcomes Assessed

* Method Overloading
* Advanced Loop Control
* `break` & `continue`
* Array Traversal
* Flexible Function Design
* Iterative Problem Solving

---

## Module Structure

This module contains:

### Coding Practice:

All questions must be completed inside:

```java id="k7v4pn"
AdvancedLoopExercises.java
```

Your task is to:

* Read each overloaded method carefully
* Understand how parameter differences change behavior
* Apply correct loop structures
* Use `break` and `continue` strategically
* Process arrays safely and accurately
* Return exact required outputs
* Pass all tests successfully

---

## Your Goal

For each function:

* Use valid Java syntax
* Understand overloaded methods deeply
* Control loop flow precisely
* Handle arrays effectively
* Prevent formatting mistakes
* Handle edge cases carefully
* Ensure all unit tests pass

---

## How to Run Your Tests

### Run all tests:

```bash id="f9r2wd"
mvn test
```

### Run module tests:

```bash id="m3x8qz"
mvn test -Dtest=AdvancedLoopExercisesTest
```

---

# 🧠 Core Advanced Concepts

---

## What is Method Overloading?

Method overloading allows multiple methods to share the same name while using different parameter lists.

This improves flexibility while keeping related functionality organized.

---

### Example:

```java id="p2j8sm"
printNumbers(int n)
printNumbers(int start, int end)
printNumbers(int n, String prefix)
```

---

## Why Overloading Matters

Method overloading helps developers:

* Reuse logical naming
* Improve readability
* Handle multiple input scenarios
* Build cleaner APIs
* Reduce unnecessary method names

---

# 🔁 Loop Control Tools

---

## `break`

Stops the loop immediately.

---

## `continue`

Skips the current iteration and moves to the next.

---

## Enhanced For Loop

Useful for arrays:

```java id="t8y6vn"
for (int num : arr) {
    // process elements
}
```

---

# 🧪 Fundamentals Coding Practice

---

## Project Structure

```plaintext id="d4m7bx"
module06/
├── AdvancedLoopExercises.java
├── tests/
│   └── AdvancedLoopExercisesTest.java
└── README.md
```

---

# Question 1 - printNumbers(int n)

## Function:

```java id="x6c9qr"
exercise1_printNumbers(int n)
```

### Detailed Objective:

Create a method that prints numbers from `1` to `n` while skipping all multiples of `3`.

This exercise focuses on:

* Basic looping
* Conditional skipping
* `continue` usage
* Output formatting

---

### Rules:

* Start from `1`
* End at `n`
* Skip numbers divisible by `3`
* Return remaining numbers as a comma-separated string

---

### Input:

* Integer `n`

---

### Output:

* Formatted string

---

### Examples:

| Input | Output                 |
| ----- | ---------------------- |
| 7     | "1, 2, 4, 5, 7"        |
| 3     | "1, 2"                 |
| 10    | "1, 2, 4, 5, 7, 8, 10" |

---

### Edge Cases:

* `n < 3`
* Exact multiples of 3
* Proper comma placement

---

# Question 2 - printNumbers(int start, int end)

## Function:

```java id="j3w8pt"
exercise2_printNumbers(int start, int end)
```

### Detailed Objective:

Create a method that prints numbers from `start` to `end`, but immediately stops once the first multiple of `5` is encountered.

This exercise focuses on:

* Range iteration
* `break` control
* Conditional stopping

---

### Rules:

* Print from `start` to `end`
* Include the first multiple of `5`
* Stop immediately afterward

---

### Input:

* Integer `start`
* Integer `end`

---

### Output:

* Formatted string

---

### Examples:

| Input  | Output           |
| ------ | ---------------- |
| 1, 10  | "1, 2, 3, 4, 5"  |
| 6, 12  | "6, 7, 8, 9, 10" |
| 11, 14 | "11, 12, 13, 14" |

---

### Edge Cases:

* First number is multiple of 5
* No multiples of 5 in range
* Reverse or invalid ranges depending on tests

---

# Question 3 - printNumbers(int n, String prefix)

## Function:

```java id="y4m7sv"
exercise3_printNumbers(int n, String prefix)
```

### Detailed Objective:

Create a method that prints numbers from `1` to `n`, skipping all even numbers, while adding a prefix before each printed value.

This exercise focuses on:

* Method overloading
* Odd/even filtering
* String formatting

---

### Rules:

* Print only odd numbers
* Skip even numbers
* Prefix each number

---

### Input:

* Integer `n`
* String `prefix`

---

### Output:

* Formatted string

---

### Examples:

| Input     | Output                |
| --------- | --------------------- |
| 5, "#"    | "#1, #3, #5"          |
| 6, "Num-" | "Num-1, Num-3, Num-5" |

---

### Edge Cases:

* `n < 1`
* Empty prefix
* Proper formatting

---

# Question 4 - printArray(int[] arr)

## Function:

```java id="r7v3lx"
exercise4_printArray(int[] arr)
```

### Detailed Objective:

Create a method that processes an integer array while skipping all negative numbers.

This exercise focuses on:

* Array traversal
* Conditional filtering
* Enhanced loops

---

### Rules:

* Skip negative numbers
* Include zero and positive numbers
* Return valid numbers as comma-separated string

---

### Input:

* Integer array

---

### Output:

* Formatted string

---

### Examples:

| Input         | Output    |
| ------------- | --------- |
| [1, -2, 3, 4] | "1, 3, 4" |
| [-1, -5, 2]   | "2"       |
| [0, 5]        | "0, 5"    |

---

### Edge Cases:

* Empty arrays
* All negative values
* Zero values

---

# Question 5 - printArray(int[] arr, int threshold)

## Function:

```java id="v5q2tw"
exercise5_printArray(int[] arr, int threshold)
```

### Detailed Objective:

Create a method that prints array values only while they remain below a specified threshold.

Once a value equal to or greater than the threshold is encountered, processing stops immediately.

---

### Rules:

* Print numbers below threshold
* Stop at first value ≥ threshold
* Do not include stopping value

---

### Input:

* Integer array
* Integer threshold

---

### Output:

* Formatted string

---

### Examples:

| Input                          | Output    |
| ------------------------------ | --------- |
| [1, 2, 3, 7, 4], threshold = 5 | "1, 2, 3" |
| [2, 4, 6], threshold = 6       | "2, 4"    |
| [10, 1], threshold = 5         | ""        |

---

### Edge Cases:

* Threshold encountered immediately
* No threshold break
* Empty arrays

---

# Question 6 - printArray(String[] arr, String prefix)

## Function:

```java id="u9p4dk"
exercise6_printArray(String[] arr, String prefix)
```

### Detailed Objective:

Create a method that processes string arrays while skipping any entries that begin with `"ignore"`.

All valid entries should include the provided prefix.

---

### Rules:

* Skip strings starting with `"ignore"`
* Prefix all others
* Return formatted string

---

### Input:

* String array
* String prefix

---

### Output:

* Formatted string

---

### Examples:

| Input                                    | Output            |
| ---------------------------------------- | ----------------- |
| ["apple", "ignoreBanana", "carrot"], "*" | "*apple, *carrot" |
| ["ignoreThis", "hello"], "#"             | "#hello"          |

---

### Edge Cases:

* All ignored entries
* Empty arrays
* Empty prefix
* Mixed capitalization depending on tests

---

# 💡 Key Developer Tips

* Understand overload signatures clearly
* Use `continue` for skipping
* Use `break` for stopping
* Be careful with formatting commas
* Validate array boundaries
* Reuse logic when possible
* Test each overloaded version independently

---

# 🚀 End Goal

By completing this module, you should:

* Understand method overloading confidently
* Master advanced loop controls
* Process arrays effectively
* Build flexible reusable functions
* Improve control-flow precision
* Strengthen software design patterns

---

# 🏆 Success Mindset

Professional developers constantly combine loops, arrays, and overloaded methods to create scalable systems.

Mastering these concepts will significantly improve your coding versatility and software engineering foundation.
