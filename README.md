# Vehicle Management System

This project demonstrates the use of **Concrete Class**, **Abstract Class**, and **Interface** in Java to model a simple vehicle management system. The system allows you to create a car object, start and stop it, and display its unique features.

---

## 📂 Project Structure

The project consists of three main files:

1. **`myvehicle.java`**: Contains the abstract class `myvehicle` that implements the `vehicle` interface.
2. **`vehicle.java`**: Contains the `vehicle` interface and the `car` class that extends the `myvehicle` abstract class.
3. **`app.java`**: Contains the `App` class with the `main` method to run the program.

---

## 🚀 How to Run the Program
**Compile the Java files**:
   ```bash
   javac myvehicle.java vehicle.java app.java
   Run the App class:  
   java.app

🖥️ Expected Output
```bash
the Rolls-Royce Phantom car has started
The Rolls-Royce Phantom car has Starlight Headliner
the Rolls-Royce Phantom car has stopped
the cars model is: Rolls-Royce Phantom
the cars release date is: 2017

## 🧠 Key Concepts Demonstrated

- **Interface (`vehicle`)**:
  - Defines a contract for methods (`start` and `stop`) that must be implemented by any class that implements this interface.

- **Abstract Class (`myvehicle`)**:
  - Provides a partial implementation of the `vehicle` interface.
  - Includes abstract methods (`uniqueFeature`) that must be implemented by subclasses.

- **Concrete Class (`car`)**:
  - Extends the abstract class `myvehicle`.
  - Provides concrete implementations for all abstract methods.

---

## 💡 About the Project

This project is a simple yet effective demonstration of how to use **interfaces**, **abstract classes**, and **concrete classes** in Java to build a modular and extensible system. It serves as a great example for understanding object-oriented programming (OOP) concepts in Java.
