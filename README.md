# AI Assistant Builder Pattern

## Description

This project demonstrates the **Builder Design Pattern** in Java.

The project creates different configurations of an AI Assistant step by step. The same product can have different configurations depending on its purpose.

The project contains two types of AI assistants:

* **Study AI Assistant** - designed for education and simple responses.
* **Coding AI Assistant** - designed for programming and technical responses.

The Builder Pattern makes the construction process more organized and avoids putting all construction logic inside the product class.

## Project Structure

```text
src/
├── AiAssIstant.java
├── Aibuilderr.java
├── AbstractAiAssistantBuilder.java
├── StudyAiassistantBuilderr.java
├── CodingAiassistantbuilder.java
├── director.java
└── Main.java
```

### Main Classes

**AiAssIstant**
The Product class. It represents the final AI Assistant object and contains its configuration:

* name
* model
* language
* response style
* memory
* specialization

**Aibuilderr**
The Builder interface. It defines the steps used to configure an AI Assistant.

**AbstractAiAssistantBuilder**
Contains the common construction logic and fields shared by different builders. It also validates the required `name` field before creating the final object.

**StudyAiassistantBuilderr**
A Concrete Builder for creating a study-oriented AI assistant.

Default configuration:

* Model: GPT-5
* Language: English
* Response style: Simple
* Memory: enabled
* Specialization: Education

**CodingAiassistantbuilder**
A Concrete Builder for creating a coding-oriented AI assistant.

Default configuration:

* Model: GPT-5
* Language: English
* Response style: Technical
* Memory: disabled
* Specialization: Programming

**director**
The Director class. It provides predefined methods for creating Study and Coding AI Assistants.

**Main**
The Client class. It uses the Director to create the assistants and displays the results.

## Builder Pattern

The construction process follows this structure:

```text
Aibuilderr
     ↑
     |
AbstractAiAssistantBuilder
     ↑                    ↑
     |                    |
StudyAiassistantBuilderr  CodingAiassistantbuilder
     \                    /
      \                  /
             AiAssIstant
```

The `director` class controls the construction process, while the builders contain the configuration logic.

## Fluent API

The builders use method chaining to make object construction easier to read.

Example:

```java
new StudyAiassistantBuilderr()
        .setName("Study ai")
        .build();
```

Each setter returns the current builder, which allows several methods to be called in one chain.

## How to Run

### Requirements

* Java JDK 17 or higher
* IntelliJ IDEA or another Java IDE

### Run the project

1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Make sure the Java SDK is configured.
4. Open `Main.java`.
5. Run the `main()` method.

The program creates and displays two AI Assistant configurations.

Example output:

```text
Ai assistantStudy ai
Model: GPT-5
Language: English
Response style: Simple
Memory: true
Specialization: Education

Ai assistantCodeHelper
Model: GPT-5
Language: English
Response style: Technical
Memory: false
Specialization: Programming
```

## Why Builder Pattern?

An AI Assistant can contain several configurable parameters. Creating such an object directly with a constructor would require passing many parameters at once.

The Builder Pattern allows the object to be created step by step and makes different configurations easier to manage.

It also separates the construction process from the final product.

## Advantages

* Step-by-step object construction.
* Fluent and readable API.
* Different configurations can be created using different builders.
* Construction logic is separated from the Product class.
* Common builder logic is stored in one abstract class.
* Required fields can be validated before creating the object.

## Disadvantages

* The pattern requires additional classes.
* The structure can be excessive for very simple objects.
* Adding many different product configurations can increase the number of builder classes.

## Technologies

* Java
* Object-Oriented Programming
* Builder Design Pattern
* IntelliJ IDEA
* Git and GitHub

## Repository

GitHub repository:

`https://github.com/anelmelis/aiassistant-builder-pattern.git`
