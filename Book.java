package Library;

public class Book {

	//fields
	protected String author;
	protected String title;
	protected String ISBN;
	
	
	//constructors
	Book () {
		author = "";
		title = "";
		ISBN = "";
	}
	
	Book (String writer, String called, String bookNum) {
		author = writer;
		title = called;
		ISBN = bookNum;
	}
	
	//methods
	//getter and setters
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	//data conversion
	public String toString() {
		return "\nBook data: \n" + 
	    "Author: " + getAuthor() + "\n" +
	    "Title: " + getTitle() + "\n" +	
	    "ISBN: " + getISBN() + "\n";
	}
}
