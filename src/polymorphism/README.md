## What is Polymorphism?

**Polymorphism** means *"one interface, multiple behaviors"*.

In simple terms, the same method call can behave differently based on the object it is acting on.

---

## How It Applies in This Project

In this pricing engine, we use a common interface:

```java
PricingStrategy
```

Multiple classes implement it:

* RegularPricing
* PremiumPricing
* VipPricing

Each class provides its own version of:

```java
double calculatePrice(double amount);
```

---

## Polymorphism in Action

```java
PricingStrategy strategy = DiscountFactory.getStrategy("VIP");
double price = strategy.calculatePrice(10000);
```

Here :

* The reference type is **PricingStrategy**
* The actual object could be **RegularPricing, PremiumPricing, or VipPricing**
* The method `calculatePrice()` behaves differently depending on the object

---

## Why This Matters

Instead of writing multiple `if-else` conditions, polymorphism allows:

* Cleaner code
* Easy extension (add new pricing types)
* Better maintainability

This is how real-world backend systems handle dynamic behavior efficiently.