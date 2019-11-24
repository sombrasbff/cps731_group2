import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
public class loginscreen extends JFrame
{

	private static final long serialVersionUID = 1L;
	private static final int FRAME_WIDTH = 1000;
	private static final int FRAME_HEIGHT = 700;
	
	public loginscreen()
	{
    JPanel MainMenuPanel = new JPanel();
    JLabel Title = new JLabel("Reach");
		Title.setFont(new Font("Arial", Font.BOLD, 35));
		Title.setBounds(450, 100, 400, 100);
		MainMenuPanel.add(Title);
	JLabel Title2 = new JLabel("A Storefront by Group 2");
		Title2.setFont(new Font("Arial", Font.BOLD, 35));
		Title2.setBounds(320, 150, 400, 150);
		MainMenuPanel.add(Title2);
		MainMenuPanel.setBounds(0,0,400,600);
		MainMenuPanel.setBackground(Color.WHITE);
		JButton AppLogin = new JButton("LOGIN"); // set these button fonts to that pixel one on microsoft word 
		AppLogin.setBounds(400, 250, 200, 50);
		JButton AppRegister = new JButton("REGISTER");
	  AppRegister.setBounds(400, 325, 200, 50);
		JButton ContactUs = new JButton("CONTACT US");
		ContactUs.setBounds(400, 400, 200, 50);
		JButton AppExit = new JButton("EXIT");
		AppExit.setBounds(400, 475, 200, 50);
		MainMenuPanel.setLayout(null);
		MainMenuPanel.add(AppLogin);
    MainMenuPanel.add(AppRegister);
    MainMenuPanel.add(ContactUs);
    MainMenuPanel.add(AppExit);
		AppExit.addActionListener(new ActionListener()
			{
	  			public void actionPerformed(ActionEvent arg0)
	  			{
	  				System.exit(0);
	  			}
			});
		add(MainMenuPanel);
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
}
