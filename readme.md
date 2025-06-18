# ☕ Spring IoC Example (Java-Based Configuration)

This project demonstrates **Spring IoC** using **Java-based configuration with annotations (@Configuration, @Bean)**. It shows a simple console-based example of constructor-based dependency injection.

---

## 🧩 What is Spring IoC?

IoC (Inversion of Control) lets the Spring container manage object creation and dependency injection — giving you more modular and testable code.

---

## 📂 Project Structure

```

SpringIOC\_Java/
├── src/
│   ├── com/example/engine/
│   │   ├── Engine.java
│   │   └── PetrolEngine.java
│   ├── com/example/vehicle/
│   │   └── Car.java
│   ├── AppConfig.java
│   └── Main.java
└── README.md

```

---

## 🛠 How It Works

- `@Configuration` class defines `@Bean`s.
- `PetrolEngine` is injected into `Car` via constructor.
- Spring’s IoC container wires the dependencies automatically.

---

## 📦 Requirements

- Java 17+
- IntelliJ IDEA or any Java IDE
- Spring Core JARs

---

## 🚀 Run Instructions

1. Open the project in IntelliJ IDEA.
2. Ensure Spring JARs are available.
3. Run `Main.java`.

---

## ✅ Output Example

```

Car is running with Petrol Engine

```

---

## 📚 Key Concepts Used

- `@Configuration`
- `@Bean`
- Constructor Injection
- ApplicationContext from `AnnotationConfigApplicationContext`

---

## 👨‍💻 Author

Created by **Saurav Sarkar**  
🔗 [LinkedIn](https://www.linkedin.com/in/saurav-sarkar-0b49251b1/)  
🐙 [GitHub](https://github.com/SauravSarkar-CodersArcade)