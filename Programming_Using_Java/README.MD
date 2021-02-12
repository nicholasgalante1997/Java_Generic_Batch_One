``` PROGRAMMING USING JAVA ```

This document is intended to provide a comprehensive framework for review of and further study into the Java programming language. 

The Topics Included in This Section Are as Listed Below

`` Intro To Java `` 
    CODE PATH: ./src/com/intro/to/java/HelloWorld.java 
    Notes: Start on Line 

`` Keywords, Variables, Identifiers, and Datatypes ``
    CODE PATH: ./src/com/keywords/variables/identifiers/datatypes/Example1.java 
    Notes: Start on Line 

3. Operators
4. Type Conversion
5. Selection Control Structure
6. Iteration Control Structure
7. Intro To OOP 
8. Methods
9. Constructors
10. this Keyword 
11. Memory Management
12. Encapsulation
13. Abstraction
14. Access Modifiers
15. Class Diagrams
16. Array
17. String
18. Debugging
19. Code Analysis
20. Static 
21. Relationships
22. Association
23. Aggregation
24. Inheritance
25. Method Overloading
26. Object and Wrapper Classes
27. Abstract
28. final Keyword
29. Interface
30. Package 
31. Exception
32. Unit Testing and Code Coverage
33. Regex


`` INTRO TO JAVA `` 

No Notes this section; 
It's customary to start every coding language venture off with a 'Hello World' program, and we're not reinventing the wheel today so; 
Step by Step 
1. Navigate to ./src/com/intro/to/java in terminal. 
2. run javac HelloWorld.java 
3. run java HelloWorld.java 

Bingo first program done; Off to level 2;

``` Keywords, Variables, Identifiers, DataTypes ```

1. Keywords
    - In every programming language there are certain reserved words which cannot be overwritten (variables cannot be named these words). 
2. Variables 
    - In Java, it is necessary to decalre a variable along with its datatype  before it can be used within the program. 

    - A variable is pretty much a parcel of data that's to be used and reused throughout the program, and hence we now have a need to identify it somehow. Speaking of which, variables are comprised of three parts:

    (1)Identifier (2)= (3)Value || Expression || Method Invocation || Instance of an object || etc... 

    the first part, the Identifier, is what the developer elects to name the variable. 

         String name; 

    then there is the assignment operator, the '=' sign. 

         name = "Nick G"; 

    and lastly, there is the right side of the assignment operator, which at its basest component is some bit of value that needs to be allocated memory because we're not done interacting with it yet. In the case above, it's a String literal. 

3. Data Types 
    - Data type identifies the type of data that can be stored in the variable and the memory allocation required by it. 
    - There are 2 Categories of Data Type in Java  
        * Primitive
            - variables of primitive data types hold the value of the data item
            - Eight Different Types of Primitive Data 
            - boolean, char, byte, short, int, long, double, float 

             ``` Primitive Data Types ``` 

            1) boolean 
                - stores true or false 
                - defaults to false 
                - 1 bit size 
                - Range of true or false 
                - Example: 
                    ` boolean overThirty = false; `

            2) byte 
                - stores whole numbers of small values
                - defaults to 0
                - 8 bit size 
                - Range of (-2^7) to (2^7 - 1)
                - Example: 
                    ` byte num = 0; `

            3) char
                - stores one unicode character
                - defaults to '\u0000' 
                - 16 bits size
                - Range of '\u0000' - \uffff'
                - Example: 
                    ` char havingFun = 'Y'; `
            
            4) short 
                - stores whole numbers of small values 
                - defaults to 0
                - 16 bit size 
                - Range from -2^13 - (2^13 - 1)
                - Example: 
                    ` short num = 2216; `

            5) int 
                - stores whole numbers (preferred whole number primitive type)
                - defaults to 0
                - 32 bits 
                - Range from (-2^31) - (2^31 - 1)
                - Example: 
                    ` int episodesOfGOT = 73; `

            6) long 
                - stores whole numbers even larger than int
                - defaults to 0
                - must be suffixed with an L 
                - 64 bits 
                - Range from (-2^63) - (2^63 - 1)
                - Example: 
                    ` long distanceToSun = 92_000_000_000L; `

            7) float 
                - stores decimals up to 6-7 degrees of precision '.0000001'
                - suffixed with f 
                - defaults to 0.0 
                - 32 bits 
                - Range from 1.4e-045 - 3.4e038
                - Example: 
                    ` float spotifySub = 9.99f; `
                
            8) double 
                - stores decimals up to 15 spaces right of the decimal point 
                - defaults to 0.0 
                - 64 bits 
                - Range from 4.9e-324 to 1.8e308 
                - Example 
                    ` double decimal = 1.123214; `

        * Non Primitive (Reference)
            - Variables of a non primitive data types hold the reference of the memory location where the object is stored as opposed to holding the value of the data item itself. 
            - Reference data types hold references!!! 
            - Includes Classes, Arrays, Interfaces, Objects, Etc 
            - These can be predefined from the Java library or user defined classes or interfaces, etc. 
            - i.e. String is a predefined class in the Java library, similar to String objects of other languages like Javascript or Ruby. 

            ` String phrase = "Catch-22"; `

    - Java Conventions Regarding Variables 
        - In Java, variable names conventionally start with lower case letters as long as they're not constants, which are instead indicated by all upper case letters 
        - Goes by camelcase e.g. gameOfThrones 
        - Comments for code follow a double forward slash ` // `


   


