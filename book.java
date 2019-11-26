
public class book {
	public String title;
	public String author;
	public String ISBN;
	public String genre;
	public double price;
	public int rating;
	
	public book (String title, String author, String ISBN, String genre, double price, int rating)
	{
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.genre = genre;
		this.price = price;
		this.rating = rating;
	}
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String newTitle)
	{
		this.title = newTitle;
	}
	public String getAuthor()
	{
		return author;
	}
	public void setAuthor(String newAuthor)
	{
		this.author = newAuthor;
	}
	public String getISBN()
	{
		return ISBN;
	}
	public void setISBN(String newISBN)
	{
		this.ISBN = newISBN;
	}
	public String getGenre()
	{
		return genre;
	}
	public void setGenre(String newGenre)
	{
		this.genre = newGenre;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(Double newPrice)
	{
		this.price = newPrice;
	}
	public int getRating()
	{
		return rating;
	}
	public void search() {
		
	}
	public void read() {
		
	}
	public void takeQuiz() {
		
	}
	public void cart() {
		
	}
	public void rate() {
		
	}
	
}

