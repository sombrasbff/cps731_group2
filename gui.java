import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class gui {

	private JFrame frame;
	private JTextField textUsername;
	private JTextField textPassword;
	private JTextField textFieldname;
	private JTextField textFieldemail;
	private JTextField textFielddateOfBirth;
	private JTextField textFieldaddress;
	private JTextField textFieldphoneNumber;
	private JTextField textFieldcreditCardNumber;
	private JTextField textFieldcreateUsername;
	private JTextField textFieldcreatePassword;
	private JButton btnRegister_1;
	public registration customer;
	public login loginobject;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui window = new gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public gui() {
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel feedback3 = new JPanel();
		feedback3.setBounds(0, 0, 450, 278);
		frame.getContentPane().add(feedback3);
		feedback3.setLayout(null);

		JLabel lblAccountRegistrationUnsuccessful = new JLabel("Account Registration Unsuccessful");
		lblAccountRegistrationUnsuccessful.setBounds(118, 34, 229, 16);
		feedback3.add(lblAccountRegistrationUnsuccessful);

		JButton btnTryAgain = new JButton("Try Again");

		btnTryAgain.setBounds(167, 121, 117, 29);
		feedback3.add(btnTryAgain);
		feedback3.setVisible(false);

		JPanel feedback2 = new JPanel();
		feedback2.setBounds(0, 0, 450, 278);
		frame.getContentPane().add(feedback2);
		feedback2.setLayout(null);
		feedback2.setVisible(false);

		JLabel lblAccountRegistrationSuccesfull = new JLabel("Account Registration Succesful");
		lblAccountRegistrationSuccesfull.setBounds(123, 33, 200, 16);
		feedback2.add(lblAccountRegistrationSuccesfull);

		JButton btnLogIn_2 = new JButton("Log In ");

		btnLogIn_2.setBounds(165, 112, 117, 29);
		feedback2.add(btnLogIn_2);
		feedback2.setVisible(false);

		JPanel feedback1 = new JPanel();
		feedback1.setBounds(0, 0, 450, 278);
		frame.getContentPane().add(feedback1);
		feedback1.setLayout(null);
		feedback1.setVisible(false);

		JLabel lblUsernameOrPassword = new JLabel("Username or Password incorrect!");
		lblUsernameOrPassword.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblUsernameOrPassword.setBounds(87, 55, 279, 16);
		feedback1.add(lblUsernameOrPassword);

		JButton tryagainbtn = new JButton("Try Again");

		tryagainbtn.setBounds(155, 139, 117, 29);
		feedback1.add(tryagainbtn);
		feedback1.setVisible(false);

		JPanel afterLoginPanel = new JPanel();
		afterLoginPanel.setBounds(0, 0, 450, 278);
		frame.getContentPane().add(afterLoginPanel);
		afterLoginPanel.setLayout(null);

		JLabel lblNewLabel_9 = new JLabel("Welcome User");
		lblNewLabel_9.setBounds(172, 6, 118, 16);
		afterLoginPanel.add(lblNewLabel_9);
		afterLoginPanel.setVisible(false);

		JPanel loginPanel = new JPanel();
		loginPanel.setBounds(0, 0, 450, 278);
		frame.getContentPane().add(loginPanel);
		loginPanel.setLayout(null);
		loginPanel.setVisible(false);

		textUsername = new JTextField();
		textUsername.setBounds(194, 56, 161, 26);
		loginPanel.add(textUsername);
		textUsername.setColumns(10);

		textPassword = new JTextField();
		textPassword.setBounds(194, 96, 161, 26);
		loginPanel.add(textPassword);
		textPassword.setColumns(10);

		JButton btnLogIn_1 = new JButton("Log In");

		btnLogIn_1.setBounds(169, 196, 117, 29);
		loginPanel.add(btnLogIn_1);

		JLabel lblEnterUsername = new JLabel("Enter Username");
		lblEnterUsername.setBounds(80, 61, 102, 16);
		loginPanel.add(lblEnterUsername);

		JLabel lblNewLabel_8 = new JLabel("Enter Password");
		lblNewLabel_8.setBounds(80, 101, 102, 16);
		loginPanel.add(lblNewLabel_8);

		JButton btnBack = new JButton("Go Back");

		btnBack.setBounds(169, 225, 117, 29);
		loginPanel.add(btnBack);
		
		//Library Panel
		JPanel LibraryPanel = new JPanel();
		JButton LibrarySort = new JButton("Sort");
		JLabel LibraryTitle = new JLabel("Your Library");
		JButton LibraryExit = new JButton("Return");
		JTextArea LibrarySelection = new JTextArea();
		JScrollPane LibraryScroll = new JScrollPane(LibrarySelection);
		LibraryScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		LibrarySelection.setBounds(5,75,425,180);
		LibraryPanel.setBounds(0, 0, 450, 278);
		LibraryTitle.setBounds(5,5,200,30);
		LibrarySort.setBounds(5,35,100,30);
		LibraryExit.setBounds(300,35,100,30);
		LibraryExit.addActionListener(new ActionListener()
		{
  			public void actionPerformed(ActionEvent arg0)
  			{
  				LibraryPanel.setVisible(false);
  				afterLoginPanel.setVisible(true);
  			}
		});
		LibraryPanel.add(LibrarySelection);
		LibraryPanel.add(LibrarySort);
		LibraryPanel.add(LibraryTitle);
		LibraryPanel.add(LibraryExit);
		LibraryPanel.add(LibraryScroll);
		frame.getContentPane().add(LibraryPanel);
		LibraryPanel.setLayout(null);
		LibraryPanel.setVisible(false);
		//Library Button
		JButton Librarybtn = new JButton("Library");
		Librarybtn.setBounds(135,40,150,40);
		Librarybtn.addActionListener(new ActionListener()
		{
  			public void actionPerformed(ActionEvent arg0)
  			{
  				LibraryPanel.setVisible(true);
				afterLoginPanel.setVisible(false);
  			}
		});
		afterLoginPanel.add(Librarybtn);
		// Shop Panel
		JPanel ShopPanel = new JPanel();
		JButton ShopSort = new JButton("Sort");
		JLabel ShopTitle = new JLabel("Available Readings");
		JButton ShopExit = new JButton("Return");
		JTextArea ShopSelection = new JTextArea();
		JScrollPane ShopScroll = new JScrollPane(ShopSelection);
		ShopScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		ShopSelection.setBounds(5,75,425,180);
		ShopPanel.setBounds(0, 0, 450, 278);
		ShopTitle.setBounds(5,5,200,30);
		ShopSort.setBounds(5,35,100,30);
		ShopExit.setBounds(300,35,100,30);
		ShopExit.addActionListener(new ActionListener()
		{
  			public void actionPerformed(ActionEvent arg0)
  			{
  				ShopPanel.setVisible(false);
  				afterLoginPanel.setVisible(true);
  			}
		});
		ShopPanel.add(ShopSelection);
		ShopPanel.add(ShopSort);
		ShopPanel.add(ShopTitle);
		ShopPanel.add(ShopExit);
		ShopPanel.add(ShopScroll);
		frame.getContentPane().add(ShopPanel);
		ShopPanel.setLayout(null);
		ShopPanel.setVisible(false);
		// Shop Button
		JButton Shopbtn = new JButton("Shop");
		Shopbtn.setBounds(135,80,150,40);
		afterLoginPanel.add(Shopbtn);
		Shopbtn.addActionListener(new ActionListener()
		{
  			public void actionPerformed(ActionEvent arg0)
  			{
  				ShopPanel.setVisible(true);
				afterLoginPanel.setVisible(false);
  			}
		});
		//Moderator Panel
		JPanel ModeratorPanel = new JPanel();
		JButton ModeratorSort = new JButton("Sort");
		JLabel ModeratorTitle = new JLabel("Moderator a forum");
		JButton ModeratorExit = new JButton("Return");
		JTextArea ModeratorSelection = new JTextArea();
		JScrollPane ModeratorScroll = new JScrollPane(ModeratorSelection);
		ModeratorScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		ModeratorSelection.setBounds(5,75,425,180);
		ModeratorPanel.setBounds(0, 0, 450, 278);
		ModeratorTitle.setBounds(5,5,200,30);
		ModeratorSort.setBounds(5,35,100,30);
		ModeratorExit.setBounds(300,35,100,30);
		ModeratorExit.addActionListener(new ActionListener()
		{
  			public void actionPerformed(ActionEvent arg0)
  			{
  				ModeratorPanel.setVisible(false);
  				afterLoginPanel.setVisible(true);
  			}
		});
		ModeratorPanel.add(ModeratorSelection);
		ModeratorPanel.add(ModeratorSort);
		ModeratorPanel.add(ModeratorTitle);
		ModeratorPanel.add(ModeratorExit);
		ModeratorPanel.add(ModeratorScroll);
		frame.getContentPane().add(ModeratorPanel);
		ModeratorPanel.setLayout(null);
		ModeratorPanel.setVisible(false);
		//Moderator Button
		JButton Moderatorbtn = new JButton("Moderator");
		Moderatorbtn.setBounds(135,120,150,40);
		Moderatorbtn.addActionListener(new ActionListener()
		{
  			public void actionPerformed(ActionEvent arg0)
  			{
  				ModeratorPanel.setVisible(true);
				afterLoginPanel.setVisible(false);
  			}
		});
		afterLoginPanel.add(Moderatorbtn);
		
		//Logout
		JButton Logoutbtn = new JButton("Logout");
		Logoutbtn.setBounds(135,160,150,40);
		Logoutbtn.addActionListener(new ActionListener()
		{
  			public void actionPerformed(ActionEvent arg0)
  			{
  				loginPanel.setVisible(true);
				afterLoginPanel.setVisible(false);
  			}
		});
		afterLoginPanel.add(Logoutbtn);
	
		JPanel registerPanel = new JPanel();
		registerPanel.setBounds(0, 0, 450, 278);
		frame.getContentPane().add(registerPanel);
		registerPanel.setLayout(null);
		registerPanel.setVisible(false);

		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(77, 6, 61, 16);
		registerPanel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setBounds(77, 34, 61, 16);
		registerPanel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Date Of Birth");
		lblNewLabel_2.setBounds(77, 61, 81, 16);
		registerPanel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Address");
		lblNewLabel_3.setBounds(77, 89, 61, 16);
		registerPanel.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Phone Number");
		lblNewLabel_4.setBounds(77, 117, 92, 16);
		registerPanel.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Credt Card Number");
		lblNewLabel_5.setBounds(77, 145, 121, 16);
		registerPanel.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Create Username");
		lblNewLabel_6.setBounds(77, 173, 121, 16);
		registerPanel.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("Create Password");
		lblNewLabel_7.setBounds(77, 199, 121, 16);
		registerPanel.add(lblNewLabel_7);

		textFieldname = new JTextField();
		textFieldname.setBounds(224, 1, 130, 26);
		registerPanel.add(textFieldname);
		textFieldname.setColumns(10);

		textFieldemail = new JTextField();
		textFieldemail.setColumns(10);
		textFieldemail.setBounds(224, 29, 130, 26);
		registerPanel.add(textFieldemail);

		textFielddateOfBirth = new JTextField();
		textFielddateOfBirth.setBounds(224, 56, 130, 26);
		registerPanel.add(textFielddateOfBirth);
		textFielddateOfBirth.setColumns(10);

		textFieldaddress = new JTextField();
		textFieldaddress.setBounds(224, 84, 130, 26);
		registerPanel.add(textFieldaddress);
		textFieldaddress.setColumns(10);

		textFieldphoneNumber = new JTextField();
		textFieldphoneNumber.setBounds(224, 112, 130, 26);
		registerPanel.add(textFieldphoneNumber);
		textFieldphoneNumber.setColumns(10);

		textFieldcreditCardNumber = new JTextField();
		textFieldcreditCardNumber.setBounds(224, 140, 130, 26);
		registerPanel.add(textFieldcreditCardNumber);
		textFieldcreditCardNumber.setColumns(10);

		textFieldcreateUsername = new JTextField();
		textFieldcreateUsername.setBounds(224, 168, 130, 26);
		registerPanel.add(textFieldcreateUsername);
		textFieldcreateUsername.setColumns(10);

		textFieldcreatePassword = new JTextField();
		textFieldcreatePassword.setBounds(224, 194, 130, 26);
		registerPanel.add(textFieldcreatePassword);
		textFieldcreatePassword.setColumns(10);

		btnRegister_1 = new JButton("Register");

		btnRegister_1.setBounds(157, 219, 117, 29);
		registerPanel.add(btnRegister_1);

		JButton btnBack1 = new JButton("Go Back");

		btnBack1.setBounds(157, 243, 117, 29);
		registerPanel.add(btnBack1);

		JPanel storePanel = new JPanel();
		storePanel.setBounds(0, 0, 450, 278);
		frame.getContentPane().add(storePanel);
		storePanel.setLayout(null);

		JLabel appLabel = new JLabel("Reach: Ebook & Audiobook Storefront\n");
		appLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		appLabel.setBounds(59, 36, 350, 16);
		storePanel.add(appLabel);

		JButton btnLogIn = new JButton("Log In ");

		btnLogIn.setBounds(182, 102, 95, 29);
		storePanel.add(btnLogIn);

		JButton btnRegister = new JButton("Register");

		btnRegister.setBounds(182, 158, 95, 29);
		storePanel.add(btnRegister);

		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				storePanel.setVisible(false);
				registerPanel.setVisible(false);
				loginPanel.setVisible(true);
			}
		});

		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				storePanel.setVisible(false);
				loginPanel.setVisible(false);
				registerPanel.setVisible(true);
			}
		});
		btnBack1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				storePanel.setVisible(true);

				registerPanel.setVisible(false);
			}
		});
		btnRegister_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				if (textFieldname.getText().equals("") || textFieldemail.getText().equals("")
						|| textFielddateOfBirth.getText().equals("") || textFieldaddress.getText().equals("")
						|| textFieldphoneNumber.getText().equals("") || textFieldcreditCardNumber.getText().equals("")
						|| textFieldcreateUsername.getText().equals("")|| textFieldcreatePassword.getText().equals("")) {
					registerPanel.setVisible(false);
					feedback3.setVisible(true);
				} else {
					customer = new registration(textFieldname.getText(), textFieldemail.getText(),
							textFielddateOfBirth.getText(), textFieldaddress.getText(), textFieldphoneNumber.getText(),
							textFieldcreditCardNumber.getText(), textFieldcreateUsername.getText(),
							textFieldcreatePassword.getText());

					try {
						registration.Save(customer);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					registerPanel.setVisible(false);
					feedback2.setVisible(true);
				}
			}
		});
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				storePanel.setVisible(true);
				loginPanel.setVisible(false);
			}
		});
		btnLogIn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (loginobject.Login(textUsername.getText(), textPassword.getText()) == true) {

					loginPanel.setVisible(false);
					afterLoginPanel.setVisible(true);
				} else {
					loginPanel.setVisible(false);
					feedback1.setVisible(true);
				}
			}
		});
		tryagainbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				feedback1.setVisible(false);
				loginPanel.setVisible(true);
			}
		});
		btnLogIn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				feedback2.setVisible(false);
				loginPanel.setVisible(true);
			}
		});
		btnTryAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				feedback3.setVisible(false);
				registerPanel.setVisible(true);
			}
		});

	}
}
