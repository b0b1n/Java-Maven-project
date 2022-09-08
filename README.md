# Maven-project
Creating a simple to java to learn manipulating and configuring mavrn projects

# Things learned :
### 1 - Maven build lifecycle
### 2 - Maven built-in build lifecycles :   
     * default : for project deployment
     * clean : for project cleaning
     * site : for creating the project site's documentation
### 3 - The Maven default lifecycle :
     * validate
     * compile
     * test
     * package
     * verify
     * install
     * deploy
### 4 - Fix Maven project's errors and warnings
### 5 - Using the sl4j api for logging, using Logback
### 6 - Logback initialization steps :
    1 - Logback tries to find a file called logback-test.xml in the classpath.
    2 - If no such file is found, logback tries to find a file called logback.groovy in the classpath.
    3 - If no such file is found, it checks for the file logback.xml in the classpath.
    4 - If no such file is found, service-provider loading facility(introduced in JDK 1.6) is used to resolve the implementation of a Configuration interface.
    5 - If none of the above succeds, logback configures itself automatically using the BasicConfiguration which will cause logging output to be directed to the console.
* The last step is meant as last-ditch effort to provide a default(vut very basic)logging functionality in the absence of a configuration file.
