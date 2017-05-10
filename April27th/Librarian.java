public class Librarian{
	private Library library;

	Librarian(Library library){
		this.library=library;
	}

	public void findMeBooksFromAuthor(String author){
		library.printBooksFromAuthor(author);
	}
	public void findMeAvailableBooks(){
		library.printAvailableBooks();
	}
	public void findMeBook(String title){
		library.printBookDetails(title);
	}
	public void findMostPopularBook(){
		library.printTheMostPopularBook();
	}
}