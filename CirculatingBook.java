package Library;

public class CirculatingBook extends LibraryBook{

	//fields 
	String currentHolder;
	String dueDate;

	//constructor
	public CirculatingBook (String author, String title, String ISBN, String callNum) {
		super(author, title, ISBN, callNum);
		currentHolder = null; //when the CirculatingBook is initialized, it has not yet been checked out
		dueDate = null; 
	}

	//getters and setters
	public String getCurrentHolder() {
		return currentHolder;
	}

	public void setCurrentHolder(String currentHolder) {
		this.currentHolder = currentHolder;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	//methods
	public void checkout (String patron, String due) {
		currentHolder = patron;
		dueDate = due;
	}

	public void returned () {
		currentHolder = null; 
		dueDate = null;
	}

	public String circulationStatus () {
		if (currentHolder != null)
			return currentHolder + " " + dueDate;
		else
			return "book available on shelves";
	}

	//data conversion
	public String toString () {
		if (currentHolder != null) {
			return super.toString () +
					"\nCurrent Holder: " + getCurrentHolder() +
					"\nDue Date: " + getDueDate () + "/n";
		}
		else {
			return super.toString ();
		}
	}
}
