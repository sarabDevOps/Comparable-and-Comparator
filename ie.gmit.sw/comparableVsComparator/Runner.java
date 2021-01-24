package comparableVsComparator;

import java.util.Set;
import java.util.TreeSet;


public class Runner {
	
	public static void main(String[] args) {
		
		//Passing NameComparable class to TreeSet constructor is called strategy pattern 
		Set<Book> tSet  = new TreeSet<>(new NameComparable());
		
		
		Book book1 = new Book("Harry Poter" , "John" , 2014);
		Book book2 = new Book("Head First Java" , "Barry" , 2017);
		Book book3 = new Book("Harry Poter" , "John" , 2014);
		Book book4 = new Book("Walden Jpeg" , "Michelle" , 2018);
		
		//adding three book objects to the Set
		tSet.add(book1);
		tSet.add(book2);
		tSet.add(book3);
		tSet.add(book4);
		
		System.out.println(tSet);
	}

}
