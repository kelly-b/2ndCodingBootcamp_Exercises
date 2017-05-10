public class Library{
	private Book[] books;

	Library(Book[] books){
		this.books=books;
	}

	public void printAvailableBooks(){
		int n=0;
		System.out.println("The following books are available at the library for renting");
		System.out.println("Books available for renting: ");
		for(int i=0; i<books.length; i++){
			if(books[i].isAvailable()){
					n++;
					System.out.println((n)+". "+books[i].toString());
			}
		}
	}

	public void printBookDetails(String titles){
		String title=" ";
		for(int i=0; i<books.length; i++){
			if(titles.equals(books[i].getTitle())){
				title=books[i].getTitle();
				System.out.println("Book with title= "+title+" found! Details:");
    			System.out.println("	Book ["+books[i].toString()+"]");
			}
		}
		if(title.equals(" ")){
			System.out.println("Book with title= "+title+" not found!");
		}
	}

	public void printBooksFromAuthor(String authors){
		String author=" ";
		System.out.println("Book with author= "+authors+" found! Details:");
		for(int i=0; i<books.length; i++){
			if(authors.equals(books[i].getAuthor())){
				author=books[i].getAuthor();
    			System.out.println("	Book ["+books[i].toString()+"]");
			}
		}
		if(author.equals(" ")){
			System.out.println("Book with author= "+authors+" not found!");
		}

	}

	public void printTheMostPopularBook(){
		int times=0;
		String popBook=" ";
		for(int i=0; i<books.length; i++){
			if(books[i].getTimesRented()>times){
				times=books[i].getTimesRented();
				popBook=books[i].toString();
			}
		}
		System.out.println("Most popular book:");
    	System.out.println("	Book ["+popBook+"]");
	}
}