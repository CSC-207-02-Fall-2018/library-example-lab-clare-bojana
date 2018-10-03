package Library;

public class ReferenceBook extends LibraryBook {
	//fields
	String collection;
	
	//constructor
	public ReferenceBook (String author, String title, String ISBN, String callNum, String collect) {
		super(author, title, ISBN, callNum);
		collection = collect;
	}

	//getters and setters
	public String getCollection() {
		return collection;
	}

	public void setCollection(String collection) {
		this.collection = collection;
	}
	
	//methods
	public void checkout (String patron, String dueDate) {
		System.out.println("Cannot checkout a reference book");
	}
	
	public void returned () {
		System.out.println("Reference book could not have been checked out - return not possible");
	}
	
	public String circulationStatus () {
		return "non-circulating reference book";
	}
	
	//data conversion
	public String toString () {
		return super.toString () +
				"\nCollection: " + getCollection();
	}	
}
