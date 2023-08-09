# Ping Pong Game

This is a simple PingPong game implemented in Java.

## Prerequisites
Make sure you have the following software installed on your system:
- Java Development Kit (JDK) - version 8 or higher
- Apache Maven (optional) - for building and managing dependencies

## Getting Started
To run the PingPong game on your local machine, follow these steps:
1. Clone the repository to your local machine using the following command:
```
git clone https://github.com/siriusberg/PingPongGame
```
2. Open a terminal or command prompt and navigate to the project directory:
`cd PingPongGame/ `
3. Compile the Java source files: `javac src/*.java`
4. Run the program: `java src.Game`
   Note: If your project uses external libraries or dependencies, you might need to include them in the classpath using the `-cp` option. And yes, my Main class named Game.
5. The game should now start running in the console or display a graphical window, depending on the implementation.

## Additional Information
- If you prefer using a Java build tool like Apache Maven, you can build and run the project using Maven commands. Make sure you have Maven installed, and then use the following commands:
  ```
  mvn compile
  mvn exec:java -Dexec.mainClass="Game"
  ```
- Customize the game settings, such as screen size, paddle speed, or ball velocity, by modifying the appropriate variables in the source code.

## Contributing
Contributions, bug reports, and feedback are welcome! If you'd like to contribute to this project, please follow these steps:
1. Fork the repository.
2. Create a new branch for your changes.
3. Make your changes and test them.
4. Commit your changes with descriptive commit messages.
5. Push your changes to your fork.
6. Create a pull request to the original repository.
