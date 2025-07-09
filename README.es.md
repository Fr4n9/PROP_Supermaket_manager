# Supermarket Manager 🛒

**Optimización inteligente de la distribución de productos en supermercados para maximizar ventas y eficiencia.**

[![Java](https://img.shields.io/badge/Java-22%2B-blue.svg)](https://www.java.com) [![Gradle](https://img.shields.io/badge/Gradle-7.0-blue.svg)](https://gradle.org) [![Estado](https://img.shields.io/badge/estado-finalizado-green.svg)](https://shields.io/)

---

### 📖 Tabla de Contenidos

* [Descripción del Proyecto](#-descripción-del-proyecto)
* [Funcionalidades Clave](#-funcionalidades-clave)
* [Demo Rápida](#-demo-rápida)
* [Stack Tecnológico y Arquitectura](#-stack-tecnológico-y-arquitectura)
* [Cómo Empezar](#-cómo-empezar)
    * [Prerrequisitos](#prerrequisitos)
    * [Instalación y Ejecución](#instalación-y-ejecución)
    * [Ejecutar Tests](#ejecutar-tests)
* [Estructura del Proyecto](#-estructura-del-proyecto)
* [Comandos Útiles de Gradle](#-comandos-útiles-de-gradle)
* [Equipo de Desarrollo](#-equipo-de-desarrollo)

---

### 🎯 Descripción del Proyecto

**Supermarket Manager** es una aplicación de escritorio diseñada para resolver el complejo problema de la distribución de productos en las estanterías de un supermercado.

El objetivo es generar una disposición óptima que no solo mejore la experiencia del cliente, sino que también incremente las ventas a través de la colocación estratégica de productos, basada en datos y similitudes entre ellos que el propio supermercado puede introducir.

El sistema utiliza algoritmos avanzados, como una solución al [**Problema del Viajante de Comercio (TSP)**](https://en.wikipedia.org/wiki/Travelling_salesman_problem) y [**Backtracking**](https://en.wikipedia.org/wiki/Backtracking), para calcular la distribución de la forma más eficiente.

---

### ✨ Funcionalidades Clave

* **Gestión de Perfiles**: Crea, carga y edita perfiles de supermercado, que contienen el catálogo de productos y sus ventas.
* **Gestión de Estanterías**: Define la estructura física de las estanterías del supermercado.
* **Cálculo de Distribución Óptima**: Genera automáticamente la mejor distribución de productos utilizando diferentes estrategias algorítmicas.
* **Análisis de Similitud**: Modifica y consulta la matriz de similitudes entre productos para afinar la estrategia de venta cruzada.
* **Visualización de Resultados**: Muestra la distribución final de forma gráfica e intuitiva.
* **Persistencia de Datos**: Guarda y carga el estado de la aplicación (perfiles, estanterías) para su uso posterior.

---

### 🚀 Demo Rápida

![alt_text](https://github.com/Fr4n9/PROP_Supermaket_manager/blob/main/Imagen1.png)
![alt_text](https://github.com/Fr4n9/PROP_Supermaket_manager/blob/main/Imagen2.png)
![alt_text](https://github.com/Fr4n9/PROP_Supermaket_manager/blob/main/Imagen3.png)

---

### 🛠️ Stack Tecnológico y Arquitectura

* **Lenguaje**: **Java (JDK 22)**
* **UI**: **Java Swing** para la interfaz de escritorio.
* **Sistema de Build**: **Gradle** para la gestión de dependencias y automatización de tareas.

El proyecto sigue una **Arquitectura en Capas** para separar responsabilidades:

* **Capa de Presentación (UI)**: Vistas de Swing que interactúan con el usuario.
* **Capa de Dominio**: Contiene la lógica de negocio y las entidades principales (Producto, Perfil, etc.).
* **Capa de Persistencia**: Gestiona la lectura y escritura de datos en ficheros.
* **Controladores**: Orquestan la comunicación entre capas para mantener cada una lo más independiente posible.

Además, el proyecto usa varias interfaces para desacoplar las distintas formas de cálculo del código principal.

---

### 🏁 Cómo Empezar

Sigue estas instrucciones para tener una copia del proyecto funcionando en tu máquina local.

#### Prerrequisitos

* Tener instalado [Java JDK 22](https://www.oracle.com/java/technologies/javase/jdk22-archive-downloads.html).
* Tener [Git](https://git-scm.com/downloads) instalado.

#### Instalación y Ejecución

1.  **Clona el repositorio:**
    ```bash
    git clone <URL-DEL-REPOSITORIO>
    cd PROP_Supermaket_manager
    ```

2.  **Construye el proyecto con Gradle:**
    En Windows:
    ```bash
    ./gradlew.bat build
    ```
    En macOS/Linux:
    ```bash
    ./gradlew build
    ```

3.  **Ejecuta la aplicación:**
    En Windows:
    ```bash
    ./gradlew.bat run
    ```
    En macOS/Linux:
    ```bash
    ./gradlew run
    ```

#### Ejecutar Tests

Para correr la suite de tests unitarios y asegurar que todo funciona como se espera:
En Windows:
```bash
./gradlew.bat test
 ```

En macOS/Linux:

```bash
./gradlew test
 ```

### 📁 Estructura del Proyecto

```
.
├── DOCS/                     # Documentación del proyecto: manual de usuario, pruebas, etc.
├── EXE/                      # Ejecutables .jar organizados por tipo de clase (test, excepciones, etc.)
├── FONTS/                    # Código fuente, incluyendo tests JUnit
├── JAVADOC/                  # Documentación generada con JavaDoc
├── PERFILES/                 # Datos .dat de perfiles guardados
├── PRESTATGERIES/            # Datos .dat de las estanterías
├── build/                    # Archivos generados por Gradle
└── src/main/java/edu/upc/prop/clusterxx/
    ├── clases_dominio/             # Modelos de datos (Producto, Perfil)
    ├── controladores/              # Lógica de negocio y de UI
    ├── controladores_persistencia/ # Lógica para guardar/cargar datos
    ├── controladores_presentacion/ # Vistas de la interfaz gráfica
    └── estrategias_calculo/        # Algoritmos de optimización
```

---

### 🧰 Comandos Útiles de Gradle

```bash
./gradlew run                  # Ejecuta la aplicación
./gradlew test                 # Ejecuta los tests
./gradlew build                # Compila y construye el proyecto
./gradlew clean                # Limpia archivos de compilación
./gradlew jar                  # Genera un .jar en build/libs (sin dependencias)
./gradlew compileAllClasses    # Compila todas las clases en /classes/java
./gradlew assembleDist         # Crea una distribución completa (.zip y .tar) para ejecutar sin IDE
```

---

### 👥 Equipo de Desarrollo

**PROP Grup 31.5 — Projecto de Programación, UPC**

*Profesor: Carles Arnal* ([carles.arnal@upc.edu]())

**Miembros del Grupo:**

- Eric Díez Apolo ([eric.diez@estudiantat.upc.edu]())
- Pol Carnicer Gonzalez ([pol.carnicer@estudiantat.upc.edu]())
- Aleix Montero Ponce ([aleix.montero@estudiantat.upc.edu]())
- Francesc Pérez Venegas ([francesc.perez.venegas@estudiantat.upc.edu]())

---
