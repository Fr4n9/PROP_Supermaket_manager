# Gestor de Supermercat 🛒

**Optimització intel·ligent de la distribució de productes en supermercats per a maximitzar vendes i eficiència.**

[![Java](https://img.shields.io/badge/Java-22%2B-blue.svg)](https://www.java.com) [![Gradle](https://img.shields.io/badge/Gradle-7.0-blue.svg)](https://gradle.org) [![Estat](https://img.shields.io/badge/estat-finalitzat-green.svg)](https://shields.io/)

---

### 📖 Taula de Continguts

* [Descripció del Projecte](#-descripció-del-projecte)
* [Funcionalitats Clau](#-funcionalitats-clau)
* [Demo Ràpida](#-demo-ràpida)
* [Stack Tecnològic i Arquitectura](#-stack-tecnològic-i-arquitectura)
* [Com Començar](#-com-començar)
    * [Prerequisits](#prerequisits)
    * [Instal·lació i Execució](#instal·lació-i-execució)
    * [Executar Tests](#executar-tests)
* [Estructura del Projecte](#-estructura-del-projecte)
* [Comandes Útils de Gradle](#-comandes-útils-de-gradle)
* [Equip de Desenvolupament](#-equip-de-desenvolupament)

---

### 🎯 Descripció del Projecte

**Supermarket Manager** és una aplicació d'escriptori dissenyada per a resoldre el complex problema de la distribució de productes a les prestatgeries d'un supermercat.

L'objectiu és generar una disposició òptima que no només millori l'experiència del client, sinó que també incrementi les vendes a través de la col·locació estratègica de productes, basada en dades i similituds entre ells que el mateix supermercat pot introduir.

El sistema utilitza algorismes avançats, com una solució al [**Problema del Viatjant de Comerç (TSP)**](https://en.wikipedia.org/wiki/Travelling_salesman_problem) i [**Backtracking**](https://en.wikipedia.org/wiki/Backtracking), per a calcular la distribució de la manera més eficient.

---

### ✨ Funcionalitats Clau

* **Gestió de Perfils**: Crea, carrega i edita perfils de supermercat, que contenen el catàleg de productes i les seves vendes.
* **Gestió de Prestatgeries**: Defineix l'estructura física de les prestatgeries del supermercat.
* **Càlcul de Distribució òptima**: Genera automàticament la millor distribució de productes utilitzant diferents estratègies algorítmiques.
* **Anàlisi de Similitud**: Modifica i consulta la matriu de similituds entre productes per a afinar l'estratègia de venda creuada.
* **Visualització de Resultats**: Mostra la distribució final de forma gràfica i intuïtiva.
* **Persistència de Dades**: Desa i carrega l'estat de l'aplicació (perfils, prestatgeries) per al seu ús posterior.

---

### 🚀 Demo Ràpida

![alt_text](https://github.com/Fr4n9/PROP_Supermaket_manager/blob/main/Imagen1.png)
![alt_text](https://github.com/Fr4n9/PROP_Supermaket_manager/blob/main/Imagen2.png)
![alt_text](https://github.com/Fr4n9/PROP_Supermaket_manager/blob/main/Imagen3.png)
---

### 🛠️ Stack Tecnològic i Arquitectura

* **Llenguatge**: **Java (JDK 22)**
* **UI**: **Java Swing** per a la interfície d'escriptori.
* **Sistema de Build**: **Gradle** per a la gestió de dependències i automatització de tasques.

El projecte segueix una **Arquitectura en Capes** per a separar responsabilitats:

* **Capa de Presentació (UI)**: Vistes de Swing que interactuen amb l'usuari.
* **Capa de Domini**: Conté la lògica de negoci i les entitats principals (Producte, Perfil, etc.).
* **Capa de Persistència**: Gestiona la lectura i escriptura de dades en fitxers.
* **Controladors**: Orquestren la comunicació entre capes per a mantenir cadascuna el més independent possible.

A més, el projecte fa servir diverses interfícies per a desacoblar les diferents formes de càlcul del codi principal.

---

### 🏁 Com Començar

Segueix aquestes instruccions per a tenir una còpia del projecte funcionant a la teva màquina local.

#### Prerequisits

* Tenir instal·lat [Java JDK 22](https://www.oracle.com/java/technologies/javase/jdk22-archive-downloads.html).
* Tenir [Git](https://git-scm.com/downloads) instal·lat.

#### Instal·lació i Execució

1.  **Clona el repositori:**
    ```bash
    git clone <URL-DEL-REPOSITORI>
    cd PROP_Supermaket_manager
    ```

2.  **Construeix el projecte amb Gradle:**
    A Windows:
    ```bash
    ./gradlew.bat build
    ```
    A macOS/Linux:
    ```bash
    ./gradlew build
    ```

3.  **Executa l'aplicació:**
    A Windows:
    ```bash
    ./gradlew.bat run
    ```
    A macOS/Linux:
    ```bash
    ./gradlew run
    ```

#### Executar Tests

Per a executar la suite de tests unitaris i assegurar que tot funciona com s'espera:
A Windows:
```bash
./gradlew.bat test
```

A macOS/Linux:
```bash
./gradlew test
```
---

### 📁 Estructura del Proyecto

```
.
├── DOCS/                     # Documentació del projecte: manual d'usuari, proves, etc.
├── EXE/                      # Executables .jar organitzats per tipus de classe
├── FONTS/                    # Codi font, incloent tests JUnit
├── JAVADOC/                  # Documentació generada amb JavaDoc
├── PERFILS/                  # Dades .dat de perfils desats
├── PRESTATGERIES/            # Dades .dat de les prestatgeries
├── build/                    # Fitxers generats per Gradle
└── src/main/java/edu/upc/prop/clusterxx/
    ├── clases_dominio/             # Models de dades (Producte, Perfil)
    ├── controladores/              # Lògica de negoci i d'UI
    ├── controladores_persistencia/ # Lògica per a desar/carregar dades
    ├── controladores_presentacion/ # Vistes de la interfície gràfica
    └── estrategias_calculo/        # Algorismes d'optimització
```

---

### 🧰 Comandes Útils de Gradle

```bash
./gradlew run                 # Executa l'aplicació
./gradlew test                # Executa els tests
./gradlew build               # Compila i construeix el projecte
./gradlew clean               # Neteja els fitxers de compilació
./gradlew jar                 # Genera un .jar a build/libs (sense dependències)
./gradlew compileAllClasses   # Compila totes les classes a /classes/java
./gradlew assembleDist        # Crea una distribució completa (.zip i .tar) per a executar sense IDE
```

---

### 👥 Equip de Desenvolupament

**PROP Grup 31.5 — Projecte de Programació, UPC**

*Profesor: Carles Arnal* ([carles.arnal@upc.edu]())

**Membres del Grup:**

- Eric Díez Apolo ([eric.diez@estudiantat.upc.edu]())
- Pol Carnicer Gonzalez ([pol.carnicer@estudiantat.upc.edu]())
- Aleix Montero Ponce ([aleix.montero@estudiantat.upc.edu]())
- Francesc Pérez Venegas ([francesc.perez.venegas@estudiantat.upc.edu]())

---

