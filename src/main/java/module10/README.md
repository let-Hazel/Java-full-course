# 📘 Module 10: Object Relationships (Aggregation & Composition)

---

## 🎯 Learning Objectives

In this module, you will:

* Understand how objects relate to one another
* Learn the difference between aggregation and composition
* Model real-world systems using object relationships
* Improve software architecture and design thinking
* Strengthen professional object-oriented programming skills

---

## 🎥 Video Learning Resource

[Java Full Course for Beginners by Bro Code](https://youtu.be/xTtL8E4LzTQ)

### ⏱ Watch These Sections in Order:

### 1️⃣ Aggregation

* **08:29:39 → 08:39:02**

### 2️⃣ Composition

* **08:39:02 → 08:45:17**

---

### 📚 Study Method:

* Watch one relationship type at a time
* Pause frequently
* Build each class manually
* Test independently
* Focus on ownership and dependency

---

## Learning Outcomes Assessed

* Object Relationships
* Aggregation
* Composition
* Constructor Design
* Class Collaboration
* OOP Architecture
* Real-World Modeling
* Software Design Thinking

---

## Module Structure

### Coding Practice Files:

```java
Student.java
School.java
Engine.java
Car.java
Exercises.java
```

---

## Your Task

You must:

* Build interconnected Java classes
* Understand object ownership deeply
* Apply aggregation correctly
* Apply composition correctly
* Design constructors carefully
* Build realistic class relationships
* Return exact expected outputs
* Pass all tests successfully

---

## How to Run Your Tests

### Run all tests:

```bash
mvn test
```

### Run module-specific tests:

```bash
mvn test -Dtest=Module10Test
```

---

# 🧠 Core Object Relationship Concepts

---

# 🔹 What Are Object Relationships?

Most real-world systems involve multiple connected objects.

### Examples:

* School → Students
* Car → Engine
* Library → Books
* Company → Employees

Understanding these relationships is critical for scalable software engineering.

---

# 🔹 Aggregation ("Has-A" Relationship)

Aggregation means one object references another, but the child object exists independently.

### Example:

A school has students.

If the school closes:

* Students still exist
* Students can transfer elsewhere

---

### Key Principle:

* Parent references child
* Parent does NOT fully own child
* Child can exist independently

---

### Real-World Examples:

* School → Students
* Team → Players
* Playlist → Songs

---

# 🔹 Composition ("Part-Of" Relationship)

Composition means one object fully owns another.

### Example:

A car has an engine.

If the car is destroyed:

* That engine belongs specifically to that car
* Engine is tightly bound to parent object

---

### Key Principle:

* Parent creates child
* Parent owns child
* Child depends on parent

---

### Real-World Examples:

* Car → Engine
* House → Rooms
* Computer → CPU

---

# 🧪 Project Structure

```plaintext
module10/
├── Student.java
├── School.java
├── Engine.java
├── Car.java
├── Exercises.java
├── tests/
│   └── Module10Test.java
└── README.md
```

---

# 🧩 Part 1: Aggregation

# Question 1 - Student Class

## Class:

```java
Student
```

---

### Objective:

Create an independent `Student` class.

### Required Field:

```java
private String name;
```

---

### Required Constructor:

```java
Student(String name)
```

---

### Required Methods:

```java
getName()
setName()
```

---

### Example:

| Code                | Result             |
| ------------------- | ------------------ |
| new Student("John") | Student named John |

---

### Developer Focus:

Students must exist independently from schools.

---

# 🧩 Question 2 - School Class

## Class:

```java
School
```

---

### Objective:

Create a `School` class that aggregates students.

### Required Fields:

```java
private String name;
private Student[] students;
```

---

### Constructor:

```java
School(String name, Student[] students)
```

---

### Rules:

* Students are passed into constructor
* School does NOT create students
* Students remain independent

---

### Required Method:

```java
countStudents()
```

---

### Output:

Return total student count.

---

### Example:

| Input      | Output |
| ---------- | ------ |
| 3 students | 3      |

---

### Key Understanding:

School organizes students, but does not own their existence.

---

# 🧩 Part 2: Composition

# Question 3 - Engine Class

## Class:

```java
Engine
```

---

### Objective:

Create an `Engine` class.

### Required Field:

```java
private String type;
```

---

### Constructor:

```java
Engine(String type)
```

---

### Required Method:

```java
getType()
```

---

### Example:

| Code             | Result         |
| ---------------- | -------------- |
| new Engine("V8") | Engine type V8 |

---

# 🧩 Question 4 - Car Class

## Class:

```java
Car
```

---

### Objective:

Create a `Car` class using composition.

### Required Fields:

```java
private String model;
private Engine engine;
```

---

### Constructor:

```java
Car(String model, String engineType)
```

---

### Rules:

* `Car` creates `Engine` internally
* User provides engine type only
* Engine belongs directly to Car

---

### Example:

```java
new Car("BMW", "V8")
```

---

### Key Understanding:

This is composition because:

* Car owns engine
* Car controls engine creation
* Engine is part of car structure

---

# 🧩 Question 5 - Describe Car

## Method:

```java
describe()
```

---

### Required Output Format:

```java
Model: BMW, Engine: V8
```

---

### Why This Matters:

Readable summaries are essential for:

* Debugging
* Logging
* Reports
* APIs

---

# 💡 Key Developer Tips

* Aggregation = external object passed in
* Composition = internal object created
* Think carefully about ownership
* Constructors define relationships
* Keep classes focused
* Use encapsulation properly
* Design scalable systems
* Build maintainable architecture

---

# 🚀 End Goal

By completing this module, you should:

* Understand object relationships deeply
* Know when to use aggregation
* Know when to use composition
* Design realistic software systems
* Improve architecture-level thinking
* Strengthen OOP mastery
* Prepare for enterprise software design

---

# 🏆 Success Mindset

Professional software is built from interconnected systems, not isolated classes.

Mastering object relationships prepares you for:

* Backend systems
* Enterprise applications
* APIs
* Game development
* Clean architecture
* Large-scale software engineering

This module moves you from basic OOP into designing real-world software structures like professional developers.
