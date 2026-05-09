# 📘 Module 02: Conditionals (`if / else`)

---

## 🎯 Learning Objectives

By the end of this module, you should be able to:

- Understand how decision-making works in Java
- Use `if`, `else if`, and `else`
- Use comparison operators such as `>`, `<`, `>=`, and `==`
- Print output using `System.out.println()`
- Format output using `System.out.printf()`
- Solve beginner programming problems using conditional logic

---

## 🎥 Video Learning Resource

https://youtu.be/xTtL8E4LzTQ

### ⏱ Watch These Sections Only

- **00:01:09 → 00:01:22** → Basic `if` statements
- **00:01:27 → 00:01:56** → `if`, `else if`, and `else`

👉 Watch a short section, pause, and code the examples yourself before continuing.

---

# 📚 Learning Outcomes Assessed

- Conditional Logic
- Comparison Operators
- Decision Making
- Console Output
- Output Formatting with `printf`
- Problem Decomposition

---

# 🛠 Module Structure

This module contains six standalone Java programs.

Each program has its own `main()` method.

Students are **not expected to write methods/functions yet**.

---

## 📁 Files to Complete

```text
module02/
├── Exercise1_TemperatureAlert.java
├── Exercise2_AgeVerification.java
├── Exercise3_EvenOrOdd.java
├── Exercise4_DiscountCalculator.java
├── Exercise5_WeatherAdvisor.java
├── Exercise6_AgeGroup.java
└── ConditionExercisesTest.java
```

---

# ✅ What You Must Do

For each exercise:

1. Open the Java file.
2. Read the instructions in this README.
3. Complete the code inside the `main()` method.
4. Print the exact required output.
5. Run the tests.
6. Fix any failing tests.

---

# 🧠 Core Conditional Concepts

---

## 🔹 `if`

Runs code only if a condition is true.

```java
if (temperature >= 35) {
    System.out.println("It's hot!");
}
```

---

## 🔹 `if / else`

Chooses between two outcomes.

```java
if (age >= 18) {
    System.out.println("Access granted");
} else {
    System.out.println("Access denied");
}
```

---

## 🔹 `if / else if / else`

Used when there are more than two possibilities.

```java
if (age < 13) {
    System.out.println("Child");
} else if (age < 20) {
    System.out.println("Teen");
} else {
    System.out.println("Adult");
}
```

---

## 🔹 `printf`

Formats output neatly.

```java
double price = 960.0;
System.out.printf("Final price: R%.2f%n", price);
```

Output:

```text
Final price: R960.00
```

---

# 🧪 Exercises

---

# 🧩 Question 1 – Temperature Alert

## File

```java
Exercise1_TemperatureAlert.java
```

## Objective

Check whether the temperature is hot.

## Rules

- If temperature is `35` or higher, print:

```text
It's hot!
```

- Otherwise, print:

```text
It's not hot.
```

## Starter Value

```java
int temperature = 35;
```

## Examples

| Temperature | Output |
|----------:|--------|
| 25 | `It's not hot.` |
| 30 | `It's not hot.` |
| 35 | `It's hot!` |

---

# 🧩 Question 2 – Age Verification

## File

```java
Exercise2_AgeVerification.java
```

## Objective

Check if a person is old enough.

## Rules

- If age is `18` or older, print:

```text
Access granted
```

- Otherwise, print:

```text
Access denied
```

## Starter Value

```java
int age = 18;
```

## Examples

| Age | Output |
|---:|------|
| 15 | `Access denied` |
| 18 | `Access granted` |
| 25 | `Access granted` |

---

# 🧩 Question 3 – Even or Odd

## File

```java
Exercise3_EvenOrOdd.java
```

## Objective

Determine whether a number is even or odd.

## Rules

- If the number is divisible by 2, print:

```text
[number] is even
```

- Otherwise, print:

```text
[number] is odd
```

## Starter Value

```java
int number = 7;
```

## Examples

| Number | Output |
|-----:|------|
| 7 | `7 is odd` |
| 10 | `10 is even` |
| 0 | `0 is even` |

---

# 🧩 Question 4 – Discount Calculator

## File

```java
Exercise4_DiscountCalculator.java
```

## Objective

Calculate the discount and final price.

## Rules

- If price is `1000` or more → discount = `20%`
- Else if price is `500` or more → discount = `10%`
- Otherwise → discount = `0%`

Print the result using:

```java
System.out.printf("Discount: %d%%, Final price: R%.2f%n", discount, finalPrice);
```

## Starter Value

```java
double price = 1200;
```

## Examples

| Price | Output |
|-----:|------|
| 1200 | `Discount: 20%, Final price: R960.00` |
| 750 | `Discount: 10%, Final price: R675.00` |
| 300 | `Discount: 0%, Final price: R300.00` |

---

# 🧩 Question 5 – Weather Advisor

## File

```java
Exercise5_WeatherAdvisor.java
```

## Objective

Provide advice based on temperature.

## Rules

- If temperature is `30` or higher → `"It's hot!"`
- Else if temperature is `15` or higher → `"It's mild."`
- Otherwise → `"It's cold."`

Print the output exactly as:

```text
Temperature: 35°C, Advice: It's hot!
```

## Starter Value

```java
int temperature = 35;
```

## Examples

| Temperature | Output |
|----------:|------|
| 35 | `Temperature: 35°C, Advice: It's hot!` |
| 20 | `Temperature: 20°C, Advice: It's mild.` |
| 5 | `Temperature: 5°C, Advice: It's cold.` |

---

# 🧩 Question 6 – Age Group

## File

```java
Exercise6_AgeGroup.java
```

## Objective

Classify a person by age.

## Rules

- Age less than `13` → `Child`
- Age less than `20` → `Teen`
- Otherwise → `Adult`

Print the result exactly as:

```text
Age: 15, Group: Teen
```

## Starter Value

```java
int age = 15;
```

## Examples

| Age | Output |
|---:|------|
| 10 | `Age: 10, Group: Child` |
| 15 | `Age: 15, Group: Teen` |
| 25 | `Age: 25, Group: Adult` |

---

# 🧪 How to Run Your Tests

### Run all tests

```bash
mvn test
```

### Run only this module's tests

```bash
mvn test -Dtest=ConditionExercisesTest
```

---

# 💡 Key Developer Tips

- Use the exact output shown in the examples.
- Pay close attention to punctuation, spaces, and capitalization.
- Use `printf()` for formatted output.
- Test boundary values like `35`, `18`, `1000`, and `13`.

---

# 🚀 End Goal

By completing this module, you will be able to:

- Write Java programs that make decisions
- Use `if`, `else if`, and `else`
- Format output with `printf()`
- Solve practical beginner problems

---

# 🏆 Success Mindset

Conditional statements are used everywhere in software:

- Login systems
- Shopping carts
- Banking apps
- Games
- Input validation

Master conditionals thoroughly—they are the foundation of intelligent programs.
```
