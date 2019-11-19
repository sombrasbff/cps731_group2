import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class registration {
	public String name;
	public String email;
	public String dateOfBirth;
	public String address;
	public String phoneNumber;
	public String creditCardNumber;
	public String userName;
	public String password;
	static ArrayList<registration> list;
	
	

	public registration() {
		list = new ArrayList<registration>();
	}

	public registration(String name, String email, String dateOfBirth, String address, String phoneNumber,
			String creditCardNumber, String userName, String password) {
		this.name = name;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.creditCardNumber = creditCardNumber;
		this.userName = userName;
		this.password = password;

	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public void register() {

	}

	public void update() {

	}

	public ArrayList<registration> getList() {
		return list;
	}

	public void register(registration name) {
		list.add(name);

	}

	public int size() {
		return list.size();
	}

	// Write to the txt file
	public static void Save(registration object) throws IOException {

		File database = new File("CustomerDb.txt");
		try {

			if (!database.exists()) {
				database.createNewFile();
			}

			FileWriter fileWriter = new FileWriter(database, true);

			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

			bufferedWriter.write(object.getName());
			bufferedWriter.write(",");
			bufferedWriter.write(object.getEmail());
			bufferedWriter.write(",");
			bufferedWriter.write(object.getDateOfBirth());
			bufferedWriter.write(",");
			bufferedWriter.write(object.getAddress());
			bufferedWriter.write(",");
			bufferedWriter.write(object.getPhoneNumber());
			bufferedWriter.write(",");
			bufferedWriter.write(object.getCreditCardNumber());
			bufferedWriter.write(",");
			bufferedWriter.write(object.getUserName());
			bufferedWriter.write(",");
			bufferedWriter.write(object.getPassword());
			bufferedWriter.write("\n");
			bufferedWriter.close();

		} catch (IOException e) {
			System.out.println("Database not updated");
		}

	}



}
