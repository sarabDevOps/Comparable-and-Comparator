package comparableVsComparator;

import java.util.Comparator;

/**
 * Version 1
 * @author sarab
 *
 */

/**
 * 
 * This is NameComparable implements the comparator interface (Raw type) Which
 * sort the book objects on the basis Alphabetic order we will pass this class
 * to TreeSet constructor , Which is called strategic pattern..
 * 
 * Comparator interface has a one method compare which takes two objects and
 * sort them .. For example, suppose one adds two elements a and b such that
 * (a.equals(b) && c.compare(a, b) != 0) to an empty TreeSet with comparator c.
 * The second add operation will return true (and the size of the tree set will
 * increase) because a and b are not equivalent from the tree set's perspective,
 * even though this is contrary to the specification of the Set.add method.
 * 
 */
public class NameComparable implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		return ((Book) o1).getTittle().compareTo(((Book) o2).getTittle());
	}

}
