import javax.swing.JFrame;
//The class that initially launches the application
public class launch
{
	public static void main(String[] args)
	   {  
	      JFrame frame = new loginscreen();	  
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.setTitle("Reach");
	      frame.setVisible(true);      
	   }
}
