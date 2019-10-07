# Caesar Cipher
##### By Nicholas M

## Description
A Caesar cipher, also known as Caesar's cipher, the shift cipher, Caesar's code or Caesar shift, is one of the simplest and most widely known encryption techniques. It is a type of substitution cipher in which each letter in the plain text is replaced by a letter some fixed number of positions down the alphabet.

###### Example encryption
| Input  | Shift Type | Output |
| :----: |:----:|:----:|
| a | Left shift of 1 | z |
| efg | Left shift of 2 | cde |
| elemenop | Right shift of 1 | fmfnfopq |
| the quick brown fox | Right shift of 3 | wkh txlfn eurzq ira |

###### Example decryption
| Input  | Shift Type | Output |
| :----: |:----:|:----:|
| ij | Left shift of 1 | hi |
| pb qdph | Left shift of 3 | my name |
| hr | Right shift of 1 | is |
| pifj pexav | Right shift of 3 | slim shady |

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
+ Run `java --version` to check which version of java you have installed in your device. If you have java installed, you should see an output slightly similar to the one below...  
_**openjdk 10.0.2 2018-07-17**_  
_**OpenJDK Runtime Environment (build 10.0.2+13-Ubuntu-1ubuntu0.18.04.4)**_  
 ... then you need to install java by running this : `sudo apt install default-jre`

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