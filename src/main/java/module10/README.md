# 📘 Module 10: Object Relationships (Aggregation & Composition)

---

## Learning Outcomes Assessed

* Object Relationships
* Aggregation
* Composition
* Constructor Design
* Class Collaboration
* Real-World Modeling
* OOP Architecture
* Software Design Thinking

---

## Module Structure

This module contains:

### Coding Practice:

You will complete several Java classes:

```java id="v8x3mq"
Student.java
School.java
Engine.java
Car.java
Exercises.java
```

---

## Your Task

For this module, you must:

* Understand how objects connect
* Model real-world systems accurately
* Apply aggregation properly
* Apply composition properly
* Design constructors correctly
* Understand ownership between objects
* Return exact outputs
* Pass all tests successfully

---

## Your Goal

For each class:

* Use valid Java syntax
* Follow OOP design principles
* Build realistic relationships
* Structure code professionally
* Handle object creation carefully
* Follow exact required formats
* Ensure all unit tests pass

---

## How to Run Your Tests

### Run all tests:

```bash id="p2k7tw"
mvn test
```

### Run module tests:

```bash id="z6v4rc"
mvn test -Dtest=Module10Test
```

---

# 🧠 Core OOP Relationship Concepts

---

# 🔹 What Are Object Relationships?

In software, objects rarely exist alone.

Real systems involve connected entities.

Examples:

* School → Students
* Car → Engine
* Company → Employees
* Library → Books

Understanding these relationships is essential for professional software engineering.

---

# 🔹 Aggregation ("Has-A" Relationship)

Aggregation means one object contains or references another, but the contained object can still exist independently.

---

### Example:

A school has students.

Even if the school closes, the students still exist.

---

### Key Principle:

Parent does NOT fully own child.

---

### Real-World Examples:

* School → Students
* Team → Players
* Playlist → Songs

---

# 🔹 Composition ("Part-Of" Relationship)

Composition means one object fully owns another.

If the parent is destroyed, the child should not meaningfully exist separately.

---

### Example:

A car has an engine.

Without the car, that engine instance belongs specifically to that car.

---

### Key Principle:

Parent fully controls child creation.

---

### Real-World Examples:

* Car → Engine
* House → Rooms
* Computer → CPU

---

# 🧪 Project Structure

```plaintext id="k9x2vp"
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

# 🔹 Part 1: Aggregation

# Question 1 - Student Class

## Class:

```java id="g4m8qx"
Student
```

---

### Detailed Objective:

Create a simple `Student` class that represents an independent student object.

This exercise teaches:

* Basic object creation
* Constructor use
* Encapsulation
* Independent entity modeling

---

### Required Field:

```java id="m7v3pk"
private String name;
```

---

### Required Constructor:

```java id="q2x9zt"
Student(String name)
```

---

### Required Methods:

```java id="y8m4rc"
getName()
setName()
```

---

### Example:

| Code                | Result             |
| ------------------- | ------------------ |
| new Student("John") | Student named John |

---

### Why This Matters:

Students should exist independently and later be used inside larger systems.

---

# Question 2 - School Class

## Class:

```java id="r5k8wd"
School
```

---

### Detailed Objective:

Create a `School` class that aggregates multiple students.

---

### Required Fields:

```java id="t3v7qp"
private String name;
private Student[] students;
```

---

### Rules:

* Students are passed into constructor
* School does NOT create students itself
* Students remain independent

---

### Constructor:

```java id="u9x2mf"
School(String name, Student[] students)
```

---

### Required Method:

```java id="w4m8zr"
countStudents()
```

---

### Output:

Return total number of students.

---

### Example:

| Students   | Output |
| ---------- | ------ |
| 3 students | 3      |

---

### Real-World Understanding:

A school organizes students, but does not "own" their existence.

---

# 🔹 Part 2: Composition

# Question 3 - Engine Class

## Class:

```java id="c7v4xp"
Engine
```

---

### Detailed Objective:

Create an `Engine` object used internally by `Car`.

---

### Required Field:

```java id="b2m9qk"
private String type;
```

---

### Constructor:

```java id="f8x3tr"
Engine(String type)
```

---

### Method:

```java id="j4v7pm"
getType()
```

---

### Example:

| Code             | Result         |
| ---------------- | -------------- |
| new Engine("V8") | Engine type V8 |

---

# Question 4 - Car Class

## Class:

```java id="n8m4qw"
Car
```

---

### Detailed Objective:

Create a `Car` class that demonstrates composition.

---

### Required Fields:

```java id="x3v7pt"
private String model;
private Engine engine;
```

---

### Rules:

* `Engine` must be created INSIDE the `Car` constructor
* User provides engine type only
* Car fully owns engine

---

### Constructor:

```java id="z7m2kc"
Car(String model, String engineType)
```

---

### Important:

This is composition because:

* Car creates engine
* Engine belongs directly to car
* Engine is part of car design

---

### Example:

```java id="h4v8qr"
new Car("BMW", "V8")
```

---

# Question 5 - Describe Car

## Method:

```java id="d9m3xt"
describe()
```

---

### Detailed Objective:

Return a readable description of the car and its engine.

---

### Required Format:

```java id="l5v7pk"
Model: BMW, Engine: V8
```

---

### Why This Matters:

Readable object summaries are important for:

* Debugging
* Logging
* Reports
* APIs

---

# 💡 Key Developer Tips

* Aggregation = external object passed in
* Composition = internal object created
* Think about ownership carefully
* Constructors define relationships
* Keep classes focused
* Model real-world systems logically
* Use encapsulation properly
* Build maintainable systems

---

# 🚀 End Goal

By completing this module, you should:

* Understand object relationships deeply
* Know when to use aggregation
* Know when to use composition
* Build more realistic software systems
* Improve architectural thinking
* Design stronger OOP systems
* Prepare for enterprise-level software development

---

# 🏆 Success Mindset

Understanding object relationships is critical for:

* Large software systems
* Backend development
* Game development
* APIs
* Enterprise applications
* Clean architecture

This module moves you beyond isolated classes and into designing interconnected software systems like professional developers.
