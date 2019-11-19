import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class login {
	static ArrayList<String> usernamelist = new ArrayList<String>();
	static ArrayList<String> passwordlist = new ArrayList<String>();
	static ArrayList<String> namelist = new ArrayList<String>();
	static ArrayList<String> dateOfBirthlist = new ArrayList<String>();
	static ArrayList<String> emaillist = new ArrayList<String>();
	static ArrayList<String> phoneNumberlist = new ArrayList<String>();
	static ArrayList<String> creditCardNumberlist = new ArrayList<String>();
	static ArrayList<String> addresslist = new ArrayList<String>();

	static ArrayList<String> validum = new ArrayList<String>();
	static registration reg = new registration();
	static Boolean correct;

	public login() {

	}

	public static Boolean Login(String Username, String Password) {
		Sort();
		for (int i = 0; i <= usernamelist.size() - 1; i++) {
			if (Username == "" || Password == "")
				correct = false;

			if (Username.equals(usernamelist.get(i))) {
				correct = true;
				break;
			}

			else {
				correct = false;
			}
		}

		if (correct == true) {
			for (int j = 0; j <= passwordlist.size() - 1; j++) {
				if (Password.equals(passwordlist.get(j))) {
					correct = true;
					break;
				}

				else {
					correct = false;
				}
			}
		}

		return correct;
	}

	public static void Sort() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("CustomerDb.txt"));
			String line = reader.readLine();

			String[] z = null;
			while (line != null) {
				z = line.split(",");
				validum.add(z[0]);
				validum.add(z[1]);
				validum.add(z[2]);
				validum.add(z[3]);
				validum.add(z[4]);
				validum.add(z[5]);
				validum.add(z[6]);
				validum.add(z[7]);

				line = reader.readLine();
			}

			for (int i = 0; i <= validum.size() - 1; i = i + 8) {
				namelist.add(validum.get(i));
				emaillist.add(validum.get(i + 1));
				dateOfBirthlist.add(validum.get(i + 2));
				addresslist.add(validum.get(i + 3));
				phoneNumberlist.add(validum.get(i + 4));
				creditCardNumberlist.add(validum.get(i + 5));
				usernamelist.add(validum.get(i + 6));
				passwordlist.add(validum.get(i + 7));
			}

			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
