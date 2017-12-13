import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddressBook {
	private String firstName;
	private String lastName;
	private int addressNum;
	private String addressStreetName;
	private int zipCode;
	private String city;
	private String state;
	private int areaCode;
	private int phone;
	private String email;
	
	public String getfName() {
		return firstName;
	}
	public void setfName(String fName) {
		this.firstName = fName;
	}
	public String getlName() {
		return lastName;
	}
	public void setlName(String lName) {
		this.lastName = lName;
	}
	public int getAddressNum() {
		return addressNum;
	}
	public void setAddressNum(int addressNum) {
		this.addressNum = addressNum;
	}
	public String getAddressStreetName() {
		return addressStreetName;
	}
	public void setAddressStreetName(String addressStreetName) {
		this.addressStreetName = addressStreetName;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	
	public String getsCity() {
		return city;
	}
	public void setsCity(String sCity) {
		this.city = sCity;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(int areaCode) {
		this.areaCode = areaCode;
	}
	public int getPhoneNum() {
		return phone;
	}
	public void setPhoneNum(int phoneNum) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;	
	}
	private static final String file = "C:\\Users\\Mine\\Desktop\\addressbook.txt";
	
public static void main (String [] args) {
	BufferedWriter in = null;
	FileWriter out = null;
	String code = null;

	try {
		out = new FileWriter(file);
		in = new BufferedWriter(out);
		
		
	do {	
		System.out.println("Enter first name: ");
		Scanner scan = new Scanner(System.in);
		String fName = scan.nextLine(); 
		
		System.out.println("Enter last name: ");
		Scanner scan2 = new Scanner(System.in);
		String lName = scan2.nextLine();
		
		
		System.out.println("Enter street address: ");
		Scanner scan3 = new Scanner(System.in);
		String address = scan3.nextLine();
		
		System.out.println("Enter city: ");
		Scanner scan4 = new Scanner(System.in);
		String city = scan4.nextLine();
		
		System.out.println("Enter state: ");
		Scanner scan5 = new Scanner(System.in);
		String state = scan5.nextLine();
		
		System.out.println("Enter zip code: ");
		Scanner scan6 = new Scanner(System.in);
		String zipCode = scan6.nextLine();
		
		System.out.println("Enter phone number: ");
		Scanner scan7 = new Scanner(System.in);
		String phone = scan7.nextLine();
		
		System.out.println("Enter email: ");
		Scanner scan8 = new Scanner(System.in);
		String email = scan8.nextLine();

		in.write(fName);
		in.write(" ");
		in.write(lName);
		in.write(" ");
		in.write(address);
		in.write(" ");
		in.write(zipCode);
		in.write(" ");
		in.write(city);
		in.write(" ");
		in.write(state);
		in.write(" ");
		in.write(phone);
		in.write(" ");
		in.write(email);
		in.newLine();
		
		System.out.println("Add another address Y or n: ");
		Scanner scan9 = new Scanner(System.in);
		code = scan9.nextLine();
		
	}while (code.equalsIgnoreCase("y"));
	
	} catch (IOException e) {

		e.printStackTrace();

	} finally {

		try {

			if (in != null)
				in.close();

			if (out != null)
				out.close();

		} catch (IOException ex) {

			ex.printStackTrace();

		}

	}

}	
}

