# 📘 Module 08: Varargs & Enhanced Switch

---

## 🎯 Learning Objectives

In this module, you will:

- Understand and use varargs (`...`)
- Work confidently with enhanced switch expressions
- Write cleaner, more flexible methods
- Combine logic with modern Java syntax
- Build scalable reusable APIs
- Strengthen structured decision-making

---

## 🎥 Video Learning Resource

https://youtu.be/xTtL8E4LzTQ

### ⏱ Watch These Sections Only:

- **05:28:07 → 05:34:36** → Varargs
- **02:49:05 → 02:57:42** → Enhanced Switch

👉 Practice immediately after each section.

---

# 📚 Learning Outcomes Assessed

- Varargs (`...`)
- Enhanced Switch Expressions
- Flexible Method Design
- Multi-Input Processing
- Modern Java Syntax
- Structured Decision Logic
- Dynamic Data Handling
- Clean Code Practices

---

# 🛠 Module Structure

This module contains:

### Coding Practice:

Complete all functions inside:

```java
VarargsSwitchExercises.java
```

---

# ✅ What You Must Do

For this module, you must:

- Use varargs correctly
- Treat varargs like arrays internally
- Apply enhanced switch expressions properly
- Avoid prohibited `if/else` where switch is required
- Handle empty or invalid inputs safely
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
mvn test -Dtest=VarargsSwitchExercisesTest
```

---

# 🧠 Core Modern Java Concepts

---

## 🔹 What is Varargs?

Varargs (`...`) allows methods to accept a variable number of arguments.

### Example:

```java
public static int sum(int... numbers)
```

---

### Why Varargs Matter

Varargs helps developers:

- Accept flexible input sizes
- Simplify method calls
- Reduce overload complexity
- Build cleaner APIs
- Improve scalability

---

### Important Reminder:

Varargs behaves like an array internally.

---

## 🔹 What is Enhanced Switch?

Enhanced switch expressions provide:

- Cleaner syntax
- Improved readability
- Safer branching
- Direct return values
- Reduced boilerplate

---

### Example:

```java
String result = switch(day) {
    case "MONDAY", "TUESDAY" -> "Weekday";
    default -> "Invalid";
};
```

---

# 🧪 Exercises

---

# 🧩 Question 1 - Sum Numbers (Varargs)

## Function:

```java
exercise1_sumNumbers(int... numbers)
```

---

### Objective:

Return the sum of all provided numbers.

---

### Rules:

- Add all values
- If empty input → return `0`

---

### Examples:

| Input | Output |
|------|--------|
| `(1, 2, 3)` | `6` |
| `(10, -5, 2)` | `7` |
| `()` | `0` |

---

### Edge Cases:

- Empty input
- Negative values
- Large lists
- Zero values

---

# 🧩 Question 2 - Find Max (Varargs)

## Function:

```java
exercise2_findMax(int... numbers)
```

---

### Objective:

Return the maximum value.

---

### Rules:

- Return largest number
- If empty → return:

```java
Integer.MIN_VALUE
```

---

### Examples:

| Input | Output |
|------|--------|
| `(5, 2, 9)` | `9` |
| `(-1, -5, -2)` | `-1` |
| `()` | `Integer.MIN_VALUE` |

---

### Edge Cases:

- Empty input
- Single value
- Negative-only lists

---

# 🧩 Question 3 - Count Even Numbers (Varargs)

## Function:

```java
exercise3_countEven(int... numbers)
```

---

### Objective:

Count how many inputs are even.

---

### Rules:

- Count numbers divisible by `2`

---

### Examples:

| Input | Output |
|------|--------|
| `(1, 2, 3, 4)` | `2` |
| `(2, 4, 6)` | `3` |
| `(1, 3, 5)` | `0` |

---

### Edge Cases:

- Empty input
- Zero
- Negative evens

---

# 🧩 Question 4 - Day Type (Enhanced Switch)

## Function:

```java
exercise4_dayType(String day)
```

---

### Objective:

Classify days.

---

### Rules:

- `MONDAY–FRIDAY` → `"Weekday"`
- `SATURDAY–SUNDAY` → `"Weekend"`
- Else → `"Invalid day"`

---

### Examples:

| Input | Output |
|------|--------|
| `"MONDAY"` | `"Weekday"` |
| `"SATURDAY"` | `"Weekend"` |
| `"HOLIDAY"` | `"Invalid day"` |

---

### Edge Cases:

- Invalid spelling
- Case sensitivity
- Empty string

---

# 🧩 Question 5 - Grade Evaluator (Enhanced Switch)

## Function:

```java
exercise5_gradeEvaluator(String grade)
```

---

### Objective:

Convert grades into performance labels.

---

### Rules:

- `A` → `"Excellent"`
- `B` → `"Good"`
- `C` → `"Average"`
- `D` → `"Poor"`
- `F` → `"Fail"`
- Default → `"Invalid grade"`

---

### Examples:

| Input | Output |
|------|--------|
| `"A"` | `"Excellent"` |
| `"C"` | `"Average"` |
| `"F"` | `"Fail"` |
| `"Z"` | `"Invalid grade"` |

---

### Edge Cases:

- Invalid values
- Lowercase depending on tests
- Empty strings

---

# 🧩 Question 6 - Simple Calculator (Enhanced Switch)

## Function:

```java
exercise6_calculator(double a, double b, String operator)
```

---

### Objective:

Perform arithmetic using operator input.

---

### Supported Operators:

- `+`
- `-`
- `*`
- `/`

---

### Rules:

- Division by zero → return `0`

---

### Examples:

| Input | Output |
|------|--------|
| `5, 3, "+"` | `8` |
| `10, 2, "/"` | `5` |
| `7, 0, "/"` | `0` |

---

### Edge Cases:

- Division by zero
- Invalid operators
- Negative numbers
- Decimals

---

# 🧩 Question 7 - Month Days (Enhanced Switch)

## Function:

```java
exercise7_monthDays(String month)
```

---

### Objective:

Return correct number of days for a month.

---

### Rules:

- February = `28`
- Invalid month = `-1`

---

### Examples:

| Input | Output |
|------|--------|
| `"JANUARY"` | `31` |
| `"FEBRUARY"` | `28` |
| `"APRIL"` | `30` |
| `"INVALID"` | `-1` |

---

### Edge Cases:

- Invalid names
- Case sensitivity
- Empty strings

---

# 💡 Key Developer Tips

- Treat varargs like arrays
- Validate empty input
- Use enhanced switch for readability
- Group cases logically
- Always define default cases
- Protect against division by zero
- Test invalid inputs thoroughly
- Practice modern Java syntax regularly

---

# 🚀 End Goal

By completing this module, you should:

- Use varargs confidently
- Master enhanced switch syntax
- Build cleaner APIs
- Handle dynamic inputs effectively
- Improve Java flexibility
- Strengthen enterprise coding readiness

---

# 🏆 Success Mindset

Modern Java emphasizes:

- Flexibility
- Readability
- Maintainability
- Scalability

Mastering varargs and enhanced switch helps you write cleaner, more professional software and prepares you for enterprise-level development.
