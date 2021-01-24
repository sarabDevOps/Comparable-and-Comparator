# Comparable-and-Comparator

## Comparable and Comparator in Java

Comparable and comparator both are an interface that can be used to sort the elements of the collection. Comparator interface belongs to java.util package while comparable belongs to java.lang package. Comparator interface sort collection using two objects provided to it, whereas comparable interface compares" this" refers to the one objects provided to it.

Comparable | Comparator
------------ | -------------
The comparable interface has a method compareTo(Object a ) | The comparator has a method compare(Object o1, Object O2) 
Collection.sort(List) method can be used to sort the collection of Comparable type objects | Collection.sort(List, Comparator) method can be used to sort the collection of Comparator type objects
Comparable provides single sorting sequence.|The comparator provides a multiple sorting sequence.
Comparable interface belongs to java.lang package.|Comparator interface belongs to java.util package.
