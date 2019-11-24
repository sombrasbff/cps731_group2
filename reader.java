import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class reader {
	public String title;
	public String author;
	public String text;
	public int pageNumber;
	public static void main(String[] args) {
		open();
	}
	public static void open() {
		if (Desktop.isDesktopSupported()) {
		    try {
			/* Change file path to run */    
		        File myFile = new File("Path/To/Book.pdf");
		        Desktop.getDesktop().open(myFile);
		    } catch (IOException ex) {
		        // no application registered for PDFs
		    }
		}
	}
	public void nextPage() {
		
	}
	public void previousPage() {
		
	}
	public void exit() {
	
	}
	public void savePage() {
	
	}
	public void loadPage() {
	
	}
}
