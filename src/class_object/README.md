# Class and Object in Java

## Overview

Object-Oriented Programming (OOP) is built on the concept of **classes** and **objects**.
Understanding these two concepts is the foundation of designing real-world systems in Java.

In simple terms :

* **Class** → A blueprint or template for creating objects
* **Object** → An instance of a class representing a real-world entity

A class defines the **state** and **behavior** of objects created from it.

---

# What is a Class ?

A **class** is a blueprint that defines the structure and behavior of objects.

It specifies :

* Attributes (fields)
* Methods (functions)
* Constructors
* Access modifiers

A class does **not represent a real entity by itself** until objects are created from it.

### Example

```java
public class Car {

    private final String manufacturer;
    private final String model;
    private int speed;
    private boolean isEngineRunning;

    public Car(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.speed = 0;
        this.isEngineRunning = false;
    }

    public void startEngine() {
        if(!isEngineRunning) {
            isEngineRunning = true;
            System.out.println(manufacturer + " - [" + model + "] engine started.");
        }
    }

    public void stopEngine() {
        if(isEngineRunning) {
            isEngineRunning = false;
            speed = 0;
            System.out.println(manufacturer + " - [" + model + "] engine stopped.");
        }
    }

    public void accelerate(int increment) {
        if (!isEngineRunning) {
            System.out.println("Start the engine first.");
            return;
        }

        speed += increment;
        System.out.println(manufacturer + " - [" + model + "] accelerating. Current speed: " + speed);
    }

    public void brake(int decrement) {
        speed -= decrement;

        if(speed < 0) {
            speed = 0;
        }

        System.out.println(manufacturer + " - [" + model + "] slowing down. Current speed : " + speed);
    }
}
```

In this example :

* `Car` is a **class**
* It defines attributes like `manufacturer`, `model`, `speed` and `isEngineRunning`
* It defines behavior like `accelerate()`, `brake()`

---

# What is an Object ?

An **object** is an instance of a class.

It represents a **real-world entity** with its own state and behavior.

Objects are created using the `new` keyword.

### Example

```java
Car rangeRover = new Car();
Car bmw = new Car();
```

Here :

* `rangeRover` and `bmw` is an **object**
* It is created from the `Car` class
* It has its own state and behavior

Multiple objects can be created from the same class.

```java
Car rangeRover = new Car();
Car bmw = new Car();
Car tata = new Car();
Car mahindra = new Car();
```

Each object has **independent state**.

---

# Object State and Behavior

Every object contains two important aspects.

## State

State represents the **data stored inside an object**.

Example :

```
model
manufacturer
speed
engineRunning
```

These values describe the current condition of the object.

Example :

```
Range Rover's Model Land Rover → speed = 60
BMW's Model BMW X7 → speed = 70
```

---

## Behavior

Behavior represents the **actions that an object can perform**.

Example :

```
startEngine()
accelerate()
brake()
stopEngine()
```

These methods modify the object's state.

Example :

```
accelerate() → increases speed
brake() → decreases speed
```

---

# Real World Example — Car

Real-world entities can be represented as objects.

| Real World Concept | Software Representation |
| ------------------ | ----------------------- |
| Car                | Class                   |
| Range Rover / BMW  | Object                  |
| Speed              | State                   |
| Accelerate         | Behavior                |

This mapping allows developers to **model real-world systems in software**.

---

# Example Implementation

## Car Class

```java
public class Car {

    private String manufacturer;
    private String model;
    private int speed;
    private boolean engineRunning;

    public Car(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.speed = 0;
        this.engineRunning = false;
    }

    public void startEngine() {
        engineRunning = true;
        System.out.println(model + " engine started.");
    }

    public void accelerate(int increment) {
        speed += increment;
        System.out.println(model + " speed: " + speed);
    }

    public void brake(int decrement) {
        speed -= decrement;
        if (speed < 0) {
            speed = 0;
        }
    }

    public void stopEngine() {
        engineRunning = false;
        speed = 0;
    }
}
```

---

## Object Creation

```java
public class CarApplication {

    public static void main(String[] args) {
        Car rangeRover = new Car("Range Rover", "Land Rover");
        rangeRover.startEngine();
        rangeRover.accelerate(60);
        rangeRover.brake(20);
        rangeRover.stopEngine();

        System.out.println("----------------------------------------------");

        Car bmw = new Car("BMW", "BMW X7");
        bmw.startEngine();
        bmw.accelerate(70);
        bmw.accelerate(30);
        bmw.brake(30);
        bmw.stopEngine();
    }
}
```

---

# Key Takeaways

* A **class** defines the structure of objects.
* An **object** represents a real-world entity created from a class.
* Objects contain **state (data)** and **behavior (methods)**.
* Multiple objects can be created from a single class.
* Each object maintains its own independent state.

---

# Why Classes and Objects Matter

Classes and objects allow developers to :

* Model real-world systems
* Organize code logically
* Improve code reusability
* Build scalable applications

Every modern software system relies heavily on **object-oriented design**.

---