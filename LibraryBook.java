package Library;


abstract class LibraryBook extends Book implements Comparable <LibraryBook> {

	//fields
	protected String callNumber;
	
	//constructors
	LibraryBook (String writer, String called, String bookNum, String callNum){
		
		super (writer, called, bookNum);
		callNumber = callNum;
	}
	
	//getters
	public String getCallNumber () {
		return callNumber;
	}
	
	//setters
	public void setCallNumber (String call) {
		callNumber = call;
	}
	
	//methods
	abstract void checkout (String patron, String dueDate);
	
	abstract void returned ();

	abstract String circulationStatus ();
	
	public int compareTo (LibraryBook book) {
		return callNumber.compareTo (book.callNumber);
	}

	//conversions
	public String toString () {
		return super.toString () +
				"Call Number: " + getCallNumber() +
				"\nCirculation Status: " + circulationStatus ();
	}
}
