# 📘 Module 13: Advanced Java Concepts

---

## Learning Outcomes Assessed

* Date Handling
* Time Handling
* Date Formatting
* Java Time API
* Anonymous Classes
* Runnable Interface
* TimerTask
* Scheduling Concepts
* Modern Java APIs
* Advanced Java Design Patterns

---

## Module Structure

This module contains:

### Coding Practice:

Complete all functions inside:

```java id="q4m8vx"
AdvancedJavaExercises.java
```

---

## Your Task

For this module, you must:

* Work with Java’s date and time systems
* Format dates professionally
* Understand anonymous classes
* Implement `Runnable`
* Simulate scheduled tasks
* Use advanced Java APIs
* Return exact outputs
* Pass all tests successfully

---

## Your Goal

For each function:

* Use valid Java syntax
* Use proper advanced Java APIs
* Follow exact formatting rules
* Keep logic clean
* Handle execution correctly
* Understand object behavior
* Ensure all unit tests pass

---

## How to Run Your Tests

### Run all tests:

```bash id="z7v3pk"
mvn test
```

### Run module tests:

```bash id="m2x8qr"
mvn test -Dtest=AdvancedJavaExercisesTest
```

---

# 🧠 Core Advanced Java Concepts

---

# 🔹 Dates & Times

Java provides modern APIs for date and time management.

---

### Common Classes:

* `LocalDate`
* `LocalTime`
* `LocalDateTime`
* `DateTimeFormatter`

---

### Why They Matter:

Dates and times are essential for:

* Logging
* Scheduling
* Reports
* APIs
* Authentication
* Business systems

---

### Example:

```java id="v8m4qp"
LocalDate.now()
```

---

# 🔹 Date Formatting

Raw dates may not always be user-friendly.

Formatting makes them readable.

---

### Example:

```java id="t5v9zx"
dd-MM-yyyy
```

---

### Real-World Use:

* Financial statements
* Government systems
* Reports
* Booking software

---

# 🔹 Anonymous Classes

Anonymous classes allow quick one-time object creation without defining a full class.

---

### Example:

```java id="r3m7qt"
new Runnable() {
    public void run() {
        ...
    }
}
```

---

### Why They Matter:

Useful for:

* Threads
* Event handling
* Task execution
* Temporary implementations

---

# 🔹 TimerTask

`TimerTask` allows scheduling future or repeated actions.

---

### Real-World Uses:

* Notifications
* Scheduled reports
* Background jobs
* System maintenance
* Automated monitoring

---

# 🧪 Project Structure

```plaintext id="n9v4pk"
module13/
├── AdvancedJavaExercises.java
├── tests/
│   └── AdvancedJavaExercisesTest.java
└── README.md
```

---

# Question 1 - Get Current Date

## Function:

```java id="f8m3qx"
exercise1_getCurrentDate()
```

---

### Detailed Objective:

Retrieve the system’s current date and return it as a string.

---

### Rules:

* Use Java date APIs
* Return current date
* Output should reflect system date

---

### Example Output:

| Output       |
| ------------ |
| "2026-05-08" |

---

### Why This Matters:

Most applications need current date tracking.

Examples:

* Attendance systems
* Banking systems
* Reports
* Scheduling

---

### Developer Skill Built:

* LocalDate usage
* System integration
* Dynamic runtime data

---

# Question 2 - Get Current Time

## Function:

```java id="h4v8zt"
exercise2_getCurrentTime()
```

---

### Detailed Objective:

Retrieve current system time.

---

### Rules:

* Use Java time APIs
* Return as string

---

### Example Output:

| Output         |
| -------------- |
| "14:35:22.123" |

---

### Why:

Time tracking is critical for:

* Logs
* Monitoring
* Event systems
* Security systems

---

# Question 3 - Format Date

## Function:

```java id="j7m2qx"
exercise3_formatDate()
```

---

### Detailed Objective:

Format the current date into:

```plaintext id="x5v8mr"
dd-MM-yyyy
```

---

### Rules:

* Use `DateTimeFormatter`
* Return formatted string

---

### Example:

| Raw Date   | Output     |
| ---------- | ---------- |
| 2026-05-08 | 08-05-2026 |

---

### Real-World Use:

Formatting improves readability for users.

---

### Developer Skill Built:

* Formatting APIs
* User-facing design
* Standardized outputs

---

# Question 4 - Anonymous Runnable

## Function:

```java id="p3v7kt"
exercise4_anonymousRunnable()
```

---

### Detailed Objective:

Create an anonymous implementation of `Runnable`, execute it, and return:

```plaintext id="s8m4qp"
Running
```

---

### Rules:

* Use anonymous class
* Implement `run()`
* Simulate execution

---

### Why This Matters:

Runnable concepts are foundational for:

* Threads
* Async systems
* Background tasks
* Java concurrency

---

### Developer Skill Built:

* Interface implementation
* Anonymous classes
* Execution flow

---

# Question 5 - TimerTask Execution

## Function:

```java id="w4v9zx"
exercise5_timerTask()
```

---

### Detailed Objective:

Simulate a scheduled task using `TimerTask`.

---

### Rules:

* Create task
* Execute task logic
* Return:

```plaintext id="k8m3qt"
Task executed
```

---

### Why:

Scheduling systems power:

* Cron jobs
* Alerts
* Monitoring
* Automation
* Notifications

---

### Developer Skill Built:

* Scheduling concepts
* Task abstraction
* Java utility classes

---

# 💡 Key Developer Tips

* Prefer `LocalDate` over old `Date`
* Use `DateTimeFormatter`
* Keep anonymous classes simple
* Understand interfaces deeply
* TimerTasks simulate automation
* Write reusable patterns
* Think beyond beginner syntax
* Learn enterprise-style Java

---

# 🔹 Professional Mindset

Advanced Java concepts separate beginner developers from professional engineers.

---

### Beginner:

Writes direct logic.

### Professional:

Uses:

* APIs
* Patterns
* Scheduling
* Reusable abstractions

---

# 🚀 End Goal

By completing this module, you should:

* Handle modern Java date systems
* Format data professionally
* Use anonymous classes
* Understand Runnable deeply
* Work with TimerTask concepts
* Build more advanced Java systems
* Strengthen enterprise readiness
* Think like an experienced Java developer

---

# 🏆 Success Mindset

Mastering advanced Java concepts prepares you for:

* Enterprise backend development
* Automation systems
* Scheduling platforms
* API services
* Professional software engineering
* Technical interviews

This module marks your transition from Java fundamentals into practical advanced development.
