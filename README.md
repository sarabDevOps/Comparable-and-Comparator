# Comparable-and-Comparator

## Comparable and Comparator in Java

Comparable and comparator both are an interface that can be used to sort the elements of the collection. Comparator interface belongs to java.util package while comparable belongs to java.lang package. Comparator interface sort collection using two objects provided to it, whereas comparable interface compares" this" refers to the one objects provided to it.

Comparable | Comparator
------------ | -------------
The comparable interface has a method compareTo(Object a ) | The comparator has a method compare(Object o1, Object O2) 
Collection.sort(List) method can be used to sort the collection of Comparable type objects | Collection.sort(List, Comparator) method can be used to sort the collection of Comparator type objects
Comparable provides single sorting sequence.|The comparator provides a multiple sorting sequence.
Comparable interface belongs to java.lang package.|Comparator interface belongs to java.util package.

## Steps will guide you how to run it 

### Dependencies
You hava to have java installed to your local machine , if you dont have java here are the steps how to dowmload it.
1. Navigate to the Java SE Downloads page.[Click Me](https://www.oracle.com/ie/java/technologies/javase/javase-jdk8-downloads.html)
2. Choose the JDK Download:
3. Agree to terms and download the appropriate version. Not sure which version of Windows you are running?
4. Open the .exe file and run the installation accepting all defaults.

### Installing

* You can download the zip folder from above and extract it to your local machine.
* If you have a git install to your machine you can use git clone command to clone the project to your local machine.

### Executing program

* Once you have a project downloaded and extracted on your machine.
* You can import it to your ide whatever ide you are using 
* Or you can run the program without Ide as well steps below explains how ...

```
open the command promt cd to where your project is saved 
once you are in the folder you can use ls or dir to see files
then you can compile all together using this command (javac *.java)
Now, type ' java Runner 

```



## Authors
[sarabDevOps](https://github.com/sarabDevOps)

## License
This project is licensed under the MIT License - see the[LICENSE.md](https://github.com/sarabDevOps/Comparable-and-Comparator/blob/main/LICENSE) for details.
