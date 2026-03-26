# Encapsulation in Java — Digital Wallet System

> Demonstrating **Encapsulation in Object-Oriented Programming** through a real-world **Digital Wallet System** example.

Encapsulation is one of the **core pillars of Object-Oriented Programming (OOP)**.
It ensures that **object data is protected and accessed only through controlled operations**.

This example models a **digital wallet system**, where the wallet balance cannot be modified directly.
Instead, all modifications must go through **controlled business operations** like `deposit()` and `withdraw()`.

---

# What is Encapsulation ?

Encapsulation means:

> **Wrapping data and the methods that operate on that data into a single unit (class) while restricting direct access to the internal state.**

This is achieved using **access modifiers** such as `private`.

Key idea :

```
Data should not be directly accessible from outside the class.
```

Instead, it must be accessed through **public methods**.

---

# Conceptual Design

```
                Wallet (Class)

        +--------------------------------+
        | walletId                       |
        | ownerName                      |
        | balance                        |
        | active                         |
        +--------------------------------+
        | deposit(amount)                |
        | withdraw(amount)               |
        | freezeWallet()                 |
        | activateWallet()               |
        | getBalance()                   |
        +--------------------------------+
```

The **Wallet class encapsulates wallet data and operations**.

Important design rule:

```
balance is private
```

So external code **cannot modify it directly**.

---

# Why Encapsulation Matters

Encapsulation protects the system from **invalid state changes**.

Example scenarios :

| Scenario                    | Protection |
| --------------------------- | ---------- |
| Negative deposit            | Prevented  |
| Withdraw without balance    | Prevented  |
| Operations on frozen wallet | Prevented  |

All rules are **enforced inside the class**.

---

# Project Structure

```
encapsulation
 ├── Wallet.java
 ├── WalletApplication.java
 └── README.md
```

This structure keeps the **encapsulation example isolated and easy to understand**.

---

# Wallet Class Implementation

```java
package encapsulation;

import java.util.UUID;

public class Wallet {

    private final String walletId;
    private final String ownerName;
    private double balance;
    private boolean isActive;

    public Wallet(String ownerName) {
        this.walletId = UUID.randomUUID().toString();
        this.ownerName = ownerName;
        this.balance = 0;
        this.isActive = true;
    }

    public void deposit(double amount) {

        if(!isActive) {
            System.out.println("Wallet is inactive.");
            return;
        }

        if(amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }

        balance += amount;
        System.out.println("Deposited : " + amount);
        System.out.println("Current Balance : " + balance);
    }

    public void withdraw(double amount) {

        if (!isActive) {
            System.out.println("Wallet is inactive.");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }

        balance -= amount;

        System.out.println("Withdrawn : " + amount);
        System.out.println("Remaining Balance : " + balance);
    }

    public void freezeWallet() {
        isActive = false;
        System.out.println("Wallet has been frozen.");
    }

    public void activateWallet() {
        isActive = true;
        System.out.println("Wallet activated.");
    }
}
```

---

# Application Execution

```java
package encapsulation;

public class WalletApplication {

    public static void main(String[] args) {
        Wallet wallet = new Wallet("Example Owner");
        wallet.deposit(50000);
        wallet.withdraw(1500);

        System.out.println();
        wallet.freezeWallet();

        System.out.println();
        wallet.withdraw(300);
        wallet.activateWallet();
        wallet.withdraw(500);
    }
}

```

---

# Execution Flow

```
Create Wallet Object
        │
        ▼
Initialize Wallet State
        │
        ▼
Deposit Money
        │
        ▼
Withdraw Money
        │
        ▼
Freeze Wallet
        │
        ▼
Prevent Transactions
        │
        ▼
Activate Wallet
```

This demonstrates **controlled state transitions using encapsulation**.

---

# Example Output

```
Deposited : 50000.0
Current Balance : 50000.0
Withdrawn : 1500.0
Remaining Balance : 48500.0

Wallet has been frozen.

Wallet is inactive.
Wallet activated.
Withdrawn : 500.0
Remaining Balance : 48000.0
```

---

# What Encapsulation Prevents

Without encapsulation, external code could do something dangerous:

```
wallet.balance = 1000000;
```

But this is **impossible** because:

```
balance is private
```

The balance can only be modified using **controlled methods**.

---

# Engineering Insight

Encapsulation enables:

* **Data protection**
* **Controlled state modification**
* **Business rule enforcement**
* **System reliability**

This principle is heavily used in:

* **Banking systems**
* **Payment gateways**
* **Financial applications**
* **Enterprise backend services**

---

# Real System Mapping

| Real World     | Software         |
| -------------- | ---------------- |
| Digital wallet | `Wallet` class   |
| Wallet balance | `balance`        |
| Deposit money  | `deposit()`      |
| Withdraw money | `withdraw()`     |
| Freeze account | `freezeWallet()` |

This demonstrates how **real systems are modeled using object-oriented design**.

---

# Key Takeaways

- Encapsulation protects object data
- Internal state cannot be modified directly
- Business rules are enforced inside the class
- External code interacts through **controlled public methods**

Encapsulation is essential for **building secure and maintainable software systems**.

---

# Final Thought

Encapsulation is not just an OOP concept — it is a **design discipline**.

Well-designed classes protect their internal state and expose **only safe operations**, ensuring that software systems remain **robust, predictable, and maintainable**.
