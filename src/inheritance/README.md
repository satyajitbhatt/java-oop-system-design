# Java Inheritance Deep Dive

A practical and architecture-focused project demonstrating **all types of inheritance in Java** using real-world backend examples.

---

## Why This Project ?

Inheritance is a core OOP concept, but most examples are too basic (animals, shapes ❌).
This repository focuses on **real backend scenarios** like :

* Entity modeling
* Service layering
* Notification systems
* Cross-cutting concerns (logging, auditing)

---

## What is Inheritance?

Inheritance allows one class to **reuse properties and behavior** of another class.

It represents an **"is-a" relationship**

Example :

```text id="kpb8rd"
User IS-A BaseEntity
Order IS-A AuditableEntity
```

---

## Types of Inheritance Covered

### 1️⃣ Single Inheritance

One child extends one parent

Example : `User → BaseEntity`

---

### 2️⃣ Multilevel Inheritance

Chain of inheritance

Example :

```text id="6zhg2l"
BaseEntity → AuditableEntity → Order
```

---

### 3️⃣ Hierarchical Inheritance

Multiple children share one parent

Example :

```text id="d86e3x"
Notification → EmailNotification / SmsNotification
```

---

### 4️⃣ Multiple Inheritance (via Interfaces)

Class implements multiple interfaces

Example :

```text id="0dx9bt"
PaymentService → Loggable + Auditable
```

---

## Architecture Insight

This project mimics real backend design:

```text id="y31qnd"
BaseEntity    → shared fields (id, audit)
Service Layer → reusable logic
Interfaces    → multiple capabilities
```

---

## Execution Examples

Each inheritance type includes a **main() method** to run independently.

Example :

```java id="1r8vfa"
Notification service = new EmailNotification();
service.send("Order confirmed");
```

---

## Real-World Use Cases

* Backend entity design (BaseEntity pattern)
* Logging & auditing systems
* Notification services
* Service-layer architecture
* Framework-level abstractions

---

## Key Takeaways

* Use inheritance for **code reuse**
* Maintain **"is-a" relationships**
* Prefer **interfaces for flexibility**
* Avoid deep inheritance chains (keep it clean)

---

## When to Use vs Avoid

✔ Use when :

* Clear parent-child relationship exists
* Common logic needs reuse

❌ Avoid when :

* Behavior varies too much → use composition instead

---

## How to Run

Compile and run any example:

```bash id="1d3e6s"
javac SingleInheritanceApplication.java
java SingleInheritanceApplication
```

(Replace class name for other examples)

---

## Final Thought

> Inheritance is powerful — but when used wisely.
> Great engineers don’t just use it, they design with it.