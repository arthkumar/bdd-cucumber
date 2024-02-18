# bdd-cucumber

The project is for writing ui test for https://the-internet.herokuapp.com/ using bdd cucumber.

## Table of Contents

- [Introduction](#introduction)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [Installation](#installation)
- [Running Tests](#running-tests)
- [Project Structure](#project-structure)
- [Contributing](#contributing)
- [License](#license)

## Introduction

The goals of this project is for automation practice. Practice ui automation skills.

## Technologies Used

- Cucumber: Version 7.15.0
- TestNG: Version 7.9.0
- Maven: Version 3.6.3 or later.
- Java: Version JDK 11 or later.

## Getting Started

### Prerequisites

List any prerequisites needed to run the project are Java JDK and Maven. For version please check above section.

### Installation

Provide step-by-step instructions for installing and setting up the project.

1. Clone the repository.
   ```bash
   git clone https://github.com/arthkumar/bdd-cucumber.git

2. Navigate to the project directory.
    ```bash
    cd project

3. Install dependencies.
   ```bash
   mvn clean install

### Running Tests
How to run the tests locally.

1. Run all tests.
    ```bash
    mvn clean test

2. Run specific tests.
    ```bash
    mvn test -Dcucumber.options="--tags @tagname"

### Project Structure
The structure of the project directory.

```
ui-bdd-automation
│   README.md
│   pom.xml   
│
└───src
    └───test
        └───java
        │   └───stepdef
        │   |   └───StepDefinitions.java
        │   └───TestRunner.java
        └───resources
            └───features
                └───login.feature
```

### Contributing

We welcome contributions to improve the project! To contribute, please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Make your changes and ensure all tests pass.
4. Commit your changes with descriptive commit messages.
5. Push your changes to your fork.
6. Submit a pull request to the main repository's branch.

We appreciate your help in making this project better for everyone!

### License

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT) - see the [LICENSE](LICENSE) file for details.
