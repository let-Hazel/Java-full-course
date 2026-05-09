# 📘 Module 03: Loops (`while`, `do-while`, `for`)

---

## 🎯 Learning Objectives

In this module, you will:

- Understand repetition using loops
- Use `while`, `do-while`, and `for` loops effectively
- Apply `break` and `continue` correctly
- Process arrays using iteration
- Handle stopping conditions safely
- Avoid infinite loops
- Strengthen algorithmic thinking through repeated problem-solving

---

## 🎥 Video Learning Resource

https://youtu.be/xTtL8E4LzTQ

### ⏱ Watch These Sections Only:

- **00:03:09 → 00:03:33** → `while` & `do-while`
- **00:03:43 → 00:03:55** → `for` loops

👉 Watch each section separately and practice immediately after each one.

---

# 📚 Learning Outcomes Assessed

- Iteration Logic
- Loop Structures (`for`, `while`, `do-while`)
- Flow Control (`break`, `continue`)
- Array Traversal
- Sequential Processing
- Stopping Conditions
- Problem Decomposition
- Algorithmic Thinking

---

# 🛠 Module Structure

This module contains:

### Coding Practice:

Complete all functions inside:

```java
LoopExercises.java
```

---

# ✅ What You Must Do

For this module, you must:

- Understand when to use each loop type
- Select the correct loop structure for each problem
- Handle stopping conditions properly
- Avoid infinite loops
- Process arrays accurately
- Apply `break` and `continue` where required
- Return exact expected outputs
- Handle all edge cases
- Pass all unit tests successfully

---

# 🧪 How to Run Your Tests

### Run all tests:

```bash
mvn test
```

### Run only this module’s tests:

```bash
mvn test -Dtest=LoopExercisesTest
```

---

# 🧠 Core Loop Concepts

---

## 🔹 `while` Loop

Used when repetition depends on a condition checked before execution.

```java
while (condition) {
    // repeated execution
}
```

### Example:

```java
int i = 0;
while (i < 5) {
    i++;
}
```

---

## 🔹 `do-while` Loop

Runs at least once before checking the condition.

```java
do {
    // executes first
} while (condition);
```

---

## 🔹 `for` Loop

Best when the number of repetitions is known beforehand.

```java
for (int i = 0; i < n; i++) {
    // repeated execution
}
```

---

## 🔹 `break`

Stops loop execution immediately.

---

## 🔹 `continue`

Skips current iteration and moves to the next.

---

# 🧪 Exercises

---

# 🧩 Question 1 - Guessing Game

## Function:

```java
exercise1_guessingGame(int[] guesses, int secret)
```

---

### Objective:

Simulate repeated guesses until the correct secret number is found.

---

### Rules:

- Iterate through the `guesses` array
- Count each attempt
- Stop immediately when guess equals secret
- Return total number of attempts used

---

### Inputs:

- `int[] guesses`
- `int secret`

---

### Output:

- Integer representing attempt count

---

### Examples:

| Input | Output |
|------|--------|
| `[5, 7], secret = 7` | `2` |
| `[3, 4, 9], secret = 9` | `3` |
| `[8], secret = 8` | `1` |

---

### Edge Cases:

- Secret may appear first
- Secret is guaranteed to exist
- Stop at first correct guess

---

# 🧩 Question 2 - PIN Validator

## Function:

```java
exercise2_pinValidator(int[] pins)
```

---

### Objective:

Validate PIN attempts until correct PIN (`1234`) is entered.

---

### Rules:

- Correct PIN = `1234`
- Count attempts
- Stop when correct PIN is found
- Return number of attempts used

---

### Input:

- `int[] pins`

---

### Output:

- Integer attempt count

---

### Examples:

| Input | Output |
|------|--------|
| `[1111, 1234]` | `2` |
| `[1234]` | `1` |
| `[0000, 9999, 1234]` | `3` |

---

### Edge Cases:

- Correct PIN may be first
- Multiple incorrect attempts
- PIN guaranteed to appear

---

# 🧩 Question 3 - Sum Until Zero

## Function:

```java
exercise3_sumUntilZero(int[] numbers)
```

---

### Objective:

Calculate total sum until `0` is encountered.

---

### Rules:

- Add numbers sequentially
- Stop at first `0`
- Do NOT include `0`

---

### Input:

- `int[] numbers`

---

### Output:

- Integer sum

---

### Examples:

| Input | Output |
|------|--------|
| `[5, 3, 2, 0]` | `10` |
| `[1, 2, 3, 0]` | `6` |
| `[0]` | `0` |

---

### Edge Cases:

- Zero first
- Negative numbers valid
- Stop immediately at first zero

---

# 🧩 Question 4 - Number Printer

## Function:

```java
exercise4_numberPrinter(int n)
```

---

### Objective:

Print numbers from `1` to `n`, skipping multiples of `5`.

---

### Rules:

- Use `for` loop
- Skip numbers divisible by `5`
- Return comma-separated string

---

### Input:

- `int n`

---

### Output:

- String

---

### Examples:

| Input | Output |
|------|--------|
| `10` | `"1, 2, 3, 4, 6, 7, 8, 9"` |
| `5` | `"1, 2, 3, 4"` |
| `3` | `"1, 2, 3"` |

---

### Edge Cases:

- `n < 5`
- Multiples excluded
- Proper formatting

---

# 🧩 Question 5 - Password Checker

## Function:

```java
exercise5_passwordChecker(String[] attempts)
```

---

### Objective:

Validate password attempts with maximum 3 tries.

---

### Rules:

- Max attempts = 3
- Correct password = `"secret"`
- Stop early if correct
- Return:
  - `"Access granted!"`
  - `"Access denied"`

---

### Input:

- `String[] attempts`

---

### Output:

- String

---

### Examples:

| Input | Output |
|------|--------|
| `["wrong", "secret"]` | `"Access granted!"` |
| `["wrong1", "wrong2", "wrong3"]` | `"Access denied"` |
| `["secret"]` | `"Access granted!"` |

---

### Edge Cases:

- Correct on first try
- More than 3 attempts given
- Only first 3 count

---

# 🧩 Question 6 - Even Numbers

## Function:

```java
exercise6_evenNumbers(int n)
```

---

### Objective:

Return all even numbers from `1` to `n`.

---

### Rules:

- Use loop
- Use `continue` to skip odds
- Return comma-separated string

---

### Input:

- `int n`

---

### Output:

- String

---

### Examples:

| Input | Output |
|------|--------|
| `8` | `"2, 4, 6, 8"` |
| `5` | `"2, 4"` |
| `2` | `"2"` |

---

### Edge Cases:

- `n < 2`
- No even numbers
- Proper formatting

---

# 💡 Key Developer Tips

- Clearly define stopping conditions
- Avoid infinite loops
- Track counters carefully
- Use arrays to simulate user input
- Apply `break` only when necessary
- Use `continue` strategically
- Validate output formatting
- Test edge cases manually
- Practice loop tracing on paper if confused

---

# 🚀 End Goal

By completing this module, you should:

- Master `while`, `do-while`, and `for`
- Understand loop flow deeply
- Process sequences confidently
- Build strong iterative logic
- Solve repeated-action programming problems
- Prepare for advanced algorithms and data structures

---

# 🏆 Success Mindset

Loops are foundational to:

- Data processing systems
- Backend services
- Automation tools
- Game engines
- AI pipelines
- Real-world software engineering

Master loops thoroughly — they are one of programming’s most powerful tools.
