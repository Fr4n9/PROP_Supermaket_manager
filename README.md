<p align="center">
  <a href="./README.es.md">Español</a> •
  <a href="./README.ca.md">Català</a>
</p>
# Supermarket Manager 🛒

**Smart optimization of product distribution in supermarkets to maximize sales and efficiency.**

[![Java](https://img.shields.io/badge/Java-22%2B-blue.svg)](https://www.java.com) [![Gradle](https://img.shields.io/badge/Gradle-7.0-blue.svg)](https://gradle.org) [![Status](https://img.shields.io/badge/status-finished-green.svg)](https://shields.io/)

---

### 📖 Table of Contents

* [Project Description](#-project-description)
* [Key Features](#-key-features)
* [Quick Demo](#-quick-demo)
* [Tech Stack and Architecture](#-tech-stack-and-architecture)
* [Getting Started](#-getting-started)
  * [Prerequisites](#prerequisites)
  * [Installation and Execution](#installation-and-execution)
  * [Run Tests](#run-tests)
* [Project Structure](#-project-structure)
* [Useful Gradle Commands](#-useful-gradle-commands)
* [Development Team](#-development-team)

---

### 🎯 Project Description

**Supermarket Manager** is a desktop application designed to solve the complex problem of product distribution on supermarket shelves.

The goal is to generate an optimal layout that not only enhances the customer experience but also increases sales through strategic product placement based on data and similarities between products defined by the supermarket itself.

The system uses advanced algorithms, such as a solution to the [**Travelling Salesman Problem (TSP)**](https://en.wikipedia.org/wiki/Travelling_salesman_problem#:~:text=In%20the%20theory%20of%20computational,an%20NP%2Dhard%20problem%20in) and [**Backtracking**](https://en.wikipedia.org/wiki/Backtracking), to calculate the most efficient layout.

---

### ✨ Key Features

* **Profile Management**: Create, load, and edit supermarket profiles containing the product catalog and sales data.
* **Shelf Management**: Define the physical structure of supermarket shelves.
* **Optimal Distribution Calculation**: Automatically generate the best product layout using different algorithmic strategies.
* **Similarity Analysis**: Modify and consult the similarity matrix between products to refine cross-selling strategies.
* **Result Visualization**: Display the final distribution graphically and intuitively.
* **Data Persistence**: Save and load the application's state (profiles, shelves) for future use.

---

### 🚀 Quick Demo



---

### 🛠️ Tech Stack and Architecture

* **Language**: **Java (JDK 22)**
* **UI**: **Java Swing** for the desktop interface.
* **Build System**: **Gradle** for dependency management and task automation.

The project follows a **Layered Architecture** to separate responsibilities:

* **Presentation Layer (UI)**: Swing views interacting with the user.
* **Domain Layer**: Contains business logic and core entities (Product, Profile, etc.).
* **Persistence Layer**: Handles reading and writing data to files.
* **Controllers**: Coordinate communication between layers to keep them as independent as possible.

The project also uses several interfaces to decouple the various calculation methods from the core code.

---

### 🏁 Getting Started

Follow these instructions to get a working copy of the project on your local machine.

#### Prerequisites

* Install [Java JDK 22](https://www.oracle.com/java/technologies/javase/jdk22-archive-downloads.html).
* Install [Git](https://git-scm.com/downloads).

#### Installation and Execution

1. **Clone the repository:**

   ```bash
   git clone <REPOSITORY-URL>
   cd PROP_Supermaket_manager
   ```

2. **Build the project with Gradle:**

   On Windows:

   ```bash
   ./gradlew.bat build
   ```

   On macOS/Linux:

   ```bash
   ./gradlew build
   ```

3. **Run the application:**

   On Windows:

   ```bash
   ./gradlew.bat run
   ```

   On macOS/Linux:

   ```bash
   ./gradlew run
   ```

#### Run Tests

To run the unit test suite and ensure everything works as expected:

On Windows:

```bash
./gradlew.bat test
```

On macOS/Linux:

```bash
./gradlew test
```

---

### 📁 Project Structure

```
.
├── DOCS/                     # Project documentation: user manual, testing, etc.
├── EXE/                      # .jar executables organized by class type (test, exceptions, etc.)
├── FONTS/                    # Source code, including JUnit tests
├── JAVADOC/                  # Documentation generated with JavaDoc
├── PERFILES/                 # Saved profile data (.dat)
├── PRESTATGERIES/            # Shelf data (.dat)
├── build/                    # Gradle-generated files
└── src/main/java/edu/upc/prop/clusterxx/
    ├── clases_dominio/             # Data models (Product, Profile)
    ├── controladores/              # Business and UI logic
    ├── controladores_persistencia/ # Logic for saving/loading data
    ├── controladores_presentacion/ # Graphical interface views
    └── estrategias_calculo/        # Optimization algorithms
```

---

### 🧰 Useful Gradle Commands

```bash
./gradlew run                  # Run the application
./gradlew test                 # Run tests
./gradlew build                # Compile and build the project
./gradlew clean                # Clean compiled files
./gradlew jar                  # Generate a .jar in build/libs (without dependencies)
./gradlew compileAllClasses    # Compile all classes in /classes/java
./gradlew assembleDist         # Create a complete distribution (.zip and .tar) for running without an IDE
```

---

### 👥 Development Team

**PROP Group 31.5 — Projecte de Programació, UPC**

*Professor: Carles Arnal* ([carles.arnal@upc.edu]())

**Group Members:**

- Eric Díez Apolo ([eric.diez@estudiantat.upc.edu]())
- Pol Carnicer Gonzalez ([pol.carnicer@estudiantat.upc.edu]())
- Aleix Montero Ponce ([aleix.montero@estudiantat.upc.edu]())
- Francesc Pérez Venegas ([francesc.perez.venegas@estudiantat.upc.edu]())

---
