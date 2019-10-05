# Caesar Cipher
##### By Nicholas M

## Description
A Caesar cipher, also known as Caesar's cipher, the shift cipher, Caesar's code or Caesar shift, is one of the simplest and most widely known encryption techniques. It is a type of substitution cipher in which each letter in the plain text is replaced by a letter some fixed number of positions down the alphabet.

###### Example encryption
| Input  | Shift Type | Output |
| :----: |:----:|:----:|
| a | Left shift of 1 | z |
| efg | Left shift of 3 | hij |
| the quick brown fox jumps | Right shift of 3 | qeb nrfzh yoltk clu grjmp |

###### Example decryption
| Input  | Shift Type | Output |
| :----: |:----:|:----:|
| a | Left shift of 1 | z |
| efg | Left shift of 3 | bcd |
| qefp tfii abcfkfqbiv tloh | Right shift of 3 | this will definitely work |

## Prerequisites
* Java JDK
* Gradle
* Git
* Some prior knowledge of Java
* (optional) Java IDE

## Technologies used
* Java
* Gradle
* Junit

## Setup Guide
+ Clone the repository into a desired folder by running the following link in your terminal: `https://github.com/Nicholas-Muturi/CaesarCipher.git`
###### (for users with an IDE such as IntelliJ)
+ Open the project using the IDE you have installed
+ Build and Run the project.

###### (for users without an IDE)
+ Navigate to the folder containing the project
+ Build the gradle by running: `gradle build`.
+ Compile the code by running: `gradle compileJava`
+ Navigate to the App class file located at build/classes/java/main and run: `java App`.

## Known Bugs
No bugs detected during the development of this project.

## License
This projects has a MIT License [found here](LICENSE)