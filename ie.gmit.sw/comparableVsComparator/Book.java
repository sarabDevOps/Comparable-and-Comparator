package comparableVsComparator;

/**
 * 
 * @author sarab
 * 
 *  This class implements Comparable interface which has one method
 *  compare which takes one object and compare it to current object 
 *  For example, if one adds two keys a and b such that (!a.equals(b) &&
 *  a.compareTo(b) == 0) to a sorted set that does not use an explicit
 *  comparator, the second add operation returns false (and the size of
 *  the sorted set does not increase) because a and b are equivalent from
 *  the sorted set's perspective.
 *
 */

class Book implements Comparable {

	String tittle;
	String author;
	int publicationYear;

	public Book(String name, String author, int publicationYear) {
		super();
		this.tittle = name;
		this.author = author;
		this.publicationYear = publicationYear;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String name) {
		this.tittle = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	@Override
	public String toString() {
		return "Book [name=" + tittle + ", author=" + author + ", publicationYear=" + publicationYear + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((tittle == null) ? 0 : tittle.hashCode());
		result = prime * result + publicationYear;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (tittle == null) {
			if (other.tittle != null)
				return false;
		} else if (!tittle.equals(other.tittle))
			return false;
		if (publicationYear != other.publicationYear)
			return false;
		return true;
	}

	@Override
	public int compareTo(Object o) {
		return getTittle().compareTo(((Book) o).getTittle());
	}

}
