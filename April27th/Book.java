public class Book{
	private String title;
	private Author author;
	private String isbn;
	private int physicalCopies;
	private int availableCopies;
	private int timesRented;

	Book(String title,Author author,String isbn,int physicalCopies,int availableCopies,int timesRented){
		this.title=title;
		this.author=author;
		this.isbn=isbn;
		this.physicalCopies=physicalCopies;
		this.availableCopies=availableCopies;
		this.timesRented=timesRented;
	}

	public String toString(){
		return "title= "+getTitle()+", "+"author= "+getAuthor()+", "+"isbn= "+getIsbn()+", "+"physical copies= "+getPhysicalCopies()+", "+"available copies= "+getAvailableCopies()+", "+"times rented= "+getTimesRented();

	}

	public void rentPhysicalCopy(){
		if(availableCopies!=0){
			System.out.println("There is an available copy to rent!");
			availableCopies--;
		}else{
			System.out.println("There is not an available copy to rent!");
		}
	}

	public boolean isAvailable(){
		if(availableCopies!=0){return true;}
		else{return false;}
	}

	public boolean hasAuthor(String givenName){
		if(author.toString()==givenName){
			return true;
		}else{return false;}
	}

	public String getTitle(){
		return title;
	}

	public String getAuthor(){
			return author.toString();
	}

	public int getTimesRented(){
				return timesRented;
	}

	public String getIsbn(){
		return isbn;
	}

	public int getPhysicalCopies(){
			return physicalCopies;
	}

	public int getAvailableCopies(){
		return availableCopies;
	}
}